import java.lang.Math;
import java.util.Scanner;

class Quadrado
{
    public static void main (String[] args){
        int n;
        double quadrado;
        System.out.println("Informe um número inteiro: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        quadrado = Math.pow(n, 2);
        System.out.println("O quadrado de " + n + " é " + quadrado);
    }
}