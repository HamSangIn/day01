package my.day06.b.Switch;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class SungjukMain {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Sungjuk lssSj = new Sungjuk();// 기본 생성자
		
		System.out.print("1.학번 : ");
		lssSj.hakbun = sc.nextLine(); // "091234"
		
		System.out.print("2.성명 : ");
		lssSj.name = sc.nextLine(); // "이순신"
		
		
		try {
		
		
			System.out.print("3.국어 : ");
			byte kor = Byte.parseByte(sc.nextLine()) ; // "091234"
			
			if( lssSj.checkJumsu(kor)) {
				lssSj.kor = kor;
				
			}
			
			else {
				// System.exit(0);
				// 또는 	
				sc.close();
				return; // 현재 실행중인 메소드를 종료해 라는 뜻이다.
			}
			
			System.out.print("4.영어 : ");
			byte eng = Byte.parseByte(sc.nextLine()) ; // "091234"
			
			if( lssSj.checkJumsu(eng)) {
				lssSj.eng = eng;
				
			}
			else {
				// System.exit(0);
				// 또는 	
				sc.close();
				return; // 현재 실행중인 메소드를 종료해 라는 뜻이다.
			}
			System.out.print("5.수학 : ");
			byte math = Byte.parseByte(sc.nextLine()) ; // "091234"
			
			if( lssSj.checkJumsu(math)) {
				lssSj.math = math;
				
			}
			else {
				// System.exit(0);
				// 또는 	
				sc.close();
				return; // 현재 실행중인 메소드를 종료해 라는 뜻이다.
			}
			
			
			lssSj.showInfo(); // 성적정보를 출력해주는 것
			
			
			
			
			
			
		}catch(NumberFormatException e) {
			System.out.println(">> 점수 입력은 0 이상 100 까지만 가능합니다. << \n");
		}
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
