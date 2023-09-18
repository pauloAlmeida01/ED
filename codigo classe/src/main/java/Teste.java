public class Teste {
    public static void main(String[] args) {
        ControleBonus controleBonus = new ControleBonus();

        Secretaria secretaria = new Secretaria("123456789-00", "Maria", 1000.0, 100.0);
        Professor professor = new Professor("987654321-00", "João", 10, 100.0);
        Coordenador coordenador = new Coordenador("123456789-00", "José", 10, 100.0, 2);

        controleBonus.addBonus(professor);
        controleBonus.addBonus(coordenador);

        System.out.println("Total Bonus: "+controleBonus.calculaTotalBonus());
        System.out.println("Bonus List: ");
        controleBonus.exibeBonus();

        System.out.println("-----------------------------------\n" +
                "----------------------------------------");
        System.out.println("Secretaria: ");
        System.out.println(secretaria);

        System.out.println("-----------------------------------\n" +
                "----------------------------------------");

        System.out.println("Professor: ");
        System.out.println(professor);

        System.out.println("-----------------------------------\n" +
                "----------------------------------------");

        System.out.println("Coordenador: ");
        System.out.println(coordenador);


    }
}
