import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o número de linhas da primeira matriz:");
        int linhasA = in.nextInt();
        System.out.println("Informe o número de colunas da primeira matriz:");
        int colunasA = in.nextInt();

        System.out.println("\nInforme o número de linhas da segunda matriz:");
        int linhasB = in.nextInt();
        System.out.println("Informe o número de colunas da segunda matriz:");
        int colunasB = in.nextInt();

        if (colunasA != linhasB) {
            System.out.println("\nErro: A multiplicação não é possível. O número de colunas da primeira matriz (" + colunasA + ") deve ser igual ao número de linhas da segunda matriz (" + linhasB + ").");
            in.close();
            return;
        }

        int[][] matrizA = new int[linhasA][colunasA];
        int[][] matrizB = new int[linhasB][colunasB];
        int[][] matrizProduto = new int[linhasA][colunasB];

        System.out.println("\nInforme os valores da primeira matriz (" + linhasA + "x" + colunasA + "):");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrizA[i][j] = in.nextInt();
            }
        }

        System.out.println("\nInforme os valores da segunda matriz (" + linhasB + "x" + colunasB + "):");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrizB[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < colunasA; k++)
                    matrizProduto[i][j] += matrizA[i][k] * matrizB[k][j];
            }
        }

        System.out.println("\nPrimeira Matriz:");
        imprimirMatriz(matrizA);

        System.out.println("\nSegunda Matriz:");
        imprimirMatriz(matrizB);

        System.out.println("\nMatriz Produto (" + linhasA + "x" + colunasB + "):");
        imprimirMatriz(matrizProduto);

        in.close();
    }
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha)
                System.out.print(elemento + " ");
            System.out.println();
        }
    }
}