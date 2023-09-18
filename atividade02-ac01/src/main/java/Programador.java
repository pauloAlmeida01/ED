public class Programador extends Profissao {
    private String especialidade;

    public Programador(double salarioBruto, String especialidade) {
        super(salarioBruto);
        this.salarioLiquido = salarioBruto;
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Especialidade: " + especialidade;
    }
}
