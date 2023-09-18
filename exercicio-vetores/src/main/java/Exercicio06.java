import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio06 {


    public static void diaDoAno(int dia, int mes) {
        int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int soma = 0;
        for (int i = 0; i < mes - 1; i++) {
            soma += meses[i];
        }

        soma += dia;

        System.out.println("O dia " + dia + " do mês " + mes + " é o dia " + soma + " do ano");


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o um número de dia (1 a 31)");
        int dia = in.nextInt();

        System.out.println("Digite o um número de mês (1 a 12)");
        int mes = in.nextInt();

        diaDoAno(dia, mes);
    }
}
