import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    List<IBonus> IBonusList;

    public ControleBonus() {
        this.IBonusList = new ArrayList<>();
    }


    public void addBonus(IBonus IBonus) {
        this.IBonusList.add(IBonus);
    }

    public Double calculaTotalBonus() {
        return this.IBonusList.stream().mapToDouble(IBonus::getValorBonus).sum();
    }

    public void exibeBonus() {
        for (IBonus IBonus : IBonusList) {
            System.out.println(IBonus);
        }
    }

    public List<IBonus> getBonusList() {
        return IBonusList;
    }

    public void setBonusList(List<IBonus> IBonusList) {
        this.IBonusList = IBonusList;
    }
}
