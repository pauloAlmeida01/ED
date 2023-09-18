public class Dvd extends Produto {
    private String nome;
    private String gravadora;

    public Dvd(int codigo, double precoCusto, String nome, String gravadora) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.gravadora = gravadora;
    }

    public String getNome() {
        return nome;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    @Override
    public double getValorVenda() {
        return (super.getPrecoCusto()) + (super.getPrecoCusto() * 0.20);
    }

    @Override
    public String toString() {
        return String.format("DVD: %s, Gravadora: %s, Preço de Custo: %.2f, Preço de Venda: %.2f", this.nome, this.gravadora, super.getPrecoCusto(), this.getValorVenda());
    }

}
