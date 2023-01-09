package my.day06.e.For;

import java.util.Scanner;

import my.util.MyUtil;

public class MemberMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("=== 회원가입 하기(유효성 검사) ===");
		
		String userid = "";
		for(;;) {
			System.out.print("1.아이디 => ");
			userid = sc.nextLine(); // "    leess    "
			                               // ""
			/*                               // "             "
			userid.trim();  // .trim();좌우 공백을 지워버린다.사이공백은 지우지못함.
			userid.trim().length(); //.length() 는 길이를 숫자로 표현해준다. 사이공백은 길이로 침
			*/
			
			
			if(userid.trim().length() == 0) {
				System.out.println("[경고] 아이디는 필수 입력사항 입니다. << \n");
				
			}
			else {
				break;
			}
			
		
		} //end of for(;;)-----------------------------------------------------
		
		
		
		String passwd ="";
			for(;;) {
				System.out.print("2.암호 => \n");
				 passwd = sc.nextLine(); 
				
				
				if(!MyUtil.isCheckPasswd(passwd)) {
					System.out.println("[경고] 암호는 8글자 이상 15글자 이하의 대문자,소문자,숫자,특수문자가 혼합되어야만 합니다. << \n");
					
				}
				else  {
					break;
				}
				
			
			} //end of for(;;)-----------------------------------------------------
			
		
		
		
			String name = "";
			for(;;) {
				System.out.print("3.성명 => \n");
				 name = sc.nextLine(); 
				
				
				if(name.trim().length() == 0) {
					System.out.println("[경고] 성명은 필수 입력사항 입니다. << \n");
					
				}
				else {
					
					break;
				}
		
			} //end of for(;;)-----------------------------------------------------
			
		Member mbr = new Member();
		mbr.userid = userid;
		mbr.passwd = passwd;
		mbr.name = name;
		
		sc.close();
		
		
		
		
	}//end of main

	}
