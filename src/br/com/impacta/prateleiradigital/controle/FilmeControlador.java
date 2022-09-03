package br.com.impacta.prateleiradigital.controle;

import br.com.impacta.prateleiradigital.negocio.Filme;
import br.com.impacta.prateleiradigital.persistencia.FilmeDAO;

import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FilmeControlador {

    FilmeDAO filmeDAO = new FilmeDAO();


    public void adicionar(Filme filme) throws SQLException {

        filmeDAO.incluir(filme);
    }

    public List<Filme> consultarFilmes(String tituloParcial, String genero, int anoInicial, int anoFinal) throws SQLException {


        return filmeDAO.consultarListaDeFilmes(tituloParcial, genero, anoInicial, anoFinal);
    }

    public List<Filme> consultarFilmes(String genero, int ano, String tituloParcial) throws SQLException {

        return filmeDAO.consultarListaDeFilmes(genero, ano, tituloParcial);
    }


    public void remover(Filme filme) throws SQLException {
        filmeDAO.excluir(filme);

    }

    public Filme sortear(String genero, String diretores, double notaMinima, int numeroDeVotos) throws SQLException {

        return filmeDAO.consultarFilme(genero, diretores, notaMinima, numeroDeVotos);
    }


    public Filme sortear(Filme filme) throws SQLException {

        return filmeDAO.consultarFilme(filme.getGenero(), filme.getDiretores(), filme.getNota(), filme.getNumDeVotos());

    }

    public void imoportarListaDeFilmes(String caminhoDoArquivo) throws IOException, SQLException {

        List<Filme> filmeList = new ArrayList<>();
        File file = new File(caminhoDoArquivo);

        FileReader fileReader = new FileReader(file);
        BufferedReader bR = new BufferedReader(fileReader);

        String linha;
        bR.readLine();

        while ((linha = bR.readLine()) != null) {
            String[] array = linha.split(";");
            Filme filme = new Filme();
            filme.setTitulo(array[0]);
            filme.setDiretores(array[1]);
            filme.setNota(Double.parseDouble(array[2]));
            filme.setDuracao(Integer.parseInt(array[3]));
            filme.setAno(Integer.parseInt(array[4]));
            filme.setGenero(array[5]);
            filme.setNumDeVotos(Integer.parseInt(array[6]));
            filme.setUrl(array[7]);


            filmeList.add(filme);

        }
        bR.close();

        filmeDAO.incluirLista(filmeList);

    }

}
