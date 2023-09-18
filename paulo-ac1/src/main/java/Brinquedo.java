public abstract class Brinquedo {
    protected int codigo;
    protected String nome;

    public Brinquedo(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public abstract double getRenda();

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("Codigo: %d, Nome: %s, Renda: %.2f,", this.codigo, this.nome, this.getRenda());
    }
}
