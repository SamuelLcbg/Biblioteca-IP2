package RepositorioTeste;

import ClassesBasicas.Cliente;
import ClassesBasicas.Emprestimo;
import ClassesBasicas.Livro;
import ClassesBasicas.Funcionario;
import ClassesRepositorio.INEException;
import ClassesRepositorio.RCException;
import ClassesRepositorio.RepositorioLivro;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("======LIVRO======");
        RepositorioLivro repositorioLivro = RepositorioLivro.getInstance();
        Livro Livro1 = new Livro("1984", "George Orwell","Ficção Científica","789456123","123456789",1,2005,true);
        Livro Livro2 = new Livro("História de fulano","Fulano de tal","Biografia","123456789","1444",1,2010,true);
        try{
            repositorioLivro.adicionar(Livro1);
            System.out.println("Livro adicionado na posição " + repositorioLivro.procurarIndice(Livro1.getCodigo()));
        } catch (RCException e) {
            throw new RuntimeException(e);
        }

        try{
            repositorioLivro.adicionar(Livro2);
            System.out.println("Livro adicionado na posição " + repositorioLivro.procurarIndice(Livro2.getCodigo()));
        } catch (RCException e) {
            throw new RuntimeException(e);
        }
        try{
            repositorioLivro.procurar(Livro2.getCodigo());
            System.out.println("Livro " + repositorioLivro.procurar(Livro2.getCodigo()));
        } catch (INEException e) {
            throw new RuntimeException(e);
        }



    }
}

