package new_questions;

import java.util.Scanner;

public class primeNumbers {
    
    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("Enter the number");
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("Not a prime numer");
				break;
			}
			else {
				System.out.println("Prime num");
				break;
			}
		}
		scan.close();
	}
}
