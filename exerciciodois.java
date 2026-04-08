import java.util.Scanner;

public class testetres {

    public static void main(String[] args) {
        Scanner leitor =  new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String x = leitor.nextLine();

        System.out.println("Digite outra palavra");
        String y = leitor.nextLine();

        if (x.equalsIgnoreCase(y)){
            System.out.println("São palavras iguais");
        } else {
            System.out.println("São palavras diferentes");
        }
        leitor.close();
    }
    
}
