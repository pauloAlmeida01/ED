public class Perfume extends Produto {
    private String fragancia;

    public Perfume(String fragancia, int codigo, String descricao, double preco) {
        super(codigo, descricao, preco);
        this.fragancia = fragancia;
    }



    @Override
    public double getValorTributo() {
        return getPreco() * 0.27;
    }

    @Override
    public String toString() {
        return super.toString() + " Perfume{" + "fragancia=" + fragancia + '}';
    }
}
