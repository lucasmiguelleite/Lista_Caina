public class Main {
    public static void main(String[] args) {
        System.out.println("===============================");
        System.out.println("Celsius (°C) |    Fahrenheit (°F)");
        System.out.println("===============================");

        for (int celsius = 80; celsius >= -80; celsius -= 10) {
            double fahrenheit = (celsius * 9.0 / 5.0) + 32;

            System.out.printf("%4d         |         %6.1f\n", celsius, fahrenheit);
        }

        System.out.println("===============================");
    }
}