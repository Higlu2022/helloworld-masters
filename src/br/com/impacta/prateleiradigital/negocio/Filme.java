package br.com.impacta.prateleiradigital.negocio;

public class Filme {

    private int idFilme;
    private String titulo;
    private String diretores;
    private double nota;
    private int duracao;
    private int ano;
    private String genero;
    private int numDeVotos;
    private String url;

    public Filme() {

    }

    public Filme(String titulo, String diretores, double nota, int duracao, int ano, String genero, int numDeVotos,
                 String url) {

        this.titulo = titulo;
        this.diretores = diretores;
        this.nota = nota;
        this.duracao = duracao;
        this.ano = ano;
        this.genero = genero;
        this.numDeVotos = numDeVotos;
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getDiretores() {
        return diretores;
    }

    public void setDiretores(String diretores) {
        this.diretores = diretores;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumDeVotos() {
        return numDeVotos;
    }

    public void setNumDeVotos(int numDeVotos) {
        this.numDeVotos = numDeVotos;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    @Override
    public String toString() {
        return " Titulo: " + titulo +
                "\n Diretore: " + diretores +
                "\n Nota: " + nota +
                "\n Duração: " + duracao +
                "\n Ano: " + ano +
                "\n Gênero: " + genero +
                "\n Número de votos: " + numDeVotos +
                "\n Site: " + url + "\n";
    }


}