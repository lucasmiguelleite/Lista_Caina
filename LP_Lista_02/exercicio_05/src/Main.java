import java.util.Scanner;

class ConversorVelocidade
{
    public static void main (String[] args){
        double v, c;
        System.out.println("Informe a velocidade em km/h: ");
        Scanner in = new Scanner(System.in);
        v = in.nextDouble();
        c = v / 3.6;
        System.out.println("A velocidade em m/s: " + c);
    }
}