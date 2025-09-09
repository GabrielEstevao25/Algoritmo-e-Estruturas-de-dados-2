import java.util.Random;

public class AlteracaoAleatoria {

    public static String aleatoria(String textoInicial, Random gerador) {
    
        char letra1 = (char) ('a' + (Math.abs(gerador.nextInt()) % 26));
        char letra2 = (char) ('a' + (Math.abs(gerador.nextInt()) % 26));

        StringBuilder textoFinal = new StringBuilder();

        for (int i = 0; i < textoInicial.length(); i++) {
            if (textoInicial.charAt(i) == letra1) {
                textoFinal.append(letra2);
            } else {
                textoFinal.append(textoInicial.charAt(i));
            }
        }

        return textoFinal.toString();
    }

    public static void main(String[] args) {
        Random gerador = new Random();
        gerador.setSeed(4);

        String entrada = MyIO.readLine();

        while (!entrada.equals("FIM")) {
            String saida = aleatoria(entrada, gerador);
            MyIO.println(saida);
            entrada = MyIO.readLine();
        }
    }
}
