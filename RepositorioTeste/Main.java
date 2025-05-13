package RepositorioTeste;

import ClassesBasicas.Livro;

public class Main {
    public static void main(String[] args) {
        Livro livroDefault = new Livro();
        System.out.println(livroDefault.getAutor());
        Livro livroNovo = new Livro("1984", "Fulano de tal", "Ficção Científica", "45678", 5, 1950, true);
        System.out.println(livroNovo.equals(livroDefault));
        livroDefault.setAutor("Fulano de tal");
        System.out.println(livroDefault.getAutor());






    }







}