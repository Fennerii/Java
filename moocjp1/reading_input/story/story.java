import java.util.*;

public class story{
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("I will tell you a story, but I need some information first\n" + "What is the main character called?");
    String Charname = s.nextLine();
    System.out.println("What is their job?");
    String job = s.nextLine();

    System.out.println("Once upon a time there was " + Charname + " who was " + job + "." + " On the way to work, " + Charname + " reflected on life.\n Perhaps " + Charname + " will not be a " + job + " forever.");
}
}