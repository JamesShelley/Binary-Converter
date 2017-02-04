import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BinaryConverter {

 public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
  ArrayList < String > binaryValues = new ArrayList < String > ();

  try {

   System.out.println("Please input an integer to convert to binary:");
   int decimalValue = input.nextInt();

   	do {
   		
   		if (decimalValue % 2 != 0) {
   			decimalValue = decimalValue / 2;
   			binaryValues.add("1");

   		} else {
   			decimalValue = decimalValue / 2;
   			binaryValues.add("0");

   		}

   	} while (decimalValue >= 1);

   System.out.println("--------------");

   StringBuilder sb = new StringBuilder();

   for (String s: binaryValues) {
	   sb.append(s);
   }
   
   String reverse = new StringBuffer(sb).reverse().toString();
   System.out.println("Binary Value: " + reverse);

  } catch (InputMismatchException e) {
   
	  System.out.println("Invalid Input: Please input a positive integer.");
	  System.out.println("----------------------------------------------");
	  main(args);
  }

  input.close();

 }

}
