package my.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyUtil {

	// == 현재시각을 출력해주는 static 메소드 생성하기 == //
	public static void currentTime() {
		
		Date now = new Date(); // 현재시각
		
		SimpleDateFormat sdfmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String today = sdfmt.format(now);
		
		System.out.println(">> 현재시각 : " + today);
		// >> 현재시각 : 2023-01-03 11:48:30
	}
	
	
	// === 비밀번호가 규칙에 맞는지 틀리는지 알려주는 static 메소드 생성하기 === // 
	// 비밀번호 규칙은 비밀번호의 길이는 8글자 이상 15글자 이하이어야 하고,
	// 또한 비밀번호는 영문대문자, 영문소문자, 숫자, 특수기호가 혼합되어야만 한다.
	// 우리는 규칙에 맞으면 true , 규칙에 틀리면 false 를 리턴해주도록 만든다.
	public static boolean isCheckPasswd(String passwd) {
		
		// passwd ==> "Ab3$"
		// passwd ==> "Ab3$sdfdsfewfsdfsdrwefsdfsdrtwefsdfewrsdfsdfsdfwerfsdf" 
		
		int length = passwd.length();  // 입력받은 passwd 문자열의 길이
		
		if( length < 8 || length > 15 ) {
			return false;
		}
		
		else { // 암호의 길이가 8글자 이상 15글자 이하인 경우 
			// passwd ==> "abcd1234"
			// passwd ==> "Abcd1234"
			// passwd ==> "Abcd1234$"
			
			boolean flagUpper = false;   // 대문자임을 표시하는 것
			boolean flagLower = false;   // 소문자임을 표시하는 것
			boolean flagDigit = false;   // 숫자임을 표시하는 것
			boolean flagSpecial = false; // 특수문자임을 표시하는 것
			
			for(int i=0; i<length; i++) {
				// 암호가 "Abcd1234$" 이라면
				// index  012345678 이 된다.
				
				// 암호가 "abcd1234" 이라면
				// index 01234567 이 된다.
				
				// 암호가 "Abcd1234" 이라면
				// index 01234567 이 된다.
				
				char ch = passwd.charAt(i); // 'A' 'b' 'c' 'd' '1' '2' '3' '4' '$' 
				                            // 'a' 'b' 'c' 'd' '1' '2' '3' '4'
				                            // 'A' 'b' 'c' 'd' '1' '2' '3' '4' 
				
				if( Character.isUpperCase(ch) ) 
					flagUpper = true;
								
				else if( Character.isLowerCase(ch) ) 
					flagLower = true;
								
				else if( Character.isDigit(ch) ) 
					flagDigit = true;
								
				else 
					flagSpecial = true;
								
			}// end of for-----------------------------
			
			return (flagUpper && flagLower && flagDigit && flagSpecial);
			
		}
		
	}// end of public static boolean isCheckPasswd(String passwd)---------


	public static String space_delete(String str) {
		
		if( str != null ) {
			char[] chArr = str.toCharArray();
			
			String result = "";
			
			for(int i=0; i<chArr.length; i++) {
				if(chArr[i] != ' ') {
					result += chArr[i];
				}
			}// end of for--------------------
			
			return result;
		}
		
		else
			return null;
		
	}// end of public static String space_delete(String str)-------
	public static long delComma(String str) {
		
		do {
			int index_comma = str.indexOf(",");
			
			if(index_comma == -1)
				break;
			
			str = str.substring(0, index_comma) + str.substring(index_comma + 1);
		}while(true);
		
		return Long.parseLong(str);
		
		
		
		
		

	}
	
	
}
