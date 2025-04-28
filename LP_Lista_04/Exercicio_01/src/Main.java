import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = in.nextInt();

        System.out.println("\nTabuada do " + numero + ":");
        System.out.println("-----------------");

        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        in.close();
    }
}