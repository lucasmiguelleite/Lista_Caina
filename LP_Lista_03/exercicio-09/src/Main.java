import java.util.Scanner;

public class Main {
    public static Double input() {
        Double value;

        Scanner in = new Scanner(System.in);

        System.out.println("\n### Par ou Ímpar ###");
        System.out.println("Informe qualquer número: ");
        value = in.nextDouble();

        in.close();
        return value;
    }

    public static void main(String[] args) {
        Double value;

        value = input();

        if (value % 2 == 0)
            System.out.println("O número informado é par");
        else
            System.out.println("O número informado é ímpar");

    }
}
