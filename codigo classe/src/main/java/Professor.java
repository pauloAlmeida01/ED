public class Professor extends Funcionario implements IBonus {

    private Integer qtdAulasSemana;
    private Double valorHoraAula;

    public Professor(String cpf, String nome, Integer qtdAulasSemana, Double valorHoraAula) {
        super(cpf, nome);
        this.qtdAulasSemana = qtdAulasSemana;
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public Double calculaSalario() {
        return this.qtdAulasSemana * this.valorHoraAula*4.5;
    }

    public Integer getQtdAulasSemana() {
        return qtdAulasSemana;
    }

    public void setQtdAulasSemana(Integer qtdAulasSemana) {
        this.qtdAulasSemana = qtdAulasSemana;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }




    @Override
    public Double getValorBonus() {
        return this.calculaSalario()*0.15;
    }

    @Override
    public String toString() {
        return "Nome:%s\nCPF:%s\nSalario: R$ %.2f\nBonus: %.2f".formatted(this.nome, this.cpf, this.calculaSalario(), this.getValorBonus());
    }
}
