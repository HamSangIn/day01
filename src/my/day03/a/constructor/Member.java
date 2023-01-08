package my.day03.a.constructor;

public class Member {

	// field, attribute, property, 속성
	String userid;
	String passwd;
	String name;
	int age;
	int point;
	
	// >>> 생성자(constructor) ==> 인스턴스(객체)화 할때 사용되어지는 일종의 메소드라고 보면 된다. 

	// 파라미터가 없는 생성자를 기본생성자(default constructor)라고 부른다.
	// 모든 클래스는 아래와 같이 기본생성자(default constructor)를 명기하지 않으면 
	// 기본 생성자가 없는 것이 아니라 생략되어져 안 보일 뿐이다.
/*	
	public Member() {
		
	}
*/	
	
	public Member() {
		System.out.println(">>> 기본생성자 Member() 가 호출됨 <<<");
	}
	
	
	// >>> 파라미터(매개변수)가 있는 생성자 
	// !!! 파라미터가 있는 생성자를 만들면 자동적으로 생략되어져 있던 기본생성자가 삭제가 되어져 버린다.!!!  
	// >>> 파라미터(매개변수)가 있는 생성자의 주목적은 필드를 초기화 시켜주는 것이다.
	
	public Member(String userid, String passwd, String name) { 
		// 지역변수명과 멤버변수명이 동일할 경우에는 지역변수명이 더 우선한다.
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		
		// this 는 자기자신 클래스인 Member 클래스의 인스턴스를 뜻하는 것이다.
		System.out.println(">>> 파라미터 생성자 Member(String userid, String passwd, String name) 가 호출됨 <<<");
	}
	
	
	public Member(String userid, String passwd, String name, int age, int point) { 
		// 지역변수명과 멤버변수명이 동일할 경우에는 지역변수명이 더 우선한다.
//		this.userid = userid;
//		this.passwd = passwd;
//		this.name = name;
		
//      또는
		this(userid, passwd, name); // 또 다른 생성자를 호출한 것임.
		
		this.age = age;
		this.point = point;
		
		// this 는 자기자신 클래스인 Member 클래스의 인스턴스를 뜻하는 것이다.
		System.out.println(">>> 파라미터 생성자 Member(String userid, String passwd, String name, int age, int point) 가 호출됨 <<<"); 
	}
	
	
	// behavior, operation, method, function, 행위, 기능, 함수
	void showInfo() {
		
		System.out.println("=== "+ name + "님의 회원정보 ===\n"
				         + "1. 아이디 : " + userid + "\n"
				         + "2. 암 호 : " + passwd + "\n"
				         + "3. 성 명 : " + name + "\n"
				         + "4. 나 이 : " + age + "\n"
				         + "5. 포인트 : " + point + "\n"
				);
		
	}// end of void showInfo()============================
	
	
	// == return 타입이 void 인 메소드 생성하기 == //
	// 암호를 변경하려는 기능(메소드)
	
	void updatePasswd(String currentPasswd, String newPasswd) { // 메소드 생성시 void 는 리턴타입이 없다.
		
		// 현재 인스턴스의 암호인 passwd 와 입력받은 currentPasswd 값이 서로 일치하지 않으면 꽝
		if( !passwd.equals(currentPasswd)) {
			System.out.println(">> \""+name+"' 님 현재 사용중인 암호와 틀린 암호를 입력하셔서 암호변경이 불가능합니다.");
		}
		
		// 현재 인스턴스의 암호인 passwd 와 입력받은 currentPasswd 값이 서로 일치하면 성공
		else {
			passwd = newPasswd;
			
			System.out.println(">> \""+name+"' 님 암호가 성공적으로 변경되었습니다.!! << \n");
			showInfo();
		}
		
	}// end of void updatePasswd(String currentPasswd, String newPasswd)=========	
		
	
	// == 리턴 타입이 있는 메소드 생성하기 == //
	int pointPayment(int point) {
			
		int jangoPoint =0;
		
		
		if( this.point == 0) {
			System.out.println("\""+name+"\" 님은 현재 포인트가 0 이므로 포인트 결제가 불가합니다.");
			jangoPoint = this.point;
		}		
					
		else if(this.point < point) {
			 System.out.println("\""+name+"\"님은 현재 포인트가 "+ this.point+" 이므로 포인트 결제 "+point+" 불가합니다.");
			 jangoPoint = this.point;
		}		
						
		else {
		    System.out.println("\""+name+"\"님은 포인트 "+point+"결제가 되었습니다");			
		    jangoPoint = this.point - point;
		}
					
				
		return jangoPoint;
		
		
		
		
		
		
				
    }// end of int pointPayment(int point)===============
	
	String memberInfo(){
		  return "1. 아이디 : "+ userid +"\n"
				+"2. 암호 : "+ passwd +"\n"
				+"3. 성명 : "+ name +"\n"
				+"4. 나이 : "+ age +"\n"
				+"5. 포인트 : "+ point +"\n";
		
		
	} //  end of String memberInfo---------------------
	
	    
        String changeInfo(String passwd, int age, int point) {
		
		
        	
        String result = " === " +name+" 님의 회원정보 수정하기전 ===\n " +memberInfo();
		
       
        
        this.passwd = passwd;
        this.age = age;
        this.point = point;
        
        
        
        return result + "\n === "+name+" 님의 회원정보 수정후 === \n"+memberInfo();
        
    
		          
        
//                === 홍길동님의 회원정보 수정하기전 ===			     
//		          1. 아이디 : hongkd
//			      2. 암호 : 1234
//			      3. 성명 : 홍길동
//			      4. 나이 : 20
//			      5. 포인트 : 70
//			      
//			      === 홍길동님의 회원정보 수정후 ===			     
//			      1. 아이디 : hongkd
//			      2. 암호 : 5678
//			      3. 성명 : 홍길동
//			      4. 나이 : 30
//			      5. 포인트 : 400
		
		

	
        
        
        
        } // end of String changeInfo
	
        // !!!! 메소드의 오버로딩(overloading) !!!!
        // 1. 메소드의 이름은 같더라도 파라미터의 개수가 다르면 다른 메소드로 취급 하므로 메소드 중복이 아니다.
        // 2. 메소드의 이름은 같고, 파라미터의 개수도 같더라도 파라미터의 데이터타입의 순서가 다르면 다른 메소드로 취급 하므로 메소드 중복이 아니다.
        // 3. 메소드의 이름은 같고, 파라미터의 개수도 같고, 파라미터의 데이터타입의 순서도 같고, 단 return 타입은 다를 경우라도 메소드 중복이라고 본다. 
        // 그러므로 메소드의 이름이 같지만 메소드가 중복이 안되려면 리턴타입은 필요가 없고 오로지 파라미터가 달라야 한다.  

       String changeInfo(String passwd , String name , int age , int point){
    	   
    	   String result = " === " +name+" 님의 회원정보 수정하기전 ===\n " +memberInfo();
   		
           
           
           this.passwd = passwd;
           this.name =name;
           this.age = age;
           this.point = point;
           
           
           
           return result + "\n === "+this.name+" 님의 회원정보 수정후 === \n"+memberInfo();
        
        	
        	
        	
        	
        	
        } // end of  String changeInfo(String passwd , String name , int age , int point)


          




} // end of class Member===============





