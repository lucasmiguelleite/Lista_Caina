public class Main {
    public static void main(String[] args) {
        int [] vetor = new int[10];
        for (int i = 0; i < 10; ++i)
            vetor[i] = i;

        System.out.println("Contador de 10 a 1:\n");
        for (int i = 9; i >= 0; --i)
            System.out.println(vetor[i]);
    }
}