import java.util.Scanner;

public class Main {
    public static Double[] input() {
        Double[] valores = new Double[3];
        String[] coeficientes = new String[3];

        Scanner in = new Scanner(System.in);
        coeficientes[0] = "a";
        coeficientes[1] = "b";
        coeficientes[2] = "c";

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o coeficiente '%s': ", coeficientes[i]);
            valores[i] = in.nextDouble();
        }

        in.close();
        return valores;
    }

    public static void main(String[] args) {
        Double[] values;
        Double d, primeiroResultado, segundoResultado;

        values = input();

        d = Math.pow(values[1], 2) - 4 * values[0] * values[2];
        System.out.println(d);
        if (d > 0) {
            primeiroResultado = (-values[1] + Math.sqrt(d)) / (2 * values[0]);
            segundoResultado = (-values[1] - Math.sqrt(d)) / (2 * values[0]);
            System.out.println("\nx1 (delta positivo) = " + primeiroResultado);
            System.out.println("\nx2 (delta negativo) = " + segundoResultado);
        } else if (d == 0) {
            primeiroResultado = (-values[1] + Math.sqrt(d)) / (2 * values[0]);
            System.out.println("\nx1 (delta positivo) = " + primeiroResultado);
        } else {
            System.out.println("\nA equação não possui raízes reais");
        }

    }
}
