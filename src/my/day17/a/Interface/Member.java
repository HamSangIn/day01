package my.day17.a.Interface;

import java.text.SimpleDateFormat;
import java.util.Date;

import my.util.MyUtil;

public abstract class Member implements InterMember { // 미완성 메소드(==추상 메소드)를 가지는 클래스는 반드시 미완성 클래스로 되어야 한다. 

	// field 생성
	private String id;            // 아이디
	private String passwd;        // 비밀번호
	private String name;          // 성명(개인성명, 회사명)
	private String register_day;  // 가입일자
	
	static int count;             // Gujikja 객체(인스턴스) 및 Company 객체(인스턴스)의 개수를 알아오려는 용도 
	
	// 기본생성자
	public Member() {
		System.out.println(">>> 확인용 부모클래스인 Member 클래스 생성자 호출됨.!!");
		
		Date now = new Date(); // 현재시각 
		SimpleDateFormat sdfmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		register_day = sdfmt.format(now);
	}

	// method 생성
	public String getId() {
		return id;
	}

	public void setId(String id) {
		
		if(id != null && !id.trim().isEmpty()) {
			this.id = id;
		}
		else {
			System.out.println("[경고] 아이디는 공백인 아닌 글자로 입력하셔야 합니다.\n");
		}

	}

	public String getPasswd() {
		return passwd;
	}
	
	public void setPasswd(String passwd) {
		
		if( MyUtil.isCheckPasswd(passwd) ) {
			this.passwd = passwd;
		}
		else {
			System.out.println("[경고] 비밀번호는 8글자 이상 15글자 이하의 대,소문자,숫자,특수기호가 혼합되어야만 합니다.\n"); 
		}
		
	}

	public String getName() {
		return name;
	}

	
	protected void setName_2(String name) {
		this.name = name;
	}
	
	
	public String getRegister_day() {
		return register_day;
	}
	
	
	public void input_name(String name) {
		this.name = name;
	}
	
	
}
