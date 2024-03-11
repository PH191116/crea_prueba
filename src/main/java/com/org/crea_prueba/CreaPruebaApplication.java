package com.org.crea_prueba;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreaPruebaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreaPruebaApplication.class, args);
        //Implementado logica para inicializar logs de log4j
        String log4jConfPath = "src/main/resources/log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);

    }

}
