package com.org.crea_prueba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/crea_prueba")
@RestController
public class HolaMundoController {
    private Logger logger = Logger.getLogger(HolaMundoController.class);

    @GetMapping("/hola_mundo")
    public String imprimir(){
        logger.info("====== DECLARANDO VARIABLE HOLAMUNDO ======");
        String holaMundo = "Hola Mundo";
        logger.info("====== DECLARANDO VARIABLE HOLAMUNDO OK ======");

        return holaMundo;
    }
}
