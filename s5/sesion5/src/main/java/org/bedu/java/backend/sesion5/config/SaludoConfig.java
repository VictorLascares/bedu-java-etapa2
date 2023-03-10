package org.bedu.java.backend.sesion5.config;

import org.bedu.java.backend.sesion5.models.Saludo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SaludoConfig {

    @Bean
    public Saludo saludo() {
        return new Saludo("Ejemplo 1: Victor");
    }
}
