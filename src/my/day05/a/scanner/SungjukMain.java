package my.day05.a.scanner;

import java.util.Scanner;

import javafx.scene.control.ProgressBar;

public class SungjukMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Sungjuk lssSj = new Sungjuk(); // 기본 생성자
		
		System.out.print(" 1. 학번 : ");
		lssSj.hakbun = sc .nextLine(); // "091234"
		
		System.out.print(" 2. 성명 : ");
		lssSj.name = sc .nextLine();   // "이순신"
		int Progress = 0;
				try {
					
				
				System.out.print(" 3. 국어 : ");
				byte kor = Byte.parseByte(sc .nextLine());
				
				
				if(lssSj.checkJumsu(kor)) {
			    lssSj.kor = kor;  //kor ==> 0~100
				}
				else { // kor ==> -128~ -1 또는 101~ 127
					
					System.exit(0);// 프로그램을 정상적으로 강제종료 (0이 아니면 비정상적으로 강제종료)
				sc.close(); // return 으로 종료시키기 전에 사용
			    return; //return 을 만나면 현재 실행중인 메소드(지금은 main메소드)를 실행을 종료시켜 준다.
				
				}
				
				System.out.print(" 4. 영어 : ");
			    byte eng = Byte.parseByte(sc .nextLine());
				
				
				if(lssSj.checkJumsu(eng)) {
			    lssSj.eng = eng;  //eng ==> 0~100
				}
				else { // eng ==> -128~ -1 또는 101~ 127
					
					System.exit(0);// 프로그램을 정상적으로 강제종료 (0이 아니면 비정상적으로 강제종료)
				sc.close(); // return 으로 종료시키기 전에 사용
			    return; //return 을 만나면 현재 실행중인 메소드(지금은 main메소드)를 실행을 종료시켜 준다.
				
				}
				System.out.print(" 5. 수학 : ");
				byte math = Byte.parseByte(sc .nextLine());
				
				
				if(lssSj.checkJumsu(math)) {
			    lssSj.math = math;  //math ==> 0~100
				}
				else { // math ==> -128~ -1 또는 101~ 127
					
					System.exit(0);// 프로그램을 정상적으로 강제종료 (0이 아니면 비정상적으로 강제종료)
				sc.close(); // return 으로 종료시키기 전에 사용
			    return; //return 을 만나면 현재 실행중인 메소드(지금은 main메소드)를 실행을 종료시켜 준다.
				
				}
				System.out.println("6. 나이 : ");
				Progress = 1;
				
				short age = Short.parseShort(sc .nextLine());
				
				if(lssSj.checkAge(age)) {
			    lssSj.age = age;  
				
				}
				else { 
					
				System.exit(0);// 프로그램을 정상적으로 강제종료 (0이 아니면 비정상적으로 강제종료)
				sc.close(); // return 으로 종료시키기 전에 사용
			    return; //return 을 만나면 현재 실행중인 메소드(지금은 main메소드)를 실행을 종료시켜 준다.
				
				}
				
				
				
				
				
				
				
		}catch(NumberFormatException e) {
			
			if(Progress == 0) {
			System.out.println(">> 점수 입력은 0이상 100까지만 가능합니다. << \n");
			}
			else{
			System.out.println(">> 나이 입력은 20이상 50까지만 가능합니다. << \n");
			}
		}
		
		
		
		
		
		
		
		
		
		
		//lssSj.kor = kor;
	
		sc.close();
	    lssSj.showinfo();
	
	
	} // end of main

}
