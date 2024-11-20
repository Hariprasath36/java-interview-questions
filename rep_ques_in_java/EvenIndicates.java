import java.util.Scanner;
public class EvenIndicates {
	
	public static void main (String args[]) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a string");
		String input=scan.nextLine();
		
		System.out.println("Character at even indices:");
		for(int i=0;i<input.length();i+=2)
		{
			System.out.print(input.charAt(i));
		}
		scan.close();
	}
	
	

}
