import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, h, v;
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o valor do raio em metros: ");
        r = in.nextDouble();
        System.out.println("Informe o valor da altura em metros: ");
        h = in.nextDouble();
        v = Math.PI * Math.pow(r, 2) * h;
        System.out.println("O volume do cilindro é de: " + v + "m³");
        in.close();
    }
}
