import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, a;
        System.out.println("Informe o raio de um circulo em metros: ");
        Scanner in = new Scanner(System.in);
        r = in.nextDouble();
        a = Math.PI * Math.pow(r, 2);
        System.out.println("O área do círculo em m² é: " + a + "m²");
        in.close();
    }
}