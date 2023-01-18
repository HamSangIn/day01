package my.day14.a.inheritance;

import java.util.Scanner;

public class Main_gujikja_company {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Ctrl_Total  ctrl_total = new Ctrl_Total();
		
		Gujikja[] guArr = new Gujikja[5];
		Company[] cpArr = new Company[3];
		
      /////////////////////////////////////////////////////
		Gujikja gu1 = new Gujikja();
		gu1.setId("eomjh");
		gu1.setPasswd("qWer1234$A");
		gu1.setName("엄정화");
		gu1.setJubun("9501172");
		gu1.setHope_money(5000);
		guArr[Gujikja.count++] = gu1;
		
		Gujikja gu2 = new Gujikja();
		gu2.setId("leess");
		gu2.setPasswd("abCd123$B");
		gu2.setName("이순신");
		gu2.setJubun("0101173");
		gu2.setHope_money(6000);
		guArr[Gujikja.count++] = gu2;
		
		Gujikja gu3 = new Gujikja();
		gu3.setId("youks");
		gu3.setPasswd("aSdf12345$C");
		gu3.setName("유관순");
		gu3.setJubun("8501172");
		gu3.setHope_money(7000);
		guArr[Gujikja.count++] = gu3;
		
      /////////////////////////////////////////////////////	
		
		String smenuNo = "";
		do {
			ctrl_total.main_menu();
			smenuNo = sc.nextLine();
			
			switch (smenuNo) {
				case "1": // 구직자 회원가입
		
					break;
					
				case "2": // 구인회사 회원가입
		
					break;
					
				case "3": // 구직자 로그인
		
					break;
					
				case "4": // 구인회사 로그인
					
					break;	
					
				case "5": // 프로그램 종료
					
					break;					
		
				default:  // 메뉴번호에 없는 값 
					System.out.println(">> [경고] 선택하신 번호는 메뉴에 없습니다. << \n");  
					break;
			}// end of switch(smenuNo)-------------------------
		
		} while( !("5".equals(smenuNo)) );
		// end of do~while------------------------------
		
		
		sc.close();
		
		System.out.println("\n~~~~~ 프로그램 종료 ~~~~~");

	}// end of main()-----------------------------------
	
	
	

}
