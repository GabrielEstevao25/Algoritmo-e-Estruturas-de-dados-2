public class ImplOrdenacao {

    public static int[] selecao(int[] array){
        int tam = array.length;
    
        for(int i = 0; i <= tam - 1; i++){
            int menor = i;
            for(int j = i + 1; j <= tam -1; j++){
                if(array[menor] > array[j]){
                    menor = j;
                } 
            }
            int temp = array[i];
            array[i] = array[menor];
            array[menor] = temp;
        }

        return array;
    }

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

    public static void main(String[] args) {
        int[] array = {6, 2, 12, 5, 6, 7, 3, 1};

        int[] arrayOrdenadoSelecao = selecao(array.clone());
        int[] arrayOrdenadoInsercao = insercao(array.clone());
        int[] arrayOrdenadoBubble = bubble(array.clone());

        System.out.println("Selection Sort:");
        for(int i = 0; i <= arrayOrdenadoSelecao.length -1; i++){
            System.out.print(arrayOrdenadoSelecao[i] + " ");
        }
        System.out.println("\nInsertion Sort:");
        for(int i = 0; i <= arrayOrdenadoInsercao.length -1; i++){
            System.out.print(arrayOrdenadoInsercao[i] + " ");
        }
        System.out.println("\nBubble Sort:");
        for(int i = 0; i <= arrayOrdenadoBubble.length -1; i++){
            System.out.print(arrayOrdenadoBubble[i] + " ");
        }
    }
}
