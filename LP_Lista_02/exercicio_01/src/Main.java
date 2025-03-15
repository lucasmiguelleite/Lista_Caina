import java.util.Scanner;

class Dobro
{
    public static void main (String[] args){
        int n, dobro;
        System.out.println("Informe um número inteiro: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        dobro = n * 2;
        System.out.println("O dobro de " + n + " é " + dobro);
    }
}