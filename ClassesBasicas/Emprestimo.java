package ClassesBasicas;

import java.time.LocalDate;
import java.util.Objects;

public class Emprestimo {
    LocalDate DataEmprestimo;
    LocalDate DataDevolucao;
    Class Cliente;
    Class Livro;

    public Emprestimo() {
        this.DataEmprestimo = LocalDate.parse("defaultDataEmp");
        this.DataDevolucao = LocalDate.parse("defaultDataDev");
        this.Cliente = "defaultCliente".getClass();
        this.Livro = "defaultLivro".getClass();
    }

    public Emprestimo(LocalDate DataEmprestimo, LocalDate DataDevolucao,Class Cliente, Class Livro){
        this.DataEmprestimo = DataEmprestimo;
        this.DataDevolucao = DataDevolucao;
        this.Cliente = Cliente;
        this.Livro = Livro;
    }

    public LocalDate getDataEmprestimo() {
        return DataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        DataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return DataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        DataDevolucao = dataDevolucao;
    }

    public Class getCliente() {
        return Cliente;
    }

    public void setCliente(Class cliente) {
        Cliente = cliente;
    }

    public Class getLivro() {
        return Livro;
    }

    public void setLivro(Class livro) {
        Livro = livro;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "DataEmprestimo=" + DataEmprestimo +
                ", DataDevolucao=" + DataDevolucao +
                ", Cliente=" + Cliente +
                ", Livro=" + Livro +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emprestimo that)) return false;
        return Objects.equals(getDataEmprestimo(), that.getDataEmprestimo()) && Objects.equals(getDataDevolucao(), that.getDataDevolucao()) && Objects.equals(getCliente(), that.getCliente()) && Objects.equals(getLivro(), that.getLivro());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDataEmprestimo(), getDataDevolucao(), getCliente(), getLivro());
    }
}
