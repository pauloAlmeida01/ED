public class BrinquedoAlugado extends Brinquedo implements IImposto{
    private double valorHora;
    private int qtdHoraAlugada;

    public BrinquedoAlugado(int codigo, String nome, double valorHora, int qtdHoraAlugada) {
        super(codigo, nome);
        this.valorHora = valorHora;
        this.qtdHoraAlugada = qtdHoraAlugada;
    }

    @Override
    public double getRenda() {
        return this.valorHora * this.qtdHoraAlugada;
    }

    @Override
    public double geValorImposto() {
        return this.getRenda() * 0.13;
    }

    public double getValorHora() {
        return valorHora;
    }

    public int getQtdHoraAlugada() {
        return qtdHoraAlugada;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void setQtdHoraAlugada(int qtdHoraAlugada) {
        this.qtdHoraAlugada = qtdHoraAlugada;
    }

    @Override
    public String toString() {
        return String.format("%s Valor da Hora: %.2f, Quantidade de Horas Alugadas: %d, Imposto: %.2f", super.toString(), this.valorHora, this.qtdHoraAlugada, this.geValorImposto());
    }
}
