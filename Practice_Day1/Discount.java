import java.util.Scanner;

public class  Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		double Fee,Precentage  ;
		System.out.println("Total Fee");
		Fee = input.nextDouble();
		System.out.println("Discount Percentage");
		Percentage= input.nextDouble();
		double  Discountfee= (Fee-percentage*100) ;
		System.out.println("Total fees To Pay" +Discountfee );
		input.close();
}}