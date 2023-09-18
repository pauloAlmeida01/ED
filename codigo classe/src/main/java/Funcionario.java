public abstract class Funcionario {

    protected String cpf;
    protected String nome;

    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public abstract Double calculaSalario();

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //toString com .formatted
    @Override
    public String toString() {
        return "Nome:%s\nCPF:%s\nSalario: R$ %.2f".formatted(this.nome, this.cpf, this.calculaSalario());
    }


}
