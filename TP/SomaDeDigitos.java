import java.util.Scanner;

public class SomaDeDigitos {
    
    public static int soma(int numero){

        int c, d, u;

        c = numero / 100;
        d = (numero % 100)/10;
        u = numero% 10;

        int soma = c + d + u;

        return soma;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String entrada = scanner.nextLine();

        while (!entrada.equals("FIM")) {
            
            int numero = Integer.parseInt(entrada); 

            int soma = soma(numero);

            System.out.println(soma);

            entrada = scanner.nextLine();

        }
    }
}
