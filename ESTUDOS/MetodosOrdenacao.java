import java.util.Scanner;

public class MetodosOrdenacao {

    /* 
    INSERTION
    Melhor caso = Θ(n)
    Caso médio = Θ(n²)
    Pior caso = Θ(n²)
    */
    public static int[] insertionSort(int[]array){

        int[] arrayOrdenado = array.clone();

        for(int i = 0; i<= arrayOrdenado.length - 1; i++){
            int temp = arrayOrdenado[i];
            int j = i -1;
            while(j >= 0 && arrayOrdenado[j]>temp){
                arrayOrdenado[j + 1] = arrayOrdenado[j];
                j--;
            }
            arrayOrdenado[j + 1] = temp;
        }

        return arrayOrdenado;
    }

    /*
    BUBBLE
    Melhor caso = Θ(n)
    Caso médio = Θ(n²)
    Pior caso = Θ(n²)

    */
    public static int[] bubbleSort(int[]array){
        int[] arrayOrdenado = array.clone();

        for(int i = 0; i< arrayOrdenado.length -1; i++){
            for(int j = 0; j < arrayOrdenado.length -1 -i; j++){
                if(arrayOrdenado[j] > arrayOrdenado[j +1 ]){
                    int temp = arrayOrdenado[j];
                    arrayOrdenado[j] = arrayOrdenado[j+1];
                    arrayOrdenado[j+1] = temp;
                }
            }
        }
        return arrayOrdenado;
    }

    /*
    SELECTION
    Melhor caso = Θ(n)
    Caso médio = Θ(n²)
    Pior caso = Θ(n²)
    */
    public static int[] selectionSort(int[] array){
        
        int [] arrayOrdenado = array.clone();

        for(int i = 0; i < arrayOrdenado.length; i++){
            int min = i;
            for(int j = i + 1; j<arrayOrdenado.length; j++){
                if(arrayOrdenado[j] < arrayOrdenado[min]){
                    min = j;
                }
            }
            if(i != min){
                int temp = arrayOrdenado[i];
                arrayOrdenado[i] = arrayOrdenado[min];
                arrayOrdenado[min] = temp;
            }
        }
        return arrayOrdenado;
    }

    public static void main(String[] args) {

        int[] array = {5, 2, 9, 1, 5, 6};

        int[] arrayInsertion = insertionSort(array);
        int[] arrayBubble = bubbleSort(array);
        int[] arraySelection = selectionSort(array);

        System.out.println("Insertions Sort: ");
        for (int i = 0; i <= arrayInsertion.length -1; i++) {
            System.out.print(arrayInsertion[i] + " ");
        }

        System.out.println();
        System.out.println("Bubble Sort:");
        for(int j = 0; j<= arrayBubble.length -1;j++){
            System.out.print(arrayBubble[j] + " ");
        }

        System.out.println();
        System.out.println("Selection Sort:");
        for(int k = 0; k<= arraySelection.length -1; k++){
            System.out.print(arraySelection[k] + " ");
        }
    }
}