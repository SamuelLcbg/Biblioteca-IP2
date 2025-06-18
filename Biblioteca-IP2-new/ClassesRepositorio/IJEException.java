package ClassesRepositorio;
//Item já existe
public class IJEException extends RuntimeException {
  public IJEException(String codigo) {
    super("Item com código '" + codigo + "' já existe no repositório.");
  }



}
