import java.util.Scanner;

class ConversorMedida
{
    public static void main (String[] args){
        double m, c;
        System.out.println("Informe a medida em quilômetros: ");
        Scanner in = new Scanner(System.in);
        m = in.nextDouble();
        c = m / 1.60934;
        System.out.println("A medida em milhas: " + c);
    }
}