package my.day13.encapsulation;

import java.util.Scanner;

public class Main_gujikja {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Ctrl_Gujikja ctrl = new Ctrl_Gujikja();
		
		Gujikja[] guArr = new Gujikja[5];
		
      /////////////////////////////////////////////////////
		Gujikja gu1 = new Gujikja();
		gu1.setUserid("eomjh");
		gu1.setPasswd("qWer1234$A");
		gu1.setName("엄정화");
		gu1.setJubun("9501172");
		guArr[Gujikja.count++] = gu1;
		
		Gujikja gu2 = new Gujikja();
		gu2.setUserid("leess");
		gu2.setPasswd("abCd123$B");
		gu2.setName("이순신");
		gu2.setJubun("0101173");
		guArr[Gujikja.count++] = gu2;
		
		Gujikja gu3 = new Gujikja();
		gu3.setUserid("youks");
		gu3.setPasswd("aSdf12345$C");
		gu3.setName("유관순");
		gu3.setJubun("8501172");
		guArr[Gujikja.count++] = gu3;
		
      /////////////////////////////////////////////////////	
		
		String smenuNo = "";
		do {
			ctrl.main_menu(); // 메인메뉴 보여주기 
			smenuNo = sc.nextLine();
			
			switch (smenuNo) {
				case "1": // 구직자 회원가입
					ctrl.register(sc, guArr);
					break;
					
				case "2": // 구직자 모두 보기
					ctrl.showAll_info(guArr);
					break;
					
				case "3": // 검색
					ctrl.search_menu(sc, guArr);
					break;
					
				case "4": // 프로그램 종료
					
					break;				
		
				default:  // 메뉴번호에 없는 값 
					System.out.println(">> [경고] 선택하신 번호는 메뉴에 없습니다. << \n");  
					break;
			}// end of switch(smenuNo)-------------------------
		
		} while( !("4".equals(smenuNo)) );
		// end of do~while------------------------------
		
		
		sc.close();
		
		System.out.println("\n~~~~~ 프로그램 종료 ~~~~~");

	}// end of main()-----------------------------------
	
	
	

}
