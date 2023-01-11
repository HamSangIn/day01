package my.day07.a.multifor;

public class MultiForMain {

	public static void main(String[] args) {
	
		// === 다중 for 문에 대해서 알아봅니다. ===
		// 다중 for문이라 함은 for문 속에 또 다른 for문이 있는 것을 말한다.
		
		/*
		 === 단일 for 문 출력결과 ===
		  abcdefg
		  hijklmn
		  opqrstu
		  
		*/
		char ch = 'a';
		for(int i=0; i<'u'-'a'+1; i++ ) {
			System.out.println(ch++);
			if((i+1)%7 == 0) {
				System.out.println("\n");
			}
			
			
		}
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		ch = 'a';
		for(int i=0; i<'u'-'a'+1; i++ ) {
			String str = ((i+1)%7 == 0)?"\n":"";
			System.out.println(ch++ + str);
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		/*
		 === 다중 for 문 출력결과 ===
		  abcdefg
		  hijklmn
		  opqrstu
		  
		*/
		
		ch = 'a';
		for(int i=0; i<3; i++) {// 바깥 for문 ==> 행
			
			for(int j=0; j<7; j++) {// 내부 for문 ==> 열
				System.out.println(ch++);
				
			}// end of for--------------------------------------
			
			System.out.println("\n");
			
		}// end of for--------------------------------------
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		/*
			이중 for문을 사용하여 아래처럼 나오도록 하세요.
			== 출력결과 ==
			[0,0][0,1][0,2]
			[1,0][1,1][1,2]
			[2,0][2,1][2,2]
			[3,0][3,1][3,2]
		*/
		for(int i=0; i<4; i++) {
			
			for(int j=0; j<3; j++) {
				System.out.print("["+i+","+j+"]");
			}// end of for ---------------------
			System.out.print("\n");
		}// end of for ---------------------
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		/*
			이중 for문을 사용하여 아래처럼 나오도록 하세요.
			== 출력결과 ==
			[0,0][0,1][0,2]
			[1,0][1,1][1,2]
			[3,0][3,1][3,2]
	    */
		for(int i=0; i<4; i++) {
			
			if (i==2)continue;// continue; 가 되어지면 밑으로 내려가지 않고 가장 가까운 반복문의 증감식으로 이동한다.
			
			for(int j=0; j<3; j++) {
				System.out.print("["+i+","+j+"]");
			}// end of for ---------------------
			System.out.print("\n");
		}// end of for ---------------------
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		/*
			이중 for문을 사용하여 아래처럼 나오도록 하세요.
			== 출력결과 ==
			[0,0][0,2]
			[1,0][1,2]
			[3,0][3,2]
	    */
		
		for(int i=0; i<4; i++) {
			
			if (i==2)continue;// continue; 가 되어지면 밑으로 내려가지 않고 가장 가까운 반복문의 증감식으로 이동한다.
			
			for(int j=0; j<3; j++) {
				if (j==1)continue;
				System.out.print("["+i+","+j+"]");
			}// end of for ---------------------
			System.out.print("\n");
		}// end of for ---------------------
		
		System.out.println("\n안녕하세요\t\"종은아침\"\t입니다.\n");
		
		System.out.println(">> [퀴즈] 이중 for문을 사용하여 아래처럼 나오도록 하세요<<");
		/*
		 501호 502호 503호 505호
		 301호 302호 303호 305호
		 201호 202호 203호 205호
		 101호 102호 103호 105호
		  
		*/
		
		for(int i=5; i>0; i--) {
			
			if(i==4) continue;
			
			for(int j=0; j<5; j++) {
				if(j+1 == 4)continue;
				System.out.print(i+"0"+(j+1)+"호\t");
				
			}
			System.out.println("\n");
			
		}

	}// end of main----------------------------------------------------------

}
