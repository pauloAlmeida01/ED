package org.example;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;

    private List<Aluno> alunos;

    public Escola(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void exibeTodos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public void exibeAlunoGraduacao() {
        for (Aluno aluno : alunos) {
            if (aluno instanceof AlunoGraduacao) {
                System.out.println(aluno);
            }
        }
    }

    public void exibeAprovaodos() {
        for (Aluno aluno : alunos) {
            if (aluno.calculaMedia() >= 6.0) {
                System.out.println(aluno);
            }
        }
    }

    public void buscarAluno(String ra) {
        for (Aluno aluno : alunos) {
            if (aluno.getRa().equals(ra)) {
                System.out.println(aluno);
            }
        }
    }
}
