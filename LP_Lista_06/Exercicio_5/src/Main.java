import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {13, 15, 24, 30, 33, 40, 42, 52, 69, 71, 88};
        int n, r;
        Scanner in = new Scanner(System.in);

        System.out.println("Busca Binária");

        System.out.print("Informe um número inteiro: ");
        n = in.nextInt();

        System.out.println();

        r = binarySearch(n, arr);
        if (r == -1) System.out.println("Valor não encontrado");
        else System.out.println("Número "+ n + " foi encontrado no array");
    }

    private static int binarySearch(int n, int[] arr){
        int low = 0;
        int high = arr.length;

        while(low <= high){
            int mid = (low + high) / 2;

            if(n < arr[mid])
               high = mid - 1;
            else if(n > arr[mid])
                low = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
