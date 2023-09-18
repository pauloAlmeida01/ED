import java.util.Scanner;

public class Exercicio05 {

    public static void economico(int[] rendimento, String[] carros){
        int menor = rendimento[0];
        int indice = 0;
        for (int i = 0; i < rendimento.length; i++) {
            if (rendimento[i] > menor){
                menor = rendimento[i];
                indice = i;
            }
        }
        System.out.println("O carro mais economico é o " + carros[indice] + " com rendimento de " + menor + " km/l");
    }

    public static void main(String[] args) {
        String[] carros = new String[5];
        int[] rendimento = new int[5];
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o carro e seu rendimento");
        for (int i = 0; i < carros.length; i++) {
            System.out.println("Digite o " + "carro " + (i + 1));
            carros[i] = in.nextLine();
            System.out.println("Digite o " + "rendimento " + (i + 1));
            rendimento[i] = in.nextInt();
            in.nextLine();
        }

        economico(rendimento, carros);



    }
}
