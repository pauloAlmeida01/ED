public class ListaEstatica {
    private int array[];
    private int tamanho;

    public ListaEstatica(int tamanho){
        this.array = new int[tamanho];
        this.tamanho = 0;
    }

    public void inserir(int elemento){
        if (this.tamanho < this.array.length){
            this.array[this.tamanho] = elemento;
            this.tamanho++;
        }else {
            System.out.println("Lista cheia");
        }
    }

    public void exibe() {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println(this.array[i]);
        }
    }

    public int busca(int elemento){
        for (int i = 0; i < this.tamanho; i++) {
            if (this.array[i] == elemento){
                return i;
            }
        }
        return -1;
    }

    public boolean removePeloIndice(int indice){
        if (indice >= 0 && indice < this.tamanho){
            for (int i = indice; i < this.tamanho-1; i++) {
                this.array[i] = this.array[i+1];
            }
            this.tamanho--;
            return true;
        }
        return false;
    }

    public boolean removePeloElemento(int elemento){
        return removePeloIndice(busca(elemento));
    }




}
