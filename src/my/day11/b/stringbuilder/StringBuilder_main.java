package my.day11.b.stringbuilder;

public class StringBuilder_main {

	public static void main(String[] args) {
		
		String name = "일순신";  // 메모리상에 name 1개 소모 
		name += ",이순신";       // 메모리상에 name 1개 소모
		name += ",삼순신";       // 메모리상에 name 1개 소모
		name += ",사순신";       // 메모리상에 name 1개 소모
		name += ",오순신";       // 메모리상에 name 1개 소모
		name += ",육순신";       // 메모리상에 name 1개 소모
		name += ",칠순신";       // 메모리상에 name 1개 소모
		name += ",팔순신";       // 메모리상에 name 1개 소모
		name += ",구순신";       // 메모리상에 name 1개 소모
		
		                       // 누적되어진 메모리상의 name은 9개 소모된다고 한다. 
		
		System.out.println(name);
		// 일순신,이순신,삼순신,사순신,오순신,육순신,칠순신,팔순신,구순신
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		StringBuilder sb = new StringBuilder();
		// StringBuilder 가 StringBuffer 보다 가볍고 빠르다.
		// StringBuilder 는 단일 쓰레드에서만 사용가능하다.
		// 단일 쓰레드 ==> 웹용
		
	//	StringBuffer sbf = new StringBuffer();
		// StringBuffer 는 StringBuilder 보다 무겁고 다소 느리다.
		// StringBuffer 는 단일 쓰레드 및 다중 쓰레드 둘 모두에서 사용가능하다.
		// 다중 쓰레드 ==> 게임용
		
		sb.append("일순신");
		sb.append(",이순신");
		sb.append(",삼순신");
		sb.append(",사순신");
		sb.append(",오순신");
		sb.append(",육순신");
		sb.append(",칠순신");
		sb.append(",팔순신");
		sb.append(",구순신");
			
		System.out.println(sb.toString());
		// 일순신,이순신,삼순신,사순신,오순신,육순신,칠순신,팔순신,구순신
		
	}// end of main()-----------------------------

}
