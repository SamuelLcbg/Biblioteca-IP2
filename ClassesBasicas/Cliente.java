package ClassesBasicas;

import java.util.Objects;

public class Cliente {
    String Nome;
    String Cpf;
    String Endereco;
    String Telefone;
    String Email;

    public Cliente(){
        this.Nome = "defaultNome";
        this.Cpf = "defaultCPF";
        this.Endereco = "defaultEndereco";
        this.Telefone = "defaultTelefone";
        this.Email = "defaultEmail";

    }

    public Cliente(String nome, String cpf, String telefone, String endereco, String email) {
        this.Nome = nome;
        this.Cpf = cpf;
        this.Telefone = telefone;
        this.Endereco = endereco;
        this.Email = email;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nome='" + Nome + '\'' +
                ", Cpf='" + Cpf + '\'' +
                ", Endereco='" + Endereco + '\'' +
                ", Telefone='" + Telefone + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente cliente)) return false;
        return Objects.equals(getNome(), cliente.getNome()) && Objects.equals(getCpf(), cliente.getCpf()) && Objects.equals(getEndereco(), cliente.getEndereco()) && Objects.equals(getTelefone(), cliente.getTelefone()) && Objects.equals(getEmail(), cliente.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getCpf(), getEndereco(), getTelefone(), getEmail());
    }
}
