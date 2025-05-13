import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[10];
        Scanner in = new Scanner(System.in);

        // inicializando
        System.out.println("Informe dez números inteiro:");
        for (int i = 0; i < array.length; i++){
            System.out.print(i + ": ");
            array[i] = in.nextInt();
        }

        verifyArray(array);
        in.close();
    }

    public static void verifyArray(int[] array){
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, maxPosition = -1, minPosition = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
                maxPosition = i;
            }
            if (array[i] < min){
                min = array[i];
                minPosition = i;
            }
        }
        System.out.println("\nO maior valor é o " + max + " na posição " + maxPosition);
        System.out.println("\nE o menor valor é o " + min + " na posição " + minPosition);
    }
}