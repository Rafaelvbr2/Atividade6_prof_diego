public class Exercicio02 {
    public static void main(String[] args) {
        int[][] m = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = Integer.parseInt(IO.readln("Valor [" + i + "][" + j + "]: "));
            }
        }

        int soma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma += m[i][j];
            }
        }
        System.out.println("Soma: " + soma);
    }
}
