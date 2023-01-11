package my.day07.a.multifor;

public class MultiForMainG {

	public static void main(String[] args) {
		
		// === 다중 for문 에 대해서 알아봅니다. ===
		// 다중 for문이라 함은 for문 속에 또 다른 for문이 있는 것을 말한다.
		
		/*
		    === 단일 for 문 출력결과 ===
		    
		      abcdefg
		      hijklmn
		      opqrstu
		*/
		char ch = 'a';
		for(int i=0; i<'u'-'a'+1; i++) {
			 System.out.print(ch++); 
			 if( (i+1)%7 == 0 ) {
				 System.out.print("\n");
			 }
		}// end of for-----------------------
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~\n");
		
		ch = 'a';
		for(int i=0; i<'u'-'a'+1; i++) {
			String str = ( (i+1)%7 == 0 )?"\n":"";  
			System.out.print(ch++ + str); 
		}// end of for-----------------------
		
		
		System.out.println("\n~~~ 다중 for 문 사용 결과 ~~~\n");
		
		/*
		    === 다중 for 문 출력결과 ===
		    
		      abcdefg   3행(가로) 7열(세로)
		      hijklmn
		      opqrstu
		*/
		ch = 'a';
		for(int i=0; i<3; i++) { // 바깥 for문 ==> 행
			
			for(int j=0; j<7; j++) { // 내부 for문 ==> 열 
				System.out.print(ch++);
			}// end of for------------------
			
			System.out.print("\n");
		}// end of for-----------------------
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		/*
		     이중 for문을 사용하여 아래처럼 나오도록 하세요.
		     
		     == 출력결과 ==
		     
		     [0,0][0,1][0,2]
		     [1,0][1,1][1,2]
		     [2,0][2,1][2,2]
		     [3,0][3,1][3,2] 
		 */
		
		
		/*
		     이중 for문을 사용하여 아래처럼 나오도록 하세요.
		     
		     == 출력결과 ==
		     
		     [0,0][0,1][0,2]
		     [1,0][1,1][1,2]
		     [3,0][3,1][3,2] 
		 */
		
		/*
		     이중 for문을 사용하여 아래처럼 나오도록 하세요.
		     
		     == 출력결과 ==
		     
		     [0,0][0,2]
		     [1,0][1,2]
		     [3,0][3,2] 
		 */
		 
		
		

	}// end of main()---------------------------------

}
