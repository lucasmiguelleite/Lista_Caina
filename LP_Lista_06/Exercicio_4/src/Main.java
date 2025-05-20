import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s;
        boolean b;
        Scanner in = new Scanner(System.in);

        System.out.println("Verificador de palíndromo");

        do{
            System.out.print("Informe uma palavra, frase ou sequência: ");
            s = in.nextLine();
        }while (s.isEmpty());

        System.out.println();

        b = verificadorPalindromo(s);

        if (b) System.out.println(s + " é palíndromo");
        else System.out.println(s + " não é um palíndromo");
    }

    private static boolean verificadorPalindromo(String s){
        String cleanedString = s.replaceAll("[^\\p{L}\\p{N}]", "");

        cleanedString = cleanedString.toLowerCase();

        for (int i = 0; i < cleanedString.length() / 2; i++){
            if(cleanedString.charAt(i) != cleanedString.charAt(cleanedString.length() - i - 1))
                return false;
        }

        return true;
    }
}