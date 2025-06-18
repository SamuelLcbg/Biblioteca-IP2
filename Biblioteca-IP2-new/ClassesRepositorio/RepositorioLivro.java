package ClassesRepositorio;
import ClassesBasicas.Livro;

public class RepositorioLivro {
    private static RepositorioLivro instancia = null;

    private Livro[] livros;
    private int proxima;
    private final int tamanho = 100;

    private RepositorioLivro() {
        this.livros = new Livro[tamanho];
        this.proxima = 0;
    }

    public static RepositorioLivro getInstance() {
        if (instancia == null) {
            instancia = new RepositorioLivro();
        }
        return instancia;
    }





    // Procurar Livro:
    public Livro procurar(String codigo) throws INEException {
        int i = 0;
        boolean achou = false;

        while ((!achou) && (i < this.proxima)) {
            if (codigo.equals(this.livros[i].getCodigo())) {
                achou = true;

            } else {
                i++;
            }
        }

        if (!achou) {
            throw new INEException(codigo);
        }

        return this.livros[i];
    }


    public void adicionar(Livro livro) throws RCException, IJEException, INEException {
        if (this.proxima >= this.livros.length) {
            throw new RCException();
        }

        try {
            procurar(livro.getCodigo());

            throw new IJEException(livro.getCodigo());
        } catch (INEException e) {

            this.livros[this.proxima] = livro;
            this.proxima++;
        }
    }

    // Procurar Indice Livro:
    public int procurarIndice(String codigo) throws INEException {
        int i = 0;
        boolean achou = false;

        while ((!achou) && (i < this.proxima)) {
            if (codigo.equals(this.livros[i].getCodigo())) {
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
    //  Remover Livro:
    public void remover(String codigo) throws INEException {
        int i = this.procurarIndice(codigo);

        this.livros[i] = this.livros[this.proxima - 1];
        this.livros[this.proxima - 1] = null;
        this.proxima--;
    }


    public boolean repositorioVazio() {
        return this.proxima == 0;
    }

    //
    public boolean repositorioCheio() {
        return this.proxima >= this.livros.length;
    }




}

