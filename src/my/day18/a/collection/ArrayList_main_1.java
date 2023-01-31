package my.day18.a.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_main_1 {

	public static void main(String[] args) {
		
/*
    == Array(배열) 와 Collection(자료구조)의 차이점은 ==  	
	    
	 1. Array(배열)은 크기가 한정 되어져 있지만
	    Collection(구조체)은 크기가 무한정 이다.
	       
	 2. Array(배열)은 배열에 선언되어진 동일한 타입의 데이터만 입력가능하지만  
	    Collection(구조체)은 입력되어지는 데이터가 객체(Object)이기만 하면
	    어떤것이든지 입력가능하다. 


	 ==== 배열(Array)과 자료구조(Collection)의 차이점 ====

	 1. 배열(Array)은 오로지 동일한 데이터 타입만 들어가는 저장소이다.
	    배열(Array)은 그 크기가 한번 정해지면 크기를 변경할 수 없다.!!!
	     
	 2. 자료구조(Collection)은 동일한 타입의 객체가 아니더라도
	    객체타입이기만 하면 모두 들어가는 저장소이다.
	    자료구조(Collection)은 저장되는 크기가 자동적으로 늘어난다.!!!
	    
	웹에서 가장 많이 사용하는 대표적인 Collection 타입은 List 계열과 Map 계열이다.

	-------------------------------------------------------------------------
	              Web에서 주로 사용하는 클래스       게임프로그램밍에서 주로 사용하는 클래스
	Interface       (Single Thread 방식)          (Multi Thread 방식)
	-------------------------------------------------------------------------           
	List 계열    --      ArrayList      ,         Vector
	Map  계열    --      HashMap        ,         Hashtable 

	  ArrayList 및 HashMap 은 Multi Thread를 지원안해주므로 가볍다.
	  Vector 및 Hashtable 이 Multi Thread를 지원해주므로 무겁다.

	  Multi Thread를 지원해주는냐 안해주느냐만 차이가 있을 뿐
	  그 나머지 기능은 동일하다.  
	*/

	/*
	  JDK 1.5 부터 제네릭(Generic)타입이 새로 추가되었는데, 제네릭(Generic)을 이용함으로써 잘못된 타입이
	   사용될 수 있는 문제를 컴파일 과정에서 제거할 수 있게 되었다. 
	   프로그램 실행시 타입 에러가 발생하여 작동이 멈추는 것보다는 컴파일시에 타입에러가 발생하도록 하여 
	   프로그램 실행시 에러를 발생하지 않도록 사전에 방지하는 것이 좋기 때문이다.
	   
	     ▷ 제네릭(Generic)은 컬렉션(자료구조) 즉, 쉽게 말해서 객체들을 저장(수집)하는 구조적인 성격을 보강하기 위해 제공하는 것이다.
	     ▷ 간단히 예를 들자면 컵이라는 특정 객체가 있다고 하자. 
	      이 컵은 물만 담을 수 있는 물컵 , 또는 이 컵은 쥬스만 담을 수 있는 쥬스 컵. 이렇게 지정해주도록 하는 것이  제네릭(Generic) 이다.    

	     ▷  JDK 1.5 부터 제네릭(Generic)타입이 새로 추가되면서, 특정 컬렉션(자료구조)에 저장되어질 특정한 객체 타입을 명시하여
	     실행하기전 컴파일 단계에서 특정한 객체 타입이 아니면 에러를 발생토록 하여 저장이 불가능하도록 만들었다.
	     즉, 특정 컬렉션(자료구조)에 저장되어질 객체의 타입을 제한하도록 만든 것이다.

	    ▷ 제네릭(Generic)타입을 사용하기 이전에는  컬렉션(자료구조)에 저장되어진 객체들을 하나씩 검출하여 객체 타입을 확인할 수 밖에 없었다.
	      Object 로 부터 상속받은 객체는 모두 저장이 가능했던 이전의 버전들과는 달리 보다 체계적이라 할 수 있다.
	  
	    ▷ 제네릭(Generic)타입을 사용함으로써 별도의 형 변환(Casting)이 필요없이 <> 사이에 선언하였던 객체자료형으로 검출되어 편리하다.       

	    ▷ 제네릭(Generic)타입에 있어서 1개 글자로 된 영문대문자는 영문대문자 아무것이나 사용해도 무관하다.
	    -- 그런데 관습상 객체가 제네릭(Generic)타입으로 사용될때 자료형(Type)이라고 나타내고 싶을때는 <T>라고 쓰고,
	       어떠한 요소(Element)이라고 나타내고 싶을때는 <E>라고 쓰고, 
	       key값이라고 나타내고 싶을때는 <K>라고 쓰고, Value값이라고 나타내고 싶을때는 <V>라고 쓴다.      
	    
	*/
	
	/*	
		String[] nameArr = new String[10];
		
		nameArr[0] = "이순신";  // String 이므로 OK
		nameArr[1] = 1234.5;  // double 이므로 오류!!
		nameArr[2] = 98;      // int 이므로 오류!!
		nameArr[3] = new Member();  // Member 이므로 오류!!
		
		for(int i=0; i<20; i++) {
			nameArr[i] = (i+1)+"홍길동";
		}
		// java.lang.ArrayIndexOutOfBoundsException 이 발생함
	*/
		
		ArrayList my_list = new ArrayList();
		
		my_list.add(new String("이순신"));
		my_list.add("엄정화");
		
		my_list.add(new Double(1234.5));
		my_list.add(234.56);  // double --> Double 으로 autoBoxing
		
		my_list.add(new Integer(98));
		my_list.add(87);      // int --> Integer 으로 autoBoxing
		
		my_list.add(new Member());
		
		
		for(int i=0; i<200000; i++) {
			my_list.add((i+1)+"홍길동");
		}
		
		
		for(int i=0; i<my_list.size(); i++) {
			System.out.println(my_list.get(i));
		}
		
		System.out.println("my_list.size() => " + my_list.size());
		// my_list.size() => 200007
		
		for(int i=0; i<7; i++) {
			System.out.println(my_list.get(i));
		}
		/*
		    이순신
			엄정화
			1234.5
			234.56
			98
			87
			my.day18.a.collection.Member@15db9742 
		 */
		
		System.out.println(my_list.get(4) + ", " + my_list.get(5));
		// 98, 87
		
		//////////////////////////////////////////////
		
		// ==== Generic(제네릭) ==== //
		/*
		   원래 Collection(구조체)은 Object 이기만 하면 모두 입력이 가능하다.
		   그런데 입력은 모두 되지만 꺼내와서 사용할때가 문제가 발생한다.
		   수많은 데이터중에서 특정 데이터타입을 가지는 데이터를 꺼내오기는 정말로 
		   귀찮은 작업을 해야만 한다.
		   그래서 배열처럼 특정한 타입의 데이터만 입력하도록 만든 것이 Generic(제네릭)이다.
		   그래야만 데이터를 꺼내올때 쉽고 명확해진다.
		*/
		
	//	List<String> str_list = new ArrayList<String>();
	//  또는
		List<String> str_list = new ArrayList<>();  // String 은 생략가능한데 JDK 8 부터 가능함.
	//	List<> str_list = new ArrayList<String>();  // 오류!!
		
	//	List<Double> dbl_list = new ArrayList<Double>(); // Double 은 생략가능한데 JDK 8 부터 가능함.
		List<Double> dbl_list = new ArrayList<>();
		
    //	List<Integer> int_list = new ArrayList<Integer>(); // Integer 은 생략가능한데 JDK 8 부터 가능함. 
		List<Integer> int_list = new ArrayList<>();	
		
    //	List<Member> mbr_list = new ArrayList<Member>(); // Member 은 생략가능한데 JDK 8 부터 가능함. 
		List<Member> mbr_list = new ArrayList<>();
		
		
		str_list.add("하하하");
	//	str_list.add(123);  // 오류
		
		dbl_list.add(12.345);
	//	dbl_list.add("호호호"); // 오류
		
		int_list.add(89);
	//	int_list.add(15.67);  // 오류
		
		mbr_list.add(new Member());
	//	mbr_list.add("헤헤헤"); // 오류 
		

	}

}