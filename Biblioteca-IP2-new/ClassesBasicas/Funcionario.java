package ClassesBasicas;

import java.util.Objects;

public class Funcionario {
    String Nome;
    String Cargo;
    String Login;
    String Senha;

    public Funcionario(){
        this.Nome = "defaultNome";
        this.Cargo = "defaultCargo";
        this.Login = "defaultLogin";
        this.Senha = "defaultSenha";
    }

    public Funcionario(String login, String cargo, String nome, String senha) {
        this.Login = login;
        this.Cargo = cargo;
        this.Nome = nome;
        this.Senha = senha;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario that)) return false;
        return Objects.equals(getNome(), that.getNome()) && Objects.equals(getCargo(), that.getCargo()) && Objects.equals(getLogin(), that.getLogin()) && Objects.equals(getSenha(), that.getSenha());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getCargo(), getLogin(), getSenha());
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "Nome='" + Nome + '\'' +
                ", Cargo='" + Cargo + '\'' +
                ", Login='" + Login + '\'' +
                ", Senha='" + Senha + '\'' +
                '}';
    }
}
