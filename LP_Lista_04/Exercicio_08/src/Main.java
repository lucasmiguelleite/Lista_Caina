import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = in.nextInt();

        if (numero <= 0)
            System.out.println("Por favor, digite um número inteiro positivo.");
        else {
            boolean isPrimo = verificarPrimo(numero);

            if (isPrimo)
                System.out.println(numero + " é um número primo.");
            else
                System.out.println(numero + " não é um número primo.");
        }

        in.close();
    }

    public static boolean verificarPrimo(int n) {
        if (n == 1)
            return false;

        if (n == 2)
            return true;

        if (n % 2 == 0)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}