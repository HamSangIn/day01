package my.day15.a.multiinheritance;

public class Me extends Faterh, Mother {

	// 자바는 클래스가 여러 클래스를 다중상속이 불가하다.!!
	// 참고로 C++ 이라는 언어는 다중상속이 가능하다.
	
	public void test() {
		System.out.println(super.userid); 
		System.out.println(super.passwd);
	}
	
}
