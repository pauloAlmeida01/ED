public class Livro extends Produto {
    private String nome;
    private String autor;
    private String isbn;

    public Livro(int codigo, double precoCusto, String nome, String autor, String isbn) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public double getValorVenda() {
        return (super.getPrecoCusto()) + (super.getPrecoCusto() * 0.1);
    }


    @Override
    public String toString() {
        return String.format("Livro: %s, Autor: %s, ISBN: %s, Preço de Custo: %.2f, Preço de Venda: %.2f", this.nome, this.autor, this.isbn, super.getPrecoCusto(), this.getValorVenda());
    }
}
