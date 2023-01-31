package my.day16.d.Final;

public class Main_final_test_1 {

	public static void main(String[] args) {
		
		Final_test_1 ft1 = new Final_test_1();
		
		ft1.id = "leess";
		ft1.name = "이순신";
		
	//	ft1.PI = 23.324324;  // final 이므로 새로운 값을 할당할 수 없기에 오류임.
		
		//////////////////////////////////////////////
		
		Child_1 child = new Child_1();
		child.greeting(); // 메소드의 overriding(오버라이딩, 재정의)
		child.rule();
		child.mytest();

	}// end of main()-------------------------

}
