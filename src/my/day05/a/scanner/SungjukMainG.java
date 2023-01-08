package my.day05.a.scanner;

import java.util.Scanner;

public class SungjukMainG {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Sungjuk lssSj = new Sungjuk(); // 기본생성자
		
		
		System.out.print("1. 학번 : ");
		lssSj.hakbun = sc.nextLine();  // "091234"
		
		System.out.print("2. 성명 : ");
		lssSj.name = sc.nextLine(); // "이순신"
		
		try {
		
			System.out.print("3. 국어 : ");
			byte kor = Byte.parseByte(sc.nextLine());  // "90"  ==> 90
			                                           // "-80" ==> -80
			                                           // "110" ==> 110
			                                           // "안녕하세요"  ==> NumberFormatException 발생함 
			                                           // "12345678" ==> NumberFormatException 발생함
			                                           // "1.234"    ==> NumberFormatException 발생함
			// byte : -128 ~ 127
			// 우리가 원하는 숫자의 범위는 0 ~ 100
			/*
				Byte.parseByte(str_kor);    // String 타입인 str_kor 을 byte 타입으로 형변환 시켜주는 것 
				Short.parseShort(str_kor);  // String 타입인 str_kor 을 short 타입으로 형변환 시켜주는 것 
				Integer.parseInt(str_kor);  // String 타입인 str_kor 을 int 타입으로 형변환 시켜주는 것 
				Long.parseLong(str_kor);    // String 타입인 str_kor 을 long 타입으로 형변환 시켜주는 것 
			*/
			
			if(lssSj.checkJumsu(kor)) {
				lssSj.kor = kor;   // kor ==> 0 ~ 100
			}
			else {  // kor ==>  -128 ~ -1 또는 101 ~ 127
				
			 //	System.exit(0); // 숫자 0을 넣어주면 프로그램을 정상적으로 강제종료
				                // 숫자 0 아닌 다른 숫자를 넣어주면 프로그램을 비정상적으로 강제종료 
			 // 또는	
			 	
				sc.close();
				return;  // return 을 만나면 현재 실행중인 메소드(지금은 main 메소드)를 실행을 종료시켜 준다.
			}
			
			
			System.out.print("4. 영어 : ");
			byte eng = Byte.parseByte(sc.nextLine()); 
			if(lssSj.checkJumsu(eng)) {
				lssSj.eng = eng;   
			}
			else {  
				sc.close();
				return;  
			}
			
			
			System.out.print("5. 수학 : ");
			byte math = Byte.parseByte(sc.nextLine()); 
			if(lssSj.checkJumsu(math)) {
				lssSj.math = math;   
			}
			else {  
				sc.close();
				return;  
			}
			
			
			System.out.print("6. 나이 : ");
			
			
			
			
		} catch(NumberFormatException e) {
			System.out.println(">> 점수 입력은 0 이상 100 까지만 가능합니다. \n <<");
		}
		
		
		sc.close();
		
	}// end of main(String[] args)-------------------------------------

}
