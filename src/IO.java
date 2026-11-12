import java.util.Scanner;

// Classe auxiliar para usar IO.readln em JDKs anteriores ao Java 25.
public class IO {
    private static final Scanner entrada = new Scanner(System.in);

    public static String readln(String mensagem) {
        System.out.print(mensagem);
        return entrada.nextLine();
    }
}
