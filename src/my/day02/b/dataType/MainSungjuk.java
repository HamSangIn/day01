package my.day02.b.dataType;

public class MainSungjuk {

	public static void main(String[] args) {
		
		Sungjuk lssSj = new Sungjuk(); // lssSj
		// lssSj 은 참조형 타입(Reference Type) 이다.
		System.out.println("lssSJ => " + lssSj);
		// lssSJ => my.day02.b.dataType.Sungjuk@15db9742
		
		lssSj.hakbun = "091234";  // "091234"
		lssSj.name = "이순신";     // "이순신"
		lssSj.korPoint = 68;      // 68
		lssSj.eng_point = 95;     // 95 
		lssSj.mathpoint = 100;    // 100
		lssSj.seedmoney = 3100000000L;
		
		lssSj.showSungjuk();
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		Sungjuk eomSj = new Sungjuk(); // eomSj
		// eomSj 은 참조형 타입(Reference Type) 이다.
		System.out.println("eomSj => " + eomSj);
        // eomSj => my.day02.b.dataType.Sungjuk@6d06d69c
		
		eomSj.hakbun = "109876";  // "109876"
		eomSj.name = "엄정화";     // "엄정화"
		eomSj.korPoint = 100;     // 100
		eomSj.eng_point = 100;    // 100 
		eomSj.mathpoint = 100;    // 100
		
		eomSj.showSungjuk();
		
		
	}

}
