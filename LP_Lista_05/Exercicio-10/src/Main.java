public class Main {
    public static void main(String[] args) {
        int[][] matrizA = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] matrizB = {
                {7, 8},
                {9, 10}
        };

        int[][] matrizProduto = new int[matrizA.length][matrizB[0].length];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                for (int k = 0; k < matrizA[0].length; k++)
                    matrizProduto[i][j] += matrizA[i][k] * matrizB[k][j];
            }
        }

        System.out.println("Matriz A:");
        imprimirMatriz(matrizA);

        System.out.println("\nMatriz B:");
        imprimirMatriz(matrizB);

        System.out.println("\nMatriz Produto (A * B):");
        imprimirMatriz(matrizProduto);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha)
                System.out.print(elemento + " ");
            System.out.println();
        }
    }
}
