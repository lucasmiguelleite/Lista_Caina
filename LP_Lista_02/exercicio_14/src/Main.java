import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double b, h, a;
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o valor da base em metros: ");
        b = in.nextDouble();
        System.out.println("Informe o valor da altura em metros: ");
        h = in.nextDouble();
        a = (b * h) / 2;
        System.out.println("A área do triângulo retângulo é de: " + a + "m²");
        in.close();
    }
}