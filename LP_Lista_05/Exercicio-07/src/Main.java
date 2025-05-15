import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int [][] m = new int[5][5];
        int maiorSomaColuna= Integer.MIN_VALUE;
        int maiorSomaLinha = Integer.MIN_VALUE;

        // inicializador de matriz
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m.length; j++)
                m[i][j] = j + random.nextInt(100);

        // imprimir o vetor com um delay
        System.out.println("Vetor:");
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m.length; j++){
                try{
                    System.out.print(" "+m[i][j]);
                    Thread.sleep(500);
                }
                catch (InterruptedException e){
                    System.out.println("error: " + e);
                }
            }

            System.out.print(" \n");
        }

        System.out.print("\n");

        for (int j = 0; j < m.length; j++){
            int somaColuna = 0;
            for (int i = 0; i < m.length; i++)
                somaColuna += m[i][j];
            if (somaColuna > maiorSomaColuna)
                maiorSomaColuna = somaColuna;
        }

        for (int i = 0; i < m.length; i++){
            int somaLinha = 0;
            for (int j = 0; j < m.length; j++)
                somaLinha += m[i][j];
            if (somaLinha > maiorSomaLinha)
                maiorSomaLinha = somaLinha;
        }

        System.out.println("Maior soma das colunas: " + maiorSomaColuna);
        System.out.println("Maior soma das linha: " + maiorSomaLinha);
    }
}