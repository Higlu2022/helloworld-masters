package Cap16;

import br.com.impacta.prateleiradigital.negocio.Filme;

import java.io.*;
import java.util.Random;

public class ConverterEmObjeto {

    public static void main(String[] args) {

        File file = new File("ListaDeFilmes.csv");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bW = new BufferedWriter(fileWriter);
            Random random = new Random();
            int count = 0;

            bW.write("Titulo;Diretores;Nota;Duração;Ano;Gênero;Número de votos;url");
            bW.newLine();

            while (++count < 10) {
                bW.write("O chamado " + count + ";" +
                        "Joe Russo;" +
                        "10.0;" +
                        "120;" +
                        "2023;" +
                        "Terror;" +
                        "50;" +
                        "www.chamado.com.br");


                bW.newLine();
            }
            bW.close();

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


                System.out.println(filme);


            }
            bR.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


