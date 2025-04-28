import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int primeiroNumero = in.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int segundoNumero = in.nextInt();

        int menor = Math.min(primeiroNumero, segundoNumero);
        int maior = Math.max(primeiroNumero, segundoNumero);

        System.out.println("\nNúmeros naturais entre " + menor + " e " + maior + ":");

        if (menor >= maior - 1)
            System.out.println("Não existem números naturais entre os valores informados.");
        else {
            int contador = 0;

            for (int i = menor + 1; i < maior; i++) {
                if (i >= 0) {
                    System.out.print(i + " ");
                    contador++;

                    if (contador % 10 == 0)
                        System.out.println();
                }
            }

            if (contador == 0)
                System.out.println("Não existem números naturais entre os valores informados.");
        }

        in.close();
    }
}