public class Main{
    public static void main(String[] args) {
        int[][] matriz = {
                {2, -3, 1},
                {4, 0, -2},
                {-1, 5, 3}
        };

        int determinante = calcularDeterminante(matriz);

        System.out.println("Matriz:");
        imprimirMatriz(matriz);

        System.out.println("\nDeterminante da matriz: " + determinante);
    }

    public static int calcularDeterminante(int[][] matriz) {
        return (matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1])) -
                (matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0])) +
                (matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]));
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha)
                System.out.printf("%d\t", elemento);
            System.out.println();
        }
    }
}