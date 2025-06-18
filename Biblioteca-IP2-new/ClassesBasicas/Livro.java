package ClassesBasicas;

import java.util.Objects;

public class Livro {
    String Titulo;
    String Autor;
    String Categoria;
    String ISBN;
    String Codigo;
    int qtdDisponivel;
    int anoLancamento;
    boolean disponivel;


    public Livro() {
        this.Titulo = "defaultTitulo";
        this.Autor = "defaultAutor";
        this.Categoria = "defaultCategoria";
        this.ISBN = "defaultISBN";
        this.Codigo = "defaultCodigo";
        this.qtdDisponivel = 0;
        this.anoLancamento = 0;
        this.disponivel = false;

    }


    public Livro(String Titulo, String Autor, String Categoria, String ISBN, String Codigo, int qtdDisponivel, int anoLancamento, boolean disponivel) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Categoria = Categoria;
        this.ISBN = ISBN;
        this.Codigo = Codigo;
        this.qtdDisponivel = qtdDisponivel;
        this.anoLancamento = anoLancamento;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getCategoria() {
        return Categoria;
    }


    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public int getQtdDisponivel() {
        return qtdDisponivel;
    }

    public void setQtdDisponivel(int qtdDisponivel) {
        this.qtdDisponivel = qtdDisponivel;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Titulo='" + Titulo + '\'' +
                ", Autor='" + Autor + '\'' +
                ", Categoria='" + Categoria + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", Codigo='" + Codigo + '\'' +
                ", qtdDisponivel=" + qtdDisponivel +
                ", anoLancamento=" + anoLancamento +
                ", disponivel=" + disponivel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return qtdDisponivel == livro.qtdDisponivel && anoLancamento == livro.anoLancamento && disponivel == livro.disponivel && Objects.equals(Titulo, livro.Titulo) && Objects.equals(Autor, livro.Autor) && Objects.equals(Categoria, livro.Categoria) && Objects.equals(ISBN, livro.ISBN) && Objects.equals(Codigo, livro.Codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Titulo, Autor, Categoria, ISBN, Codigo, qtdDisponivel, anoLancamento, disponivel);
    }
}
