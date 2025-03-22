import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2;
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        n1 = in.nextInt();

        System.out.println("Informe outro número inteiro: ");
        n2 = in.nextInt();

        if (n1 > n2){
            System.out.println("O número " + n1 + " é maior que o número " + n2);
        }
        else if (n2 > n1){
            System.out.println("O número " + n2 + " é maior que o número " + n1);
        }
        else {
            System.out.println("Os números " + n1 + " e " + n2 + " possuem o mesmo valor");
        }

        in.close();
    }
}