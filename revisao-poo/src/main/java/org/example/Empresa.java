package org.example;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
        System.out.println("Funcionário adicionado com sucesso!");
    }

    public void exibirTodos(){
        for(Funcionario funcionario : this.funcionarios){
            System.out.println(funcionario);
        }
    }

    public void exibirHorista() {
        for(Funcionario funcionario : this.funcionarios){
            if(funcionario instanceof Horista){
                System.out.println(funcionario);
            }
        }
    }

    public void exibeTotalSalario(){
        Double total = 0.0;
        for(Funcionario funcionario : this.funcionarios){
            total += funcionario.calcularSalario();
        }
        System.out.println("Total de salários: " + total);
    }

    @Override
    public String toString() {
        return "Empresa{" + "funcionarios=" + funcionarios + '}';
    }

}
