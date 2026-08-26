import java.util.*;

public class boolean_input{
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        System.out.println("Write something");
        String userMsg = s.nextLine();
        System.out.println("True or False?");
        boolean userChoice = s.nextBoolean();
        System.out.println(userChoice);
    }
}