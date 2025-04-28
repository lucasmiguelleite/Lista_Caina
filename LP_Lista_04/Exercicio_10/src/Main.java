import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        int n = in.nextInt();

        if (n <= 0)
            System.out.println("Por favor, insira um número maior que zero.");
        else {
            System.out.println("Sequência de Fibonacci com " + n + " termos:");
            for (int i = 0; i < n; i++)
                System.out.print(fibonacci(i) + " ");
        }

        in.close();
    }

    public static int fibonacci(int num) {
        if (num <= 1)
            return num;
        else
            return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
