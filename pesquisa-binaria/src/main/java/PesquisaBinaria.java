public class PesquisaBinaria {
    public static void main(String[] args) {
        int[] vetor = {5,3,1,4,2};
        int valor = 5;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        int posicao = -1;
        boolean encontrado = false;

        while (!encontrado && inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (vetor[meio] == valor) {
                encontrado = true;
                posicao = meio;
            } else if (vetor[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        if (encontrado) {
            System.out.println("Valor encontrado na posição " + posicao);
        } else {
            System.out.println("Valor não encontrado");
        }
    }
}
