package my.day13.encapsulation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import my.util.MyUtil;

// === 객체지향프로그래밍(Object Oriented Programming) 이란? === //
// 어떤 프로그램이냐에 따라 그 목적에 맞도록 필요한 데이터(필드)를 추상화(필요한 것만 추출하는것. 반대가 정밀화)시키고,
// 또한 그 목적에 맞는 기능(메소드)만 부여한 클래스를 생성하여 프로그램하는 것이다.

// === 객체지향프로그래밍(Object Oriented Programming) 의 4가지 특징 === //
/*
    1. 상속성(Inheritance) : 클래스의 재사용과 소스 코드의 중복제거를 목적으로 하는 기술
    2. 추상화(Abstraction) : 프로그램이 필요로 하는 실제 데이터들을 모델링하는 기술 
    3. 캡슐화(EnCapsulation == 은닉화) : 객체지향의 가장 중요한 데이터 보호 기술
    4. 다형성(Polymorphism) : 상속을 이용하여 여러 클래스 타입을 하나의 클래스 타입으로 다루는 기술 

    구인구직 어플리케이션 프로그래밍 제작시
    필요한 요소(부품)가 무엇이 있는지 생각해보자.
    아주 다양하고, 많은 요소들이 필요할 것이다.
    
    예를 들어,
    구직자, 구인회사, 채용 ..... 등등등 많이 있다.
    이러한 요소(부품)들이 바로 객체인데 이 객체를 만드는 설계도면이 클래스이다.

    위와(구인구직 어플리케이션 프로그래밍 제작) 같이 현실세계에 존재하는 
    다양한 객체들을 각각 하나하나 추상화 시켜서 클래스로 옮기는 것을 객체지향 프로그래밍(OOP)이라고 한다.
    
   ※ 여기서 추상화(abstraction)란?
   --> 일반적인 의미의 추상화란 어떤 물체(object)에서 주된
       특징을 부각시켜 표현하고, 나머지 부분은 과감하게 생략하는것을 말한다.
       추상화의 반대는 아주 시시콜콜한것(세세한 것)까지 전부 몽땅
       다 묘사하는 것을 말하는데 이것을 정밀화 라고 말한다.
    
    객체지향 프로그래밍(OOP)에서 사용되는 추상화도 이와 비슷하다.
    어떤 하나의 물체를 대표하는 속성(명사, 멤버변수)과 기능(동사, 메소드)을 추출해내는 것을 
    객체지향 프로그래밍(OOP)에서 "추상화" 라고 한다. 

   >>> 예를 들어, 구인구직 어플리케이션 프로그래밍 제작시
       필요한 부품(요소)중 하나인 "구직자" 에 대해서 알아보자.
       "구직자" 가 가지고 있는 속성(명사, 멤버변수)과 행동양식(기능, 동사, 메소드)을 뽑아보자.
   1). 속성(property, attribute, field)은 멤버변수가 되고,
   2). 행동양식(기능)은 메소드가 되는 것이다.

   Gujikja(클래스)
      |
      |-- 속성(property, attribute, field) : 아이디, 암호, 성명, 연락처, 이메일, 주소, 학력, 희망구직직종, 희망연봉.....  
      |-- 행동양식(기능, 메소드) : 구직자로 접속(로그인)할수 있는 기능, 구직자정보를 조회해주는 기능, 구직자정보를 변경해주는 기능, ....... 

*/

public class Gujikja {

/*
    ---------------------------------------------------------------------------------------------------------------------------
	접근제한자(접근지정자, accessmodifier)   자기자신클래스내부      동일패키지에있는다른클래스      다른패키지에있는하위(자식)클래스        그외의영역  
	--------------------------------------------------------------------------------------------------------------------------- 
	public                                    O                    O                         O                        O  
	protected                                 O                    O                         O                        X
	default                                   O                    O                         X                        X
	private                                   O                    X                         X                        X
*/	
	
	// field(속성) 생성
	private String userid;    // 아이디
	private String passwd;    // 비밀번호
	private String name;      // 성명
	private String jubun;     // 주민번호 앞의 7자리 까지만
	                          // 예: "9512201" 남자  "0112203" 남자
                              // 예: "9512202" 여자  "0112204" 여자
	private String register_day;  // 가입일자
	
	static int count; // Gujikja 객체(인스턴스)의 개수를 알아오려는 용도 
	
	// 기본생성자
	public Gujikja() {
		Date now = new Date(); // 현재시각 
		SimpleDateFormat sdfmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		register_day = sdfmt.format(now);
	}
	
	// method 생성 
	public void setUserid(String userid) {
		
		if(userid != null && !userid.trim().isEmpty()) {
			this.userid = userid;
		}
		else {
			System.out.println("[경고] 아이디는 공백인 아닌 글자로 입력하셔야 합니다.\n");
		}
		
	}// end of public void setUserid(String userid)------------------
	
	
	public String getUserid() {
		return userid;
	}// end of public String getUserid()------------------
	
	
	public void setPasswd(String passwd) {
		
		if( MyUtil.isCheckPasswd(passwd) ) {
			this.passwd = passwd;
		}
		else {
			System.out.println("[경고] 비밀번호는 8글자 이상 15글자 이하의 대,소문자,숫자,특수기호가 혼합되어야만 합니다.\n"); 
		}
		
	}// end of public void setPasswd(String passwd)-----------------
	
	
	public String getPasswd() {
		return passwd;
	}// end of public String getPasswd()-----------------
	

	public void setName(String name) {
		
		// name 에는 한글만 허용하겠다.
		
		if(name != null) {
			
			// 정규표현식(Regular Expression)이란?
			// ==> 특정한 규칙을 가진 문자열의 집합을 표현하기 위해 쓰이는 형식언어 
			
			// == 1. 정규표현식(Regular Expression) 패턴을 작성한다. == //
			Pattern p = Pattern.compile("^[가-힣]{2,5}$");
			// ^ 은 시작을 의미한다.
			// $ 는 끝을 의미한다.
			// [] 는 글자 1개가 들어오는 것을 의미한다.
			// {2,5} 은 반복되어지는 회수를 말하는데 2번 또는 3번 또는 4번 또는 5번 까지를 허용한다는 말이다.
			
			// == 2. 검사할 문자열이 주어진 정규식 패턴과 일치하는지 아닌지를 판별하는 객체를 생성한다. == //
			Matcher m = p.matcher(name);
			
			// == 3. 검사할 문자열을 판별하도록 한다. == //
			// 입력받은 jubun 이 주어진 정규식 패턴과 일치하면 true, 일치하지 않으면 false 를 리턴시켜준다.  
			boolean bool = m.matches();
			
			if(bool) 
				this.name = name;	
			
			else 
				System.out.println(">> 성명은 공백없이 한글로만 2글자 부터 5글자 이내로만 가능합니다. <<\n"); 
			
		}
		else {
			System.out.println("[경고] 성명은 필수로 공백이 아닌 것으로 입력하셔야 합니다.");
		}
		
	}// end of public void setName(String name)------------------- 
	
	
	public String getName() {
		return name;
	} // end of public String getName()---------------
	

	public void setJubun(String jubun) {
		
		if( MyUtil.isCheckJubun(jubun) ) 
			this.jubun = jubun;
		
		else 
			System.out.println("[경고] 주민번호를 올바르게 입력하세요!!\n 예>9501182 \n");
		
	}// end of public void setJubun(String jubun)------------------
	
	
	public String getJubun() {
		return jubun;
	} // end of public String getJubun()-----------------
	
	///////////////////////////////////////////////////////////////////
	

	// == 구직자의 성별을 알려주는 메소드 생성하기 == 
	String getGender() {
		
		String gender = "";
				
		switch (jubun.substring(6)) {
			case "1":
			case "3":	
				gender = "남";
				break;
	
			default:
				gender = "여";
				break;
		}// end of switch()--------------
		
		return gender;
	}// end of String getGender()-------------------------
	
	
	// == 구직자의 현재나이를 알려주는 메소드 생성하기 ==  
	int getAge() {
		
		// 현재나이 = 현재년도 - 태어난년도 + 1;
		
		Calendar currentDate = Calendar.getInstance();    // 현재날짜와 시간을 얻어온다. 
		int currentYear = currentDate.get(Calendar.YEAR); // 2023
		
		int centry = ( "1".equals(jubun.substring(6)) || "2".equals(jubun.substring(6)) )?1900:2000; 
		
		int birthYear = Integer.parseInt(jubun.substring(0,2)) + centry; 
		// 태어난년도 
		
		return currentYear - birthYear + 1;
		
	}// end of int getAge()------------------------ 
	
	
	// == 구직자의 정보를 한줄로 리턴시켜주는 메소드 생성하기 == 
	String getInfo() {
	
		// eomjh   qwer******    엄정화   여      29   2023-01-17 15:30:20         
	    
		StringBuilder sb = new StringBuilder();
		sb.append(userid+"\t");
		
		String star = "";
		for(int i=0; i<passwd.length()-4; i++) {
			star += "*";
		}
		
		sb.append(passwd.substring(0, 4) + star + "\t");
		
		sb.append(name+"\t");
		sb.append(getGender()+"\t");
		sb.append(getAge()+"\t");
		sb.append(register_day);
		
		return sb.toString();
	
	}// end of String getInfo()----------------------------
	
	
	
}
