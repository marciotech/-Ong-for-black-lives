package org.ong.ongforblacklives.controller.usuariodto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioDto {

    private Long id;
    private String nome;
    private String cidade;
    private String bairro;
    private String cep;
    private String cnpj;
    private String email;
    private String area_de_atuacao;

    public UsuarioDto(UsuarioDto usuarioDto) {
        this.id = usuarioDto.getId();
        this.nome = usuarioDto.getNome();
        this.cidade = usuarioDto.getCidade();
        this.bairro = usuarioDto.getBairro();
        this.cep = usuarioDto.getCep();
        this.cnpj = usuarioDto.getCnpj();
        this.email = usuarioDto.getEmail();
        this.area_de_atuacao = usuarioDto.getArea_de_atuacao();
    }

    public static List<UsuarioDto> convert(List<UsuarioDto> usuarioDtos){
        return usuarioDtos.stream().map(UsuarioDto::new).collect(Collectors.toList());

    }
}
