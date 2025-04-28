public class Main {
    public static void main(String[] args) {
        System.out.println("Números positivos divisíveis por 4 e menores que 200:\n");

        int contador = 0;

        for (int i = 1; i < 200; i++) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
                contador++;

                if (contador % 10 == 0) {
                    System.out.println();
                }
            }
        }

        System.out.println("\n\nTotal de números encontrados: " + contador);
    }
}