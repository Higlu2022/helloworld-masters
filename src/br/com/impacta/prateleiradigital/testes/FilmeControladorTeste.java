package br.com.impacta.prateleiradigital.testes;

import br.com.impacta.prateleiradigital.controle.FilmeControlador;
import br.com.impacta.prateleiradigital.negocio.Filme;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;

public class FilmeControladorTeste {

    @Test
    public void validarSortearFilmeNaoNulo() throws SQLException {
        Filme filme = new Filme();
        filme.setGenero("Terror");
        filme.setDiretores("Joe");
        filme.setNota(10);
        filme.setNumDeVotos(300);

        Filme filmeDAO = new FilmeControlador().sortear(filme);
        Assert.assertNotNull(filmeDAO);
    }

    @Test
    public void validarSortearFilmeNulo() throws SQLException {
        Filme filme = null;

        Filme filmeDAO = new FilmeControlador().sortear(filme);
        Assert.assertNull(filmeDAO);
    }
}
