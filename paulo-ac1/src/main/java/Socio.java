public class Socio implements IImposto{
    private String nome;
    private double honorario;

    public Socio(String nome, double honorario) {
        this.nome = nome;
        this.honorario = honorario;
    }

    @Override
    public double geValorImposto() {
        return this.honorario * 0.24;
    }

    public String getNome() {
        return nome;
    }

    public double getHonorario() {
        return honorario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHonorario(double honorario) {
        this.honorario = honorario;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Honorario: %.2f, Imposto: %.2f", this.nome, this.honorario, this.geValorImposto());
    }
}
