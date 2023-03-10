	package my.day04.b.operator;
	
	public class OperatorMain {
	
		public static void main(String[] args) {
			
			// ~~~~~~~~~~~~~~~~~연산자~~~~~~~~~~~~~~~~ //
			// #### 산술 연산자 #### //
			//  +   -   *   /   %(나머지)  <<  >> >>>
			
		System.out.println("=== 산술 연산자 +   -   *   /   %(나머지)  <<  >> >>> ===");
		
		int n =10;
		System.out.println("n+3 =" + (n+3)); // n+3 = 103
		System.out.println("n-3 =" + (n-3));
		System.out.println("n*3 =" + (n*3));
		System.out.println("n/3 =" + (n/3));
		System.out.println("(double)n/3 =" + ((double)n/3)); // 소수점 자리가 길게.
		System.out.println("(float)n/3 =" + ((float)n/3)); // 소수점 자리가 짧게.
		System.out.println("n%3 =" + (n%3)); // %는 몫말고 나머지를 구해준다.
		
		
		
		
		System.out.println("n<<3 = " + (n<<3));
	
		
		
	/*
	    << 는 왼쪽 쉬프트 연산자
	    
	    int 는 4byte 이므로 32bit 로 구성된다.
	    10<<3 은
	    정수 10을 이진수 00000000 00000000 00000000 00001010  (원래 공백은 없다) 으로 나타내고
	    왼쪽방향으로 3개를 밀어버린다.
	    00000 00000000 00000000 00001010___ 이 되는데
	    그런 다음에 _자리에 0으로 채운다,
	    즉,00000 00000000 00000000 00001010000 이 된다.
	    이진수 00000 00000000 00000000 00001010000이 되는데 이것을 십진수로 나타내면
        1*(2의6승) +1*(2의4승)
        
        이것은 10 * (2의 3승) 와 같은것이 된다. 그러므로 80이다.
	
	*/
	
		
		System.out.println("n>>2 = " + (n>>2));
		
	/*
	    >> 는 오른쪽 쉬프트 연산자
	    int 는 4byte 이므로 32bit 로 구성된다.
	    10>>2 은
	    정수 10을 이진수 00000000 00000000 00000000 00001010  (원래 공백은 없다) 으로 나타내고
	    오른쪽방향으로 2개를 밀어버린다.
	    __00000000 00000000 00000000 000010 이 되는데
	    그런다음에 __자리에 정수 10의  부호비트(가장 왼쪽 비트1개 0이면 양수이고, 1이면 음수를 말하는 것이다.)와 같은 값으로 채운다.
	    즉 0000000000 00000000 00000000 000010 이 된다.
	    이것을 십진수로 나타내면 2가 된다.
	    
	    이것은 10/2의2승 와 같은 것이된다. 그러므로 몫만 쓰고 나머지는 버린다.
	 
	 
	   	
	 */
		
		
		 System.out.println("n>>>3 = " + (n>>>3));
		 
	 
	 /*
	    >>> 는 오른쪽 쉬프트 연산자
	    int 는 4byte 이므로 32bit 로 구성된다.
	    10>>>3 은
	    정수 10을 이진수 00000000 00000000 00000000 00001010  (원래 공백은 없다) 으로 나타내고
	    오른쪽방향으로 3개를 밀어버린다.
	    ___00000000 00000000 00000000 00001
	    그런다음에 _자리에는 0으로 채운다.
	    00000000000 00000000 00000000 00001
	    이진수 00000000   00000000   00000000   00000001
	    이것을 십진수로 나타내면 1*2의0승 = 1
	 
	  */
		
		    n =-10;
		    System.out.println("~~~~~ n이 -10 인 경우 ~~~~~ ");
		    
	   /*
	     >>> -10을 bit로 나타내어 주는 방법 <<<
	     
	     int 는 4byte 이므로 32bit 로 구성된다.
	     컴퓨터의 음수 표현방법은 2의 보수 표현 방법을 사용한다.
	     2의 보수란 1의 보수(0은 1로 1은 0로 바꾸어 주는것)로 변환 후 +1해주는 것이다.
	     
	     -10 을 이진수로 표현하면 다음과 같다.
	     10을 이진수로 나타내면  00000000 00000000 00000000 000001010 인데
	     이것을 1의 보수로 만든다.11111111 11111111 11111111 11110101 이다.
	     여기에 +1을 하면 11111111 11111111 11111111 11110110 이다.
	     11111111 11111111 11111111 11110110 을 십진수로 나타내어 보겠습니다.
	     첫번째 bit는 부호비트로 사용되어지는데
	     0은 양수 1은 음수임을 의미한다.
	     
	     첫번째 bit가 1인 경우, 즉 음수를 뜻할 경우에는 아래와 같이 구한다.
	     똑같은 1이 나오는것 중에서 마지막 1만 취하고, 여기에다가 그 나머지를 끝까지 취한다.
	     10110
	     첫번째 값만 -를 붙이고, 나머지 값은 +로 연산을 하면 된다.
	     -1 +0 +1 +1 +0 = -16 + 6 = -10
	     
	     
	     
	     
	     
	    */
		
		    System.out.println("n<<3 = " + (n<<3));
		    
	   
        /*   << 는 왼쪽 쉬프트 연산자
	    
	     int 는 4byte 이므로 32bit 로 구성된다.
	     10<<3 은
	     정수 -10을 이진수 1111111 11111111 11111111 11110110  (원래 공백은 없다) 으로 나타내고
	     ___1111 11111111 11111111 11110110 왼쪽방향으로 3개를 밀어버린다
	     그런 다음에 _자리에 0으로 채운다,
	     즉, 1111 11111111 11111111 11110110000이 된다.
	     이진수 1111 11111111 11111111 11110110000이 되는데 이것을 십진수로 나타내면
         음수 이므로 10110000 를 십진수로 나타내면
         -128 + 32 + 16 = -80
         
        
         이것은 -10 * (2의 3승) 와 같은것이 된다. 그러므로 -80이다.
	    
	    
	    */
	    
	    
	     // -10 *(2의3승) ==> -80
		
		     System.out.println("n>>2 = " + (n>>2));
		    
		     System.out.println("n>>>3 = " + (n>>>3));
	
		
	
	     // #### 2. 증감연산자 #### //
	     
	     //         ++ --
	     
		     System.out.println("\n=== 2.증감연산자 ++ -- ===");
     
		 //	int a=7;
		 // int b=3;
		 // 또는
		     int a=7,b=3;
		     System.out.println("a ==> " + a);
		        
	     // a = a+1;
	     // 또는
		     a++;
		     System.out.println("a ==> " + a);
		        
		     ++a;
		     System.out.println("a ==> " + a);
		        
		     System.out.println("b ==> " + b);
		        
		     b--;
		     System.out.println("b ==> " + b);
		        
		     --b;
		     System.out.println("b ==> " + b);
		     
	     // !!!! 꼭 암기하세요 !!!! //
		 // 후위증감연산자(a++; b--;) 다른 연산을 다 마친 이후에 1씩 증감 한다.
		 // 전위증감연산자(++a; --b;) 맨먼저 1씩 증감을 마친 이후에 다른 연산을 한다.
		     int x=10,y=10;
		     int z=++x;
		     System.out.println("z==> " + z);
		     System.out.println("x==> " + x);
		     
		     z=y++;
		     System.out.println("z==> " + z);
		     System.out.println("y==> " + y);
		     
		     
		     
		     
		     
		  // #### 3. bit별 not 연산자 #### //
		  //      ~(틸드)
		     System.err.println("\n=== 3. bit별 not 연산자 ~ ===");
		     
		  /*
		    주어진 정수값을 32bit 형태의 2진수로 바꾸어서 나타내는데
		    0 bit 는 1 bit 로 바꾸고, 1 bit 는 0 bit 로 바꾸어 주는 것이다.
		    
		  */
		     
		     int m =42;
		     System.out.println("~m : " + ~m);
		     
	      /*
	        00000000 00000000 00000000 00101010 <= 42
	        11111111 11111111 11111111 11010101 <= ~42
	        
	        첫번째 bit는 부호비트로 사용되어지는데
	        0은 +(양수)를 의미하고,
	        1은 -(음수)를 의미한다,
	        
	        1010101
	        
	        -64 + 16 + 4 + 1 = -43
	        
	        
	       
	      */
		     
		     
		     
		  // #### 4. 논리 부정 연산자 #### //
		  //      !
			 System.out.println("\n=== 4. 논리 부정 연산자 ! ===");
			 boolean bool = false;
			 System.out.println("bool : " + bool);
			 System.out.println("!bool : " + !bool);
		     
		   
		  // #### 5. bit 연산자 #### //
	      //      &(엠퍼센드) |(쉬프트 백슬레시 = 파이프,버티컬,라인,짝대기) ^(꼬깔)
			 
			 System.out.println("\n=== 5. bit 연산자 ===");
			 
			 /*
			  &(and 연산자) ==> 2개 bit 모두 1 일때만 1, 나머지는 0
			  |(or 연산자) ==> 2개 bit 중에서 적어도 1개가 1이면 1, 모두 0이어야만 0
			  ^(xor 연산자) ==> 2개 bit 중에서 서로 달라야만 1, 같으면 0
			  
			  & | ^ 연산자는 연산되어지는 대상이 정수일때만 사용가능하다
		
			 */
			 
			 int x1=3, y1=5;
			 System.out.println("x1 & y1 => " + (x1 & y1));
		 /*
		    00000011 => 3
		  & 00000101 => 5
		  ----------------
		    00000001 => 1
		   
		   */
			 System.out.println("x1 | y1 => " + (x1 | y1));
		 /*
		    00000011 => 3
		  | 00000101 => 5
		  ----------------
		    00000111 => 7
		   
		   */	 
			 System.out.println("x1 ^ y1 => " + (x1 ^ y1));
	
			
		 /*
		    00000011 => 3
		  ^ 00000101 => 5
		  ----------------
		    00000110 => 6
		   
		   */
			
	
		  // #### 6. 논리 연산자 #### //
	      //    & | && ||  
	      // 비교 대상값이 boolean 타입에서 사용되어진다.
			 
			 
			 
			 System.out.println("\n=== 6. 논리 연산자 & | && || ===");
		 
			 /*
			 
			  수학에서는 T ∧ T ∧ F ==> F
			  수학에서는 T ∧ T ∧ T ==> T
			  
			  
			  
			  
			  수학에서는 T ∨ T ∨ F ==> T
			  수학에서는 T ∨ T ∨ T ==> T
			  수학에서는 F ∨ F ∨ F ==> F
			  
			 */
		
			 int c=50, d=60, e=70;
			 
			 bool =(c > d) && (d < e) && (c == 3);
			 //     false  &&  스킵 (맨앞이 거짓이면 뒷값은 어차피 거짓이니까 스킵)
			 System.out.println("bool => "+ bool);
			 
			 bool =(c > d) || (d < e) || (c == 3);
			 //     false  ||  true   || 스킵 (트루가 하나라도 나오면 트루니까 그다음은 스킵) 
			 System.out.println("bool => "+ bool);
			     
			 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
			 
			 
			 bool =(c > d) & (d < e) & (c == 3);
			 //     false  &  한개는 스킵없이 끝까지 연산한다.
			 System.out.println("bool => "+ bool);
			 
			 bool =(c > d) | (d < e) | (c == 3);
			 //     false  | 한개는 스킵없이 끝까지 연산한다.
			 System.out.println("bool => "+ bool);
			     
			 // 속도가 두개가 빠르다.
			 
			 
			 
			 System.out.println("\n~~~~~~ 퀴즈1 ~~~~~~~\n");
		     int i=1;   // i=1;
		     int j=i++; // j=1;
		     
		     if( (i > ++j) & (i++ == j) ) {
		        
		    	 i = i+j;
		     }
		     
		     System.out.println("i="+i);  // i=3
		     
		     i=1;
		     j=i++;
		     
		     if( (i > ++j) && (i++ == j) ) {
		        i = i+j;
		     }
		     
		     System.out.println("i="+i);  // i=2
		      
		     
		     System.out.println("\n~~~~~~ 퀴즈2 ~~~~~~~\n");
		     
		     int m1=0, n1=1;
		     
		     if( (m1++ == 0) | (n1++ == 2) ) {
		        m1=42;
		     }
		     
		     System.out.println("m1=>"+m1 + ", n1=>"+n1); // m1=>  , n1=> 
		     
		     m1=0;
		     n1=1;
		     
		     if( (m1++ == 0) || (n1++ == 2) ) {
		        m1=42;
		     }
		     
		     System.out.println("m1=>"+m1 + ", n1=>"+n1); // m1=>  , n1=> 
		
		
		
		     // #### 7. 비교 연산자 #### //
		     //     == 같다    != 같지않다  > 크다  <작다 >=  <=//
		     
		     int A=1 , B=2;
		     
		     if(A > B);
		     if(A < B);
		     if(A == B);
		     if(A != B);
		     
		     
		     System.out.println("A=>" + B);
		     
		     
		     // #### 8. 할당 연산자(연산후 대입 연산자) #### //
		     // +=  -=  *=  /=  %=
		
		     System.out.println("\n=== 8. 할당 연산자(연산후 대입 연산자) +=  -=  *=  /=  %= ===");
		
		     int no =1;
		     no += 3; // no + 3 연산 후 no에 결과물을 다시 no에 넣는것.  ex) no = no+3; 와 같은말
		
		     System.out.println("no = " + no);
		     
		     no -= 2; // no - 2 연산 후 no에 결과물을 다시 no에 넣는것. ex) no = no-2; 와 같은말
		     
		     System.out.println("no = " + no);
		     
		     no *= 5;
		     
		     System.out.println("no = " + no);
		     
		     no /= 4;
		     
		     System.out.println("no = " + no);
		     
	    	 no %= 3;
		     
		     System.out.println("no = " + no);
		     
		     // #### 9. 삼항 연산자 #### //
		     /*
		        변수선언 = (조건식)?값1:값2;
		        
		        변수를 선언하고 나서 값을 부여하고자 할때 사용되어지는데
		        조건식이 참 이라면 변수에 값1을 대입해주고,
		        만약에 조건식이 거짓 이라면 변수에 값2 를 대입해주는 것이다.
		        
		     */
			 System.out.println("\n==== 9. 삼항연산자 ====");
			
			 int num1=50 ,num2=60;
			 int num3=(num1 > num2)?num1:num2;
			 //         false
			 //num3에는 num2가 들어간다.
					 
					 System.out.println("num3 => " + num3);
			 
			
			
		
		}
}
