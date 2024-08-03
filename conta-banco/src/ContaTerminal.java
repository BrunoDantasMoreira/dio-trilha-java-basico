import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Hi, what's your name? ");
        String name = scanner.next();

        System.out.println("Please, type the Agency: ");
        int agency = scanner.nextInt();

       System.out.println("Now the Number: "); 
       int number = scanner.nextInt();

       System.out.println("And the Balance: ");
       double balance = scanner.nextDouble();

       System.out.println("Hello " + name + ", thank you to create a acount account in your bank, you agency is " + agency + ", account " + number + " and you balance " + balance + " is already available for withdraw!");
    }
}
