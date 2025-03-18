import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, d, primeiroResultado, segundoResultado;
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o coeficiente 'a' da equação do segundo grau: ");
        a = in.nextDouble();
        System.out.println("Informe o coeficiente 'b' da equação do segundo grau: ");
        b = in.nextDouble();
        System.out.println("Informe o coeficiente 'c' da equação do segundo grau: ");
        c = in.nextDouble();

        d = Math.pow(b, 2) - 4*a*c;
        primeiroResultado = (-b + Math.sqrt(d))/(2*a);
        segundoResultado = (-b - Math.sqrt(d))/(2*a);

        System.out.println("x1 (delta positivo) = " + primeiroResultado);
        System.out.println("x2 (delta negativo) = " + segundoResultado);
        in.close();
    }
}