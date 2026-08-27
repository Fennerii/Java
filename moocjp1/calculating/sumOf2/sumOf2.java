import java.util.*;

public class sumOf2{
 
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Give the first number:");
    int FirstNum = Integer.valueOf(s.nextLine());
    System.out.println("Give the second number:");
    int SecNum = Integer.valueOf(s.nextLine());

    int total = FirstNum + SecNum;
    System.out.println("The sum of the numbers is "+ total);



}

        
    
}