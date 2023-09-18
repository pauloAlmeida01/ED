import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a quantidade de nomes");
        int quantidadeNomes = ler.nextInt();
        String nomes[] = new String[quantidadeNomes];

        for (int i = 0; i < quantidadeNomes; i++) {
            System.out.println("Informe o " + (i + 1) + "º nome");
            nomes[i] = ler.next();
        }


        for (int i = 0;; i++) {
            System.out.println("Informe o número equivalente ao nome");
            int numero = ler.nextInt();
            if (numero > quantidadeNomes) {
                System.out.println("Número inválido, apenas %d numeros disponíveis".formatted(quantidadeNomes));

            } else if (numero < 0) {
                System.out.println("Número inválido, apenas números positivos");

            } else {
                for (int j = 0; j < quantidadeNomes; j++) {
                    if (numero == j) {
                        System.out.println("O nome do número %d é %s".formatted(numero, nomes[j]));
                        System.exit(0);
                    }
                }

            }
        }
    }
}
