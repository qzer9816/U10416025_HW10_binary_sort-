//U10416025
import java.util.Scanner;
 
public class BinarySort 
{
	public static void main(String args[])
	{	
		int number;
		int element[];
		int search;
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many elements you need:");
		number = input.nextInt();
		
		element = new int[number];
	
		System.out.println("Please enter " + number + " integers:");

		for (int i = 0; i < number; i++){
			element[i] = input.nextInt();
		}
		
		System.out.println("Enter value to find:");
		search = input.nextInt();
	}
}
