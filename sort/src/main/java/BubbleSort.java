public class BubbleSort {
    public static void bubbleSort(int[] arr) {

        int aux = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    aux = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }

    public static int pesqBin(int[] arr, int x) {
        int inicio = 0;
        int fim = arr.length - 1;
        int meio = (inicio + fim) / 2;
        while (inicio <= fim) {
            if (arr[meio] == x) {
                return meio;
            } else if (arr[meio] < x) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
            meio = (inicio + fim) / 2;
        }
        return -1;


    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(pesqBin(arr, 3));
    }


}
