package org.bedu.java.backend.sesion5.models;

import org.springframework.stereotype.Component;

@Component
public class SaludoComponent {
    private final String nombre;

    public SaludoComponent() {
        this.nombre = "Beto";
    }

    public String getNombre() {
        return nombre;
    }
}
