package my.day18.a.collection;

public class Member {

	String id;
	String passwd;
	String name;
	
	public Member() {}
	
	public Member(String id, String passwd, String name) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.name = name;
	}
	
	public void infoPrint() {
		System.out.println("== " + name + "님의 회원정보 == \n"
							+ "1.아이디 : " + id + " \n "
							+ "2.비밀번호 : " + passwd + " \n "
							+ "3.성명 : " + name + " \n ");
	}

	
	
	
}
