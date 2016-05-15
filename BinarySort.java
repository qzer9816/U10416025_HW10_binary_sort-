//U10416025
import java.util.Scanner;
 
public class BinarySort 
{
	//main method
	public static void main(String args[])
	{	
		//data field
		int first, last, middle;
		int number;
		int element[];
		int search;
		
		//new scanner
		Scanner input = new Scanner(System.in);
		System.out.println("How many elements you need:");
		number = input.nextInt();
		
		element = new int[number];
	
		System.out.println("Please enter " + number + " integers:");

		//let number in element array
		for (int i = 0; i < number; i++){
			element[i] = input.nextInt();
		}
		
		//let user input search number
		System.out.println("Enter value to find:");
		search = input.nextInt();
		
		first = 0;
		last = number - 1;
		middle = (first + last)/2;
		
		//binary search
		while( first <= last ){
			if ( element[middle] < search ){
				first = middle + 1;    
			}
			else if (element[middle] == search){
				System.out.println("The number " + search + " at position " + (middle + 1) + ".");
				break;
			}
			else{
				last = middle - 1;
				middle = (first + last)/2;
			}
		}
		if ( first > last ){
			System.out.println("The number " + search + " is not in this list.\n");
		}
	}
}
