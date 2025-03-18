import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double vo, a, v;
        int t;
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a velocidade inicial em m/s: ");
        vo = in.nextDouble();
        System.out.println("Informe a aceleração em m/s²: ");
        a = in.nextDouble();
        System.out.println("Informe o tempo de percurso em segundos: ");
        t = in.nextInt();
        v = vo + a * t; 
        System.out.println("A velocidade é de: " + v + "m/s");
        in.close();
    }
}
