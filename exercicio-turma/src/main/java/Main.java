import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = null;
        Scanner in = new Scanner(System.in);
        String t1[] = new String[10];
        String t2[] = new String[10];
        int contadort1 = 0;
        int contadort2 = 0;
        for (int i = 0; i < t1.length; i++) {
            System.out.println("Digite o nome do aluno: ");
            nome = in.nextLine();

            System.out.println("Em qual turma deseja inserir o aluno? (1 ou 2)");

            int turmaEscolhida = in.nextInt();
            in.nextLine();

            if (turmaEscolhida == 1) {
                t1[contadort1++] = nome;
            } else if (turmaEscolhida == 2) {
                t2[contadort2++] = nome;
            } else {
                System.out.println("Turma inválida");
            }
        }

        System.out.println("Turma 1: ");
        for (int i = 0; i < contadort1; i++) {
                System.out.println(t1[i]);

        }

        System.out.println("Turma 2: ");
        for (int i = 0; i < contadort2; i++) {
                System.out.println(t2[i]);

        }
















    }
}
