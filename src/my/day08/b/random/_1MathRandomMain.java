package my.day08.b.random;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class _1MathRandomMain {

	public static void main(String[] args) {
		
		// === 랜덤한 정수를 뽑아낸다 === //
		double random = Math.random();
		System.out.println("random => " + random);
		// random => 0.0872948627250868
        // random => 0.8606970691775878
		// random => 0.21534823746789
		// random => 0.5672984827210117
		
		/*
		   java.lang.Math.random() 메소드는
		   0.0 이상 1.0 미만의 실수(double)값을 랜덤하게 나타내어주는 메소드이다.
		      즉,  0.0 <= 임의의 난수(실수) < 1.0
		      
		   1 부터 10 까지중 랜덤한 정수를 얻어와 본다.
		   
		    랜덤한 정수 = (int)(Math.random()*구간범위)+시작값;
		    
		    Math.random() ==> 0.0 일 때 
		    (int)0.0*(10-1+1)+1 ==> 1
		    
		    Math.random() ==> 0.0872948627250868 일 때
		    (int)0.0872948627250868*(10-1+1)+1 ==> 
		    (int)0.872948627250868 ==> 0   + 1 ==> 1  
		    
		    Math.random() ==> 0.8606970691775878 일 때
		    (int)0.8606970691775878*(10-1+1)+1 ==> 
		    (int)8.72948627250868 ==> 8    + 1 ==> 9
		    	
		    Math.random() ==> 0.21534823746789 일 때
		    (int)0.21534823746789*(10-1+1)+1 ==> 
		    (int)2.1534823746789 ==> 2    + 1 ==> 3
		    
		    Math.random() ==> 0.5672984827210117 일 때
		    (int)0.5672984827210117*(10-1+1)+1 ==> 
		    (int)5.672984827210117 ==> 5    + 1 ==> 6  
		    
		    		                
		    3 부터 7 까지중 랜덤한 정수를 얻어와 본다.
		   
		    랜덤한 정수 = (int)(Math.random()*구간범위)+시작값;
		    
		    Math.random() ==> 0.0 일 때 
		    (int)0.0*(7-3+1)+3 ==> 3
		    
		    Math.random() ==> 0.0872948627250868 일 때
		    (int)0.0872948627250868*(7-3+1)+3 ==> 
		    (int)0.436474313625434 ==> 0   + 3 ==> 3  
		    
		    Math.random() ==> 0.8606970691775878 일 때
		    (int)0.8606970691775878*(7-3+1)+3 ==> 
		    (int)4.303485345887939 ==> 4    + 3 ==> 7
		    	
		    Math.random() ==> 0.21534823746789 일 때
		    (int)0.21534823746789*(7-3+1)+3 ==> 
		    (int)1.07674118733945 ==> 1    + 3 ==> 4
		    
		    Math.random() ==> 0.5672984827210117 일 때
		    (int)0.5672984827210117*(7-3+1)+3 ==> 
		    (int)2.836492413605059 ==> 2    + 3 ==> 5  		                
		    		                
		*/
		
		// 1 부터 10까지 중 랜덤한 정수를 얻어와 본다.
		int rand1 = (int)(Math.random()*(10-1+1))+1;
		System.out.println("1 부터 10 까지의 랜덤한 정수 => " + rand1);
		
		// 3 부터 7까지 중 랜덤한 정수를 얻어와 본다.
		int rand2 = (int)(Math.random()*(7-3+1))+3;
		System.out.println("3 부터 7 까지의 랜덤한 정수 => " + rand2);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		/////////////////////////////////////////////////////////////
		
		// 인증키는 랜덤한 숫자3개(0~9)와 랜덤한 대문자1개와 랜덤한 소문자3개로 만들어진다.
		// 예> 109Sata   090Bwac
		
		// 0 ~ 9 까지 랜덤한 숫자 1개를 얻어오는 작업을 3번 반복해야 한다.
		String key = "";
		
		for(int i=0; i<3; i++) {
			int num = (int)(Math.random()*(9-0+1))+0;
			key += num;
		}
		
		int num = (int)(Math.random()*('Z'-'A'+1))+'A';
		
		key += (char)num;
		
		for(int i=0; i<3; i++) {
			num = (int)(Math.random()*('z'-'a'+1))+'a';
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
				int choice = Integer.parseInt(sc.nextLine());
				
				if(choice !=0 && choice !=1) {
					System.out.print(">> [경고] 0 또는 1 만 입력하세요!!<< \n");
				}
				else {
					int rand_num = (int)(Math.random()*10-1+1)+1;
					
					String result ="";
					
					if( rand_num%2 == choice ) {
						result = "맞추었습니다.";
					
					}
					else {
						result = "틀렸습니다.";
					}
					System.out.println("컴퓨터가 낸수 : " + rand_num + "=>" + result);
					
					
					do {
					System.out.print(">> 또 할래?[Y/N] => ");
					String yn = sc.nextLine();
					
					if("Y".equalsIgnoreCase(yn)) {
					}
					else if("N".equalsIgnoreCase(yn)) {
						break outer;
					}
					else {
						System.out.println(">> [경고] Y 또는 N 만 입력하세요!! << \n");
					}
					}while(true);
					
					
				
				
				}
				
			}catch(NumberFormatException e) {
				System.out.print(">> [경고] 정수만 입력하세요!!<< \n");
			}
		}while(true);
		
		
		
		
		sc.close();
		System.out.println(">> 프로그램 종료 <<");
		
	}// end of main()--------------------------------

}
