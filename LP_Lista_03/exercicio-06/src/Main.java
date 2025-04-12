import java.util.Scanner;

public class Main {
    public static int menu() {
        int optionSelected;

        Scanner in = new Scanner(System.in);

        System.out.println("Menu: ");
        System.out.println("5. Hambúrger;");
        System.out.println("6. Pizza;");
        System.out.println("7. Hot-Dog;");
        System.out.println("8. Espaguete;");
        System.out.println("9. Sushi.");
        System.out.println("\nSelecione uma opção: ");
        optionSelected = in.nextInt();

        in.close();
        return optionSelected;
    }

    public static void main(String[] args) {
        int optionSelected;

        optionSelected = menu();

        switch (optionSelected) {
            case 5:
                System.out.println("\nA opção escolhida foi Hambúrger");
                break;

            case 6:
                System.out.println("\nA opção escolhida foi Pizza");
                break;

            case 7:
                System.out.println("\nA opção escolhida foi Hot-Dog");
                break;

            case 8:
                System.out.println("\nA opção escolhida foi Espaguete");
                break;

            case 9:
                System.out.println("\nA opção escolhida foi Sushi");
                break;

            default:
                System.out.println("\nOpção Inválida");
                break;
        }

    }
}
