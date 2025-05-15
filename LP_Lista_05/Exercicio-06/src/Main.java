public class Main {
    public static void main(String[] args) {
        int [] v = new int[10];
        int contador = 0;

        // inicializador de vetor de 0 a 9
        for (int i = 0; i < v.length; i++)
            v[i] = i;

        // inversor do vetor
        for (int i = v.length / 2; i > 0; i--) {
            int b = v[contador];
            v[contador] = v[i];
            v[i] = b;
            contador++;
        }

        System.out.println("Vetor:");
        for (int i : v)
            System.out.println(v[i]);

    }
}