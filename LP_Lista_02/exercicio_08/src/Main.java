import java.util.Scanner;

class ConversorMedida
{
    public static void main (String[] args){
        double m, c;
        System.out.println("Informe a medida em polegadas: ");
        Scanner in = new Scanner(System.in);
        m = in.nextDouble();
        c = m * 25.4;
        System.out.println("A medida em milímetro: " + c);
    }
}