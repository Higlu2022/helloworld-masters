package br.com.impacta.prateleiradigital.controle;

import br.com.impacta.prateleiradigital.negocio.Filme;
import br.com.impacta.prateleiradigital.persistencia.FilmeDAO;

import java.sql.SQLException;
import java.util.List;

public class FilmeControlador {

    FilmeDAO filmeDAO = new FilmeDAO();


    public void adicionar(Filme filme) throws SQLException {

        filmeDAO.incluir(filme);
    }

    public List<Filme> consultarFilmes(String tituloParcial, String genero, int anoInicial, int anoFinal) throws SQLException {
        //TODO implementar regra para consultar uma lista de filmes

        return filmeDAO.consultarListaDeFilmes(tituloParcial, genero, anoInicial, anoFinal);
    }

    public List<Filme> consultarFilmes(String genero, int ano, String tituloParcial) throws SQLException {

        return filmeDAO.consultarListaDeFilmes(genero, ano, tituloParcial);
    }


    public void remover(Filme filme) throws SQLException {
        filmeDAO.excluir(filme);

    }

    public Filme sortear(String genero, String diretores, double notaMinima, int numeroDeVotos) throws SQLException {
        //TODO Implementar a regra para sortear o filme
        return filmeDAO.consultarFilme(genero, diretores, notaMinima, numeroDeVotos);
    }


    public Filme sortear(Filme filme) throws SQLException {

        return filmeDAO.consultarFilme(filme.getGenero(), filme.getDiretores(), filme.getNota(), filme.getNumDeVotos());

    }

    public void imoportarListaDeFilmes(String caminho) {
        //TODO Implementar a regra para importar um filme
        //TODO Verificar o caminho do arquivo e ler os dados para criar uma lista de filmes com os dados do arquivo

        //TODO criar uma ForEach para chamar o método adicionar para cada elemento da lista


    }

}
