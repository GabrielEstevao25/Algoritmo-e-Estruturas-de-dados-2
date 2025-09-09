import java.util.ArrayList;
import java.util.List;

public class AlgebraBooleana {

    public static boolean avaliarExpressaoRec(String expr) {
        expr = expr.replace(" ", ""); 

        if (expr.equals("1")) return true;
        if (expr.equals("0")) return false;

        if (expr.startsWith("not(") && expr.endsWith(")")) {
            String inner = expr.substring(4, expr.length() - 1);
            return !avaliarExpressaoRec(inner);
        }

        if ((expr.startsWith("and(") || expr.startsWith("or(")) && expr.endsWith(")")) {
            String inner = expr.substring(expr.indexOf("(") + 1, expr.length() - 1);
            boolean isAnd = expr.startsWith("and(");
            boolean acum = isAnd ? true : false;

            List<String> args = separarArgumentos(inner);
            for (String arg : args) {
                boolean val = avaliarExpressaoRec(arg);
                if (isAnd) acum &= val;
                else acum |= val;
            }
            return acum;
        }

        return false; 
    }

    public static List<String> separarArgumentos(String s) {
        List<String> lista = new ArrayList<>();
        int nivel = 0;
        int ultimo = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') nivel++;
            else if (c == ')') nivel--;
            else if (c == ',' && nivel == 0) {
                lista.add(s.substring(ultimo, i));
                ultimo = i + 1;
            }
        }
        lista.add(s.substring(ultimo));
        return lista;
    }

    public static String substituirVariaveis(String expr, int n, int[] valores) {
        for (int i = 0; i < n; i++) {
            char var = (char)('A' + i);
            expr = expr.replace(var + "", valores[i] + "");
        }
        return expr;
    }

    public static void main(String[] args) {
        String linha = MyIO.readLine();

        while (!linha.equals("0")) {
            String[] tokens = linha.split(" ");
            int n = Integer.parseInt(tokens[0]);
            int[] valores = new int[n];
            for (int i = 0; i < n; i++) {
                valores[i] = Integer.parseInt(tokens[i+1]);
            }

            StringBuilder sb = new StringBuilder();
            for (int i = n+1; i < tokens.length; i++) {
                sb.append(tokens[i]);
                if (i < tokens.length-1) sb.append(" ");
            }
            String expr = sb.toString();

            expr = substituirVariaveis(expr, n, valores);

            boolean resultado = avaliarExpressaoRec(expr);
            MyIO.println(resultado ? "1" : "0");

            linha = MyIO.readLine();    
        }
    }
}
