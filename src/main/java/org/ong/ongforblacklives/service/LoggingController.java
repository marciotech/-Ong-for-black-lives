package org.ong.ongforblacklives.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    Logger logger = (Logger) LoggerFactory.getLogger(LoggingController.class);

    @RequestMapping("/")
    public String index() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("Aplicacao executada com sucesso");
        logger.warn("A WARN Message");
        logger.error("Ocorreu um erro na aplicacao");

        return "Howdy! Check out the Logs to see the output...";
    }
}

