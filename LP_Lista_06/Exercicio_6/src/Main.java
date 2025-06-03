import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int o, n;
        long r;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Menu: ");
            System.out.println("1) Exercício 1");
            System.out.println("2) Exercício 2");
            System.out.println("3) Exercício 3");
            System.out.println("4) Exercício 4");
            System.out.println("5) Exercício 5");
            System.out.println();
            System.out.print("Escolha uma opção: ");
            o = in.nextInt();
        } while (o > 5 || o < 1);

        switch (o){
            case 1:
                do {
                    System.out.println("Informe um número inteiro maior que zero: ");
                    n = in.nextInt();
                } while (n <= 0);
                r = exercicio01(n);
                System.out.println("A soma de todos os números inteiros de 1 até " + n + " = " + r);
                break;

            case 2:
                do{
                    System.out.println("Informe um número inteiro maior que zero: ");
                    n = in.nextInt();
                } while ( n <= 0);
                r = exercicio02(n);
                System.out.println("O factorial de " + n + " é:");
                System.out.println(r);
                break;

            case 3:
                int x, y;
                do{
                    System.out.print("Informe um número inteiro: ");
                    x = in.nextInt();

                    System.out.print("Agora, informe um expoente que deve ser um número inteiro maior ou igual a zero: ");
                    y = in.nextInt();
                } while ( x <= 0 && y <= 0);
                r = exercicio03(x, y);
                System.out.println(x + " ^ " + y + " = " + r);
                break;

            case 4:
                String s;
                boolean result;
                do{
                    System.out.print("Informe uma palavra, frase ou sequência: ");
                    s = in.nextLine();
                }while (s.isEmpty());

                String cleanedString = s.replaceAll("[^\\p{L}\\p{N}]", "");
                cleanedString = cleanedString.toLowerCase();
                result = exercicio04(cleanedString, 0, cleanedString.length() - 1);

                if (result) System.out.println(s + " é palíndromo");
                else System.out.println(s + " não é um palíndromo");
                break;

            case 5:
                int[] arr = {13, 15, 24, 30, 33, 40, 42, 52, 69, 71, 88};
                System.out.println("Busca Binária");

                System.out.print("Informe um número inteiro: ");
                n = in.nextInt();

                System.out.println();

                r = exercicio05(n, arr, 0, arr.length);
                if (r == -1) System.out.println("Valor não encontrado");
                else System.out.println("Número "+ n + " foi encontrado no array");
                break;

            default:
                break;
        }

    }

    private static long exercicio01(int n){
        if(n <= 1)
            return n;

        return n + exercicio01(n - 1);
    }

    private static long exercicio02(int n){
        if (n <= 1)
            return 1;

        return n * exercicio02(n - 1);
    }

    private static long exercicio03(int x, int y){
        if (y == 0)
            return 1;

        return x * exercicio03(x, y - 1);
    }

    private static boolean exercicio04(String s, int left, int right){
        if (left >= right)
            return true;
        if (s.charAt(left) != s.charAt(right))
            return false;
        return exercicio04(s, left + 1, right - 1);
    }

    private static int exercicio05(int n, int[] arr, int low, int high){
        if(high >= low){
            int mid =  low + (high - low) / 2;

            if(arr[mid] == n)
                return mid;
            if(arr[mid] > n)
                return exercicio05(n, arr, low, mid - 1);

            return exercicio05(n, arr, mid + 1, high);
        }
        return -1;
    }
}