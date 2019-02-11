import java.util.Scanner;

public class scanForInt {
    
    static Scanner sc = new Scanner(System.in);        // Must be declared outside as static to be accessed
    
    public static void main (String[] args) {
        
        getNumber();
        System.out.println("First method finished.\n");
        getNumber();
        System.out.println("Second method finished.\n");
        getNumber();
        System.out.println("Third method finished.\n");        // Method can be reused without error or excess intput spilling over
        
        sc.close();
        
        System.out.println("Program termianted.");    

    }
    
    // Gets first number entered from an input String and discards the rest - will loop if char
    public static void getNumber() {
    
        System.out.println("Enter an integer: ");
        while (!sc.hasNextInt()) {                // No integer entered, loop until you do.
           System.out.println("Wrong input!");
           sc.nextLine();                        // Try again...
        }
        int num = sc.nextInt();                    // Convert the int in input to an int variable.
        System.out.println("\nUser input passed to Integer variable: " + num);
        sc.nextLine();                            // Takes the rest of the input and discard it.
    }

}
