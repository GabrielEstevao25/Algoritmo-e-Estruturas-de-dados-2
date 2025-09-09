import java.util.Arrays;
import java.util.Scanner;

public class PesquisaBinaria {

     /* 
    Para fazer uma pesquisa binária, o vetor precisa estar previamente ordenado
    custo Θ(log)
    */  

    public static int pesquisaBinaria(int[] array, int x){
        int esq = 0;
        int dir = array.length - 1;
        int meio; 

        while (esq <= dir) {
            meio = (esq + dir) / 2;
            if (x == array[meio]) {
                return meio; // retorna a posição
            }
            else if (x > array[meio]) {
                esq = meio + 1;
            }
            else {
                dir = meio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        int[] array = {5, 2, 9, 1, 5, 6};
        Arrays.sort(array); // precisa estar ordenado!
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o termo que deseja encontrar:");
        int x = scanner.nextInt();

        int pos = pesquisaBinaria(array, x);

        System.out.println("Array ordenado: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        if (pos == -1) {
            System.out.println("Termo não existe no array!");
        }
        else {
            System.out.println("O termo " + x + " está na posição: " + pos);
        }
    }
}
