public class Professor  extends Profissao implements IClt{

    private String materia;
    private int qtdEscolaTrabalhadas;

    public Professor(double salarioBruto, String materia, int qtdEscolaTrabalhadas) {
        super(salarioBruto);
        this.salarioLiquido = salarioBruto - this.getImpostoSalario() * qtdEscolaTrabalhadas;
        this.materia = materia;
        this.qtdEscolaTrabalhadas = qtdEscolaTrabalhadas;
    }

    @Override
    public double getImpostoSalario() {
        return this.salarioBruto * 0.20;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Materia: " + materia + "\n" +
                "Quantidade de escolas trabalhadas: " + qtdEscolaTrabalhadas;

    }

}
