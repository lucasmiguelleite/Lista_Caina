public class Main {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 10; numero++) {
            System.out.println("\nTabuada do " + numero + ":");
            System.out.println("------------------");

            for (int i = 0; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }

            System.out.println();
        }
    }
}