package my.day07.e.Dowhile;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class _PrimeNumberMain {
	// === 소수란? === 
	   // 소수란? 1과 자기 자신으로밖에 나누어지지 않는 1 이외의 정수 
	   // 예> 1 부터 10까지의 소수를 나타내면 
	   //       2%2 ==> 0   2 는 소수
	   //       3%3 ==> 0   3 는 소수
	   //       4%2 ==> 0   4 는 소수가 아님
	   //       5%5 ==> 0   5 는 소수
	   //       6%2 ==> 0   6 는 소수가 아님
	   //       7%7 ==> 0   7 는 소수
	   //       8%2 ==> 0   8 는 소수가 아님
	   //       9%3 ==> 0   9 는 소수가 아님
	   //      10%2 ==> 0  10 는 소수가 아님     
	public static void main(String[] args) {
		int startNo =0, endNo = 0;
		
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("▷시작 자연수 : ");
				startNo = sc.nextInt();
				
				sc.nextLine();
				
				System.out.println("▷끝 자연수 : ");
				endNo = sc.nextInt();
				
				sc.nextLine();
				
				
				if(startNo < 1 || endNo < 1) {
					System.out.println(">> [경고] 입력하시는 값은 모두 자연수이어야 합니다!! << \n");
				}
				else if(startNo>= endNo) {
					System.out.println(">> [경고] 두번째 입력한 숫자가 첫번째 입력한 숫자보다 커야 합니다!! << \n");
				}
				else {
					break;
				}
			}catch(InputMismatchException e) {
				System.out.println(">> [경고] 자연수만 입력하세요!! << \n");
				sc.nextLine();
			}	
			
		}while(true);
			
		String str_result = "";
		int cnt = 0; // 소수의 누적개수
		int sum = 0; // 소수들의 누적의 합계
		
		for(int i=startNo; i<endNo; i++) {
			
			if(i==1) // i 가 소수인지 아닌지를 검사할 대상값이다.
				continue;	 // 1은 소수가 아니므로 검사할 필요가 없기에 continue; 를 한다.
			
			boolean isSosu = true;
			
			for(int j=2; j<i; j++) {// j가 분모에 들어갈 값이다.
				
				if(i%j ==0) {// 검사대상인 i는 소수가 아닌 경우
					isSosu = false;
					break;
				}
			}
			
			if(isSosu) {
				
				String str_add =(!"".equals(str_result))?",":"";
				
				str_result += str_add + i;
			
				cnt++; // 소수의 개수를 누적
				sum += i; // 소수들의 누적의 합계
			}
		}// end of for-----------------------------
		
		System.out.println(startNo +" 부터 "+ endNo + "까지의 소수는?\n" + str_result + "\n");
		// 2,3,5,7,11,13,17,19
		
		System.out.println(startNo +" 부터 "+ endNo + "까지의 소수의 개수? "+ cnt +"개");
		System.out.println(startNo +" 부터 "+ endNo + "까지의 소수들의 합?" + sum);
		
		
		
		
		
		
		sc.close();
		System.out.println("=== 프로그램 종료 ===");
	}//end of main-------------------------------------

}
