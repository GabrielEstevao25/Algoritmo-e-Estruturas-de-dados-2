public class Anagrama {
    public static boolean comparacao(String palavra1, String palavra2) {

        palavra1 = palavra1.toLowerCase();
        palavra2 = palavra2.toLowerCase();
        boolean status = false;

        if (palavra1.length() != palavra2.length()) {
            return false;
        }

        boolean[] usado = new boolean[palavra2.length()];

        for(int i = 0; i < palavra1.length(); i++){
            for(int j = 0; j< palavra2.length();j++){
                if(palavra1.charAt(i) == palavra2.charAt(j)){
                    status = true;
                    usado[i] = true;
                }
            }
        }  
    for(int i = 0; i < palavra1.length(); i++){
        if(usado[i] != true){
            return false;
        }
    }

        return true;
    }

    public static void main(String[] args) {
        String entrada = MyIO.readLine();

        while (!entrada.equals("FIM")) {
            String[] partes = entrada.split(" - ");
            String palavra1 = partes[0];
            String palavra2 = partes[1];

            if (comparacao(palavra1, palavra2)) {
                MyIO.println("SIM");
            } else {
                MyIO.println("NÃO");
            }

            entrada = MyIO.readLine();
        }
    }
}
