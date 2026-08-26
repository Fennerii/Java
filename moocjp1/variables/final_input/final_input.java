import java.util.*
;
public class final_input{
    public static void main(String[] args) {
        String userString;
        int userInt;
        double userDouble;
        boolean userChoice;

        Scanner s = new Scanner(System.in);
        System.out.println("Give String");
        userString = s.nextLine();
        System.out.println("Give Int");
        userInt = s.nextInt();
        System.out.println("Give Double");
        userDouble = s.nextDouble();
        System.out.println("Give boolean");
        userChoice = s.nextBoolean();
        
        System.out.println("You gave the String " + userString);
        System.out.println("You gave the integer " + userInt);
        System.out.println("You gave the double " + userDouble);
        System.out.println("You gave the boolean " + userChoice);
    }
}