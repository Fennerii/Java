import java.util.*;

public class integer_input{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Give a number");
        int userNumber = s.nextInt();
        System.out.println("You gave the number " + userNumber);
    }
}