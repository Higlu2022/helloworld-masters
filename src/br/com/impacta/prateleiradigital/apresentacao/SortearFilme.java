package br.com.impacta.prateleiradigital.apresentacao;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.impacta.prateleiradigital.controle.FilmeControlador;
import br.com.impacta.prateleiradigital.negocio.Filme;

public class SortearFilme {

    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

        Filme filme = new Filme();

        System.out.println("*** Indicar um Filme *** \n");

        System.out.println("Insira um gênero: ");
        filme.setGenero(scanner.nextLine());
        System.out.println("Insira um diretor: ");
        filme.setDiretores(scanner.nextLine());
        System.out.println("Insira uma nota de avaliação: ");
        filme.setNota(scanner.nextDouble());
        System.out.println("Insira um número mínimo de votos: ");
        filme.setNumDeVotos(scanner.nextInt());


        Filme filmeDAO = new FilmeControlador().sortear(filme);

        if (filmeDAO != null) {
            System.out.println(filmeDAO);
        }
        System.out.println("Nenhum filme encontrado!!");

    }

}
