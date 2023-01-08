package my.day03.a.constructor;

public class MemberMain {

	public static void main(String[] args) {
		
		Member hongMbr = new Member(); // 파라미터(매개변수)가 없는 생성자를 기본생성자(default constructor)라고 부른다.
		hongMbr.userid = "hongkd";
		hongMbr.passwd = "1234";
		hongMbr.name = "홍길동";
		hongMbr.age = 20;
		hongMbr.point = 100;
		
		hongMbr.showInfo();
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		Member iyouMbr = new Member("iyou", "abcd", "아이유", 29, 300); // 파라미터(매개변수)가 있는 생성자
		iyouMbr.showInfo();
		
		
		System.out.println("\n================================\n");
		
		Member chaewMbr = new Member("chaew", "qwer", "차은우");
		chaewMbr.showInfo();
		
		
		
		
		System.out.println("\n##################################\n");
		
		// == return 타입이 void 인 메소드 호출 == //
		
		// hongMbr 인스턴스(객체)의 암호를 변경해주는 메소드 호출 
		hongMbr.updatePasswd("qweqwe", "0070$"); // 매개변수 , 인자 , argument , parameter
		
		// iyouMbr 인스턴스(객체)의 암호를 변경해주는 메소드 호출 
		iyouMbr.updatePasswd("abcd", "asdf!");
		
		System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1\n");
		
		// == return 타입이 있는 메소드 호출 ==//
		int jangoPoint = hongMbr.pointPayment(30);
		System.out.println("\""+hongMbr.name + "\"님의 남은 포인트"+ jangoPoint + " 입니다.\n");
		// "홍길동"님의 남은 보인프는 70입니다.
        // "홍길동"님은 포인트 30 결제가 되었습니다.
		jangoPoint = chaewMbr.pointPayment(20);
		System.out.println("\""+chaewMbr.name + "\"님의 남은 포인트"+ jangoPoint + " 입니다.\n");
		// "차은우"님의 남은 포인트는 0입니다.
		// "차은우"님은 현재 포인트가 0 이므로 포인트 결제가 불가합니다.
		
		jangoPoint = iyouMbr.pointPayment(5000);
		System.out.println("\""+iyouMbr.name + "\"님의 남은 포인트"+ jangoPoint + " 입니다.\n");
		// "아이유"님의 남은 포인트는 300입니다.
		// "아이유""아이유"님은 현재 포인트가 300 이므로 포인트 결제가 불가합니다.
		
		System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1\n");
		
		String info = hongMbr.changeInfo("5678" , 30, 400);
		                  // 암호 , 나이 , 포인트
	    
		
		System.out.println(info); 
	    
	    /*
	     *  === 홍길동님의 회원정보 수정하기전 ===
	      1. 아이디 : hongkd
	      2. 암호 : 1234
	      3. 성명 : 홍길동
	      4. 나이 : 20
	      5. 포인트 : 70
	      
	      === 홍길동님의 회원정보 수정후 ===
	     
	      1. 아이디 : hongkd
	      2. 암호 : 5678
	      3. 성명 : 홍길동
	      4. 나이 : 30
	      5. 포인트 : 400
	    
	     
	     
	      */
		System.out.println("\n#######################################\n");
		
		info = iyouMbr.changeInfo("7777" , "이지은" , 35 , 8000);
		                          // 암호 , 성명 , 나이 , 포인트
	    System.out.println(info);
	
	
	
	}

	
}
