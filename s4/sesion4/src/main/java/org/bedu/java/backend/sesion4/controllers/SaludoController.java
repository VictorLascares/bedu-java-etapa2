package org.bedu.java.backend.sesion4.controllers;

import org.bedu.java.backend.sesion4.models.Saludo;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class SaludoController {

    @GetMapping("/saludo")
    public Saludo saluda() {
        Saludo saludo = new Saludo();
        saludo.setMensaje("Hola Mundo!!");
        return saludo;
    }

    @GetMapping("/saludo/{nombre}")
    public Saludo saludaConParametro(@PathVariable String nombre) {
        Saludo saludo = new Saludo();
        saludo.setMensaje("Hola mundo!!");
        saludo.setNombre(nombre);
        return saludo;
    }

    @PostMapping("/saludo")
    public Saludo saludaPost(@RequestBody Saludo saludo) {
        return saludo;
    }

    @PutMapping("/saludo")
    public Saludo saludaPut(@RequestBody Saludo saludo) {
        LocalDate fechaActual = saludo.getFechaNacimiento();
        LocalDate newDate = LocalDate.of(fechaActual.getYear(), fechaActual.getMonth(), fechaActual.getDayOfMonth() + 1);
        saludo.setFechaNacimiento(newDate);
        return saludo;
    }

    @DeleteMapping("/saludo/{id}")
    public String saludaDel(@PathVariable int id) {
        return id + " eliminado!!";
    }
}
