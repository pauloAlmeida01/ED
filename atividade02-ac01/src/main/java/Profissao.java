public abstract class Profissao{

    protected double salarioBruto;
    protected double salarioLiquido;
    protected int salariosGanhos;

    public Profissao(double salarioBruto) {
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = 0;
    }

    public void trabalhar() {
        this.salariosGanhos++;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public int getSalariosGanhos() {
        return salariosGanhos;
    }

    public void setSalariosGanhos(int salariosGanhos) {
        this.salariosGanhos = salariosGanhos;
    }

    @Override
    public String toString() {
        return "Profissao{" + "salarioBruto=" + salarioBruto + ", salarioLiquido=" + salarioLiquido + ", salariosGanhos=" + salariosGanhos + '}';
    }



}
