package my.day15.e.abstractClass;

public class Main {

	// >>> 다형성(Polymorphism) <<< 
	// ==> 상속을 이용하여 여러 클래스 타입을 하나의 클래스 타입으로 다루는 기술.
	// 자식클래스로 생성되어진 객체를 부모 클래스 타입으로 받을 수 있다는 것이 다형성(Polymorphism) 이다. 
	
	public static void main(String[] args) {
		
		Animal[] aniArr = new Animal[5];
		
		Dog dog = new Dog();
	//	Animal ani1 = new Dog(); // 가능 
	//	aniArr[0] = new Dog();   // 가능
		dog.setName("뽀삐");
		dog.setBirthYear(2010);
		dog.setWeight(5);
    	aniArr[0] = dog;
		
		Cat cat = new Cat();
	//	Animal ani2 = new Cat(); // 가능
	//	aniArr[1] = new Cat();   // 가능
		cat.setName("톰");
		cat.setBirthYear(2017);
		cat.setColor("검정");
		aniArr[1] = cat;
		
		Duck duck = new Duck();
	//	Animal ani3 = new Duck(); // 가능
	//	aniArr[2] = new Duck();   // 가능
		duck.setName("도널드");
		duck.setBirthYear(2018);
		duck.setPrice(5000);
		aniArr[2] = duck;
		
		
		for(int i=0; i<aniArr.length; i++) {
			if(aniArr[i] != null)
				aniArr[i].showInfo();
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		
		for(int i=0; i<aniArr.length; i++) {
			if(aniArr[i] != null)
				aniArr[i].cry();
		}
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		for(int i=0; i<aniArr.length; i++) {
			if(aniArr[i] != null) {
				
				if(aniArr[i] instanceof Dog) {
				  // aniArr[i] 가 Dog 클래스로 생성되어진 instance 입니까? 
				  // aniArr[i] 이 new Dog(); 로 생성되어진 것이라면 true
				  // aniArr[i] 이 new Dog(); 로 생성되어진 것이 아니라면 false	
				  (	(Dog) aniArr[i] ).run();
				}
				
				else if(aniArr[i] instanceof Cat) {
				   // aniArr[i] 가 Cat 클래스로 생성되어진 instance 입니까? 
				   // aniArr[i] 이 new Cat(); 로 생성되어진 것이라면 true
				   // aniArr[i] 이 new Cat(); 로 생성되어진 것이 아니라면 false	
				  (	(Cat) aniArr[i] ).jump();
				}
				
				else if(aniArr[i] instanceof Duck) {
				   // aniArr[i] 가 Duck 클래스로 생성되어진 instance 입니까? 
				   // aniArr[i] 이 new Duck(); 로 생성되어진 것이라면 true
				   // aniArr[i] 이 new Duck(); 로 생성되어진 것이 아니라면 false	
				  (	(Duck) aniArr[i] ).swim();
				}
				
			}
				
		}// end of for----------------------

	}// end of main()-------------------------------

}
