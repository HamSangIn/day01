package my.day08.b.random;

import java.util.Random;
import java.util.Scanner;

public class _3GawibawiboMain {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		String str_menuno = "";
		int win=0,draw=0,lose=0;
		do {
	        System.out.println("\n============= 메 뉴 =============\n"
	        		          +"1.가위\t2.바위\t3.보\t4.게임종료\n"
	        		          +"=================================");
	        
	        System.out.print(">> 선택하세요 => ");
	        
	        str_menuno = sc.nextLine(); // 사용자가 입력
	        
	        // 1~3 까지중 랜덤한 숫자 한개 만들기
	        int rndnum = rnd.nextInt(3-1+1) + 1;
	        
	        // 정수를 문자열로 변환하기 
	        String str_rndnum = String.valueOf(rndnum);   
	        //  1=>"1"  2=>"2"  3=>"3"
	        
	        String str_pc_gbb = "";
	        if("1".equals(str_rndnum))       str_pc_gbb = "가위";
	        else if("2".equals(str_rndnum))  str_pc_gbb = "바위";
	        else                             str_pc_gbb = "보";
	        
	        boolean status = true;
	        String str_user_gbb = "";
	        switch (str_menuno) {
				case "1": // 가위
					str_user_gbb = "가위";
					break;

				case "2": // 바위
					str_user_gbb = "바위";
					break;	
					
				case "3": // 보
					str_user_gbb = "보";
					break;	
					
				case "4": // 게임종료
					status = false;
					break;					
	
				default:
					System.out.println(">> [경고] 메뉴에 존재하지 않는 것입니다. \n");
					status = false;
					break;
			}// end of switch(str_menuno)-----------------
	        
	        if(status) {
	        	
	        	String str_result = "";
	        	
	        	
	        	// 사용자가 이긴경우
	        	if( "1".equals(str_menuno) && "3".equals(str_rndnum) ||    
        			"2".equals(str_menuno) && "1".equals(str_rndnum) ||
        			"3".equals(str_menuno) && "2".equals(str_rndnum) ) { 
	        	str_result = "이겼습니다.!!\n";
	        	win++;
	        	}
	        	// 사용자가 진경우
	        	else if( "1".equals(str_menuno) && "2".equals(str_rndnum) ||    
	        			"2".equals(str_menuno) && "3".equals(str_rndnum) ||
	        			"3".equals(str_menuno) && "1".equals(str_rndnum) 
		        			) {
	        	str_result = "졌습니다.ㅜㅜ\n";
	        	lose++;}
	        	// 사용자와 PC가 비긴경우
	        	else {
	        	str_result = "비겼습니다.\n";
	        	draw++;}
	        	System.out.println("\n=== 게임결과 ===\n"
	        				     + "사용자 : "+str_user_gbb+"\n"
	        		             + "컴퓨터 : "+str_pc_gbb+"\n"
	        		             + "사용자님이 "+str_result+"\n"
    		             		 + "=="+win+"승"+lose+"패"+draw+"무"
    		             		 );
	        }
	        
		} while( !("4".equals(str_menuno)) );
        
		sc.close();
		System.out.println("\n>> 프로그램 종료 <<");

	}// end of main()-------------------------------------

}
