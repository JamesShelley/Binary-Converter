import java.util.ArrayList;
import java.util.Scanner;

public class BinaryConverter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String binaryOne = "1";
		String binaryZero = "0";
		ArrayList<String> binaryValues = new ArrayList<String>();
		
		System.out.println("Please input a decimal number to convert to binary");
		System.out.println("--------------");
		double decimalValue = input.nextInt();
		
		do {
				if (decimalValue % 2 != 0) {
				decimalValue = decimalValue / 2;
				decimalValue = Math.floor(decimalValue);
				binaryValues.add(binaryOne);
				
				} else {
				decimalValue = decimalValue / 2;
				decimalValue = Math.floor(decimalValue);
				binaryValues.add(binaryZero);
				
				}
				
		} while (decimalValue >= 1);
		
		System.out.println("--------------");
		
		StringBuilder sb = new StringBuilder();

		for (String s : binaryValues) {
			sb.append(s);
		}
		String reverse = new StringBuffer(sb).reverse().toString();
		System.out.println("Binary Value: " + reverse);
	
		input.close();
		
	}
		
}
