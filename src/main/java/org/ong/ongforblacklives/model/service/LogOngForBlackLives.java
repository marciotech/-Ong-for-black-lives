package org.ong.ongforblacklives.model.service;


import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class LogOngForBlackLives {


    private static  final Logger LOGGER = LoggerFactory(LogOngForBlackLives);

    public static void main(String[] args) {
        LOGGER.info("Iniciando Api de Cadastros de Ongs");
        (SpringBootApplication.class)



    }
}
