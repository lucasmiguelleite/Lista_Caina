import java.util.Scanner;

class QuintaParte
{
    public static void main (String[] args){
        double n, x;
        System.out.println("Informe um número real: ");
        Scanner in = new Scanner(System.in);
        n = in.nextDouble();
        x = n / 5;
        System.out.println("A quinta parte de " + n + " é " + x);
    }
}