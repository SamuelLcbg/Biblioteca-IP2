package RepositorioTeste;

import ClassesBasicas.Cliente;
import ClassesBasicas.Emprestimo;
import ClassesBasicas.Livro;
import ClassesBasicas.Funcionario;

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

        System.out.println("\n\n ---------- FUNCIONARIO --------- \n\n");

        Funcionario funcionario1 = new Funcionario("Rafaelly@hotmail.com", "Ajudante de livros", "Rafelly" , "123");
        System.out.println(funcionario1);


        System.out.println("\n\n ---------- EMPRÉSTIMO ---------");

        Emprestimo emprestimo1 = new Emprestimo(1, LocalDate.of(2025, 5, 19), LocalDate.of(2025, 6, 19), cliente1, livroNovo);
        System.out.println(emprestimo1);

        Emprestimo emprestimoIgual = new Emprestimo(1, LocalDate.of(2025, 5, 19), LocalDate.of(2025, 6, 19), cliente1, livroNovo);
        System.out.println("\n\n" + emprestimo1.equals(emprestimoIgual));

        Livro livroNovo2 = new Livro("Fina flor da malandragem", "Carlos Didier", "historiografia", "8790", 3, 2022, true);

        Cliente cliente2 = new Cliente("Cristina", "111", "219", "Paquetá", "Cristina@gmail.com");

        Emprestimo emprestimo2 = new Emprestimo(2, LocalDate.of(2024, 12, 23), LocalDate.of(2025, 3, 12), cliente2, livroNovo2);
        System.out.println(emprestimo2);

        System.out.println("\n\n" + emprestimo2.equals(emprestimo1));

        System.out.println(emprestimo2.getLivro());

        emprestimo2.setLivro(livroNovo);
        System.out.println("\n\n" + emprestimo2.getLivro());









    }







}