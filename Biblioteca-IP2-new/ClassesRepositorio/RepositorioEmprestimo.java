package ClassesRepositorio;
import ClassesBasicas.Emprestimo;
import ClassesBasicas.Livro;

public class RepositorioEmprestimo {
    private static RepositorioEmprestimo instanciaEmprestimo= null;
    private Emprestimo[] emprestimos;
    private int proxima;
    private int tamanho = 100;



    public RepositorioEmprestimo() {
        this.emprestimos = new Emprestimo[tamanho];
        this.proxima = 0;
    }

    public static RepositorioEmprestimo getInstance() {
        if (instanciaEmprestimo == null) {
            instanciaEmprestimo = new RepositorioEmprestimo();
        }
        return instanciaEmprestimo;
    }










  //Procurar emprestimo:
  public Emprestimo procurar(String codigo) throws INEException {
      int i = 0;
      boolean achou = false;

      while ((!achou) && (i < this.proxima)) {
          if (codigo.equals(this.emprestimos[i].getCodigo())) {
              achou = true;
          } else {
              i++;
          }
      }

      if (!achou) {
          throw new INEException(codigo);
      }

      return this.emprestimos[i];
  }
    // Adicionar Emprestimo:
    public void adicionar(Emprestimo emprestimo) throws RCException, IJEException, INEException {
        if (this.proxima >= this.emprestimos.length) {
            throw new RCException();
        }

        try {
            procurar(emprestimo.getCodigo());

            throw new IJEException(emprestimo.getCodigo());
        } catch (INEException e) {

            this.emprestimos[this.proxima] = emprestimo;
            this.proxima++;
        }
    }
    //Procurar Indice Emprestimo:
    public int procurarIndice(String codigo) throws INEException {
        int i = 0;
        boolean achou = false;

        while ((!achou) && (i < this.proxima)) {
            if (codigo.equals(this.emprestimos[i].getCodigo())) {
                achou = true;
            } else {
                i++;
            }
        }

        if (!achou) {
            throw new INEException(codigo);
        }

        return i;
    }

  // Remover Emprestimo:
  public void remover(String codigo) throws INEException {
      int i = this.procurarIndice(codigo);

      this.emprestimos[i] = this.emprestimos[this.proxima - 1];
      this.emprestimos[this.proxima - 1] = null;
      this.proxima--;
  }




    public boolean repositorioVazio() {
        return this.proxima == 0;
    }


    public boolean repositorioCheio() {
        return this.proxima >= this.emprestimos.length;
    }
























}

















