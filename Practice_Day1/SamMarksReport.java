import java.util.Scanner;

public class SamMarksReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        double physics, maths, chemistry;
        String name = "Sam";

        System.out.println("--- Entering Marks for " + name + " ---");

       
        System.out.print("Enter Physics marks: ");
        physics = input.nextDouble();

        System.out.print("Enter Maths marks: ");
        maths = input.nextDouble();

        System.out.print("Enter Chemistry marks: ");
        chemistry = input.nextDouble();

       .        double total = physics + maths + chemistry;
        double average = total / 3;

        // Step 3: Display the report
        System.out.println("\n--- Report Card ---");
        System.out.println("Student Name: " + name);
        System.out.println("Physics: " + physics);
        System.out.println("Maths: " + maths);
        System.out.println("Chemistry: " + chemistry);
        System.out.println("-------------------");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + average + "%");

        // Close the scanner
        input.close();
    }
}