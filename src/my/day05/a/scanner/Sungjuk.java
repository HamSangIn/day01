package my.day05.a.scanner;

public class Sungjuk {

	String hakbun; // 학번 "091234
	String name;   // 성명
	byte kor;      // 국어
	byte eng;	   // 영어
	byte math;	   // 수학
	short age;      // 나이
	
	// public Sungjuk() {} // 기본생성자는 생략되어져 있다.
	
	// 입력받은 점수가 0~100 사이의 점수인지 아닌지를 판별해주는 메소드 생성하기
	boolean checkJumsu(byte jumsu) {
		
		if( 0 <= jumsu && jumsu <= 100) {
			return true;
			
			
			
		}
		else {
			System.out.println("### 점수 입력은 0이상 100 까지만 가능합니다. ###");
			return false;
		}
		
		
	}
	
	
	boolean checkAge(short age) {
		
		if (20 <= age && age <= 50) {
			return true;
			
			
		}
		else {
			System.out.println("~~~ 나이 입력은 20이상 50 까지만 가능합니다");
			return false;
		
		}
		
		
		
		
		
	}
	
	// 입력되어진 필드 값을 화면에 출력해주는 메소드 생성하기
	void showinfo() {
		
		float avg = (kor+eng+math)/3.0F;
		
		String hakjum = "";
		
		if(avg >= 90) {
			hakjum = "A";
		}			
		else if(avg >= 80) {
			hakjum = "B";
		}	
		else if(avg >= 70) {
			hakjum = "C";
		}	
		else if(avg >= 60) {
			hakjum = "D";
		}	
		else {
			hakjum = "F";
		}	
		
		System.out.println("\n=== "+ name +" 님의 성적결과 ===\n "
		+ "1. 학번 : " + hakbun + "\n"
		+ "2. 성명 : " + name + "\n"
		+ "3. 국어 : " + kor + "\n"
		+ "4. 영어 : " + eng + "\n"
		+ "5. 수학 : " + math + "\n"
		+ "6. 총점 : " + (kor+eng+math) + "\n"
		+ "7. 평균 : " + avg + "\n"
		+ "8. 학점 : " + hakjum + "\n"
		+ "9. 나이 : " + age + "세\n"
		);
		
	} // end of void showinfo()
	
	
	
	
	
	
}// end of public class Sungjuk
