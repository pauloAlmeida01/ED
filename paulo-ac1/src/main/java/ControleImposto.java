import java.util.ArrayList;
import java.util.List;

public class ControleImposto {
    private List<IImposto> listaImposto;

    public ControleImposto() {
        this.listaImposto = new ArrayList<>();
    }

    public void addImposto(IImposto imposto){
        this.listaImposto.add(imposto);
    }

    public double getTotalImposto(){
        double total = 0;
        for (IImposto imposto : listaImposto) {
            total += imposto.geValorImposto();
        }
        return total;
    }

    public void exibeTodosImposto(){
        for (IImposto imposto : listaImposto) {
            System.out.println(imposto);
        }
    }
}
