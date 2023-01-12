package my.day09.b.array;

import java.text.DecimalFormat;
import java.util.Scanner;

import my.util.MyUtil;

public class _2MoneyCommaAdd_main {

/*
    ▷ 금액을 입력하세요(정수로만) ==> 1234567890엔터
    1,234,567,890 원 	
    
    ▷ 금액을 입력하세요(정수로만) ==> 123엔터
    123 원
 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("▷ 금액을 입력하세요(정수로만) ==> "); // "     123 4567890     " 
		                                                     // "1234567890"
		                                                     // "  123a45678강90   "
		                                                     // "123a45678강90"
		
		String str = MyUtil.space_delete(sc.nextLine());
	
		if(str.length() > 0) {
			
			char[] chArr = str.toCharArray(); 
			boolean b_flag = true;
			for(int i=0; i<chArr.length; i++) {
				if( !Character.isDigit(chArr[i]) ) { // 글자가 숫자가 아니라면 
					System.out.println(">> [경고] 금액은 숫자로 되어야 합니다!! << \n");
					b_flag = false;
					break;
				}
			}// end of for-------------------
			
			if(b_flag) {
				
				System.out.println(str+" 원");
				// 1234567890 원       234567890 원
				// 길이 10             길이  9
				// 10/3 => 3           9/3 => 3  
				// 길이가 3의 배수이냐?   길이가 3의 배수이냐?
				// 10%3 != 0           9%3 == 0
				// 3(콤마의 개수)        3-1(콤마의 개수)
				
				int len = str.length(); // 길이 
				
				int commaCount = len/3;
				
				if( len%3 == 0 ) {
					commaCount -= 1;
				}
				
				char[] inputChArr = str.toCharArray();
				/*  
				             ---------------------    -------------------
				   데이터값 => |1|2|3|4|5|6|7|8|9|0|    |2|3|4|5|6|7|8|9|0|
				             ---------------------    -------------------
				   index  =>  0 1 2 3 4 5 6 7 8 9      0 1 2 3 4 5 6 7 8          
				*/
				
				char[] outputChArr = new char[len+commaCount];
				
				/*
	                         ------------------------------------------------------      ---------------------------------------------               
				   데이터값 => |' '|' '|' '|' '|' '|' '|' '|' '|' '|' '|' '|' '|' '|       |' '|' '|' '|' '|' '|' '|' '|' '|' '|' '|' '|
				             ------------------------------------------------------      ---------------------------------------------
				   index  =>   0   1   2   3   4   5   6   7   8   9   10  11  12          0   1   2   3   4   5   6   7   8   9   10				   
				   
				   
	                         -----------------------------------------------------       ---------------------------------------------
				   데이터값 => |'1'|','|'2'|'3'|'4'|','|'5'|'6'|'7'|','|'8'|'9'|'0'|       |'2'|'3'|'4'|','|'5'|'6'|'7'|','|'8'|'9'|'0'|
				             ------------------------------------------------------      ---------------------------------------------
				   index  =>   0   1   2   3   4   5   6   7   8   9   10  11  12          0   1   2   3   4   5   6   7   8   9  10          
				
				   콤마가 들어올 ==>
				   index
				*/
				
				int cnt = 0; // 반복하는 회수
				
				for(int i=outputChArr.length-1, j=inputChArr.length-1; i>=0; i-- , j--) {
					cnt++;
					if(cnt%4 !=0) {// 4의배수가 아니라면 값을 넣어준다.
					outputChArr[i] =  inputChArr[j];
					
					
				}
					else {// 4의 배수라면
						outputChArr[i] = ',';
						j++;
					}
				}
				
				String result = "";
				for(int i=0; i<outputChArr.length; i++) {
					result += outputChArr[i];
				}
				System.out.println(result + " 원");
				
				// 1,234,567,890 원   234,567,890 원
				System.out.println("\n=======================================\n");
				// 아래식으로 해도 됨.
				System.out.println(String.valueOf(outputChArr)+ " 원");
			}
			
		}
		else {
			System.out.println(">> [경고] 금액을 올바르게 입력하세요!! << \n");
		}
		
		System.out.println("\n=======================================\n");
		// 위에거 버리고 아래거 쓰기 영상 4교시 35분 부터.
		System.out.print("▶ 금액을 입력하세요(정수로만) ==> "); 
		
		long money  = Long.parseLong(MyUtil.space_delete(sc.nextLine()));
		
		DecimalFormat df = new DecimalFormat("#,###");
		String srt_money = df.format(money);
		
		System.out.println(srt_money +" 원");
		
		
		
		sc.close();
		System.out.println(">> 프로그램 종료 <<");
	}

}
