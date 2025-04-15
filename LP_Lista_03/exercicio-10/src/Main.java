import java.util.Scanner;

public class Main {
    static int[] input() {
        int[] value = new int[3];

        Scanner in = new Scanner(System.in);

        System.out.println("\n### Ordenador de números em ordem crescente ###");
        System.out.println("\nInforme três números inteiros separados por espaço: ");
        for (int i = 0; i < value.length; i++)
            value[i] = in.nextInt();

        in.close();
        return value;
    }

    int[] sort(int[] values){
        int n = values.length;

        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if(values[j] > values[j + 1]){
                    int buffer = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = buffer;
                }
            }
        }
        return values;
    }

    public static void main(String[] args) {
        int[] values = input();

        Main main = new Main();
        values = main.sort(values);

        System.out.println("--------------------------------------------------");
        System.out.println("Aqui estão os números ordenados: ");
        for (int i : values)
            System.out.println(i);
    }
}
