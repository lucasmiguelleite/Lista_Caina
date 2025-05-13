public class Main {
    public static void main(String[] args) {
        int [] vetor = new int[10];

        // inicializando
        for (int i = 0; i < 10; ++i)
            vetor[i] = i;

        // imprimindo os valores
        System.out.println("Valores originais:\n");
        for (int i = 0; i < 10; i++)
            System.out.println(vetor[i]);

        // alterando os valores
        for (int i = 0; i < 10; ++i){

            if (vetor[i] % 2 == 0)
                vetor[i] = vetor[i] + 2;
            else
                vetor[i] = vetor[i] * 2;
        }

        // imprimindo os valores
        System.out.println("\nValores alterados:\n");
        for (int i = 0; i < 10; i++)
            System.out.println(vetor[i]);
    }
}