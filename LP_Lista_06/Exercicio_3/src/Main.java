import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y, p;
        Scanner in = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        x = in.nextInt();

        System.out.print("Agora, informe um expoente que deve ser um número inteiro maior ou igual a zero: ");
        y = in.nextInt();

        if (y <= 0){
            while (y < 0){
                System.out.print("Por favor, informe o expoente que deve ser um número inteiro maior ou igual a zero: ");
                y = in.nextInt();
            }
        }

        System.out.println();

        p = elevar(x, y);

        System.out.println(x + " ^ " + y + " = " + p);
    }

    private static int elevar(int x, int y){
        int resultado = 1;
        for (int i = 0; i < y; i++)
            resultado *= x;

        return resultado;
    }
}
