import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

public class TrianguloTeste extends TestCase {
    public TrianguloTeste(String testName) {
        super(testName);
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of Classificar method, of class Triangulo.
     */
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
