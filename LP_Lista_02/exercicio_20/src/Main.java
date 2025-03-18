import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double primeiraRaiz, segundaRaiz, soma, produto;
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o valor da primeira raiz: ");
        primeiraRaiz = in.nextDouble();
        System.out.println("Informe o valor da segunda raiz ");
        segundaRaiz = in.nextDouble();

        soma = primeiraRaiz + segundaRaiz;
        produto = primeiraRaiz * segundaRaiz;

        System.out.println("A equação do segundo grau é: ");
        System.out.println("x² - (" + soma + ")x + " + produto + " = 0");
        in.close();
    }
}