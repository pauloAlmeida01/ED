import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    List<Vendavel> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }


    public void adicionaVendavel(Vendavel v) {
            itens.add(v);
            System.out.println("Item adicionado com sucesso!");

    }

    public double calculaTotalVenda() {
        double total = 0;
        for(Vendavel v : itens) {
            total += v.getValorVenda();
        }
        return total;
    }

    public void exibeItensCarrinho() {
        for(Vendavel v : itens) {
            System.out.println(v.toString());
        }
    }
}
