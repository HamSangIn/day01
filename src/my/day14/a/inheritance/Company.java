package my.day14.a.inheritance;

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

public class Company extends Member {
	// Member  ==> 부모클래스 
	// Company ==> 자식클래스
	
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
	private String business_number;  // 사업자등록번호
	private String jobType;          // 회사직종타입(제조업, 서비스업, IT, ....)
	private long seedMoney;          // 자본금 
	
	static int count; // Gujikja 객체(인스턴스)의 개수를 알아오려는 용도 
	
	
}
