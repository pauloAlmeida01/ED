import java.util.Scanner;

public class Exercicio04 {

    public static void ocorrenciaNoArray(int[] numeros, int numero) {
        int vezes = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numero) {
                vezes++;
            }

        }
        System.out.println("O número " + numero + " ocorre " + vezes + " vezes");
    }

    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner in = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + "numero " + (i + 1));
            numeros[i] = in.nextInt();

        }

        System.out.println("Digite um número inteiro");
        int numero = in.nextInt();

        ocorrenciaNoArray(numeros, numero);
    }
}
