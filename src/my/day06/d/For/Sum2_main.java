package my.day06.d.For;

import java.util.Scanner;

public class Sum2_main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
		
			try {
					System.out.print(">> 누적해야 할 시작 숫자 => ");  
					int startNo = Integer.parseInt(sc.nextLine());  
					//  startNo = 5 
					//  startNo = "안녕하세요"
					
					System.out.print(">> 누적해야 할 마지막 숫자 => ");  
					int endNo = Integer.parseInt(sc.nextLine());  
					//  endNo = 1 
					//  endNo = 10
				    //  endNo = "건강하세요"
					
					
					if(endNo < startNo) {
						System.out.println("== [경고] 마지막 숫자는 시작 숫자 보다 같거나 커야 합니다 == \n");
						continue;
					}
					
					// startNo      ==> 1   2   3    5
					// endNo        ==> 10  9   5   10
					// 반복해야할 회수 ==> 10  8   3    6번 반복
					// 반복해야할 회수 ==> (endNo - startNo + 1) 번 반복
					
					int cnt = endNo - startNo + 1; // 반복해야할 회수
					int sum = 0;  // 누적의 합을 저장시켜주는 변수. 0으로 초기화 함.
					int start = startNo; // int start = 5;
					String str = "";
					
					for(int i=0; i<cnt; i++) {
						
						String str_add = (i<cnt-1)?"+":"=";
						
						str += start + str_add; // str = str + start + "+"; 
						                        // str = "" + 5 + "+";
						                        // str = "5+" + 6 + "+";
						                        // str = "5+6+" + 7 + "+";
						                        // .......
						                        // str = "5+6+7+8+9+10=";
						
						sum += start++; // sum = sum + start; 
						                // sum = 0 + 5;
						                // sum = 0 + 5 + 6;  
						                // sum = 0 + 5 + 6 + 7;
						                // sum = 0 + 5 + 6 + 7 + 8;
						                // sum = 0 + 5 + 6 + 7 + 8 + 9;
						                // sum = 0 + 5 + 6 + 7 + 8 + 9 + 10;
					}// end of for-----------------
					
					System.out.println(startNo+" 부터 "+endNo+" 까지의 누적의 합은 "+sum+"입니다.");
					// 5 부터 10 까지의 누적의 합은 45 입니다.
					
					System.out.println(str+sum);
					// 5+6+7+8+9+10=45
					
					break;
				
			} catch(NumberFormatException e) {
				System.out.println("== [경고] 정수만 입력하세요~~ == \n");
			}
			
		}// end of for----------------------
				
		sc.close();

	}// end of main()---------------------------------

}
