import java.util.Scanner;

public class Exercicio03 {

    public static void pesquisaNome(String[] nomes, String nome){
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(nome)){
                System.out.println("Nome encontrado no indice " + i + " do vetor");
                return;
            }
        }
        System.out.println("O nome " + nome + " não foi encontrado");
    }

    public static void main(String[] args) {
        String[] nomes = new String[10];
        Scanner in = new Scanner(System.in);

        System.out.println("Digite 10 nomes");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o " + "nome " + (i + 1));
            nomes[i] = in.nextLine();
        }
        System.out.println("Digite o nome a ser pesquisado");
        String nome = in.nextLine();

        pesquisaNome(nomes, nome);

    }
}
