public class Servico implements Vendavel {
    private String descricao;
    private int codigo;
    private int quantHoras;
    private double valorHora;

    public Servico(String descricao, int codigo, int quantHoras, double valorHora) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.quantHoras = quantHoras;
        this.valorHora = valorHora;
    }

    @Override
    public double getValorVenda() {
        return quantHoras* valorHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQuantHoras() {
        return quantHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setQuantHoras(int quantHoras) {
        this.quantHoras = quantHoras;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }


    @Override
    public String toString() {
        return String.format("Serviço: %s, Código: %d, Quantidade de Horas: %d, Valor da Hora: %.2f, Preço de Venda: %.2f", this.descricao, this.codigo, this.quantHoras, this.valorHora, this.getValorVenda());
    }
}
