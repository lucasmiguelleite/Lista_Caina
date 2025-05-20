import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Informe um número inteiro maior ou igual a zero: ");
            n = in.nextInt();
        } while (n < 0);

        System.out.println();

        if (n > 31) {
            BigInteger f = calculaFatorial(n);
            System.out.println("O factorial de " + n + " é:");
            System.out.println(f);
            return;
        }

        int f = calculaFatorialRecursivo(n);

        System.out.println("O factorial de " + n + " é:");
        System.out.println(f);
    }

    private static BigInteger calculaFatorial(int n){
        if (n <= 1)
            return BigInteger.ONE;

        BigInteger resultado = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            resultado = resultado.multiply(BigInteger.valueOf(i));

        return resultado;
    }

    private static int calculaFatorialRecursivo(int n){
        if (n <= 1)
            return 1;

        return n * calculaFatorialRecursivo(n - 1);
    }
}