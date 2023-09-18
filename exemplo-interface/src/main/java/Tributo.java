import java.util.ArrayList;
import java.util.List;

public class Tributo  {
    List<Tributavel> tributaveis;

    public Tributo() {
        this.tributaveis = new ArrayList<>();
    }

    public void adicionaTributavel(Tributavel tributavel){
        this.tributaveis.add(tributavel);
    }

    public double calculaTotalTributo(){
        double total = 0;
        for (Tributavel tributavel : tributaveis) {
            total += tributavel.getValorTributo();
        }
        return total;
    }

    public void exibeTodos(){
        for (Tributavel tributavel : tributaveis) {
            System.out.println(tributavel);
        }
    }


}
