import java.util.Scanner;

public class testesete {
    public static void main(String[] args) {
        String frase = "Estudar programação é legal";

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String x = leitor.nextLine();

        int posicao = frase.indexOf(x);

        if (posicao != -1){
            System.out.println("Palavra encontrada!!!");
        } else {
            System.out.println("não foi possivel encontrar a palavra");
        }
    }
}
