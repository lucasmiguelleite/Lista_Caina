import java.util.Scanner;

public class Main {
    public static int menu(){
        int optionSelected;

        Scanner in = new Scanner(System.in);

        System.out.println("Menu: ");
        System.out.println("1. De 0 a 10;");
        System.out.println("2. De 0 a 100.");
        System.out.println("\nSelecione uma opção: ");
        optionSelected = in.nextInt();

        if(optionSelected != 1 && optionSelected != 2){
            System.out.println("Opção Inválida, Selecione uma opção válida\n");
            return menu();
        }

        return optionSelected;
    }

    public static void main(String[] args) {
        double n1, n2, mean;
        int optionSelected;

        Scanner in = new Scanner(System.in);

        optionSelected = menu();

        if (optionSelected == 1){
            System.out.println("Informe a primeira nota de 0 a 10: ");
            n1 = in.nextDouble();

            System.out.println("Informe a segunda nota de 0 a 10: ");
        }
        else{
            System.out.println("Informe a primeira nota de 0 a 100: ");
            n1 = in.nextDouble();

            System.out.println("Informe a segunda nota de 0 a 100: ");
        }
        n2 = in.nextDouble();

        mean = (n1 + n2) / 2;

        System.out.println("\nMédia: " + mean);

        if (optionSelected == 1 && mean >= 8.5){
            System.out.println("A");
        }
        else if (optionSelected == 1 && mean >= 7){
            System.out.println("B");
        }
        else if (optionSelected == 1 && mean >= 5){
            System.out.println("C");
        }
        else if (optionSelected == 1 && mean < 5){
            System.out.println("D");
        }
        else if (optionSelected == 2 && mean >= 85){
            System.out.println("A");
        }
        else if (optionSelected == 2 && mean >= 70){
            System.out.println("B");
        }
        else if (optionSelected == 2 && mean >= 50){
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }

        in.close();
    }
}
