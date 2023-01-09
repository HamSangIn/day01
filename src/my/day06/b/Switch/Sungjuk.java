package my.day06.b.Switch;

public class Sungjuk {

	String hakbun; // 학번 "091234"
	String name;   // 성명	
	byte kor;	   // 국어 byte -128 ~ 127 0 ~ 100 로 제한
	byte eng;	   // 영어
	byte math;     // 수학
	
	// 입력받은 점수가 0 ~ 100 사이의 점수인지 아닌지를 판별해주는 메소드 생성하기
	boolean checkJumsu(byte jumsu) {
		if( 0 <= jumsu && jumsu <= 100)
			return true;
		else {
			System.out.println("### 점수 입력은 0 이상 100 까지만 가능합니다. ###");
			return false;
		}
	}// end of boolean checkJumsu(byte jumsu)
	
	// 성적정보를 화면에 출력해주는 메소드 생성하기
	void showInfo() {
		
		int total = kor + eng + math; //
		double avg = Math.round(total/3.0f)*10/10.0F;
		String hakjum = "";
		if(avg >= 90) hakjum = "A";
		else if(avg >= 80) hakjum = "B";
		else if(avg >= 70) hakjum = "C";
		else if(avg >= 60) hakjum = "D";
		else 			   hakjum = "F";
		//선물은
		//학점이 "A" 이라면 "놀이공원이용권,치킨,피자,아이스크림"
		//학점이 "B" 이라면 "치킨,피자,아이스크림"
		//학점이 "C" 이라면 "피자,아이스크림"
		//학점이 "D" 이라면 "아이스크림"
		//학점이 "F" 이라면 "꿀밤 3대"
		
		String gift = "";
		
		switch (hakjum) { // swith ()속에 들어올수 있는 타입은 byte, short, int, char, String 만 가능함
			case "A":
				gift = gift + "놀이공원이용권,"; // gift += "놀이공원이용권"; 와 같다.
				//break; // break; 를 만나야만 switch case 문을 빠져나간다.
				
			case "B":
				gift = gift + "치킨,"; // gift += "놀이공원이용권"; 와 같다.
				//break;
			case "C":
				gift = gift + "피자,"; // gift += "놀이공원이용권"; 와 같다.
				//break;
			case "D":
				gift = gift + "아이스크림"; // gift += "놀이공원이용권"; 와 같다.
				break;
			case "F":
				gift = gift + "꿀밤 3대"; // gift += "놀이공원이용권"; 와 같다.
				break;
	
			default:
				break;
		}//end of switch (key)----------------------
		
		
		System.out.println("\n=== "+name+" 님의 성적결과 ===\n"
				+ "1. 학번 " + hakbun + "\n"
				+ "2. 성명 " + name + "\n"
				+ "3. 국어 " + kor + "\n"
				+ "4. 영어 " + eng + "\n"
				+ "5. 수학 " + math + "\n"
				+ "6. 총점 " + total + "\n"
				+ "7. 평균 " + avg + "\n"
				+ "8. 학점 " + hakjum + "\n"
				+ "9. 선물 " + gift + "\n"
				);
		
		
		
	}// ens of void showInfo()





}
