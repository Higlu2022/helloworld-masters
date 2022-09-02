package br.com.impacta.prateleiradigital.persistencia;

import br.com.impacta.prateleiradigital.negocio.Filme;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FilmeDAO {

    public void incluir(Filme filme) throws SQLException {

        String queryInsert = "INSERT INTO impacta.filme VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = getConnection().prepareStatement(queryInsert);

        preparedStatement.setNull(1, Types.INTEGER);
        preparedStatement.setString(2, filme.getTitulo());
        preparedStatement.setString(3, filme.getDiretores());
        preparedStatement.setDouble(4, filme.getNota());
        preparedStatement.setInt(5, filme.getDuracao());
        preparedStatement.setInt(6, filme.getAno());
        preparedStatement.setString(7, filme.getGenero());
        preparedStatement.setInt(8, filme.getNumDeVotos());
        preparedStatement.setString(9, filme.getUrl());

        preparedStatement.executeUpdate();

        System.out.println("Filme adicionado com sucesso!!");
    }

    public void incluirLista(List<Filme> filme) throws SQLException {
        for (Filme cadaFilme : filme) {
            incluir(cadaFilme);
        }

    }

    public void excluir(Filme filme) throws SQLException {

        String sqlQuery =
                "DELETE FROM impacta.filme WHERE idfilme= ?";

        PreparedStatement preStm =
                getConnection().prepareStatement(sqlQuery);

        preStm.setInt(1, filme.getIdFilme());
        preStm.executeUpdate();
        preStm.close();
    }

    public List<Filme> consultarListaDeFilmes(String tituloParcial, String genero, int anoInicial, int anoFinal) throws SQLException {

        ResultSet resultSet = null;
        Statement statement = null;

        if (tituloParcial.equals("") && genero.equals("")) {

            String queryConsultAll = "SELECT * FROM impacta.filme ";
            statement = getConnection().createStatement();
            resultSet = statement.executeQuery(queryConsultAll);
        } else {
            String queryConsult = "SELECT * FROM impacta.filme " +
                    "where genero like \"%" + genero + "%\"" +
                    "and titulo like \"%" + tituloParcial + "%\"" +
                    "and ano between  " + anoInicial + "and" +
                    "and titulo like \"%" + tituloParcial + "%\"";

            statement = getConnection().createStatement();
            resultSet = statement.executeQuery(queryConsult);
        }

        List<Filme> listFilme = new ArrayList<>();
        while (resultSet.next()) {
            Filme filme = new Filme();
            filme.setIdFilme(resultSet.getInt("idFilme"));
            filme.setTitulo(resultSet.getString("titulo"));
            filme.setDiretores(resultSet.getString("diretores"));
            filme.setNota(resultSet.getDouble("nota"));
            filme.setDuracao(resultSet.getInt("duracao"));
            filme.setAno(resultSet.getInt("ano"));
            filme.setGenero(resultSet.getString("genero"));
            filme.setNumDeVotos(resultSet.getInt("numDeVotos"));
            filme.setUrl(resultSet.getString("url"));

            listFilme.add(filme);
        }

        return listFilme;

    }

    public List<Filme> consultarListaDeFilmes(String genero, int ano, String tituloParcial) throws SQLException {


        ResultSet resultSet = null;
        if (genero.equals("") && ano < 1900 && tituloParcial.equals("")) {

            String queryConsultAll = "SELECT * FROM impacta.filme ";
            Statement statement = getConnection().createStatement();
            resultSet = statement.executeQuery(queryConsultAll);

        } else {

            String queryConsult =
                    "SELECT * FROM impacta.filme " +
                            "where genero like \"%" + genero + "%\"" +
                            "and ano = \"" + ano + "\"" +
                            "and titulo like \"%" + tituloParcial + "%\"";

            Statement statement = getConnection().createStatement();
            resultSet = statement.executeQuery(queryConsult);
        }

        List<Filme> listFilme = new ArrayList<>();
        while (resultSet.next()) {
            Filme filme = new Filme();
            filme.setTitulo(resultSet.getString("titulo"));
            filme.setDiretores(resultSet.getString("diretores"));
            filme.setNota(resultSet.getDouble("nota"));
            filme.setDuracao(resultSet.getInt("duracao"));
            filme.setAno(resultSet.getInt("ano"));
            filme.setGenero(resultSet.getString("genero"));
            filme.setNumDeVotos(resultSet.getInt("numDeVotos"));
            filme.setUrl(resultSet.getString("url"));

            listFilme.add(filme);
        }

        return listFilme;
    }


    public Filme consultarFilme(String genero, String diretores, double notaMinima, int numDeVotos) throws SQLException {

        Filme filme = new Filme();
        String queryConsult = null;
        ResultSet resultSet = null;

        if (genero.equals("") && diretores.equals("") && notaMinima < 0) {
            queryConsult = "SELECT * FROM impacta.filme ";

            Statement statement = getConnection().createStatement();
            resultSet = statement.executeQuery(queryConsult);
        } else {

            queryConsult = "SELECT * FROM impacta.filme " +
                    "where genero like \"%" + genero + "%\"" +
                    "and diretores like \"%" + diretores + "%\"" +
                    "and nota >= \"" + notaMinima + "\"" +
                    "and numDeVotos >= \"" + numDeVotos + "\"";

            Statement statement = getConnection().createStatement();
            resultSet = statement.executeQuery(queryConsult);
        }


        List<Filme> listFilme = new ArrayList<>();
        while (resultSet.next()) {

            filme.setTitulo(resultSet.getString("titulo"));
            filme.setDiretores(resultSet.getString("diretores"));
            filme.setNota(resultSet.getDouble("nota"));
            filme.setDuracao(resultSet.getInt("duracao"));
            filme.setAno(resultSet.getInt("ano"));
            filme.setGenero(resultSet.getString("genero"));
            filme.setNumDeVotos(resultSet.getInt("numDeVotos"));
            filme.setUrl(resultSet.getString("url"));

            listFilme.add(filme);
        }

        if (listFilme.size() > 0) {
            Random random = new Random();
            int numAleatorio = random.nextInt(listFilme.size());
            return listFilme.get(numAleatorio);
        }
        return null;
    }


    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/impacta";
        String usuario = "root";
        String senha = "Imp@ct@";

        return DriverManager.getConnection(url, usuario, senha);
    }

}
