public class Secretaria extends Funcionario {

    private double salario;
    private double extra;

    public Secretaria(String cpf, String nome, double salario, double extra) {
        super(cpf, nome);
        this.salario = salario;
        this.extra = extra;
    }

    @Override
    public Double calculaSalario() {
        return this.salario + this.extra;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getExtra() {
        return extra;
    }

    public void setExtra(double extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "Nome:%s\nCPF:%s\nSalario: R$ %.2f".formatted(this.nome, this.cpf, this.calculaSalario());
    }
}
