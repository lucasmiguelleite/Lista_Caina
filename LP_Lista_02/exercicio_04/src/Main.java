import java.util.Scanner;

class Media
{
    public static void main (String[] args){
        double n1, n2, media;
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        n1 = in.nextDouble();
        System.out.println("Informe a segunda nota: ");
        n2 = in.nextDouble();
        media = (n1 + n2)/ 2;
        System.out.println("A média: " + media);
    }
}