public class BrinquedoIngresso extends Brinquedo implements IImposto{
    private double valorIngresso;
    private int qtdIngressoVendido;

    public BrinquedoIngresso(int codigo, String nome, double valorIngresso, int qtdIngressoVendido) {
        super(codigo, nome);
        this.valorIngresso = valorIngresso;
        this.qtdIngressoVendido = qtdIngressoVendido;
    }

    @Override
    public double getRenda() {
        return this.valorIngresso * this.qtdIngressoVendido;
    }

    @Override
    public double geValorImposto() {
        return this.getRenda() * 0.18;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    public int getQtdIngressoVendido() {
        return qtdIngressoVendido;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public void setQtdIngressoVendido(int qtdIngressoVendido) {
        this.qtdIngressoVendido = qtdIngressoVendido;
    }

    @Override
    public String toString() {
        return String.format("%s Valor do Ingresso: %.2f, Quantidade de Ingressos Vendidos: %d, Imposto: %.2f", super.toString(), this.valorIngresso, this.qtdIngressoVendido, this.geValorImposto());
    }
}
