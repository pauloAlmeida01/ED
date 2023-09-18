import java.util.Scanner;

public class Exercicio02 {

    public static double calculaMediaVetor(int[] numeros) {
        double soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return soma / numeros.length;
    }

    public static void exibeAcimaMedia(int[] numeros) {
        double media = calculaMediaVetor(numeros);
        System.out.println("A média é " + media);
        System.out.println("Os numeros acima da média são:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media) {
                System.out.println(numeros[i]);
            }
        }
    }


    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner in = new Scanner(System.in);

        System.out.println("Digite 10 numeros inteiros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + "numero " + (i + 1));
            numeros[i] = in.nextInt();
        }

        exibeAcimaMedia(numeros);


    }


}
