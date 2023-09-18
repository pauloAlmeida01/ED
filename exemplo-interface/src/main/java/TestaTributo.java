public class TestaTributo {
    public static void main(String[] args) {
        Tributo tributo = new Tributo();
        tributo.adicionaTributavel(new Alimento(1, "Arroz", 10.0, 100));
        tributo.adicionaTributavel(new Alimento(2, "Feijão", 5.0, 50));
        tributo.adicionaTributavel(new Servico("Corte de cabelo", 20.0));
        tributo.adicionaTributavel(new Perfume("Lavanda", 3, "Perfume", 100.0));
        tributo.exibeTodos();
        System.out.println("Total de tributos: " + tributo.calculaTotalTributo());
    }
}
