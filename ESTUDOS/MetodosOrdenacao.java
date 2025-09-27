import java.util.Scanner;

public class MetodosOrdenacao {

    /* 
    INSERTION
    Melhor caso = Θ(n)
    Caso médio = Θ(n²)
    Pior caso = Θ(n²)
    */
    public static int[] insercao(int[] array){
        int tam = array.length;
         
        for(int i = 0; i <= tam -1; i++){
            int temp = array[i];
            int j = i - 1;
            while ((j>=0) && (array[j]>temp)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        return array;
    }

    /*
    BUBBLE
    Melhor caso = Θ(n)
    Caso médio = Θ(n²)
    Pior caso = Θ(n²)

    */
    public static int[] bubble(int[] array){
        int tam = array.length;

        for(int i = 0; i <= tam - 2; i++){
            for(int j = 0; j <= tam - 2 - i; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    /*
    SELECTION
    Melhor caso = Θ(n)
    Caso médio = Θ(n²)
    Pior caso = Θ(n²)
    */
    public static int[] selectionSort(int[] array){
        
        int     [] arrayOrdenado = array.clone();

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
            int temp = array[i];
            array[i] = array[menor];
            array[menor] = temp;
        }

        return array;
    }

    public static void main(String[] args) {

        int[] array = {5, 2, 9, 1, 5, 6};

        int[] arrayInsertion = insercao(array);
        int[] arrayBubble = bubble(array);
        int[] arraySelection = selecao(array);

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