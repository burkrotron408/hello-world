import java.util.Scanner;

public class SalesTaxes {
		public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
			
			System.out.print("Enter purchaseAmount");
			double purchaseAmount = input.nextDouble();
			
			double tax = purchaseAmount * 0.07;
			double TotalPrice = purchaseAmount + tax;
			System.out.println("Sales tax is $" + (int)(tax * 100)/ 100.0);
			System.out.println("The Total Price is $" + TotalPrice);
	}

}
