package br.com.impacta.prateleiradigital.apresentacao;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import br.com.impacta.prateleiradigital.controle.FilmeControlador;
import br.com.impacta.prateleiradigital.negocio.Filme;

public class ListarERemoverFilme {

    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Remover um filme \n");

        System.out.println("Insira um titulo parcial: ");
        String tituloParcial = scanner.nextLine();

        System.out.println("Insira um gênero: ");
        String genero = scanner.nextLine();

        System.out.println("Insira um ano inicial: ");
        String anoI = scanner.nextLine();
        int anoIConvertido = Integer.parseInt(anoI);

        System.out.println("Insira um ano final: ");
        String anoF = scanner.nextLine();
        int anoFConvertido = Integer.parseInt(anoF);

        List<Filme> listaFilme = new FilmeControlador().consultarFilmes(tituloParcial, genero, anoIConvertido, anoFConvertido);

        int count = 0;
        for (Filme cadaFilme : listaFilme) {
            System.out.println("index: " + count);
            System.out.println(cadaFilme);
            count++;
        }

        System.out.println("*** Para excluir um filme insira o id ***");
        int index = scanner.nextInt();

        // excluir o filme informado
        new FilmeControlador().remover(listaFilme.get(index));
        listaFilme.clear();
        listaFilme =
                new FilmeControlador().consultarFilmes(
                        tituloParcial,
                        genero,
                        anoIConvertido,
                        anoFConvertido);

        for (Filme cadaFilme : listaFilme) {
            System.out.println("id Filme: " + cadaFilme.getIdFilme());
            System.out.println(cadaFilme);
        }


    }

}
