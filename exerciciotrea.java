import java.util.Scanner;

public class testequatro {
   public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String x = leitor.nextLine();

        System.out.println(x.length());

        leitor.close();
    
   }
}
