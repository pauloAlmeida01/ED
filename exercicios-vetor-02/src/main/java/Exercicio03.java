import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner lerString = new Scanner(System.in);

        System.out.println("Informe a quantidade de cadastros");
        int quantidadeCadastros = ler.nextInt();
        String nomes[] = new String[quantidadeCadastros];
        String telefones[] = new String[quantidadeCadastros];

        for (int i = 0; i < quantidadeCadastros; i++) {
            System.out.println("Informe o %dº nome".formatted(i+1));
            nomes[i] = lerString.nextLine();
            System.out.println("Informe o %d telefone".formatted(i+1));
            telefones[i] = lerString.nextLine();
        }


        for (int i = 0; i < quantidadeCadastros; i++) {
            System.out.println("Informe o nome para buscar o telefone");
            String nome = lerString.nextLine();
            boolean achou = false;
            for (int j = 0; j < quantidadeCadastros; j++) {
                if (nome.equals(nomes[j])) {
                    System.out.println("O telefone de %s é %s".formatted(nome, telefones[j]));
                    achou = true;
                }
            }
            if (!achou) {
                System.out.println("Nome não encontrado");
            }
        }



        }
    }
