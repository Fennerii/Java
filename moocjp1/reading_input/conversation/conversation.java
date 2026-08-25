import java.util.*;

public class conversation{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Greetings! How are you doing?");
        String firstResponse = s.nextLine();
        System.out.println(firstResponse);
        System.out.println("Oh, how Interesting. Tell me more!");
        String secondResponse = s.nextLine();
        System.out.println(secondResponse);
        System.out.println("Thanks for sharing!");
    }
}