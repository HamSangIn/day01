package my.day09.d.array;

import java.util.Scanner;

import my.util.MyUtil;

public class MemberMain {

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
					
					// 배열 mbrArr 에 빈방(비어있는 즉, null로 되어진방)이 있는지 없는지 확인한 후 
					// 빈방이 있으면 회원가입을 진행하고, 빈방이 없으면 정원마감 이라는 메시지를 출력하도록 한다.
					if(Member.count < mbrArr.length) {
						
						String id = "";
						String passwd = "";
						String name = "";
						
						for(;;) {
							System.out.print("\n1.아이디 : ");
							id = sc.nextLine();
							
							boolean isIdDuplicate = false;
							
							// 입력받은 id 가 기존회원이 저장된 배열 mbrArr 에 가서 동일한 id 가 있는지 없는지 검사해야 한다. 
							for(int i=0; i<Member.count; i++) {
								if(mbrArr[i].id.equals(id)) {
									// 입력받은 id 가 기존회원이 사용중인 id 인 경우, 즉 중복된 id 인 경우이다.
									isIdDuplicate = true;
									break;
								}
							}// end of for-----------------
							
						//	if(isIdDuplicate || id.trim().length()==0) { // ""
						//  또는	
							if(isIdDuplicate || id.trim().isEmpty())  { // ""
								System.out.println(">> [경고] 아이디가 중복되었거나 아이디를 입력하지 않으셨습니다. 새로운 아이디를 입력하세요!! <<\n");     
							}
							else {
								System.out.println(">> "+ id +" 는 사용가능한 id 입니다.<<"); 
								break;
							}
							
						}// end of for-----------------------
						
						for(;;) {
							System.out.print("\n2.비밀번호 : ");
						    passwd = sc.nextLine();
							
						    if( !MyUtil.isCheckPasswd(passwd) ) {
						    	System.out.println(">> [경고] 비밀번호는 8글자 이상 15글자 이하에 대,소문자,숫자,특수문자가 혼합되어져야만 합니다. <<\n"); 
						    }
						    else {
						    	break;
						    }
						}// end of for------------------------
						
						for(;;) {
							System.out.print("\n3.성명 : ");
						    name = sc.nextLine();
							
						    if( name.trim().isEmpty() ) {
						    	System.out.println(">> [경고] 성명은 필수입력 사항입니다. <<\n"); 
						    }
						    else {
						    	break;
						    }
						}// end of for------------------------
						
						Member mbr = new Member();
						mbr.id = id;
						mbr.passwd = passwd;
						mbr.name = name;
						
						mbrArr[Member.count++] = mbr;
						
						System.out.println(">> 회원가입 성공 !! ["+Member.count+"번째 가입/정원:"+mbrArr.length+"명] << \n"); 
					}
					
					else {
						System.out.println(">> [경고] 정원마감으로 인해 더이상 회원가입이 불가합니다. <<\n"); 
					}
					
					
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
	
					
				case "3": // 모든회원조회
					
					if(login_mbr != null) {
						System.out.println("-------------------------------");
						System.out.println("아이디\t성명\t포인트");
						System.out.println("-------------------------------");
						
						String allMember_info = "";
						for(int i=0; i<Member.count; i++) {
							allMember_info += mbrArr[i].showInfo()+"\n";
						}// end of for--------------------
						
						System.out.println(allMember_info);
					}
					
					else {
						System.out.println(">> [경고] 먼저 로그인 하세요!! << \n"); 
					}
					
					break;
					
				case "4": // 내정보조회	
					
					if(login_mbr != null) {
						System.out.println(login_mbr.showMyInfo()+"\n");
					}
					else {
						System.out.println(">> [경고] 메뉴에 없는 번호 입니다. <<\n");
					}
					
					break;
					
				case "5": // 내정보수정	
					
					if(login_mbr != null) {
						
						System.out.println("\n=== "+login_mbr.name+"님의 회원정보 변경하기 ==="); 
						System.out.println(login_mbr.showMyInfo()+"\n");
						
						String newpasswd = "";
						
						for(;;) {
							System.out.print("\n1.새비밀번호 [비밀번호를 변경하지 않으려면 그냥 엔터하세요] : ");
						    newpasswd = sc.nextLine();
							
						    if("".equals(newpasswd)) { // 그냥 엔터만 했을 경우
						       newpasswd = login_mbr.passwd;
						       break;
						    }
						    else { // 엔터가 아닌 값이 들어온 경우 
						    	if( !MyUtil.isCheckPasswd(newpasswd) ) 
							    	System.out.println(">> [경고] 비밀번호는 8글자 이상 15글자 이하에 대,소문자,숫자,특수문자가 혼합되어져야만 합니다. <<\n"); 
							    
							    else 
							    	break;
						    }
						    
						}// end of for------------------------
						
						login_mbr.passwd = newpasswd;
						
						
						for(;;) {
							System.out.print("\n2.새성명 [성명을 변경하지 않으려면 그냥 엔터하세요] : ");
							String newname = sc.nextLine();
							
						    if( "".equals(newname) )  // 그냥 엔터한 경우
						    	break;
						    	
						    else { // 그냥 엔터가 아닌 값을 입력한 경우 
						    	if( newname.trim().isEmpty() ) 
						    		System.out.println(">> [경고] 성명은 필수입력 사항입니다. <<\n");
						    	
						        else {
						        	login_mbr.name = newname;
						        	break;
						        }
						    }	
						}// end of for------------------------
						
						System.out.println("\n>>> 사용자 정보 변경한 후 알아보기 <<<");
						System.out.println(login_mbr.showMyInfo()+"\n");
						
					}
					else {
						System.out.println(">> [경고] 메뉴에 없는 번호 입니다. <<\n");
					}
					
					break;	
					
				case "6": // 프로그램종료	
					
					break;
					
				default:
					break;
			}// end of switch (key)------------------------------------------
			
		
		} while( !("6".equals(str_menuNo)) );
		
		sc.close();
		
		System.out.println("\n=== 프로그램 종료 ===");
		
	}// end of main()---------------------------------------------------------

}
