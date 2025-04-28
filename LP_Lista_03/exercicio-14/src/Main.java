import java.util.Scanner;

public class Main {
    public static int menu() {
        int optionSelected;

        Scanner in = new Scanner(System.in);

        System.out.println("Menu: ");
        System.out.println("    1. Débito");
        System.out.println("    2. Pix");
        System.out.println("    3. Crédito");
        System.out.println("\nSelecione uma opção: ");
        optionSelected = in.nextInt();

        return optionSelected;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int option;
        double v, p;

        System.out.println("Insira o valor da compra: ");
        v = in.nextDouble();

        option = menu();

        switch (option){
            case 1:
                System.out.println("\nDébito Selecionado");
                v = v - ((v * 5) / 100);
                System.out.printf("\nValor final da compra: R$%.2f", v);
                break;

            case 2:
                System.out.println("\nPix Selecionado");
                v = v - ((v * 10) / 100);
                System.out.printf("\nValor final da compra: R$%.2f", v);
                break;

            case 3:
                System.out.println("\nCrédito Selecionado");
                System.out.println("\nEscolha o número de parcelas (até no maximo 10 parcelas): ");
                p = in.nextInt();
                if(p >= 1 && p <= 4)
                    v = v + ((v * 2) / 100);
                else if (p > 4 && p <= 10)
                    v = v + ((v * 5) / 100);
                else {
                    System.out.println("Quantidade de parcelas inválidas");
                    return;
                }
                System.out.printf("\nValor final da compra: R$%.2f", v);
                System.out.printf("\nValor das parcelas: R$%.2f", v / p);
                break;
        }

        in.close();
    }
}