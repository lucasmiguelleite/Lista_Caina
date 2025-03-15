import java.util.Scanner;

class ConversorMedidaTemperatura
{
    public static void main (String[] args){
        double t, c;
        System.out.println("Informe o valor da temperatura em graus Celsius: ");
        Scanner in = new Scanner(System.in);
        t = in.nextDouble();
        c = (t * 1.8) + 32;
        System.out.println("A temperatura em graus Fahrenheit: " + c);
    }
}