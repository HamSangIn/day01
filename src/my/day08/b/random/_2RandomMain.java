package my.day08.b.random;

import java.util.Random;
import java.util.Scanner;

public class _2RandomMain {

	public static void main(String[] args) {
		
		// === 랜덤한 정수를 뽑아낸다 === //
		
		// 보안상 Math.random() 보다는 new Random(); 을 사용하는 것 더 안전한다.
		
		Random rnd = new Random();
		
		// == 처음수 부터 마지막수 사이에 랜덤한 정수 만들기 공식 ==
		// 랜덤한정수 = rnd.nextInt(마지막수 - 처음수 + 1) + 처음수;
		
		// 1 부터 10까지 중 랜덤한 정수를 얻어와 본다.
		int rand1 = rnd.nextInt(10 - 1 + 1) + 1;
		System.out.println("1 부터 10 까지의 랜덤한 정수 => " + rand1);
		
		// 3 부터 7까지 중 랜덤한 정수를 얻어와 본다.
		int rand2 = rnd.nextInt(7 - 3 + 1) + 3;
		System.out.println("3 부터 7 까지의 랜덤한 정수 => " + rand2);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		/////////////////////////////////////////////////////////////
		
		// 인증키는 랜덤한 숫자3개(0~9)와 랜덤한 대문자1개와 랜덤한 소문자3개로 만들어진다.
		// 예> 109Sata   090Bwac
		
		// 0 ~ 9 까지 랜덤한 숫자 1개를 얻어오는 작업을 3번 반복해야 한다.
		String key = "";
		
		for(int i=0; i<3; i++) {
			int num = rnd.nextInt(9 - 0 + 1) + 0;
			key += num;
		}
		
		int num = rnd.nextInt('Z'-'A' + 1) + 'A';
		
		key += (char)num;
		
		for(int i=0; i<3; i++) {
			num = rnd.nextInt('z'-'a' + 1) + 'a';
			key += (char)num;
		}
		
		System.out.println("인증키 => " + key);
		
		///////////////////////////////////////////////////////////
		
		System.out.println("\n~~~~~~~ 홀짝 맞추기 ~~~~~~~~\n");
		
		/*
		   선택[1:홀수 / 0:짝수] => 1
		   
		   컴퓨터가 낸수 : 7 => 맞추었습니다.
		   컴퓨터가 낸수 : 10 => 틀렸습니다.   
		*/
		
		Scanner sc = new Scanner(System.in);
		
		outer:
		do {
			try {
				System.out.print("선택[1:홀수 / 0:짝수] => ");
				int choice = Integer.parseInt(sc.nextLine()); // "안녕하세요"  "1.2345" 
				                                              // "9"
				                                              // "1" 또는 "0"
				if(choice != 0 && choice != 1) {
					System.out.println(">> [경고] 0 또는 1 만 입력하세요!! << \n");
				}
				else {
					// PC에서 랜덤하게 1 ~ 10 까지중 하나만 가지도록 만든다.
					int rand_num = rnd.nextInt(10-1 + 1) + 1;
					
					String result = "";
					
					if( rand_num%2 == choice ) {
						result = "맞추었습니다.";
					}
					else {
						result = "틀렸습니다.";
					}
					
					System.out.println("컴퓨터가 낸수 : " + rand_num + " => " + result);
					
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
							System.out.println(">> [경고] Y 또는 N 만 입력하세요!! << \n");
						}
					} while(true);
					// end of do~while-----------------------------
					
				}
				
			} catch (NumberFormatException e) {
				System.out.println(">> [경고] 정수만 입력하세요!! << \n");
			}
			
		} while(true);
		// end of do~while------------------------------
		
		sc.close();
		System.out.println(">> 프로그램 종료 <<");
		
	}// end of main()--------------------------------

}
