package my.day04.c.scanner;

//import java.util.Scanner;
import java.util.*;

public class Scanner4Main {

	public static void main(String[] args) {
		
		System.out.println("== 키보드로 부터 2개의 정수를 입력받아서 더한 결과 알아보기 == \n");
		Scanner sc = new Scanner(System.in);
		String inputStr = "";
		
		try {
		
		
		System.out.println("1. 첫번째 정수 :  " );
		
		inputStr = sc.nextLine();  // "10"
						                  // "안녕하세요"
		int num1 = Integer.parseInt(inputStr);
		
				
		System.out.println("1. 두번째 정수 :  " );
		
		inputStr = sc.nextLine();
		
		int num2 = Integer.parseInt(inputStr);
		
		
		System.out.println(" >> 더한결과 : " +num1+"+"+num2+"="+(num1+num2) );
		}//end of try
		
		catch(NumberFormatException e) {
		System.out.println(inputStr +"정수가 아니므로 정수로 입력하세요!!");
		
		}//end of catch
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// end of public static void main(String[] args)
}// end of public class Scanner2Main 
