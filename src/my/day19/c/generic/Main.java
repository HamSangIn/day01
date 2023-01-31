package my.day19.c.generic;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Box_Employee<Employee_Child_Executive> box_executive =  new Box_Employee<>(); 
		box_executive.register(new Employee_Child_Executive("hansk","1234","한석규","사장","1-01"));  
		box_executive.register(new Employee_Child_Executive("dusk","5678","두석규","전무","2-01"));
		box_executive.register(new Employee_Child_Executive("sesk","0070","세석규","상무","3-01"));  
		
		List<Employee_Child_Executive> executive_list = box_executive.getList(); 
		
		for(Employee_Child_Executive executive : executive_list) {
			System.out.println(executive);
		}
		/*
			== 임직원 ==
			1.아이디 : hansk
			2.비밀번호 : 1234
			3.성명 : 한석규
			4.직급 : 사장
			5.법인카드번호 : 1-01
			
			== 임직원 ==
			1.아이디 : dusk
			2.비밀번호 : 5678
			3.성명 : 두석규
			4.직급 : 전무
			5.법인카드번호 : 2-01
			
			== 임직원 ==
			1.아이디 : sesk
			2.비밀번호 : 0070
			3.성명 : 세석규
			4.직급 : 상무
			5.법인카드번호 : 3-01 
		 */
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		Box_Employee<Employee_Child_Plain> box_plain =  new Box_Employee<>();
		box_plain.register(new Employee_Child_Plain("leess","qwer","이순신","부장",8000)); 
		box_plain.register(new Employee_Child_Plain("emojh","abcd","엄정화","과장",6000)); 
		box_plain.register(new Employee_Child_Plain("hongkd","1234","홍길동","대리",4000)); 

		List<Employee_Child_Plain> plain_list = box_plain.getList();
		
		for(Employee_Child_Plain plain : plain_list) {
			System.out.println(plain);
		}
		/*
			== 일반직원 ==
			1.아이디 : leess
			2.비밀번호 : qwer
			3.성명 : 이순신
			4.직급 : 부장
			5.연봉 : 8000만원
			
			== 일반직원 ==
			1.아이디 : emojh
			2.비밀번호 : abcd
			3.성명 : 엄정화
			4.직급 : 과장
			5.연봉 : 6000만원
			
			== 일반직원 ==
			1.아이디 : hongkd
			2.비밀번호 : 1234
			3.성명 : 홍길동
			4.직급 : 대리
			5.연봉 : 4000만원 
		 */
		
	}// end of main()---------------------------------

}
