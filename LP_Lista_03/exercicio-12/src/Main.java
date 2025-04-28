import java.util.Scanner;

public class Main {
    public static int menu() {
        int optionSelected;

        Scanner in = new Scanner(System.in);

        System.out.println("##### Operações Matemáticas #####");
        System.out.println("1. Soma;");
        System.out.println("2. Subtração;");
        System.out.println("3. Multiplicação;");
        System.out.println("4. Divisão;");
        System.out.println("\nSelecione uma opção: ");

        optionSelected = in.nextInt();

        if(optionSelected < 1 || optionSelected > 4 ){
            System.out.println("\nOpção inválida");
            return menu();
        }

        return optionSelected;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int optionSelected;
        double result = 0, a = 0, b = 0;

        optionSelected = menu();

        while (a == 0){
            System.out.println("Digite o primeiro número: ");
            a = in.nextDouble();
        }

        while (b == 0){
            System.out.println("Digite o segundo número: ");
            b = in.nextDouble();
        }

        switch (optionSelected){
            case 1:
                result = a + b;
                break;

            case 2:
                result =  a - b;
                break;

            case 3:
                result =  a * b;
                break;

            case 4:
                result =  a / b;
                break;

            default:
                System.out.println("Valor Inválido");
                return;
        }

        System.out.println("\nResultado: " + result);
        in.close();
    }
}
