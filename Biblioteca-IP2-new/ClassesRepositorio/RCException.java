package ClassesRepositorio;
//Repositorio Cheio
public class RCException extends Exception {
    public RCException(String message) {
        super(message);
    }

    public RCException() {
        super("Repositório está cheio. Não é possível cadastrar mais itens.");
    }
}