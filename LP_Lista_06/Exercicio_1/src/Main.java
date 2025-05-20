import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, soma;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Informe um número inteiro maior que zero: ");
            n = in.nextInt();
        } while (n <= 0);

        soma = calculaSomaDosTermosDeUmaPA(n);

        System.out.println("A soma de todos os números inteiros de 1 até " + n + " é:");
        System.out.println(soma);
    }

    private static int calculaSomaDosTermosDeUmaPA(int n){
        // Sn = (a1 + an)n /2
        return ((1 + n) * n) / 2 ;
    }

}