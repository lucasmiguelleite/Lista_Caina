import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double value;
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um número real:");
        value = in.nextDouble();

        if (value < 0){
            System.out.println("Valor inválido!");
        }
        else {
            System.out.println("A raiz quadrada de " + value + " é " + Math.sqrt(value));
        }

        in.close();
    }
}