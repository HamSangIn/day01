package my.day09.d.array;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {

		Member[] mbrArr = new Member[4];
		
		for(int i=0; i<mbrArr.length; i++) {
			System.out.println("mbrArr["+i+"]=> " + mbrArr[i]);
		}
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		Member mbr1 = new Member();
		mbr1.id = "leess";
		mbr1.passwd = "qWer1234$";
		mbr1.name = "이순신";
	
		Member mbr2 = new Member();
		mbr2.id = "eomJh";
		mbr2.passwd = "qWer1234@";
		mbr2.name = "엄정화";
		
		mbrArr[Member.count++] = mbr1;
		mbrArr[Member.count++] = mbr2;
	
//		for(int i=0; i<mbrArr.length; i++) {
//			System.out.println(mbrArr[i].showInfo());
//		}
//	
/////////////////////////////////////////////////////////////////////////////////	
	
	Scanner sc = new Scanner(System.in);
	
	Member login_mbr = null;
	String str_menuNo;
	
	do {
	String loginMsg = "";
	String login_logout = "";
	String myInfoSearch = "";
	String myInfoUpdate = "";
	
		if(login_mbr == null) {//로그인을 하지 않았으면
			login_logout = "로그인";
		}
		else {//로그인을 했으면
			loginMsg = "["+login_mbr.name+"님 로그인중]";
			login_logout = "로그아웃";
			myInfoSearch = "4.내정보조회  ";
			myInfoUpdate = "5.내정보수정  ";
			
		}

	System.out.println("\n=======> 메뉴 " +loginMsg+ " <<=======\n"
						+"1.회원가입 2."+login_logout+"\n"
						+"3.모든회원조회 "+myInfoSearch + myInfoUpdate+"  6.프로그램종료 \n"
						+"=========================================="
						);
	System.out.println(" > 선택하세요 => ");
	
	str_menuNo = sc.nextLine();
	
	switch (str_menuNo) {
		case "1": //1=회원가입
			
			break;
		case "2": //2=로그인 또는 로그아웃
			
			if(login_mbr == null){//로그인 시도를 해야한다.
				
				System.out.print("→ID: ");
				String id = sc.nextLine();
				
				System.out.print("→암호: ");
				String passwd = sc.nextLine();
				
				boolean isLoginSuccess = false;
				
				for(int i=0; i<Member.count; i++) {
					if(mbrArr[i].id.equals(id)&&
					   mbrArr[i].passwd.equals(passwd)) {
						//로그인시 입력해준 id 와 passwd 가 배열속에 저장된 Member 객체에 존재하는 경우
				    isLoginSuccess = true;
				    
					login_mbr = mbrArr[i];
					login_mbr.point += 10;//로그인을 하면 10포인트를 준다.
					
					break;
					
					}
				}
			
			if(isLoginSuccess)
				System.out.println(">> 로그인 성공!! <<\n");
			else
				System.out.println(">> 로그인 실패!! <<\n");
			}
				
			else {//로그아웃 시도를 해야 한다.
				login_mbr = null;
				System.out.println(">> 로그아웃 되었습니다. <<\n");
				
				
			}
			
			
			
			
			break;
			
		case "6": //프로그램종료
			break;
	
		default:
			break;
	}// end of switch------------------------------------------------------------
	
	
	
	
	System.out.println("\n ====프로그램 종료==== \n");
	
	}while(!("6".equals(str_menuNo)));
	
	sc.close();
	
	}//end of main-------------------------------------------------------

}
