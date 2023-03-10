package my.day06.a.If;

public class MemberMain {

	public static void main(String[] args) {
		
		Member mbr1 = new Member();
		mbr1.id = "leess";
		mbr1.name = "이순신";
		mbr1.nickName = new String("장군");
		
		Member mbr2 = new Member();
		mbr2.id = "eomjh";
		mbr2.name = "엄정화";
		mbr2.nickName = new String("가수");
		
		Member mbr3 = new Member();
		mbr3.id = "leess";
		mbr3.name = "이순신";
		mbr3.nickName = new String("장군");

	
		if(mbr1 == mbr2) {
			//인스턴스(객체) 와 인스턴스(객체) 를 비교(==) 할때는 메모리상에 올라가있는 인스턴스(객체)의 메모리 주소를 비교하는 것이다.
			System.out.println("인스턴스 mbr1 과 인스턴스 mbr2 은 동일한 메모리 주소를 참조하고 있습니다.");
		}
		else if(mbr1 == mbr3) {
			System.out.println("인스턴스 mbr1 과 인스턴스 mbr3 은 동일한 메모리 주소를 참조하고 있습니다.");
		}
			System.out.println("인스턴스 mbr1 과 인스턴스 mbr2 와 인스턴스 mbr3 은 모두 다른 메모리 주소를 참조하고 있습니다.");
			//인스턴스 mbr1 과 인스턴스 mbr2 와 인스턴스 mbr3 은 모두 다른 메모리 주소를 참조하고 있습니다.
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		String passwd_1 = new String("abcd");
		String passwd_2 = new String("abcd");
		
		if(passwd_1 == passwd_2) {
			System.out.println("인스턴스 passwd_1 과 인스턴스 passwd_2 은 동일한 메모리 주소를 참조하고 있습니다.");
				
		}
		else {
			System.out.println("인스턴스 passwd_1 과 인스턴스 passwd_2 은 서로 다른 메모리 주소를 참조하고 있습니다.");
			
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		String passwd_3 = "abcd";
		String passwd_4 = "abcd";
		
		if(passwd_3 == passwd_4) {
			System.out.println("passwd_3 과 passwd_4 은 동일한 값을 가지고 있습니다.");
				// 이때의 passwd_3 == passwd_4 은
				// passwd_3 에 저장된 값("abcd")과 passwd_4 에 저장된 값("abcd")을 비교하는 것이다.
		}
		else {
			System.out.println("passwd_3 과 passwd_4 은 서로 다른 값을 가지고 있습니다.");
			
		}
		
		System.out.println("\n>>>> 문자열 값을 비교시 .equals() 메소드를 사용하자 <<<<\n");
		
		if(passwd_1.equals(passwd_2)) {
			System.out.println("passwd_1 과 passwd_2 은 동일한 값을 가지고 있습니다.");
				// passwd_1.equals(passwd_2)은
				// passwd_1 에 저장된 값("abcd")과 passwd_2 에 저장된 값("abcd")을 비교하는 것이다.
		}
		else {
			System.out.println("passwd_1 과 passwd_2 은 서로 다른 값을 가지고 있습니다.");
			
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		if(passwd_3.equals(passwd_4)) {
			System.out.println("passwd_3 과 passwd_4 은 동일한 값을 가지고 있습니다.");
				// passwd_3.equals(passwd_4)은
				// passwd_3 에 저장된 값("abcd")과 passwd_4 에 저장된 값("abcd")을 비교하는 것이다.
		}
		else {
			System.out.println("passwd_3 과 passwd_4 은 서로 다른 값을 가지고 있습니다.");
			
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		// if(mbr1.id == mbr3.id  ){ 이렇게 하면 메모리비교 이퀄을 써야 값 비교
		if(mbr1.id.equals(mbr3.id)){
			System.out.println( mbr1.id+" 와 "+ mbr3.id+" 은 같습니다.");
		}
		else {
			System.out.println( mbr1.id+" 와 "+ mbr3.id+" 은 같지 않습니다.");
		}
		// if(mbr1.nickName == mbr3.nickName  ){ 이렇게 하면 메모리비교 이퀄을 써야 값 비교
		if(mbr1.nickName.equals(mbr3.nickName)){
			System.out.println( mbr1.nickName+" 와 "+ mbr3.nickName+" 은 같습니다.");
		}
		else {
			System.out.println( mbr1.nickName+" 와 "+ mbr3.nickName+" 은 같지 않습니다.");
		}
		
		
		
	}

} // end of public class MemberMain
