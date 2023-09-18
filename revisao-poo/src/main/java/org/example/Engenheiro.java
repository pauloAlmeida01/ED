package org.example;

public class Engenheiro extends Funcionario {
    private Double salario;

    public Engenheiro(String nome, String cpf, Double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

@Override
    public Double calcularSalario() {
        return this.salario;
    }
    
    public Double getSalario() {
        return salario;
    }



    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Engenheiro{" + "nome=" + getNome() + ", cpf=" + getCpf() + ", salario=" + salario + '}';
    }
}
