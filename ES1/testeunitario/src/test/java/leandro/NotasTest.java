package leandro;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

//TESTES DAS NOTAS
// MENOR QUE ZERO OU MAIOR QUE 10: EXCEPTION
// 0 < M < 3 REPROVADO
// 3 < M < 6 EXAME (REC)
// 6 < M < 10 APROVADO

public class NotasTest {
    @Test
    void testVerificaReprova() {
        Notas n = new Notas();
        assertEquals('R', n.VerificaAprovacao(1, 3));
    }
    @Test
    void testVerificaExame() {
        Notas n = new Notas();
        assertEquals('E', n.VerificaAprovacao(6, 3));
    }
    @Test
    void testVerificaAprovado() {
        Notas n = new Notas();
        assertEquals('A', n.VerificaAprovacao(10, 10));
    }
    @Test
    void testVerificaNotaInvalidaMaior() {
        Notas n = new Notas();
        assertThrows(IllegalArgumentException.class, 
        ( ) -> {
            n.VerificaAprovacao(103, 10);
        });
    }
    @Test
    void testVerificaNotaInvalidaMenor() {
        Notas n = new Notas();
        assertThrows(IllegalArgumentException.class, 
        ( ) -> {
            n.VerificaAprovacao(-1, 10);
        });
    }

}
