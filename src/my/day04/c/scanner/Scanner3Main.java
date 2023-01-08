package my.day04.c.scanner;

//import java.util.Scanner;
import java.util.*;

public class Scanner3Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 => " );
		
		try {
		String inputStr = sc.nextLine();
		
		int n = Integer.parseInt(inputStr) +10; // Integer. => 문자열을 인트로 바꿔준다.
		
		
		
	
		
		System.out.println("입력한 정수에 10을 더한 값 : " + n);
		
			} //end of try
		catch(NumberFormatException e) {
			System.out.println(" >>> 정수만 입력하세요!! <<< \n");
			
		} // end of catch

			
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// end of public static void main(String[] args)
}// end of public class Scanner2Main 
