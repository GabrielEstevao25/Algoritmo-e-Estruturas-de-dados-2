import java.util.Scanner;

public class ContaSubtracoes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int cont = 0;
        int n;

        //COMPLEXIDADE 3n + 2n^2  

        n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            cont++;
            cont++;
            cont++;
            
            for(int j = 0; j<n; j++){
                cont++;
                cont++;
            }
        }
        System.out.println("numero de operacoes: " + cont);

        
        // COMPLEXIDADE 5n + 4n^3

        int cont1 = 0;

        for(int a = 0; a < n; a++){
            cont1++;
            cont1++;
            cont1++;
            cont1++;
            cont1++;

            for(int b = 0;  b < n; b++){
                for(int c = 0; c < n; c++){
                        cont1++;
                        cont1++;
                        cont1++;
                        cont1++;
                }
            }
        }
        System.out.println("numero de operacoes: " + cont1);


        // COMPLEXIDADE lg(n) + n
        
        // COMPLEXIDADE 2n + 5

        // COMPLEXIDADE  9n^4 + 5n^2 + n/2

        //COMPLEXIDADE lg(n) + 5 lg(n)
        
    }
}