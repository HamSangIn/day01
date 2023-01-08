package my.day04.c.scanner;

//import java.util.Scanner;
import java.util.*;

public class Scanner2Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 => " );
		
		try {
		int inputNum = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("입력한 정수 : " + inputNum);
		
		}catch(InputMismatchException e) {
			System.out.println(" >>> 정수만 입력하세요!! <<< \n");
			
		}
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// end of public static void main(String[] args)
}// end of public class Scanner2Main 
