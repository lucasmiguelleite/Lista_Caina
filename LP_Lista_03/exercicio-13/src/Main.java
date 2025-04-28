import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite os três lados do triângulo separados por espaço:");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a < (b + c) && a > Math.abs(b - c) && b < (a + c) && b > Math.abs(a - c) && c < (b + a) && c > Math.abs(a - b)) {
            System.out.println("a, b e c formam um triângulo.");
            if (a == b && a == c)
                System.out.println("Triângulo Equilátero.");
            else if (a == b || b == c || a == c)
                System.out.println("Triângulo Isosceles");
            else
                System.out.println("Triângulo Escaleno");
        } else System.out.println("a, b e c NÃO formam um triângulo.");
    }
}