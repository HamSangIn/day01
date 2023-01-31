package my.day16.c.block;

public class MainBlock {

	public static void main(String[] args) {
		
		Child child_1 = new Child();
	/*	
		*** Child 클래스의 'static 초기화 블럭' 호출됨. ***
		>> 부모클래스인 Parent 클래스의 기본생성자 호출됨 <<
		### Child 클래스의 instance(인스턴스) 초기화 블럭 호출됨. ###
		=== 자식클래스인 Child 클래스의 기본생성자 호출됨 ===
	*/	

		System.out.println("child_1.name => " +  child_1.name);
		// child_1.name => 한지민
		
		System.out.println("Child.count => " + Child.count);
		// Child.count => 1
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		Child child_2 = new Child();
	/*
	    >> 부모클래스인 Parent 클래스의 기본생성자 호출됨 <<
        ### Child 클래스의 instance(인스턴스) 초기화 블럭 호출됨. ###
        === 자식클래스인 Child 클래스의 기본생성자 호출됨 === 	
	 */
		
		child_2.name = "전지현";
		
		System.out.println("child_2.name => " +  child_2.name);
		// child_2.name => 전지현
		
		System.out.println("Child.count => " + Child.count);
		// Child.count => 1
		
	}

}
