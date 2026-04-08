
import java.util.Scanner;

public class testedois {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

            System.out.print("Digite um nome: ");
            String x = leitor.nextLine();
            
            System.out.print("Digite outro nome: ");
            String y = leitor.nextLine();

            // boolean b = x.equals(y);

            if (x.equals(y)){
                System.out.println("As palavras são iguais");
            } else {
                System.out.println("São palavras diferentes");
            }
            leitor.close();
        }

    }
