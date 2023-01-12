package my.day09.d.array;

import java.util.Scanner;

public class MemberMainG {

	public static void main(String[] args) {
		
		Member[] mbrArr = new Member[4];
		
		Member mbr1 = new Member();
		mbr1.id = "leess";
		mbr1.passwd = "qWer1234$";
		mbr1.name = "이순신";
		
		Member mbr2 = new Member();
		mbr2.id = "eomjh";
		mbr2.passwd = "qWer1234@";
		mbr2.name = "엄정화";
		
		mbrArr[Member.count++] = mbr1;
		mbrArr[Member.count++] = mbr2;
		
		////////////////////////////////////////////
		
		Scanner sc = new Scanner(System.in);
		String str_menuNo = "";
		
		Member login_mbr = null;
		
		do {
			String loginMsg = "";
			String login_logout = "";
			String myInfoSearch = "";
			String myInfoUpdate = "";
			
			if(login_mbr == null) { // 로그인을 하지 않았으면 
				login_logout = "로그인";
			}
			else { // 로그인을 했으면
				loginMsg = "["+login_mbr.name+"님 로그인중]";
				login_logout = "로그아웃";
				myInfoSearch = "4.내정보조회   ";
				myInfoUpdate = "5.내정보수정   ";
				
			}
			
			System.out.println("\n========== >> 메뉴 " +loginMsg+ " << ===========\n"
					         + "1.회원가입     2."+login_logout+"\n"
					         + "3.모든회원조회  "+myInfoSearch + myInfoUpdate +"6.프로그램종료\n"
					         + "=====================================================");
			
			System.out.print("▷ 선택하세요 => "); 
			
			str_menuNo = sc.nextLine();
			
			switch (str_menuNo) {
				case "1": // 회원가입
					
					break;
					
				case "2": // 로그인 또는 로그아웃 
					
				 	if(login_mbr == null) { // 로그인 시도를 해야 한다.
					
				 		System.out.print("▷ID: ");
				 		String id = sc.nextLine();
				 		
				 		System.out.print("▷암호: ");
				 		String passwd = sc.nextLine();
				 		
				 		boolean isLoginSuccess = false;
				 		
				 		for(int i=0; i<Member.count; i++) {
				 			
				 			if( mbrArr[i].id.equals(id) && 
				 				mbrArr[i].passwd.equals(passwd)	) {
				 			    // 로그인시 입력해준 id 와 passwd 가 배열속에 저장된 Member 객체에 존재하는 경우  
				 				
				 				isLoginSuccess = true;
				 				login_mbr = mbrArr[i];
				 				
				 				login_mbr.point += 10; // 로그인을 하면 point 를 10점씩 올려주고자 한다.
				 				
				 				break; // for 문의 break; 이다.
				 			}
				 			
				 		}// end of for----------------------
				 		
				 		if(isLoginSuccess)
				 			System.out.println(">> 로그인 성공!! <<\n");
				 		else
				 			System.out.println(">> 로그인 실패!! <<\n");
				 		
				 	}
				 	
				 	else { // 로그아웃 시도를 해야 한다. 
				 		login_mbr = null;
				 		System.out.println(">> 로그아웃 되었습니다. <<\n");
				 	}
				 	
					break; // switch 의 break; 이다.					
	
					
				case "6": // 프로그램종료	
					
					break;
					
				default:
					break;
			}// end of switch (key)--------------------
			
		
		} while( !("6".equals(str_menuNo)) );
		
		sc.close();
		
		System.out.println("\n=== 프로그램 종료 ===");
		
	}// end of main()------------------------------

}
