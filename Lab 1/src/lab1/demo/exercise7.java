package lab1.demo;
import java.util.Scanner;

public class exercise7 {

	public static void main(String[]args) {
		double weight, marsWeight;
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Input your weight in kg: ");
	     weight = sc.nextDouble();
	     marsWeight = (weight/9.81)*3.711;
	     
	     System.out.println("Your weight on earth: " +weight + "kg");
         System.out.println("Your weight on mars: " +String.format("%.2f", marsWeight ) + "kg");
	}
}
