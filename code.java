import java.awt.*;
import java.util.Arrays;
import java.text.NumberFormat;
/*public class code{
	public static void main(String[] args){
		//int age = 30;
		//int temparature = 25;
		//age = temperature;
		//float floated = 123.45F;
		//byte a = 40;
		//long longer = 3_123_456_789L;
		//char letter = 'A';
		Point point1 = new Point(1 , 1);
		Point point2 = point1;
		point1.x = 2;
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;

		double number = 1234567.891;
		NumberFormat currency =NumberFormat.getCurrencyInstance();
		String result = currency.format(number);
		String res = NumberFormat.getPercentInstance().format(0.1);
		System.out.println(res);
	}
}*/

public class code {
	public static void main(String[] args){
		final byte ANNUAL_MONTHS =12;
		final byte PERCENT =100;
		System.out.println("Enter the value of principal");
		Scanner sc = new Scanner(System.in);
		int principal = sc.nextInt();
		System.out.println("Enter the annual interest rate");
		float annualRate = sc.nextFloat();
		float monthlyRate = annualRate/PERCENT/ANNUAL_MONTHS;
		System.out.println("Enter the number of years");

	}
}

