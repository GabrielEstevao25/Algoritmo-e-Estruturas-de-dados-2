import java.util.Scanner;

public class PesquisaSequencial {

    /*
    Para a pesquisa sequencial não precisamos que o vetor esteja previamente ordenado
     */

    public static int buscaSequencial(int[] array, int x){

        for(int pos = 0; pos <= array.length -1; pos++){
            if(array[pos] == x){
                return pos;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = {5, 2, 9, 1, 5, 6};
        System.out.println("Qual numero deseja encontrar?");
        int x = scanner.nextInt();

        int posPesquisa = buscaSequencial(array, x);

        System.out.println("Array:");
        
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        if(posPesquisa == -1){
            System.out.println("O termo procurado nao existe!");
        }else{
            System.out.println("Posicao do " + x + " e:" + posPesquisa);
        }
    }
}