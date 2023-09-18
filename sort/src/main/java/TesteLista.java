import java.util.ArrayList;
import java.util.List;

public class TesteLista {
    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica(5);
        lista.inserir(5);
        lista.inserir(4);
        lista.inserir(3);
        lista.inserir(2);
        lista.inserir(1);

        System.out.println("Lista depois de inserir");
        lista.exibe();

        System.out.println("Busca elemento 3\n" + lista.busca(3));
        System.out.println("Busca elemento 6\n" + lista.busca(6));

        System.out.println("Lista depois de remover pelo indice");
        System.out.println(lista.removePeloIndice(2));
        lista.exibe();

        System.out.println("Lista depois de remover pelo elemento");
        System.out.println(lista.removePeloElemento(5));
        lista.exibe();

    }
}
