package leandro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    //TESTES ADIÇÃO/SUBTRAÇÃO
    @Test
    void testAdd2mais2eh4() {
        var calculadora = new Calculadora();
        assertTrue(2+2 == calculadora.add(2, 2));

    }
    @Test
    void testAdd3mais7eh10() {
        var calculadora = new Calculadora();
        assertEquals(10, calculadora.add(3, 7));

    }
    @Test
    void testAdd3mais_menos_7eh_menos4() {
        var calculadora = new Calculadora();
        assertEquals(-4, calculadora.add(3, -7));

    }

    //TESTES MULTIPLICAÇÃO
    @Test
    void testMultiplica2x2eh4()
    {
        var calculadora = new Calculadora();
        assertTrue(2*2 == calculadora.multiplica(2, 2));
    }
    @Test
    void testMultiplica3x3eh9()
    {
        var calculadora = new Calculadora();
        assertEquals(9, calculadora.multiplica(3, 3));
    }
    @Test
    void testMultiplica10x_menos_5eh_menos50()
    {
        var calculadora = new Calculadora();
        assertTrue(-50 == calculadora.multiplica(10, -5));
    }
    @Test
    void testMultiplicaMeiox10eh5()
    {
        var calculadora = new Calculadora();
        assertTrue(5d == calculadora.multiplica(0.5d, 10));
    }

    //TESTES DIVISÃO (Se dividir por zero retorna zero)
    @Test
    void testDivide10por10eh1()
    {
        var calculadora = new Calculadora();
        assertTrue(1 == calculadora.divide(10, 10));
    }
    @Test
    void testDivide0por10eh0()
    {
        var calculadora = new Calculadora();
        assertEquals(0, calculadora.divide(0, 10));
    }
    @Test
    void testDivide10por0eh0()
    {
        var calculadora = new Calculadora();
        assertTrue(0 == calculadora.divide(10, 0));
    }
    @Test
    void testDivide_menos3por10eh_menos_zero_ponto_tres()
    {
        var calculadora = new Calculadora();
        assertTrue(-0.3d == calculadora.divide(-3, 10));
    }

    //TESTE DA COMPARAÇÃO DO MAIOR (a>b)
    @Test
    void testMaior_3m4ehF()
    {
        var calculadora = new Calculadora();
        assertFalse(calculadora.maior(3, 4));
    }
    @Test
    void testMaior_10m4ehT()
    {
        var calculadora = new Calculadora();
        assertTrue(calculadora.maior(10, 4));
    }
    @Test
    void testMaior__menos_4m4ehF()
    {
        var calculadora = new Calculadora();
        assertFalse(calculadora.maior(-4, 4));
    }
    @Test
    void testMaior_3m_menos_4ehT()
    {
        var calculadora = new Calculadora();
        assertTrue(calculadora.maior(3, -4));
    }
    @Test
    void testMaior_0m0ehF()
    {
        var calculadora = new Calculadora();
        assertFalse(calculadora.maior(0, 0));
    }
    //TESTE RAIZ (raiz a_ésima de b)
    @Test
    void testRaiz_2d4eh2()
    {
        var calculadora = new Calculadora();
        assertEquals(2, calculadora.raiz(2, 4));
    }
    @Test
    void testRaiz_2d9eh3()
    {
        var calculadora = new Calculadora();
        assertEquals(3, calculadora.raiz(2, 9));
    }
    @Test
    void testRaiz_3d8eh2()
    {
        var calculadora = new Calculadora();
        assertEquals(2, calculadora.raiz(3, 8));
    }
    // TESTE EXPONENCIAL (A ^ B)
    @Test
    void testExp_4e2eh16()
    {
        var calculadora = new Calculadora();
        assertEquals(16, calculadora.exp(4, 2));
    }
    @Test
    void testExp_5e3eh125()
    {
        var calculadora = new Calculadora();
        assertEquals(125, calculadora.exp(5, 3));
    }
    @Test
    void testExp_4eMeioeh2()
    {
        var calculadora = new Calculadora();
        assertEquals(2, calculadora.exp(4, 0.5d));
    }
}
