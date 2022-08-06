package org.ong.ongforblacklives.exceptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class HandlerResponse extends ResponseEntityExceptionHandler {
    ErrorResponse errorResponse = new ErrorResponse();

    @Autowired
    MessageSource messageSource;

    @Override
    public ResponseEntity<Object>  handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request){

        List<ErrorResponse.Campos> campos = new ArrayList<>();

        for (ObjectError objectError: ex.getBindingResult().getAllErrors()){
            String nome = ((FieldError) objectError).getField();
            String mensagem = messageSource.getMessage(objectError, LocaleContextHolder.getLocale());
            campos.add(new ErrorResponse.Campos(nome,mensagem));
        }

        errorResponse.setStatus(status.value());
        errorResponse.setCampos(campos);
        errorResponse.setTitulo("Um ou mais campos estao inválidos");

        return handleExceptionInternal(ex, errorResponse,headers, status, request);


    }
}
