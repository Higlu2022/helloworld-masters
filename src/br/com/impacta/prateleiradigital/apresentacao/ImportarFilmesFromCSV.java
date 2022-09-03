package br.com.impacta.prateleiradigital.apresentacao;

import br.com.impacta.prateleiradigital.controle.FilmeControlador;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class ImportarFilmesFromCSV {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Importar arquivo ***\n");
        System.out.println("Insira o nome do arquivo: ");
        String caminhoDoArquivo = scanner.nextLine();

        try {
            new FilmeControlador().imoportarListaDeFilmes(caminhoDoArquivo);
            System.out.println("Os filmes foram importados com sucesso!!");

        } catch (RuntimeException e) {
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}
