import java.util.Scanner; // Step 1: Import the class

public class Main {
    public static void main(String[] args) {
        // Step 2: Create a Scanner object
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter your name: ");
        // Step 3: Read a String
        String name = reader.nextLine(); 

        System.out.print("Enter your age: ");
        // Step 4: Read an Integer
        int age = reader.nextInt();

        System.out.println("Hello " + name + "! You are " + age + " years old.");

        // Step 5: Close the scanner
        reader.close();
    }
}