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
        double n1, n2, n3, mean;
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
        System.out.println("Situação: Em Recuperação\n");

        if (optionSelected == 1 && mean < 5){
            System.out.println("Informe a nota da prova de recuperação de 0 a 10: ");
            n3 = in.nextDouble();

            mean = (mean + n3) / 2;
            System.out.println("\nNova Média: " + mean);

            if (mean < 5) {
                System.out.println("Situação: Reprovado");
            }
            else {
                System.out.println("Situação: Aprovado");
            }
        }
        else if (optionSelected == 2 && mean < 50){
            System.out.println("Informe a nota da prova de recuperação de 0 a 100: ");
            n3 = in.nextDouble();

            mean = (mean + n3) / 2;
            System.out.println("\nNova Média: " + mean);

            if (mean < 50) {
                System.out.println("Situação: Reprovado");
            }
            else {
                System.out.println("Situação: Aprovado");
            }
        }
        else {
            System.out.println("Situação: Aprovado");
        }

        in.close();
    }
}
