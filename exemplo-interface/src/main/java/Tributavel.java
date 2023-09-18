public interface Tributavel {

    //atributos sao sempre constantes
    //mesmo sem o static e final
    double taxaFixa = 3.1;
    double getValorTributo();

    private double analisaTributo(double valor){
        return valor * taxaFixa;
    }


}
