package my.day07.e.Dowhile;

import java.util.Scanner;

public class _2FactorialMain {

// === 입사문제 === //
/*
   >> 알고 싶은 팩토리얼 수 입력 => 5엔터
   >> 5! = 120
   
   5! ==> 5*4*3*2*1 
   7! ==> 7*6*5*4*3*2*1 
   
   >> 또 할래?[Y/N] => s엔터
   >> [경고] Y 또는 N만 입력하세요!!
   
   >> 또 할래?[Y/N] => y엔터
   >> 알고 싶은 팩토리얼 수 입력 => 안녕엔터 또는 1.234엔터
   ## [경고] 정수만 입력하세요!! ##
   
   >> 알고 싶은 팩토리얼 수 입력 => -6엔터 또는 0엔터
   >> [경고] 자연수만 입력하세요!!
   
   >> 알고 싶은 팩토리얼 수 입력 => 6엔터
   6! = 720
   >> 또 할래?[Y/N] => n엔터
   
   == 프로그램 종료 ==  	
*/
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		outer:
		do {
			try {
				System.out.print(">> 알고 싶은 팩토리얼 수 입력 => ");
				int num = Integer.parseInt(sc.nextLine()); // "5" 가능
				                                           // "-7"    "0" 불가함.
				                                           // "1.234" "안녕"  불가함. 
				if(num <= 0) {
					System.out.println(">> [경고] 자연수만 입력하세요!! \n");
					continue; 
					// continue; 를 만나면 아래로 떨어지지 않고 do~while(조건식); 의 조건식으로 들어간다. 
				}
				
				long result = 1;
				for(int i=num; i>0; i--) {  // 5*4*3*2*1
				
					result *= i;   // result = result * i;
					               // result =    1*5;
					               // result =    1*5*4;
					               // result =    1*5*4*3;
					               // result =    1*5*4*3*2;
					               // result =    1*5*4*3*2*1;
				}// end of for-----------------------------
				
				System.out.println(num+"! = " + result);
				
				do {
					System.out.print(">> 또 할래?[Y/N] => ");
					String yn = sc.nextLine();
					
					if("Y".equalsIgnoreCase(yn)) {
						break;
					}
					
					else if("N".equalsIgnoreCase(yn)) {
						break outer;
					}
					
					else {
						System.out.println(">> [경고] Y 또는 N만 입력하세요!! \n");
					}
				} while(true);
				// end of do~while---------------------------
			
			} catch(NumberFormatException e) {
				System.out.println("## [경고] 정수만 입력하세요!! ## \n");
			}
			
		} while(true);
		// end of do~while--------------------------------
		
		sc.close();
		System.out.println("\n== 프로그램 종료 ==");
		
	}// end of main()---------------------------------------

}
