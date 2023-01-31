package my.day18.a.collection;

import java.util.*;

/*
	== ArrayList == 
	1. 출력시 저장된 순서대로 나온다.
	2. 중복된 데이터를 저장할 수 있다.
	3. 데이터를 읽어오는 속도는 ArrayList 가 LinkedList 보다 상대적으로 빠르다.
	4. 순차적으로 데이터를 추가/삭제하는 경우에는 ArrayList 가 LinkedList 보다 상대적으로 빠르다.
	5. 일반적인 데이터 추가/삭제는 데이터 중간 중간마다 발생하므로 이러한 경우에는 ArrayList 가 LinkedList 보다 상대적으로 느리다.
	6. 결과값은 ArrayList 를 사용하든지 LinkedList 를 사용하든지 동일한 결과값을 가진다.
	7. LinkedList 보다는 ArrayList 를 사용하도록 하자.
*/

public class ArrayList_main_2 {

	public static void main(String[] args) {
		
		// 1. Member 클래스의 객체만을 저장할 수 있는 ArrayList 객체 mbrList 를 생성하세요.
		List<Member> mbrList = new ArrayList<>();
		
		// 2. Member 클래스의 객체 6개를 생성하여 mbrList 에 저장하세요.
		mbrList.add(new Member("youjs","qwer1234$","유재석"));
		mbrList.add(new Member("eom","qwer1234$","엄정화"));
		mbrList.add(new Member("kanghd","qwer1234$","강호동"));
		mbrList.add(new Member("leess","qwer1234$","이순신"));
	//	mbrList.add(new Member("kimth","qwer1234$",null));
		mbrList.add(new Member("kimth","qwer1234$","김태희"));
		mbrList.add(new Member("kangkc","qwer1234$","강감찬"));
		
		// 3. mbrList 에 저장되어진 모든 회원들의 정보를 출력하도록
		//    Member 클래스에 정의된 infoPrint() 메소드를 실행하세요.
		
		System.out.println(mbrList.size());  // 6
		
		for(int i=0; i<mbrList.size(); i++) {
			mbrList.get(i).infoPrint();
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		for(Member mbr : mbrList) { // mbrList.size() 만큼 반복한다.
			mbr.infoPrint();
		}
		
		
		System.out.println("\n~~~~~~~~ [퀴즈1] ~~~~~~~~~~~~\n");
		/*
		   [퀴즈1]
		   mbrList 에 저장되어진 Member 객체들 중에서
		   id 값이 "leess" 인 회원만 그 회원의 정보를 출력하세요.  
		*/
		for(int i=0; i<mbrList.size(); i++) {
			if("leess".equals(mbrList.get(i).id))
				mbrList.get(i).infoPrint();
		}
		
		System.out.println("\n-------------------------\n");
		
		// 또는
		for(Member mbr : mbrList) {
			if("leess".equals(mbr.id))
				mbr.infoPrint();
		}
		
		/*
		   == 이순신님의 회원정보 == 
		   1.아이디 : leess
		   2.암호 : qwer1234$
		   3.성명 : 이순신 
		*/
		
		System.out.println("\n~~~~~~~~ [퀴즈2] ~~~~~~~~~~~~\n");
		/*
		   [퀴즈2]
		   mbrList 에 저장되어진 Member 객체들 중에서
		   name 이 "강" 씨인 회원만 그 회원의 정보를 출력하세요.
		   
		   name 이 "서" 씨인 회원만 그 회원의 정보를 출력하세요. 
		   >> 회원중 "서"씨는 없습니다. <<
		*/
		
		String first_name = "강";
	//	String first_name = "서";
		
		boolean flag = false;
	
	/*	
		for(int i=0; i<mbrList.size(); i++) {
			
		   String name = mbrList.get(i).name;  // 유재석  엄정화  강호동  이순신  null  강감찬
		   
		   if( name != null && name.startsWith(first_name)) {
			   mbrList.get(i).infoPrint();
			   flag = true;
		   }
			
		}// end of for---------------------
	*/	
	
	//  또는
		for(Member mbr : mbrList) {
			
			if(mbr.name != null && 
			   mbr.name.startsWith(first_name)) {
				   mbr.infoPrint();
				   flag = true;
			}
		}// end of for---------------------
		
		
		if(!flag)
			System.out.println(">> 회원중 \""+ first_name +"\"씨는 없습니다. <<");
		
		
		
		// *** ArrayList 타입인 mbrList 에 새로운 Member 객체 추가시
		//     특정 index(위치)에 들어가도록 할 수 있다.
		
		System.out.println("\n ~~~~ mbrList 에 새로운 Member 객체 추가하기 ~~~ ");
		
		mbrList.add(new Member("seolh","qwer1234$","설현"));
		// index 값이 없으면 mbrList 의 맨 뒤에 추가된다.
		//          유재석  엄정화  강호동  이순신  김태희  강감찬  설현 
		// index =>   0     1     2     3     4     5     6
		
		System.out.println(mbrList.get(3).name); // 이순신
		System.out.println(mbrList.get(4).name); // 김태희
		System.out.println(mbrList.get(6).name); // 설현
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		mbrList.add(3, new Member("chaew","qwer1234$","차은우"));
		//          3 이 특정 인덱스 이다.
		
		System.out.println(mbrList.get(3).name); // 차은우
		System.out.println(mbrList.get(4).name); // 이순신
		System.out.println(mbrList.get(6).name); // 강감찬
		
		// *** ArrayList 타입인 mbrList 에 저장되어진 Member 객체 삭제하기
		
		System.out.println("\n == ArrayList 타입인 mbrList 에 저장되어진 Member 객체 삭제하기 == \n");
		
		System.out.println(">> 삭제하기 전 mbrList.size() => " + mbrList.size());
		
		mbrList.remove(3);

		System.out.println(">> 삭제한 후 mbrList.size() => " + mbrList.size());
		
		System.out.println(mbrList.get(3).name);
		
		////////////////////////////////////////////////////////////////////
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		mbrList.add(new Member("iyou","qwer1234$","이지은"));
		mbrList.add(new Member("ieemh","qwer1234$","이민호"));
		
		//          유재석  엄정화 강호동  이순신  김태  강감찬   설현  이지은  이민호
		// index =>   0     1     2     3     4     5     6    7      8
		
		System.out.println("\n~~~~~~~~ [퀴즈3] ~~~~~~~~~~~~\n");
		
		/*
			[퀴즈3]
			 mbrList 에 저장되어진 Member 객체들 중에서
		     name 이 "이" 씨인 회원들을 모두 삭제하고
		     삭제한 후  mbrList 에 저장되어진 Member 객체들의 정보를 출력하세요.
		   
		*/
		
			first_name = "이";
			
			for(int i=mbrList.size()-1; i>=0; i--) {
				String name = mbrList.get(i).name;
				
				if(name != null && name.startsWith(first_name)) {
					System.out.println("i=> " +i);
					
					mbrList.remove(i);
				}
				
				System.out.println("mbrList.size() => " + mbrList.size() );
			}// end of for--------------------------------------------------
		for(Member mbr : mbrList) {
			mbr.infoPrint();
		}
		System.out.println("\n ==== mbrList 에 저장된 모든 객체 삭제하기 ==== \n");
		mbrList.clear();
		
		System.out.println("mbrList.size() => " + mbrList.size());
	}// end of main()-----------------------------------

}
