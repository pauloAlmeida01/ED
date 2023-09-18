package org.example;

public class TesteEscola {

    public static void main(String[] args) {
        AlunoFundamental alunoFundamental = new AlunoFundamental("123", "João", 10.0, 10.0, 10.0, 10.0);
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao("456", "Maria", 10.0, 10.0);
        AlunoPos alunoPos = new AlunoPos("789", "José", 10.0, 10.0, 10.0);

        Escola escola = new Escola("Escola do Bairro");

        escola.adicionaAluno(alunoFundamental);
        escola.adicionaAluno(alunoGraduacao);
        escola.adicionaAluno(alunoPos);

        escola.exibeTodos();
        System.out.println("====================================");
        escola.exibeAlunoGraduacao();
        System.out.println("====================================");
        escola.exibeAprovaodos();
        System.out.println("====================================");
        escola.buscarAluno("123");



    }
}
