import java.util.Scanner;

public class ScannerApp93 {
    // create sc which is a Scanner obj variable , as a class/static variable.
    // So you can use sc in any method in the class. 
    static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
           
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();
        System.out.println("You entered: " + x + ".");
    }
}
