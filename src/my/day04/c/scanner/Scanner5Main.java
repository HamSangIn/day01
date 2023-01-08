package my.day04.c.scanner;

import java.util.Scanner;

public class Scanner5Main {

	public static void main(String[] args) {
		
		System.out.println("== 키보드로 부터 2개의 숫자를 입력받아서 사칙연산(+ - * /)한 결과 알아보기 == \n"); 
				
		Scanner sc = new Scanner(System.in);
		String inputStr = "";
		
		try {
			System.out.print(">> 첫번째 정수 입력 : ");
			inputStr = sc.nextLine(); // "25"
			                                 // "똘똘이"
			
			// "문자열"을 int 타입으로 형변환 시켜주는 방법
			int num1 = Integer.parseInt(inputStr);
			
			System.out.print(">> 두번째 정수 입력 : ");
			inputStr = sc.nextLine(); // "2"
                                      // "안녕"
			
			// "문자열"을 int 타입으로 형변환 시켜주는 방법
			int num2 = Integer.parseInt(inputStr); 
			
			System.out.print(">> 사칙연산(+ - * /) 선택 : "); 
			String operator = sc.nextLine(); // "+"
									         // "-"
									         // "*"
									         // "/"
									         // "몰라요"
			                                 // "abcd"
			 		 
			double result = 0;
			boolean b_flag = true;
			
			switch (operator) { 
			    // operator 에 들어올 수 있는 타입은 byte, short, int, char, String 만 가능하다. 
				case "+":
					result = num1 + num2;
					break; // break; 를 만나면 switch 문장을 빠져나간다.
					
				case "-":
					result = num1 - num2;
					break; // break; 를 만나면 switch 문장을 빠져나간다.	
					
				case "*":
					result = num1 * num2;
					break; // break; 를 만나면 switch 문장을 빠져나간다.
					
				case "/":
					result = (double)num1 / num2;  // 25.0/2 => 12.5
					break; // break; 를 만나면 switch 문장을 빠져나간다.		
		
				default:
					b_flag = false;
					System.out.println(">> "+operator+" 는 사칙연산(+ - * /)이 아니므로 계산이 불가합니다.!! <<"); 
					break; // break; 를 만나면 switch 문장을 빠져나간다.
			}// end of switch()--------------------------
			
			if(b_flag) {
			   
				if("/".equals(operator)) {
					System.out.println(">> 결과 : " + num1 + operator + num2 + "=" + result);
				}
				else {
					System.out.println(">> 결과 : " + num1 + operator + num2 + "=" + (int)result);
				}
			}
		
		} catch(NumberFormatException e) {
			System.out.println(">> "+inputStr+" 은(는) 정수가 아닙니다. 정수만 입력하세요!! <<");
		}
		
		sc.close();
		
	}// end of main()-----------------------------------------

}
