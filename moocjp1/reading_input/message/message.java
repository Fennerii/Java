import java.util.Scanner;

public class message{
    public static void main(String [] args){
        // Code
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your message");
        String message = scanner.nextLine();

        System.out.println(message);
    }
}