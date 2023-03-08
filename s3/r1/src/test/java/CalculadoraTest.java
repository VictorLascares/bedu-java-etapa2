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

    @Test
    @DisplayName("Prueba divide entre 0")
    void divide() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> calculadora.divide(100, 0));
        assertEquals("No es posible dividir un valor entre 0", exception.getMessage());
    }

    @Test
    @DisplayName("Prueba divide")
    void divide2() {
        assertEquals(10, calculadora.divide(100,10));
    }
}