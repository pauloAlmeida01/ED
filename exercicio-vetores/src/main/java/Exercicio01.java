import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio01 {

    public static void exibeOrdemInserido(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("O numero " + (i + 1) + " é " + numeros[i]);
        }
    }

    public static void exibeOrdemContraria(int[] numeros){
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("O numero " + (i + 1) + " é " + numeros[i]);
        }
    }

    public static void main(String[] args) {
        int[] numeros = new int[7];
        Scanner in = new Scanner(System.in);

        System.out.println("Preencha o Array");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + "numero " + (i + 1));
            numeros[i] = in.nextInt();

        }

        System.out.println("Exibindo ordem inserida:");
        exibeOrdemInserido(numeros);

        System.out.println("Exibindo ordem contraria:");
        exibeOrdemContraria(numeros);



    }
}
