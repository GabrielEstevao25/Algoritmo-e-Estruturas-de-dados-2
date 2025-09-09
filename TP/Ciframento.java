
public class Ciframento {

    public static String criptografar(String palavra) {

        String palavraCriptografada = "";

        for (int i = 0; i <= palavra.length() - 1; i++) {

            palavraCriptografada += (char) (palavra.charAt(i) + 3);

        }

        return palavraCriptografada;
    }

    public static void main(String[] args) {

        String palavra = MyIO.readLine();
        String palavraCriptografada = "";

        while (!palavra.equals("FIM")) {

            palavraCriptografada = criptografar(palavra);
            
            MyIO.println(palavraCriptografada);
            
            palavra = MyIO.readLine(); 
        }
    }
}
