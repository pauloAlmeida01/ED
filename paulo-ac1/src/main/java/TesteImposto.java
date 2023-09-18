public class TesteImposto {
    public static void main(String[] args) {
        BrinquedoAlugado patinete = new BrinquedoAlugado(1, "Patinete", 5.0, 10);
        BrinquedoIngresso montanhaRussa = new BrinquedoIngresso(2, "Montanha Russa", 10.0, 100);
        Socio socio = new Socio("João", 1000.0);

        ControleImposto controleImposto = new ControleImposto();

        controleImposto.addImposto(patinete);
        controleImposto.addImposto(montanhaRussa);
        controleImposto.addImposto(socio);

        System.out.println("Total de Impostos: " + controleImposto.getTotalImposto());
        System.out.println("Todos os Impostos: ");
        controleImposto.exibeTodosImposto();

    }
}
