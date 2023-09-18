public class Medico extends Profissao implements IClt {
    private String crm;
    private String especialidade;

    public Medico(double salarioBruto, String crm, String especialidade) {
        super(salarioBruto);
        this.salarioLiquido = salarioBruto - this.getImpostoSalario();
        this.crm = crm;
        this.especialidade = especialidade;
    }

    @Override
    public double getImpostoSalario() {
        return this.salarioBruto * 0.15;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
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
                "CRM: " + crm + "\n" +
                "Especialidade: " + especialidade;
    }


}
