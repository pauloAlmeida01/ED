import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a quantidade de notas");
        int quantidadeNotas = ler.nextInt();
        double notas[] = new double[quantidadeNotas];
        double media = 0;

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.println("Informe a "+ (i+1) +"ª nota");
            notas[i] = ler.nextDouble();
            media += notas[i];
        }

        System.out.printf("Média: %.1f\n", media/notas.length);

        System.out.println("Notas acima da média: ");
        for (int i = 0; i < quantidadeNotas; i++) {
            if (notas[i] > media/notas.length) {
                System.out.println(notas[i]);
            }
        }

        System.out.println("Notas abaixo da média: ");
        for (int i = 0; i < quantidadeNotas; i++) {
            if (notas[i] < media/notas.length) {
                System.out.println(notas[i]);
            }
        }
    }
}
