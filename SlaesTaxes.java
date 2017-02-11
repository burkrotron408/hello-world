import java.util.Scanner;

public class SlaesTaxes {
		public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
			
			System.out.print("Enter purchaseAmount");
			double purchaseAmount = input.nextDouble();
			
			double tax = purchaseAmount * 0.07;
			System.out.println("Sales tax is $" + (int)(tax * 100)/ 100.0);
	}

}
