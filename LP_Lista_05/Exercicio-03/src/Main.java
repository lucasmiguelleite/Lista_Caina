import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[10];
        Scanner in = new Scanner(System.in);

        // inicializando
       for (int i = 9; i >= 0; i--){
           array[i] = i * 2;
       }

        System.out.println("Informe um número inteiro:");
        int inputValue = in.nextInt();

        verifyValueInArray(array, inputValue);
        in.close();
    }

    public static void verifyValueInArray(int[] array, int inputValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == inputValue){
                System.out.print("\nValor " + inputValue + " encontrado no vetor na posição " + i);
                return;
            }
        }
        System.out.println("\nValor não encontrado");
    }
}