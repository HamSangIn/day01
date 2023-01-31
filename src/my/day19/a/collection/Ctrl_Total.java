package my.day19.a.collection;

import java.util.*;

public class Ctrl_Total implements Inter_Ctrl_Total {

	// === 메인 메뉴를 보여주는 메소드 생성하기 === //
	@Override
	public void main_menu() {
		System.out.println("\n === 메인메뉴 ===\n"
				        + "1.구직자 회원가입   2.구인회사 회원가입   3.구직자 로그인   4.구인회사 로그인\n" 
				        + "5.프로그램 종료\n");
		System.out.print("▷ 메뉴번호 선택 : ");
	}
	
	
	// == Gujikja 객체 및 Company 객체를 List<Member> mbrList 에 저장시키는 메소드 생성하기 == // 
	@Override
	public void save_mbrList(Member mbr, List<Member> mbrList) {
		
		Gujikja gu = null;
		Company cp = null;
		
		if( mbr instanceof Gujikja ) {
			gu = (Gujikja)mbr;
		}
		
		else {
			cp = (Company)mbr;
		}
		
		if( cp == null && gu != null &&
			gu.getId() != null &&
			gu.getPasswd() != null &&
			gu.getName() != null &&
			gu.getJubun() != null ) {
			
			mbrList.add(gu);
			
			System.out.println("[구직자 회원으로 가입 성공함!!]\n");
		}
		
		else if( gu == null && cp != null &&
				 cp.getId() != null &&
				 cp.getPasswd() != null &&
				 cp.getName() != null &&
				 cp.getBusiness_number() != null &&
				 cp.getJobType() != null &&
				 cp.getSeedMoney() > 0 ) {
				
				 mbrList.add(cp);
				
				 System.out.println("[구인회사 회원으로 가입 성공함!!]\n");
		}
		
		else if (cp == null && gu != null) {
			System.out.println("[구직자 회원 가입 실패함!!]\n");
		}
		
		else {
			System.out.println("[구인회사 회원 가입 실패함!!]\n");
		}
		
	}// end of public void save_mbrList(Member mbr, List<Member> mbrList)---------------------

	

	// === 구직자(Gujikja) 신규 회원가입시
	//     Gujikja 클래스의 field 의 요구사항에 모두 맞으면 
	//     List<Member> mbrList 에 저장시켜주는 메소드 생성하기 ===
	@Override
	public void register_gu(Scanner sc, List<Member> mbrList) {
		
		// 아이디는 필수 입력사항이면서 중복된 아이디로 입력하면 안된다.!!
		// 입력받은 아이디가 중복된 아이디가 아닐때 까지 반복해야 한다.
		String id;
		boolean isUseID;
		
		do {
			isUseID = true;
			
			System.out.print("1.아이디 : ");
			id = sc.nextLine(); // "eomjh"  "leess"   "youks"
			
			// == 가입된 구직자 회원들 중에서 중복아이디 검사하기 == //
			if( !id.trim().isEmpty() ) {
				for(int i=0; i<mbrList.size(); i++) {
					if( mbrList.get(i) instanceof Gujikja && id.equals(mbrList.get(i).getId()) ) { 
						System.out.println(">> 이미 사용중인 아이디 입니다. <<\n");
						isUseID = false;
						break;
					}
				}// end of for--------------------
			}
			
			else {  // ""  또는  "        "
				isUseID = false;
			}
			
		} while (!isUseID);
		// end of do ~ while-------------------
		
		
		System.out.print("2.비밀번호 : ");
		String passwd = sc.nextLine();
		
		System.out.print("3.성명 : ");
		String name = sc.nextLine();
		
		System.out.print("4.주민번호 : ");
		String jubun = sc.nextLine();
		
		Gujikja gu = new Gujikja();
		gu.setId(id);
		gu.setPasswd(passwd);
		gu.setName(name);
		gu.setJubun(jubun);
		
		save_mbrList(gu, mbrList);
		
	}// end of public void register_gu(Scanner sc, List<Member> mbrList)--------

	

	// === 구인회사(Company) 신규 회원가입시
	//     Company 클래스의 field 의 요구사항에 모두 맞으면 
	//     List<Member> mbrList 에 저장시켜주는 메소드 생성하기 ===
	@Override
	public void register_cp(Scanner sc, List<Member> mbrList) {
			
		// 아이디는 필수 입력사항이면서 중복된 아이디로 입력하면 안된다.!!
		// 입력받은 아이디가 중복된 아이디가 아닐때 까지 반복해야 한다.
		String id;
		boolean isUseID;
		
		do {
			isUseID = true;
			
			System.out.print("1.아이디 : ");
			id = sc.nextLine(); // "lg"  "samsung"   
			
			// == 가입된 구인회사들 중에서 중복아이디 검사하기 == //
			if( !id.trim().isEmpty() ) {
				for(int i=0; i<mbrList.size(); i++) {
					if( mbrList.get(i) instanceof Company && id.equals(mbrList.get(i).getId()) ) {
						System.out.println(">> 이미 사용중인 아이디 입니다. <<\n");
						isUseID = false;
						break;
					}
				}// end of for--------------------
			}
			
			else {  // ""  또는  "        "
				isUseID = false;
			}
			
		} while (!isUseID);
		// end of do ~ while-------------------
		
		
		System.out.print("2.비밀번호 : ");
		String passwd = sc.nextLine();
		
		System.out.print("3.회사명 : ");
		String name = sc.nextLine();
		
		System.out.print("4.사업자등록번호 : ");
		String businees_number = sc.nextLine();
		
		System.out.print("5.회사직종타입 : ");
		String jobType = sc.nextLine();
		
		System.out.print("6.자본금 : ");
		String seedMoney = sc.nextLine();
		
		Company cp = new Company();
		cp.setId(id);
		cp.setPasswd(passwd);
		cp.setName(name);
		cp.setBusiness_number(businees_number);
		cp.setJobType(jobType);
		cp.setSeedMoney(Long.parseLong(seedMoney));
		
		save_mbrList(cp, mbrList);
		
	}// end of public void register_cp(Scanner sc, List<Member> mbrList)-------


	// == 구직자 로그인 메소드 생성하기 ==
	@Override
	public Gujikja login_gu(Scanner sc, List<Member> mbrList) {
		
		System.out.print("▷ 구직자 ID : ");
		String id = sc.nextLine();
		
		System.out.print("▷ 비밀번호 : ");
		String passwd = sc.nextLine();
		
		for(int i=0; i<mbrList.size(); i++) {
			
			if( mbrList.get(i) instanceof Gujikja && 
				id.equals(mbrList.get(i).getId()) &&
				passwd.equals(mbrList.get(i).getPasswd()) ) {
				
				return (Gujikja) mbrList.get(i);
			}
			
		}// end of for---------------------
		
		return null;
	}// end of public Gujikja login_gu(Scanner sc, List<Member> mbrList)--------------


	// == 구직자 전용메뉴 메소드 생성하기 ==  
	@Override
	public void gu_menu(Scanner sc, Gujikja login_gu, List<Member> mbrList) {
		
		String str_menuno = "";
		
		do {
			System.out.println("=== 구직자 전용메뉴("+ login_gu.getName() +"님 로그인중) ===\n"
					         + "1.내정보 보기   2.내정보 수정   3.모든구인회사 조회   4.로그아웃\n");
			
			System.out.print("▷ 메뉴번호 선택 : ");
			str_menuno = sc.nextLine();
			
			switch (str_menuno) {
				case "1": // 내정보 보기
					show_myInfo(login_gu);
					break;
					
				case "2": // 내정보 수정
					update_myInfo(sc, login_gu);
					break;
					
				case "3": // 모든구인회사 조회
					show_all_companyInfo(mbrList);
					break;
					
				case "4": // 로그아웃
					login_gu = null;
					break;					
	
				default:
					System.out.println("[경고] 메뉴에 있는 번호만 선택하세요!! \n"); 
					break;
			}// end of switch (key)---------------
			
		} while ( !("4".equals(str_menuno)) );
		
		System.out.println(">> 로그아웃 되었습니다. << \n");
		
	}// end of public void gu_menu(Scanner sc, Gujikja login_gu, List<Member> mbrList)---------------
    	
	

	// == 내정보 보기를 해주는 메소드 생성하기 == //
	private void show_myInfo(Gujikja login_gu) {
		
		System.out.println("\n==="+ login_gu.getName() +"님의 정보 ==="); 
	//	System.out.println(login_gu.toString());
	//  또는	
		System.out.println(login_gu);
	}// end of private void show_myInfo(Gujikja login_gu)--------------
	
	
	// == 내정보 수정을 해주는 메소드 생성하기 == 
	private void update_myInfo(Scanner sc, Gujikja login_gu) {
		
		show_myInfo(login_gu);
		
		System.out.println(">> [주의사항] 변경하지 않고 예전의 데이터값을 사용하시려면 그냥 엔터하세요!!");
		
		System.out.print("1.비밀번호 : ");
		String passwd = sc.nextLine();
		
		System.out.print("2.성명 : ");
		String name = sc.nextLine();
		
		System.out.print("3.주민번호 : ");
		String jubun = sc.nextLine();
		
		System.out.print("4.희망연봉 : ");
		String hope_money = sc.nextLine();
		
		System.out.println("");
		
		if( !"".equals(passwd) ) {  
			login_gu.setPasswd(passwd);
		}
		
		if( !"".equals(name) ) {  
			login_gu.setName(name);
		}
		
		if( !"".equals(jubun) ) {  
			login_gu.setJubun(jubun);
		}
		
		if( !"".equals(hope_money) ) {  
			login_gu.setHope_money(Integer.parseInt(hope_money));
		}
		
	}// end of private void update_myInfo(Scanner sc, Gujikja login_gu)-------

	
	
	// == 모든구인회사 조회 해주는 메소드 생성하기 == //
	private void show_all_companyInfo(List<Member> mbrList) {
		
		int company_count = 0;
		
		for(int i=0; i<mbrList.size(); i++) {
			if(mbrList.get(i) instanceof Company) {
				company_count++;
				break;
			}
		}
		
		
		if(company_count == 0) {
			System.out.println(">> 구인회사로 등록된 회사가 한개도 없습니다. <<\n");
		}
		
		else {
			System.out.println("========================================\n"
					         + "회사명      업종    사업자등록번호      자본금 \n"
					         + "========================================");
			
			StringBuilder sb = new StringBuilder();
			
			for(int i=0; i<mbrList.size(); i++) {
				if( mbrList.get(i) instanceof Company ) {
					sb.append(mbrList.get(i).view_info()+"\n");
				}
			}// end of for---------------------
			
		//	System.out.println(sb.toString());
		//  또는	
			System.out.println(sb);
		}
	}// end of private void show_all_companyInfo(List<Member> mbrList)------


	// == 구인회사 로그인 해주는 메소드 생성하기 ==
	@Override
	public Company login_cp(Scanner sc, List<Member> mbrList) {
		
		System.out.print("▷ 구인회사 ID : ");
		String id = sc.nextLine();
		
		System.out.print("▷ 비밀번호 : ");
		String passwd = sc.nextLine();
		
		for(int i=0; i<mbrList.size(); i++) {
			
			if( mbrList.get(i) instanceof Company && 
				id.equals(mbrList.get(i).getId()) &&
				passwd.equals(mbrList.get(i).getPasswd()) ) {
				
				return (Company) mbrList.get(i);
			}
			
		}// end of for---------------------
		
		return null;		
		
	}// end of public Company login_cp(Scanner sc, List<Member> mbrList)-----


	// == 구인회사 전용메뉴를 생성해주는 메소드 생성하기 == //
	@Override
	public void cp_menu(Scanner sc, Company login_cp, List<Member> mbrList) {

		String str_menuno;
		
		do {
			System.out.println("=== 구인회사 전용메뉴("+ login_cp.getName() +"님 로그인중) ===\n"
					        + "1.회사정보 보기   2.회사정보 수정    3.모든구직자 조회   4.성별검색 \n"
					        + "5.연령대검색     6.성별 및 연령대검색  7.로그아웃 \n");
			
			System.out.print("▷ 메뉴번호 선택 : ");
			str_menuno = sc.nextLine();
			
			switch (str_menuno) {
				case "1": // 회사정보 보기
					show_mycompanyInfo(login_cp);	
					break;
					
				case "2": // 회사정보 수정
					update_mycompanyInfo(sc, login_cp);
					break;
					
				case "3": // 모든구직자 조회
					show_all_gujikja(mbrList);
					break;
					
				case "4": // 성별검색
					search_gender(sc, mbrList);
					break;	
					
				case "5": // 연령대검색
					search_ageline(sc, mbrList);
					break;	
					
				case "6": // 성별 및 연령대검색
					search_gender_ageline(sc, mbrList);
					break;	
					
				case "7": // 로그아웃
					login_cp = null;
					break;						
		
				default:
					System.out.println("[경고] 메뉴에 있는 번호만 선택하세요!!\n");
					break;
			}// end of switch (str_menuno)-------------------------
			
		} while(!"7".equals(str_menuno));
		
		System.out.println(">> 로그아웃 되었습니다. << \n");				
		
	}// end of public void cp_menu(Scanner sc, Company login_cp, List<Member> mbrList)-------


	// 회사정보 보기 메소드 생성하기 
	private void show_mycompanyInfo(Company login_cp) {

		System.out.println("\n=== "+ login_cp.getName() +"님의 정보 ==="); 
		System.out.println(login_cp.myinfo()+"\n");
	}// end of private void show_mycompanyInfo(Company login_cp)-------
	
	
	// 회사정보 수정 메소드 생성하기 
	private void update_mycompanyInfo(Scanner sc, Company login_cp) {
		
		show_mycompanyInfo(login_cp);
		
		System.out.println(">> [주의사항] 변경하지 않고 예전의 데이터값을 사용하시려면 그냥 엔터하세요!!");
		
		System.out.print("1.비밀번호 : ");
		String passwd = sc.nextLine();
		
		System.out.print("2.성명 : ");
		String name = sc.nextLine();
		
		System.out.print("3.사업자등록번호 : ");
		String business_number = sc.nextLine();
		
		System.out.print("4.회사직종타입 : ");
		String jobType = sc.nextLine();
		
		System.out.print("5.자본금 : ");
		String seedMoney = sc.nextLine();
		
		System.out.println("");
		
		if( !"".equals(passwd) ) {  
			login_cp.setPasswd(passwd);
		}
		
		if( !"".equals(name) ) {  
			login_cp.setName(name);
		}
		
		if( !"".equals(business_number) ) {  
			login_cp.setBusiness_number(business_number);
		}
		
		if( !"".equals(jobType) ) {  
			login_cp.setJobType(jobType);
		}
		
		if( !"".equals(seedMoney) ) {  
			login_cp.setSeedMoney(Long.parseLong(seedMoney));
		}
		
	}// end of private void update_mycompanyInfo(Scanner sc, Company login_cp)-------
		
		
	// 모든구직자 조회 메소드 생성하기 
	private void show_all_gujikja(List<Member> mbrList) {
		
		int gujikja_count = 0;
		
		for(int i=0; i<mbrList.size(); i++) {
			if(mbrList.get(i) instanceof Gujikja) {
				gujikja_count++;
				break;
			}
		}
		
		
		if(gujikja_count == 0) {
			System.out.println(">> 등록된 구직자가 한명도 없습니다. <<\n");
		}
		
		else {
			System.out.println("=========================================================\n"
					         + "구직자명  성별   나이         가입일자                 희망연봉 \n"
					         + "=========================================================");
			
			StringBuilder sb = new StringBuilder();
			
			for(int i=0; i<mbrList.size(); i++) {
				if( mbrList.get(i) instanceof Gujikja ) {
					
					String temp_info = mbrList.get(i).view_info();
				//	temp_info ==> eomjh   qwer******    엄정화   여      29   2023-01-17 15:30:20   5,000만원 
					
					int index_tab = temp_info.indexOf("\t");
					temp_info = temp_info.substring(index_tab+1);
					
					index_tab = temp_info.indexOf("\t");
					temp_info = temp_info.substring(index_tab+1);
					
					sb.append(temp_info+"\n");
				}
			}// end of for---------------------
			
		//	System.out.println(sb.toString());
		//  또는	
			System.out.println(sb);
		}		
		
	}// end of private void show_all_gujikja(List<Member> mbrList)-------
		
		
	// 성별검색 메소드 생성하기 
	private void search_gender(Scanner sc, List<Member> mbrList) {
		
		do { 
			System.out.print("▷성별[남/여] : ");
			String gender = sc.nextLine();
			gender = gender.trim();
			
			if( "남".equals(gender) || "여".equals(gender) ) { 
				
				int gender_count = 0;
				
				for(int i=0; i<mbrList.size(); i++) {
					if(mbrList.get(i) instanceof Gujikja &&
					   gender.equals( ((Gujikja) mbrList.get(i)).getGender() ) ) {
						  gender_count++;	
						  break;
					}
				}// end of for-------------------
				
				if(gender_count == 0) {
					System.out.println(">> 등록된 구직자중 "+ gender +"자는 한명도 없습니다. <<\n");
				}
				
				else {
						System.out.println("=========================================================\n"
						                 + "구직자명  성별   나이         가입일자                 희망연봉 \n"
						                 + "=========================================================");
						
						StringBuilder sb = new StringBuilder();
						
						for(int i=0; i<mbrList.size(); i++) {
							if( mbrList.get(i) instanceof Gujikja &&
								gender.equals( ((Gujikja) mbrList.get(i)).getGender() ) ) {
								
								String temp_info = mbrList.get(i).view_info();
								int index_tab = temp_info.indexOf("\t");
								temp_info = temp_info.substring(index_tab+1);
								
								index_tab = temp_info.indexOf("\t");
								temp_info = temp_info.substring(index_tab+1);
								
								sb.append(temp_info+"\n");
							}
						}// end of for---------------------
						
					//	System.out.println(sb.toString());
					//  또는	
						System.out.println(sb);
				}
				
				break;
			}
			
			else {
				System.out.println(">> [경고] 성별은 남 또는 여 만 가능합니다!!\n");
			}
			
		} while(true);
		
	}// end of private void search_gender(Scanner sc, List<Member> mbrList)------
		
		
	// 연령대검색	
	private void search_ageline(Scanner sc, List<Member> mbrList) {
		
		do { 
			System.out.print("▷연령대 : ");
			String str_ageline = sc.nextLine();
			
			try {
				int ageline = Integer.parseInt(str_ageline);
				
				if(ageline < 0) {
					System.out.println(">> [경고] 연령대는 음수가 안됩니다!!\n");
				}
				
				else {
					int ageline_count = 0;
					
					for(int i=0; i<mbrList.size(); i++) {
						if(mbrList.get(i) instanceof Gujikja &&
						   ageline == ((Gujikja) mbrList.get(i)).getAge()/10*10 ) {
							  ageline_count++;	
							  break;
						}
					}
					
					if(ageline_count == 0) {
						System.out.println(">> 등록된 구직자중 "+ ageline +"대는 한명도 없습니다. <<\n");
					}
					
					else {
							System.out.println("=========================================================\n"
							                 + "구직자명  성별   나이         가입일자                 희망연봉 \n"
							                 + "=========================================================");
							
							StringBuilder sb = new StringBuilder();
							
							for(int i=0; i<mbrList.size(); i++) {
								if( mbrList.get(i) instanceof Gujikja &&
								    ageline == ((Gujikja) mbrList.get(i)).getAge()/10*10 ) {
									
									String temp_info = mbrList.get(i).view_info();
									int index_tab = temp_info.indexOf("\t");
									temp_info = temp_info.substring(index_tab+1);
									
									index_tab = temp_info.indexOf("\t");
									temp_info = temp_info.substring(index_tab+1);
									
									sb.append(temp_info+"\n");
								}
							}// end of for---------------------
							
						//	System.out.println(sb.toString());
						//  또는	
							System.out.println(sb);
					}
					
					break;
				}
				
			} catch(NumberFormatException e) {
				System.out.println(">> [경고] 연령대는 정수로만 입력하세요!!\n"); 
			}
			
		} while(true);
		
	}// end of private void search_ageline(Scanner sc, List<Member> mbrList)-------
	
	
	// 성별 및 연령대검색 메소드 생성하기
	private void search_gender_ageline(Scanner sc, List<Member> mbrList) {
		
		// 풀이 안합니다. ~~~
		
	}// end of private void search_gender_ageline(Scanner sc, List<Member> mbrList)------

	
}
