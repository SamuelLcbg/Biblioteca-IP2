package ClassesRepositorio;
//Item não encontrado
public class INEException extends RuntimeException {
  public INEException(String codigo) {
    super("Item com código '" + codigo + "' não foi encontrado.");
  }
}