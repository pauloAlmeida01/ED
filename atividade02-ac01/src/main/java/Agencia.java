import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private List<Profissao> profissoes;

    public Agencia() {
        this.profissoes = new ArrayList<>();
    }

    public void addProfissao(Profissao profissao) {
        profissoes.add(profissao);
        System.out.println("Profissão adicionada com sucesso!");
    }

    public double calcularTotalSalario() {
        double total = 0;
        for (Profissao profissao : profissoes) {
            total += profissao.getSalarioBruto();
        }
        return total;
    }

    public void exibeTodos() {
        for (Profissao profissao : profissoes) {
            System.out.println(profissao.toString());
        }
    }
}
