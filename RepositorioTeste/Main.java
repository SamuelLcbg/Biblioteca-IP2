package RepositorioTeste;

import ClassesBasicas.Cliente;
import ClassesBasicas.Emprestimo;
import ClassesBasicas.Livro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n\n ---------- LIVRO --------- \n\n");


        Livro livroDefault = new Livro();
        System.out.println(livroDefault.getAutor());

        Livro livroNovo = new Livro("1984", "Fulano de tal", "Ficção Científica", "45678", 5, 1950, true);

        //comparando livros ->
        System.out.println(livroNovo.equals(livroDefault));

        //mudando o nome do autor->
        livroDefault.setAutor("Fulano de tal");
        System.out.println(livroDefault.getAutor());

        System.out.println("\n\n ---------- CLIENTE --------- \n\n");

        Cliente cliente1 = new Cliente("Gabriel", "145", "819", "Marte", "gabriel@gmail.com");
        System.out.println(cliente1);

        System.out.println("\n\n ---------- EMPRÉSTIMO ---------");

        Emprestimo emprestimo1 = new Emprestimo(1, LocalDate.of(2025, 5, 19), LocalDate.of(2025, 6, 19), cliente1, livroNovo);
        System.out.println(emprestimo1);





    }







}