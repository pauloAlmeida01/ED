public class Exercicio05 {

    public static int totalPares(int[] numeros) {
        int totalPares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                totalPares++;
            }
        }
        return totalPares;
    }

    public static int maiorValor(int[] numeros) {
        int maiorValor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
            }
        }
        return maiorValor;
    }

    public static int verificaDuplicados(int[] numeros) {
        int duplicados = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    duplicados++;
                }
            }
        }
        return duplicados;
    }

    public static void maiorSoma(int[] numeros, int[] numeros2) {
        int soma[] = new int[10];
        int soma2[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            soma[i] += numeros[i];
            soma2[i] += numeros2[i];
        }

        if(soma[0] > soma2[0]) {
            System.out.println("O primeiro vetor é maior");
        } else if (soma[0] < soma2[0]) {
            System.out.println("O segundo vetor é maior");
        } else {
            System.out.println("As somas são iguais");
        }

    }


    public static void main(String[] args) {
        int numeros[] = new int[10];
        int numeros2[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100);
            numeros2[i] = (int) (Math.random() * 100);
        }

        System.out.println("Primeiro vetor: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("[%d] = %d".formatted(i, numeros[i]));
        }

        System.out.println("Segundo vetor: ");
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println("[%d] = %d".formatted(i, numeros2[i]));
        }

        System.out.println("Total de pares: " + totalPares(numeros));
        System.out.println("Maior valor: " + maiorValor(numeros));
        System.out.println("Total de duplicados: " + verificaDuplicados(numeros));
        maiorSoma(numeros, numeros2);
    }
}
