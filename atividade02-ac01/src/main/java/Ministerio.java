import java.util.ArrayList;
import java.util.List;

public class Ministerio {
    private List<IClt> clts;

    public Ministerio () {
        this.clts = new ArrayList<>();
    }

    public void addClt(IClt clt) {
        clts.add(clt);
        System.out.println("CLT adicionado com sucesso!");
    }

    public double calcularImposto() {
        double imposto = 0;
        for (IClt clt : clts) {
            imposto += clt.getImpostoSalario();
        }
        return imposto;

    }

    public void exibeTodos() {
        for (IClt clt : clts) {
            System.out.println(clt.toString());
        }
    }
}
