package my.day18.a.collection;

import java.util.*;

/*
	=== Map 계열 ===
	1. HashMap 과 Hashtable 이 있다.
	2. Map 계열은 List 계열(Vector, ArrayList, LinkedList)처럼 index 가 사용되어 저장되는 것이 아니라, 
	   Map 계열은 key값과 value값을 쌍으로 사용하여 저장하는데  
	   데이터 저장시 사용되는 메소드는 put(String key, Object value)메소드를 사용한다.
	   이때 key값은 반드시 고유한 값을 가져야 하고, value값은 중복된 값이 와도 괜찮다.
	3. Map 계열에 저장된 key값들은 순서와는 상관없이 저장된다.  
	4. Map 계열에 저장된 value값을 추출하려면 key를 이용해서 가져오는데 
	   value 값의 추출은 get(String key) 메소드를 사용한다. 
*/

public class HashMap_main_4 {

	public static void main(String[] args) {
		
	 //	Map<String, Member> mbrMap = new HashMap<String, Member>();
	 // 또는
	 	Map<String, Member> mbrMap = new HashMap<>(); // JDK 8 이상 부터 가능함. 
	 //	Map<> mbrMap = new HashMap<String, Member>(); // 오류!!
	 //	Map<K, V>
	 	
	 	mbrMap.put("youjs", new Member("youjs","qwer1234$","유재석"));
	 // mbrMap 이라는 HashMap 저장소에 new Member("youjs","qwer1234$","유재석")을 저장하는데 
	 // 저장된 new Member("youjs","qwer1234$","유재석")을 찾고자 할때는 
	 // "youjs" 만 넣어주면 new Member("youjs","qwer1234$","유재석") 이 나오도록 저장하겠다는 말이다. 
	 	
	 	mbrMap.put("eom", new Member("eom","qwer1234$","엄정화"));
	 	mbrMap.put("kanghd", new Member("kanghd","qwer1234$","강호동"));
	 	mbrMap.put("leess", new Member("leess","qwer1234$","이순신"));
	 	mbrMap.put("kimth", new Member("kimth","qwer1234$","김태희"));
	 	mbrMap.put("kangkc",new Member("kangkc","qwer1234$","강감찬"));
	 	
	 	mbrMap.put("kangkc",new Member("kangkc","abcd1234$","에이비시디"));
	 	
	 	System.out.println( mbrMap.get("kangkc").name ); // 에이비시디
	 	// 이미 존재하는 KEY 가 있는데 동일한 KEY 로 put 해버리면 value 에 해당하는 값을 새로운 value 로 덮어씌운다. 
	 	
	 	System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	 	
	 	// === mbrMap 에 저장되어진 모든 key들을 읽어오는 첫번째 방법 === //
	 	Set<String> keySets = mbrMap.keySet();
	 	
	 	for(String key : keySets) {
	 		System.out.println(key);
	 	}
	 	/*
	 	 	eom
			youjs
			kimth
			kangkc
			kanghd
			leess 
	 	 */
	 	
	 	System.out.println("\n#########################\n");
	 	
	 //	String id = "leess";
	 	String id = "leesams";
	 	String passwd = "qwer1234$";
	 	String name = "이삼순";
	 	
	 	Member mbr = new Member(id, passwd, name);
	 	
	 	Set<String> key_sets = mbrMap.keySet();
	 	
	 	boolean isUseKey = true;
	 	for(String key : key_sets) {
	 	    if(id.equals(key)) {
	 	    	isUseKey = false;
	 	    	break;
	 	    }
	 	}// end of for--------------
	 	
	 	if(isUseKey) { 	 	
	 		mbrMap.put(id, mbr);
	 		System.out.println(id + " 으로 회원가입 성공함^^\n");
	 	}	
	 	else 
	 		System.out.println(id + " 은 이미 사용중이므로 다른것으로 바꾸세요~~\n");
	 	
	 	System.out.println(mbrMap.get("leess").name); 
	 	// 이순신
	 	
	 	System.out.println(mbrMap.get("leesams").name); 
		// 이삼순
	 	
	 	
	 	System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	 	
	 // [퀴즈] mbrMap 에 저장되어진 key 가 "eom", "leess", "hongkd" 으로 되어있는 회원들을 모두 출력해보세요. 
	 	
	 	List<String> searchList = new ArrayList<>();
	 	searchList.add("eom");
	 	searchList.add("leess");
	 	searchList.add("hongkd");
	 	
	 	for(int i=0; i<searchList.size(); i++) {
	 		Member membr = mbrMap.get(searchList.get(i));
	 		if(membr != null)
	 			membr.infoPrint();
	 		else
	 			System.out.println("id 가 "+ searchList.get(i) + " 인 회원은 존재하지 않습니다.");
	 	}
	 	/*
		 	 == 엄정화님의 회원정보 == 
			 1.아이디 : eom
			 2.암호 : qwer1234$
			 3.성명 : 엄정화
			
			 == 이순신님의 회원정보 == 
			 1.아이디 : leess
			 2.암호 : qwer1234$
			 3.성명 : 이순신
			
			 id 가 hongkd 인 회원은 존재하지 않습니다. 
	 	*/
	 	
	 	
	 	System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	 	
	 	
	    // === mbrMap 에 저장되어진 모든 key들을 읽어오는 두번째 방법 === //
	 	
	 	Set<String> keySet_2 = mbrMap.keySet();
	 	
	 	Iterator<String> itrator = keySet_2.iterator();
	 	// Iterator 는 저장소가 아니라 Collection 에 저장되어진 요소(Element)를 읽어오는 용도로 쓰이는 것이다.
	 	
	 	while(itrator.hasNext()) {
	 		/*
	 		   itrator.hasNext() 는
	 		   itrator 에서 현재 itrator 가 가지고 있는 여러 String 데이터중
	 		   하나를 끄집어 내서 존재하는지를 알아보는 것이다. 
	 		   존재하면 true, 존재하지 않으면 false 를 리턴해준다.
	 		   그러므로 현재는 키의 개수가 7개 이므로 7번 반복을 할 것이다.  
	 		*/
	 		
	 		String key = itrator.next();
	 		/*
	 		    itrator.next() 이 실제로 키값인 String 값을 itrator 에서 끄집어 낸다.
	 		    이때 중요한 것은 끄집어 낸 키값인 String 값은 더 이상 itrator 에는 남아 있지 않게 된다. 
	 		*/
	 		
	 		System.out.println(key);
	 		
	 	}// end of while------------------------
	 	/*
	 	 	eom
			youjs
			kimth
			kangkc
			kanghd
			leess
			leesams 
	 	 */
	 	
	 	System.out.println("\n~~~~~ 또 한번 더 ~~~~~\n");
	 	
	 	while(itrator.hasNext()) {
	 		String key = itrator.next();
	 		System.out.println(key);
	 	}// end of while------------------------
	 	/*
	 	    itrator 에는 더 이상 String 데이터가 존재하지 않으므로 
	 	    처음부터 itrator.hasNext() 은 false 가 되어진다.
	 	    그래서 아무것도 출력이 되지 않는다.
	 	 */
	 	
	 	System.out.println("\n~~~~~ 다시 처음부터 해본다 ~~~~~\n");
	 	
	 	itrator = keySet_2.iterator();
	 	
	 	while(itrator.hasNext()) {
	 		String key = itrator.next();
	 		System.out.println(key);
	 	}
	 	/*
	 	    eom
			youjs
			kimth
			kangkc
			kanghd
			leess
			leesams 
	 	 */
	 	
	 	System.out.println("\n~~~ [퀴즈] mbrMap 에 저장되어진 모든 회원들의 정보를 출력하세요 ~~~ \n");
	 	
	 	Set<String> keySet = mbrMap.keySet();
	 	
	 	for(String key : keySet) {
	 		mbrMap.get(key).infoPrint();
	 	}
	 	
	 	System.out.println("\n ~~~~~ 또는 ~~~~~~ \n");
	 	
	 	Iterator<String> it = keySet.iterator();
	 	
	 	while(it.hasNext()) {
	 		String key = it.next();
	 		mbrMap.get(key).infoPrint();
	 	}// end of while------------------
	 	

	}// end of main()----------------------------------------

}
