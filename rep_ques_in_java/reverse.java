

import java.util.Scanner;
public class reverse {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String:");
		String res=scan.nextLine();
		
		String reversed="";
		for(int i=res.length()-1;i>=0;i--) {
			reversed +=res.charAt(i);
	
		}
		System.out.println(reversed);
		scan.close();
	}
	

}
