import java.util.*;

public class seconds{
    public static void main(String[] args) {
        
        int seconds = 86400;
        int days;

        Scanner s = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        days = s.nextInt();

        int total = days * seconds;

        System.out.println(total);

    }
}