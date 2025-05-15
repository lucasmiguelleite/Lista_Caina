import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int [][] m = new int[5][5];

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

        // imprimir a diagonal com um delay
        System.out.println("\nDiagonal principal:");
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m.length; j++){
                try{
                    if(i == j){
                        System.out.print(" "+m[i][j]);
                        Thread.sleep(500);
                    }

                    System.out.print("   ");
                }
                catch (InterruptedException e){
                    System.out.println("error: " + e);
                }
            }
            System.out.print(" \n");
        }



    }
}