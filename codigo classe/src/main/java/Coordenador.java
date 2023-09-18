public class Coordenador extends Funcionario implements IBonus {
    private int qtdHorasCoordenacao;
    private double valorHoraCoordenacao;
    private int qtdCursoCoordenados;

    public Coordenador(String cpf, String nome, int qtdHorasCoordenacao, double valorHoraCoordenacao, int qtdCursoCoordenados) {
        super(cpf, nome);
        this.qtdHorasCoordenacao = qtdHorasCoordenacao;
        this.valorHoraCoordenacao = valorHoraCoordenacao;
        this.qtdCursoCoordenados = qtdCursoCoordenados;
    }

    @Override
    public Double calculaSalario() {
        return this.qtdHorasCoordenacao * this.valorHoraCoordenacao + 4.5 + this.qtdCursoCoordenados * 500;
    }

    @Override
    public Double getValorBonus() {
        return this.calculaSalario()*0.20;
    }

    public int getQtdHorasCoordenacao() {
        return qtdHorasCoordenacao;
    }

    public void setQtdHorasCoordenacao(int qtdHorasCoordenacao) {
        this.qtdHorasCoordenacao = qtdHorasCoordenacao;
    }

    public double getValorHoraCoordenacao() {
        return valorHoraCoordenacao;
    }

    public void setValorHoraCoordenacao(double valorHoraCoordenacao) {
        this.valorHoraCoordenacao = valorHoraCoordenacao;
    }

    public int getQtdCursoCoordenados() {
        return qtdCursoCoordenados;
    }

    public void setQtdCursoCoordenados(int qtdCursoCoordenados) {
        this.qtdCursoCoordenados = qtdCursoCoordenados;
    }

    @Override
    public String toString() {
        return "Nome:%s\nCPF:%s\nSalario: R$ %.2f\nBonus: %.2f".formatted(this.nome, this.cpf, this.calculaSalario(), this.getValorBonus());
    }
}
