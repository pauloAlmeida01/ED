package org.example;

public class Horista extends Funcionario{
    private Integer horas;

    private Double valorHora;

    public Horista(String nome, String cpf, Integer horas, Double valorHora) {
        super(nome, cpf);
        this.horas = horas;
        this.valorHora = valorHora;
    }

    @Override
    public Double calcularSalario() {
        return this.horas * this.valorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "Horista{" + "nome=" + getNome() + ", cpf=" + getCpf() + ", horas=" + horas + ", valorHora=" + valorHora + '}';
    }
}
