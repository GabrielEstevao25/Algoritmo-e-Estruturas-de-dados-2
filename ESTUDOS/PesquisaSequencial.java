import java.util.Scanner;

public class PesquisaSequencial {

    public static int buscaSequencial(int[] array, int n){

        for(int pos = 0; pos < array.length -1; pos++){
            if(array[pos] == n){
                return pos;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = {5, 2, 9, 1, 5, 6};
        System.out.println("Qual número deseja encontrar?");
        int n = scanner.nextInt();

        int posPesquisa = buscaSequencial(array, n);

        System.out.println("Array:");
        
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        if(posPesquisa == -1){
            System.out.println("O termo procurado não existe!");
        }else{
            System.out.println("Posicao do " + n + " é:" + posPesquisa);
        }
    


    }
}
