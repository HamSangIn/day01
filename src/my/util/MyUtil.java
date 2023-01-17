package my.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
	
	// === , 가 들어있는 숫자형태로 되어진 문자열을 , 를 제거해서 정수로 리턴시켜주는 메소드 생성하기 === // 
	public static long delComma(String str) {
		
		do {
			 int index_comma = str.indexOf(",");
			 
			 if(index_comma == -1)
				 break;
			 
			 str = str.substring(0, index_comma) + str.substring(index_comma + 1);
			
		}while(true);
		// end of do~while---------------
		
		return Long.parseLong(str);
		
	}// end of public static long delComma(String str)-------------


	public static String today() {
		
		Calendar currentDate = Calendar.getInstance();
		// 현재 날짜와 시간을 얻어온다.
		
		int year = currentDate.get(Calendar.YEAR);
		int month = currentDate.get(Calendar.MONTH)+1;
		int day = currentDate.get(Calendar.DATE);
		
		int hour = currentDate.get(Calendar.HOUR_OF_DAY);
		int minute = currentDate.get(Calendar.MINUTE);
		int second = currentDate.get(Calendar.SECOND);
		
		String dayname = "";
		switch (currentDate.get(Calendar.DAY_OF_WEEK)) {
			case 1:
				dayname = "일요일";
				break;
	
			case 2:
				dayname = "월요일";
				break;
				
			case 3:
				dayname = "화요일";
				break;
				
			case 4:
				dayname = "수요일";
				break;
				
			case 5:
				dayname = "목요일";
				break;
				
			case 6:
				dayname = "금요일";
				break;
				
			case 7:
				dayname = "토요일";
				break;				
		}
		
		String s_month = (month<10)?"0"+month:String.valueOf(month);
		String s_day = (day<10)?"0"+day:String.valueOf(day);
		String s_hour = (hour<10)?"0"+hour:String.valueOf(hour);
		String s_minute = (minute<10)?"0"+minute:String.valueOf(minute);
		String s_second = (second<10)?"0"+second:String.valueOf(second);
		
		return year+"-"+s_month+"-"+s_day+" "+s_hour+":"+s_minute+":"+s_second+" "+dayname; 
	}// end of public static String today()---------------------


	// == 주민번호 7자리를 입력받아서 올바른 주민번호인지 아닌지를 검사해주는 메소드 생성 == //  
	public static boolean isCheckJubun(String jubun) {
		
		if(jubun == null)
		   return false;
	
		// 정규표현식(Regular Expression)이란?
		// ==> 특정한 규칙을 가진 문자열의 집합을 표현하기 위해 쓰이는 형식언어 
		
		// == 1. 정규표현식(Regular Expression) 패턴을 작성한다. == //
	//	Pattern p = Pattern.compile("^[0123456789][0-9][01][0-9][0-3][0-9][1-4]$");
		// ^ 은 시작을 의미한다.
		// $ 는 끝을 의미한다.
		// [] 는 글자 1개가 들어오는 것을 의미한다.
		// [0123456789] 은 0 또는 1 또는 2 또는 ..... 8 또는 9 만 들어온다는 뜻이다. 
		// [0-9] 은 [0123456789] 와 같다.
		
		
	//	Pattern p = Pattern.compile("^\\d\\d[01]\\d[0-3]\\d[1-4]$"); 
		// [0-9] 와 \\d 은 같은 것이다.
		
		
		Pattern p = Pattern.compile("^\\d{2}[01]\\d[0-3]\\d[1-4]$");
		// \\d{2} 은 \\d 이 연속적으로 2번 나온다는 뜻이다. 즉, [0-9][0-9] 와 같은 말이다. 
				
		
		// == 2. 검사할 문자열이 주어진 정규식 패턴과 일치하는지 아닌지를 판별하는 객체를 생성한다. == //
		Matcher m = p.matcher(jubun);
		
		
		// == 3. 검사할 문자열을 판별하도록 한다. == //
		// 입력받은 jubun 이 주어진 정규식 패턴과 일치하면 true, 일치하지 않으면 false 를 리턴시켜준다.  
		boolean bool = m.matches();
		
		return bool;
		
	}// end of public static boolean isCheckJubun(String jubun)--------
	
	
	
	
	
	
	
	
	
	
	
	
	
}
