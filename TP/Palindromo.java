public class Palindromo {

    public static boolean ehPalindromo(String palavra) {
        int i = 0;
        int j = palavra.length() - 1;

        while (i < j) {
            if (palavra.charAt(i) != palavra.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String palavra = MyIO.readLine();

        // Enquanto não for "FIM"
        while (!palavra.equals("FIM")) {
            if (ehPalindromo(palavra)) {
                MyIO.println("SIM");
            } else {
                MyIO.println("NAO");
            }

            palavra = MyIO.readLine(); 
        }
    }
}
