package StringMethods;

import java.util.Scanner;

public class AlphabetDigitSpecial {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the String:");
		String s=scan.next();
		
		
		for(int i=0;i<s.length();i++) {
			int n=s.charAt(i);
			int countA=0, countD=0,countS=0;
			if((n>='a' && n<='z')||(n>='A'&& n<='Z')) {
				countA++;
			}
			else if(n>='0' && n<='9') {
				countD++;
			}
			else {
				countS++;
			}
		
			System.out.println("Alphabets count :" + countA);
			System.out.println("Digits count :" + countD);
			System.out.println("Special Characters count :" + countS);
		}
		
		
	
	}

}
