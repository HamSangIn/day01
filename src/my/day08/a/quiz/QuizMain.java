package my.day08.a.quiz;

import java.util.Scanner;

public class QuizMain {
/*      
	   === 홀수 및 짝수의 합 구하기 ===
	   
	   ▷ 첫번째 정수 입력하세요: 1
	   ▷ 두번째 정수 입력하세요: 10
	   
	   >>> 결과 <<<
	   1부터 10까지의 홀수의 합 : 25
	   1+3+5+7+9 = 25
	   
	   1부터 10까지의 짝수의 합 : 30
	   2+4+6+8+10 = 30
	   
	   === 홀수 및 짝수의 합 구하기 ===
	   
	   ▷ 첫번째 정수 입력하세요: 2
	   ▷ 두번째 정수 입력하세요: 9
	   
	   >>> 결과 <<<
	   2부터 9까지의 홀수의 합 : 24
	   3+5+7+9 = 24
	   
	   2부터 9까지의 짝수의 합 : 20
	   2+4+6+8 = 20
*/   
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 홀수 및 짝수의 합 구하기 === \n");
		
		while(true) {
			try {
				System.out.print(" > 첫번째 정수  입력하세요: ");
				String strFirstNo = sc.nextLine();
				int firstNo = Integer.parseInt(strFirstNo);
				
				System.out.print(" > 두번째 정수  입력하세요: ");
				String strSecondNo = sc.nextLine();
				int SecondNo = Integer.parseInt(strSecondNo);
				
				int holSum = 0; // 홀수의 누적의 합계를 저장하는 변수
				int jjakSum = 0; // 짝수의 누적의 합계를 저장하는 변수
				
				int hol_startNo = 0, jjak_startNo = 0;
		
				
				// 첫번째 입력받은 값이 짝수이라면
				if(firstNo%2 ==0) {
					
					hol_startNo = firstNo + 1;
					jjak_startNo = firstNo; 
				}
				// 첫번째 입력받은 값이 홀수이라면
				else{
					hol_startNo = firstNo;
					jjak_startNo = firstNo + 1; 
				}
			
				
				// == 홀수 및 짝수의 합을 구한다. ==
				String str_hol = "",str_jjak = "";
				
				int status_1 = 0, status_2=0;
				
				while(true) {
					
					String str_add = ("".equals(str_hol) && "".equals(str_jjak))?"":"+";
					// 맨처음 글자는 아무것도없다 "" 그리고 ?"" 없다면 : +를 붙여라 두번째부터.
					
					if(hol_startNo <= SecondNo ) {
						holSum += hol_startNo;
						str_hol += str_add + hol_startNo;
						hol_startNo += 2;
						
						status_1 = 1;
					}
					if(jjak_startNo <= SecondNo ) {
						jjakSum += jjak_startNo;
						str_jjak += str_add + jjak_startNo;
						jjak_startNo += 2;
					
						status_2 = 1;
					}
					
					if(hol_startNo > SecondNo && jjak_startNo > SecondNo) {
						break;
					}
					
					
					
				}// end of while(true)---------------------------------------------
				
				if(status_1*status_2 == 1){
					
					System.out.println("\n>>> 결과 <<<");
					System.out.println(firstNo +"부터"+ SecondNo +"까지의 홀수의 합 : " +holSum);
					System.out.println(str_hol+" = "+ holSum);
					System.out.println("");
					System.out.println(firstNo +"부터"+ SecondNo +"까지의 짝수의 합 : " +jjakSum);
					System.out.println(str_jjak+" = "+ jjakSum);
				
				}
				
				else {
					System.out.println("\n [경고] 두번째 숫자는 첫번째 숫자 보다 커야 합니다.");
				}
				
				
				
				sc.close();
				break;
		}catch(NumberFormatException e) {
			System.out.println(">> [경고] 정수만 입력하세요!! << \n");
		}
			
			
			
			
			
			
			
		}// end of while(true)
		System.out.println("\n === 프로그램 종료 ===");
		
	}

}
