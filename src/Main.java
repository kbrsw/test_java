import java.util.Scanner;

public class Main {
    //Create method
    static void myMethod() {
        //Print hello
        System.out.println("I just got executed!");
        System.out.println("Enter your name ");
        //Create new scanner object "name"
        Scanner name = new Scanner(System.in);
        //Read string "a"
        String a = name.nextLine();
        System.out.println("Your name is " +a);
    }

    //Realizing 
    public static void main(String[] args) {
        myMethod();
    }
}
