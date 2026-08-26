import java.util.*;

public class double_input{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Give a number");
        double userNumber = s.nextDouble();
        System.out.println("You gave the number " + userNumber);
    }
}