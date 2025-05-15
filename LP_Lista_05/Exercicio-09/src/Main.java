import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int [][] m = new int[5][5];

        // inicializador de matriz
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m.length; j++)
                m[i][j] = j + random.nextInt(100);

        // imprimir a diagonal com um delay
        System.out.println("Diagonal secundária:");
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m.length - 1 - i; j++)
                System.out.print("    ");
            try{
                System.out.print(" "+m[i][m.length - 1 - i]);
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                System.out.println("error: " + e);
            }
            System.out.print(" \n");
        }

        // imprimir o vetor com um delay
        System.out.println("\nVetor:");
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

    }
}
