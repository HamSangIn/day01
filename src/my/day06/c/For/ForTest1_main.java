package my.day06.c.For;
/*
 **** 반복문(loop) ==> for 문 ****
  
    ※ for 문의 형식
   
    for(초기화; 조건식; 증감식) {
          반복해서 실행할 문장;
    }  
    
    ▣ 순서
    1) 초기화;
    2) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
              조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
               } 을 빠져나간다.)
    3) 증감식
    4) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
              조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
               } 을 빠져나간다.) 
    5) 증감식
    6) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
              조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
               } 을 빠져나간다.)                                                  
    
*/

public class ForTest1_main {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println((i+1)+".안녕자바~~");
		}
		
		/*
		  1.안녕자바~~
		  2.안녕자바~~
		  3.안녕자바~~
		  4.안녕자바~~
		  5.안녕자바~~
		  6.안녕자바~~
		  7.안녕자바~~
		  8.안녕자바~~
		  9.안녕자바~~
		  10.안녕자바~~
		  
		 */
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=0; i<10; i+=1) { //i+=1; ==> i=i+1;
			System.out.println((i+1)+".안녕자바^^");
		}
		
		
		/*
		  1.안녕자바^^
		  2.안녕자바^^
		  3.안녕자바^^
		  4.안녕자바^^
		  5.안녕자바^^
		  6.안녕자바^^
		  7.안녕자바^^
		  8.안녕자바^^
		  9.안녕자바^^
		  10.안녕자바^^
		  
		 */
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=0; i<10; i+=2) { 
			System.out.println((i+1)+".안녕이클립스^^");
		}
		/*
		  1.안녕이클립스^^
		  3.안녕이클립스^^
		  5.안녕이클립스^^
		  7.안녕이클립스^^
	      9.안녕이클립스^^
	 	
		  
		 */
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=0; i<10; i++) { 
			System.out.println((++i)+".안녕이클립스~~");
		}
		/*
		  1.안녕이클립스~~
		  3.안녕이클립스~~
		  5.안녕이클립스~~
		  7.안녕이클립스~~
	      9.안녕이클립스~~
	 	 */
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=0; i<20; i++) { 
			System.out.println((++i)+".안녕 오라클~~");
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=0, j=0; i<10; i+=1, j+=2) { 
			System.out.println((j+1)+".안녕 ORACLE~~");
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=0, j=1; i<10; i+=1, j+=2) { 
			System.out.println(j+".안녕 ORACLE~~");
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=0, j=0; i<10; i+=1, j++) { 
			System.out.println(++j +".안녕 ORACLE~~");
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=10; i>0; i-- ) { 
			System.out.println(i+".안녕 ORACLE~~");
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=10; i>0; i-=1 ) { 
			System.out.println(i+".안녕 스프링~~");
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=10; i>0; i-- ) { 
			if(i%2 !=0)// %는 몫이 아닌 나머지 나머지가 0이면 짝수 0이 아니면 홀수
			System.out.println(i+".안녕 Spring~~");
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=10; i>0; i-=2 ) { 
			
			System.out.println((i-1)+".안녕하세요~~");
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=10; i>0; i-- ) { 
			
			System.out.println((--i)+".Hello~~");
		}
		

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=0,j=9; i<5; i++, j-=2 ) { 
			
			System.out.println(j+".헬로~~");
		}

		System.out.println("\n============================================\n");
		int n=0;
		for( ; n<5; n++) {
		
		System.out.println((n+1)+"반복문");
		
		}
		
		System.out.println(">> 반복회수: " + n + " <<");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// end of main()--------------------------------------

}//end of public class ForTest1_main
