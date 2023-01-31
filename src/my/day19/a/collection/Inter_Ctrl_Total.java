package my.day19.a.collection;

import java.util.*;

public interface Inter_Ctrl_Total {

	// 메인 메뉴를 보여주기
	void main_menu();
	
	// Gujikja 객체 및 Company 객체를 List<Member> mbrList 에 저장시키기
	void save_mbrList(Member mbr, List<Member> mbrList);
		
	// 구직자(Gujikja) 신규 회원가입시
	// Gujikja 클래스의 field 의 요구사항에 모두 맞으면 List<Member> mbrList 에 저장시켜주기
	void register_gu(Scanner sc, List<Member> mbrList);
	
	// 구인회사(Company) 신규 회원가입시
	// Company 클래스의 field 의 요구사항에 모두 맞으면 List<Member> mbrList 에 저장시켜주기 
	void register_cp(Scanner sc, List<Member> mbrList);
	
	// 구직자 로그인
	Gujikja login_gu(Scanner sc, List<Member> mbrList);
	
	// 구직자 전용메뉴
	void gu_menu(Scanner sc, Gujikja login_gu, List<Member> mbrList);
	
	// 구인회사 로그인
	Company login_cp(Scanner sc, List<Member> mbrList);
	
	// 구인회사 전용메뉴
	void cp_menu(Scanner sc, Company login_cp, List<Member> mbrList);
	
	
}
