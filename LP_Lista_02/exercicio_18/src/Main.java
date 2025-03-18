import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, x;
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o coeficiente 'a' da equação do primeiro grau: ");
        a = in.nextDouble();
        System.out.println("Informe o coeficiente 'b' da equação do primeiro grau: ");
        b = in.nextDouble();
        x = -b / a;
        System.out.println("x = " + x);
        in.close();
    }
}
