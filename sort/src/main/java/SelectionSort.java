import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        int arr2[] = { 5, 4, 3, 2, 1 };

        selectionSort(arr);
        selectionSortOtimizado(arr2);


    }

    public static void selectionSortOtimizado(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
           int min = i;
              for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                     min = j;
                }
              }
                int aux = arr[min];
                arr[min] = arr[i];
                arr[i] = aux;



        }
        System.out.println("Ordem " + ": " + Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
           for (int j = i+1; j < arr.length; j++) {
               if (arr[i] > arr[j]) {
                   int aux = arr[i];
                   arr[i] = arr[j];
                   arr[j] = aux;
               }
           }


        }
        System.out.println("Ordem " + ": " + Arrays.toString(arr));
    }
}
