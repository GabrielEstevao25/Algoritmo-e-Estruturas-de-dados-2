public class InversaoString {
    
    public static String inverteString(String palavra){

        String palavraInvertida = "";

        for(int i = palavra.length() - 1; i >= 0;i-- ){
            palavraInvertida += palavra.charAt(i);
        }

        return palavraInvertida;
    }
    
    public static void main(String[] args) {

        String palavra = MyIO.readLine();

        while (!palavra.equals("FIM ")) {

            String palavraInvertida = inverteString(palavra);
            MyIO.println(palavraInvertida);
            palavra = MyIO.readLine();  

        }
    }
}
