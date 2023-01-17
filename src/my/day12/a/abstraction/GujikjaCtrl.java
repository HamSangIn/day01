package my.day12.a.abstraction;

import java.util.Scanner;

import my.util.MyUtil;

public class GujikjaCtrl {

	// == 메인 메뉴를 보여주는 메소드 생성하기 == //
	void main_menu() {
		System.out.println("\n=== 메인메뉴 === \n"
		               + " 1.구직자 회원가입  2.구직자 모두 보기  3.검색  4.프로그램 종료 \n"); 

		System.out.print("▷ 메뉴번호 선택 => ");
	}

	// == 구직자(Gujikja) 신규 회원가입시
	//    Gujikja 클래스의 field 의 요구사항에 모두 맞으면
	//    Gujikja[] guArr 에 저장시켜주는 메소드 생성하기 ==
	void register(Scanner sc, Gujikja[] guArr) {
		
		if( Gujikja.count < guArr.length ) {
			
			String userid;
			String passwd;
			String name;
			String jubun;
			
			// 아이디는 필수 입력사항이면서 중복된 아이디로 입력하면 안된다.!!
			// 입력받은 아이디가 중복된 아이디가 아닐때 까지 반복해야 한다.
			boolean isUseID;
			
			do {
				isUseID = true;
				
				System.out.print("1. 아이디 : ");
				userid = sc.nextLine(); // "eomjh" "leess"  "youks"
				                        // "hongkd"
				                        // ""  
				                        // "          "
				
				// == 가입된 회원들에 대해 중복아이디 검사하기 == //
				if( !userid.trim().isEmpty() ) {
					for(int i=0; i<Gujikja.count; i++) {
						if( userid.equals(guArr[i].userid) ) {
							System.out.println(">> 이미 사용중인 아이디 입니다. << \n"); 
							isUseID = false;
							break;
						}
					}// end of for---------------------------
				}
				
				else { // "" 또는 "          "
					System.out.println(">> 아이디는 필수 입력사항 입니다. << \n"); 
					isUseID = false;
				}
				
			} while (!isUseID);
			// end of do~while-------------------------
			
			
			// 비밀번호는 필수 입력사항이면서 비밀번호 조건에 맞을때 까지 반복해야 한다.
			boolean isUsePasswd;
			
			do {
				isUsePasswd = true;
				
				System.out.print("2. 비밀번호 : ");
				passwd = sc.nextLine(); // "qW12$" "qwer1234$"  
				                        // "qWer1234$"
				
				// 비밀번호 조건에 맞는지 아닌지를 검사한다.
				if( !MyUtil.isCheckPasswd(passwd) ) {
					System.out.println(">> [경고] 비밀번호는 8글자 이상 15글자 이하의 대,소문자,숫자,특수기호가 혼합되어야만 합니다. \n"); 
					isUsePasswd = false;
				}
				
			} while (!isUsePasswd);
			// end of do~while-------------------------
			
			
			// 성명은 필수 입력사항이므로 그냥 엔터나 공백만으로 된것이 아닐때 까지 반복해야 한다.
			boolean isUseName;
			
			do {
				isUseName = true;
				
				System.out.print("3. 성명 : ");
				name = sc.nextLine(); // ""  "         "  
				                      // "홍길동"
				
				// 입력받은 성명이 그냥 엔터인지 또는 공백만으로 이루져 있는지를 검사한다.
				if( name.trim().isEmpty() ) {
					System.out.println(">> [경고] 성명은 공백만으로 된것이 아닌 데이터를 입력해야 합니다. \n"); 
					isUseName = false;
				}
				
			} while (!isUseName);
			// end of do~while-------------------------
			
			
			// 주민번호는 필수 입력사항이면서 주민번호 조건에 맞을때 까지 반복해야 한다.
			boolean isUseJubun;
			
			do {
				isUseJubun = true;
				
				System.out.print("4. 주민번호 : ");
				jubun = sc.nextLine(); // "95abcd1" "9513562"  "9501179" ==> 꽝!!  
				                       // "9501171" "9501172"  "0101173"  "0201174" ==> 정상   
				
				// 주민번호 조건에 맞는지 아닌지를 검사한다.
				if( !MyUtil.isCheckJubun(jubun) ) {
					System.out.println(">> [경고] 올바른 주민번호를 입력하세요!! \n"); 
					isUseJubun = false;
				}
				
			} while (!isUseJubun);
			// end of do~while-------------------------
			
			
			Gujikja gu = new Gujikja();
			gu.userid = userid;
			gu.passwd = passwd;
			gu.name = name;
			gu.jubun = jubun;
			
			guArr[Gujikja.count++] = gu;
			
			System.out.println(">> 구직자 회원가입 성공!! << \n");
			
		}
		
		else {
			System.out.println(">> 정원 "+ guArr.length +"명이 초과하여 구직자 회원가입이 불가합니다.!! << \n"); 
		}
	}// end of void register(Scanner sc, Gujikja[] guArr)---------

	
	// === 구직자 모두보기 메소드 ===
	void showAll_info(Gujikja[] guArr) {
		
	/*
	     ---------------------------------------------------
	      아이디    비밀번호       성명    성별    현재나이   가입일자
	     ---------------------------------------------------
	      eomjh   qWer*****    엄정화   여      27           
	      leess   abCd******   이순신   남      31           
	      chaew   aSdf*****    차은우   남      22           
	*/
		
		if( Gujikja.count == 0 ) {
			System.out.println(">> 구직자로 가입된 회원이 아무도 없습니다. << \n"); 
		}
		
		else {
			title();
			StringBuilder sb = new StringBuilder();
			
			for(int i=0; i<Gujikja.count; i++) {
				sb.append( guArr[i].getInfo() + "\n");
			}// end of for----------------------
			System.out.println(sb.toString());
		}
		
		
	}// end of void showAll_info(Gujikja[] guArr)--------------- 
	
	
	void title() {
		System.out.println("===============================================\n"
				         + " 아이디   비밀번호      성명   성별   현재나이   가입일자 \n"
				         + "===============================================");
		
	}// end of void title()----------------------------
	
	
	
}
