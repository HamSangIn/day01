package my.day16.d.Final;

public class Child_1 extends Final_test_1 {

	int age;
	
	void mytest() {
		System.out.println(">> 연습입니다. <<");
	}
	
	@Override
	public void greeting() {
		System.out.println("\n~~~ Hi Hello ~~~\n");
	}
	
/*	
	=== final 메소드는 overriding(오버라이딩, 재정의)을 할 수 없다. ===
	@Override
	public void rule() {
		System.out.println("\n~~~ Honesty ~~~\n");
	}
*/	
	
}
