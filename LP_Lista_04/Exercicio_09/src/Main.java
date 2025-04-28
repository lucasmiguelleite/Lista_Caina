import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            boolean perdeu = false;

            for (int i = 1; i <= 10 && !perdeu; i++) {
                for (int j = 1; j <= 10 && !perdeu; j++) {
                    System.out.print("Quanto é " + i + " x " + j + "? ");
                    int respostaUsuario = in.nextInt();

                    if (respostaUsuario == i * j)
                        System.out.println("Correto!");
                    else {
                        System.out.println("Errado! A resposta certa era: " + (i * j));
                        perdeu = true;
                    }
                }
            }

            if (!perdeu)
                System.out.println("Parabéns! Você completou toda a tabuada sem erros!");
            else
                System.out.println("Você perdeu!");

            System.out.print("Deseja jogar novamente? (s/n): ");
            String resposta = in.next().toLowerCase();
            jogarNovamente = resposta.equals("s");
        }

        System.out.println("Obrigado por jogar!");
        in.close();
    }
}
