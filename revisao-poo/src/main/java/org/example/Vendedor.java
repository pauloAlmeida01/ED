package org.example;

public class Vendedor extends Funcionario {
    private Double vendas;

    private Double taxa;

    public Vendedor(String nome, String cpf, Double vendas, Double taxa) {
        super(nome, cpf);
        this.vendas = vendas;
        this.taxa = taxa;
    }

    @Override
    public Double calcularSalario() {
        return this.vendas * this.taxa;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    @Override

    public String toString() {
        return "Vendedor{" + "nome=" + getNome() + ", cpf=" + getCpf() + ", vendas=" + vendas + ", taxa=" + taxa + '}';
    }
}
