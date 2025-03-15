import java.util.Scanner;

class notas
{
    public static void main (String[] args){
        double n1, n2, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o valor da primeira nota de 0 a 10: ");
        n1 = in.nextDouble();
        if(n1<0 || n1>10){
            System.out.println("O valor informado tem estar entre 0 a 10");
            return;
        }
        System.out.println("Informe o valor da segunda nota de 0 a 10: ");
        n2 = in.nextDouble();
        if(n2<0 || n2>10){
            System.out.println("O valor informado tem estar entre 0 a 10");
            return;
        }
        result = media(n1, n2);
        System.out.println("A média ponderada é: " + result);
    }

    static double media(double n1, double n2){
        return ((n1 * 1) + (n2 * 2)) / (1 + 2);
    }
}