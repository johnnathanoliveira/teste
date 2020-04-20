import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrianguloTeste {
    @Test
    public void testClassificar() {
        System.out.println("Classificar");
        double a = 10.0;
        double b = 10.0;
        double c = 10.0;
        Triangulo instance = new Triangulo();
        String expResult = "O Triangulo é equilátero";
        String result = instance.Classificar(a, b, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}