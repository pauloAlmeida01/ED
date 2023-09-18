import java.util.Scanner;

public class TesteVetores {

    public static void exibirVetor(int[] vetor){
        for (int i = 0; i <vetor.length ; i++) {
            System.out.println("vetor[" + i + "] = " + vetor[i]);
        }
    }

    public static void main(String[] args) {
        int[] vetor = new int[10];

        //Criando e inicializando um vetor, tudo junto
        int[] vetor2 = {1,2,3,4,5,6,7,8,9,10};

        String vetor03[] = new String[4];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i*10;
        }

        exibirVetor(vetor);
        exibirVetor(vetor2);

        //preencha o vetor03 com nomes digitados pelo usuário
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < vetor03.length; i++) {
            System.out.println("Digite o nome da pessoa " + (i+1));
            vetor03[i] = in.nextLine();
        }

        //exiba o vetor03
        for (int i = 0; i < vetor03.length; i++) {
            System.out.println("vetor03[" + i + "] = " + vetor03[i]);
        }


    }
}
