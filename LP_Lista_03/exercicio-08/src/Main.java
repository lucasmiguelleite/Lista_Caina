import java.util.Scanner;

public class Main {
    public static Double input() {
        Double value;

        Scanner in = new Scanner(System.in);

        System.out.println("\n### Par ou Ímpar ###");
        System.out.println("\nInforme qualquer número: ");
        value = in.nextDouble();

        in.close();
        return value;
    }

    public static void main(String[] args) {
        Double value;

        value = input();

        System.out.println("--------------------------------------------------");
        if (value % 2 == 0)
            System.out.println("\nO número informado é par");
        else
            System.out.println("\nO número informado é ímpar");

    }
}
