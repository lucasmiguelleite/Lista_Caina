public class Main {
    public static void main(String[] args) {
        int [] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [] v2 = new int[10];
        int contador = 0;

        for (int i = 9; i > 0; i--) {
            v2[contador] = v1[i];
            contador++;
        }

        System.out.println("Vetor 1:");
        for (int i : v1)
            System.out.println(v1[i]);

        System.out.println("\nVetor 2:");
        for (int i = 0; i < v1.length; i++)
            System.out.println(v2[i]);
    }
}
