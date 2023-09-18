public class Exercicio04 {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        int numeros2[] = new int[10];
        int soma[] = new int[10];

        //encha os dois vetores de numeros inteiros de forma aleatoria
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100);
            numeros2[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < numeros.length; i++) {
            soma[i] = numeros[i] + numeros2[i];
            System.out.println("%d + %d = %d".formatted(numeros[i], numeros2[i], soma[i]));
        }



    }
}
