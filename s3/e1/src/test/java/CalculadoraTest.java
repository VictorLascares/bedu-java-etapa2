import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    private Calculadora calculadora = new Calculadora();

    @Test
    @DisplayName("Prueba suma")
    void suma() {
        int expected = 5;
        assertEquals(expected, calculadora.suma(3,2));
    }

    @Test
    @DisplayName("Prueba resta")
    void resta() {
        int expected = 1;
        assertEquals(expected, calculadora.resta(3,2));
    }

    @Test
    @DisplayName("Prueba multiplica")
    void multiplica() {
        int expected = 6;
        assertEquals(expected, calculadora.multiplica(3,2));
    }
}