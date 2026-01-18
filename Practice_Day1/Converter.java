import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		double cp , sp ;
		System.out.println("Cost price ");
		cp= input.nextDouble();
		System.out.println("Selling price");
		sp= input.nextDouble();
		double profit = sp-cp;
		System.out.println("Profit:" + profit);
		input.close();
}}