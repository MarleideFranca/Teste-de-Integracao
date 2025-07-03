package marleidealves;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {

    @Test
    public void testGetSetNome() {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "12345678000199", 1995);
        biblioteca.setNome("Biblioteca Municipal");
        assertEquals("Biblioteca Municipal", biblioteca.getNome());
    }

    @Test
    public void testGetSetCnpj() {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "12345678000199", 1995);
        biblioteca.setCnpj("00987654000188");
        assertEquals("00987654000188", biblioteca.getCnpj());
    }

    @Test
    public void testGetSetAnoFundacao() {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "12345678000199", 1995);
        biblioteca.setAnoFundacao(2000);
        assertEquals(2000, biblioteca.getAnoFundacao());
    }

    @Test
    public void testPatrimonioHistoricoTrue() {
        Biblioteca biblioteca = new Biblioteca("Antiga Biblioteca", "11222333000100", 1975);
        assertTrue(biblioteca.patrimonioHistorico());
    }

    @Test
    public void testPatrimonioHistoricoFalse() {
        Biblioteca biblioteca = new Biblioteca("Nova Biblioteca", "22334455000111", 2000);
        assertFalse(biblioteca.patrimonioHistorico());
    }
}

