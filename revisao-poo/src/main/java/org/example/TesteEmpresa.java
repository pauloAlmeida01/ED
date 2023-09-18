package org.example;

public class TesteEmpresa {
    public static void main(String[] args) {
        Horista horista = new Horista("João", "123456789-00", 160, 10.0);
        Vendedor vendedor = new Vendedor("Maria", "987654321-00", 10000.0, 0.05);
        Engenheiro engenheiro = new Engenheiro("José", "123456789-00", 10000.0);

        Empresa empresa = new Empresa();
        empresa.adicionarFuncionario(horista);
        empresa.adicionarFuncionario(vendedor);
        empresa.adicionarFuncionario(engenheiro);

        empresa.exibirTodos();
        empresa.exibirHorista();
        empresa.exibeTotalSalario();

        System.out.println(empresa);
    }
}
