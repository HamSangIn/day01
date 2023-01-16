package my.day11.a.string;

import java.text.DecimalFormat;

import my.util.MyUtil;

public class StringMain {

	public static void main(String[] args) {
		
		// === 1. "문자열".charAt(int index) ===
		//         "안녕하세요".charAt(2) ==> '하'
		// index => 01234 
		
		char ch = "안녕하세요".charAt(2);
		System.out.println("ch => " + ch);
        // ch => 하
		
		String str = "안녕하세요";
	    //  index =>  01234	
		
		String result = "";
		for(int i=str.length()-1; i>=0; i--) {
			result += str.charAt(i);
		}
		
		System.out.println(result);
		// 요세하녕안
		
		
		
		// === 2. "문자열".toCharArray() ===
		// "안녕하세요".toCharArray() ==> char 타입의 배열로 만들어준다.
		// -----------------------
		// |'안'|'녕'|'하'|'세'|'요'|
		// -----------------------
		//   0   1    2   3    4  <== index
		
		char[] chArr = "안녕하세요".toCharArray();
		result = "";
		
		for(int i=chArr.length-1; i>=0; i--) {
			result += chArr[i];
		}
		
		System.out.println(result);
		// 요세하녕안
		
		
		
		// === 3. "문자열".substring(int 시작인덱스, int 끝인덱스) ===
		// "안녕하세요".substring(1, 4) ==> 1번 인덱스인 "녕" 부터 4번 인덱스 앞에까지인 "세" 까지만 뽑아온다.   
		//  01234
		str = "안녕하세요".substring(1, 4);
		System.out.println(str);
		// 녕하세
		
		str = "안녕하세요";
		System.out.println(str.substring(2, str.length()) );
		// 하세요
		
		
		
		// === 4. "문자열".substring(int 시작인덱스) ===
		// "안녕하세요".substring(2) ==> 2번 인덱스인 "하" 부터 끝까지 뽑아온다.   
		//  01234
		str = "안녕하세요".substring(2);
		System.out.println(str);
		// 하세요
		
		
		
		// === 5. "문자열".indexOf("찾을문자열") ===
		//        "문자열" 에서 최초로 나오는 "찾을문자열"의 인덱스(int)를 알려준다.
		int index = "시작하라 안녕하세요 건강하세요".indexOf("하");
		          // 012
		System.out.println(index); // 2
		
		index = "시작하라 안녕하세요 건강하세요".indexOf("하세");
              // 01234567
		System.out.println(index); // 7
		
		index = "시작하라 안녕하세요 건강하세요".indexOf("A");
	    System.out.println(index); // -1  찾고자 하는 문자열이 없으면 -1 이 나온다. 
	    
		// === [퀴즈] === //
	    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	    
	    String[] fileNameArr = {"C:/mydocument/resume/나의이력서.hwp",
	    		                "D:/mymusic.mp3",
	    		                "C:/photo/내얼굴.jpg"};
	    
	    for(int i=0; i<fileNameArr.length; i++) {
	    	System.out.println(fileNameArr[i]);
	    }// end of for-------------------
	    /*
	        C:/mydocument/resume/나의이력서.hwp
			D:/mymusic.mp3
			C:/photo/내얼굴.jpg 
	    */
	    
	    System.out.println("\n==== 파일명만 뽑아온 결과물 ====");
	    
	    for(int i=0; i<fileNameArr.length; i++) {
	    	
	    	char[] chrArr = fileNameArr[i].toCharArray();
	    	
	    	String str_reverse = "";
	    	for(int j=chrArr.length-1; j>=0; j--) {
	    		str_reverse += chrArr[j];
	    	}
	    	
	    	// System.out.println(str_reverse);
	    	/*
	    	   pwh.서력이의나/emuser/tnemucodym/:C
			   3pm.cisumym/:D
			   gpj.굴얼내/otohp/:C
	    	*/
	    	
	    	// System.out.println( str_reverse.substring(0, str_reverse.indexOf("/")) ); 
	    	
	    	/*
	    	   pwh.서력이의나
	    	   3pm.cisumym
	    	   gpj.굴얼내 
	    	 */
	    	
	    	chrArr = str_reverse.substring(0, str_reverse.indexOf("/")).toCharArray(); 
	    	
	    	String output = "";
	    	for(int j=chrArr.length-1; j>=0; j--) {
	    		output += chrArr[j];
	    	}
	    	
	    	System.out.println(output);
	    	
	    }// end of for------------------------
	    /*
	        나의이력서.hwp
	        mymusic.mp3
	        내얼굴.jpg
		*/
	    
	    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	    
	    
	    // === 6. "문자열".lastIndexOf("찾을문자열") ===
	 	//        "문자열" 에서 마지막으로 나오는 "찾을문자열"의 인덱스(int)를 알려준다.
	 	index = "시작하라 안녕하세요 건강하세요".lastIndexOf("하");
	 		  // 012
	    System.out.println(index); // 13
	 		
	 	index = "시작하라 안녕하세요 건강하세요".lastIndexOf("하세");
	          // 01234567
	 	System.out.println(index); // 13
	 		
	 	index = "시작하라 안녕하세요 건강하세요".lastIndexOf("A");
	 	System.out.println(index); // -1  찾고자 하는 문자열이 없으면 -1 이 나온다. 
	    
	    // === [퀴즈] === //
	 	/*
	        C:/mydocument/resume/나의이력서.hwp
			D:/mymusic.mp3
			C:/photo/내얼굴.jpg 
	    */
	 	for(int i=0; i<fileNameArr.length; i++) {
	 		System.out.println( fileNameArr[i].substring( fileNameArr[i].lastIndexOf("/")+1 )); 
	 	}// end of for-----------------
	 	
	 	
	 	System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	 	
	 	// === [퀴즈] === //
	 	String money = "2,000,000"; 
	 	
	 	// indexOf 와 substring 만 사용하여 구해보세요.
	 	
	 	// "2,000,000" 에서 "2,000,000".indexOf(",") 를 하면 최초로 "," 가 나오는 index 값이 나온다. 즉, 1 이 나온다. 
	 	// "2" + "000,000" ==> "2000,000"
	 	// "2"       ==> "2,000,000".substring(0,1) ==> "2"
	 	// "000,000" ==> "2,000,000".substring(1+1) ==> "000,000"
	 	
	 	// "2000,000" 에서 "2000,000".indexOf(",") 를 하면 최초로 "," 가 나오는 index 값이 나온다. 즉, 4 가 나온다. 
	 	// "2000" + "000"  ==> "2000000"
	 	// "2000"    ==> "2000,000".substring(0,4) ==> "2000"
	 	// "000"     ==> "2000,000".substring(4+1) ==> "000"
	 	
	 	// "2000000" 에서 "2000000".indexOf(",") 를 하면 최초로 "," 가 나오는 index 값이 나온다. 지금은 "," 가 없으므로 -1 이 나온다. 
	 	
	 	do {
	 		int index_comma = money.indexOf(",");
	 		
	 		if(index_comma == -1)
	 			break;
	 		
	 		money = money.substring(0, index_comma) + money.substring(index_comma+1);
	 		
		} while (true);
	 	// end of do~while-------------------------
	 	
	 	System.out.println(money);
	 	// "2000000"
	 	
	 	long sum = MyUtil.delComma("2,000,000") + MyUtil.delComma("5,000") + MyUtil.delComma("100");
	 	//  2000000 + 5000 + 100 
	 	//  2005100
	 	
	 	DecimalFormat df = new DecimalFormat("#,###");
	 	System.out.println(df.format(sum)); 
	 	// "2,005,100"
	 	
	 	
	 	
	    // === 7. "문자열".split("구분자") ===
	 	//        "문자열" 을 "구분자" 로 잘라서 String 타입의 배열로 돌려주는 것이다. 
	 	System.out.println("\n 1.=========================== \n");
	 	
	 	String food = "파스타,국밥,볶음밥,고구마,계란말이";
	 	
	 	String[] foodArr = food.split(",");
	 	// {"파스타","국밥","볶음밥","고구마","계란말이"}
	 	
	 	System.out.println("foodArr.length => " + foodArr.length);
	 	// foodArr.length => 5
	 	
	 	for(int i=0; i<foodArr.length; i++) {
	 		System.out.println(foodArr[i]);
	 	}
	 	/*
	 	    파스타
			국밥
			볶음밥
			고구마
			계란말이 
	 	 */
	 	
	 	System.out.println("\n 2.=========================== \n");
	 	
	 	food = "파스타	국밥	볶음밥	고구마	계란말이";
	 	
	 	foodArr = food.split("\t");
	 	// {"파스타","국밥","볶음밥","고구마","계란말이"}
	 	
	 	System.out.println("foodArr.length => " + foodArr.length);
	    // foodArr.length => 5
	 	
	 	for(int i=0; i<foodArr.length; i++) {
	 		System.out.println(foodArr[i]);
	 	}
	 	/*
	 	    파스타
			국밥
			볶음밥
			고구마
			계란말이 
	 	 */
	 	
	 	
	 	System.out.println("\n 3.=========================== \n");
	 	
	 	food = "파스타.국밥.볶음밥.고구마.계란말이";
	 	
	 	foodArr = food.split(".");
	 	
	 	System.out.println("foodArr.length => " + foodArr.length);
	    // foodArr.length => 0
	 	// 즉  . 단독만으로는 구분자로 인식을 못 함
	 	// split 사용시 구분자로 . | / 등 특수문자를 사용하려고 할 경우에는 구분자로 인식을 못할 경우가 많으므로 
	 	// 구분자 앞에 \\ 를 붙이거나 구분자를 [] 로 씌워주면 된다.
	 	// 즉, \\구분자  이거나  [구분자] 이렇게 해야 한다.
	 	
        foodArr = food.split("\\.");
        // {"파스타","국밥","볶음밥","고구마","계란말이"}
	 	
	 	System.out.println("foodArr.length => " + foodArr.length);
	    // foodArr.length => 5
	 	
	 	for(int i=0; i<foodArr.length; i++) {
	 		System.out.println(foodArr[i]);
	 	}
	 	/*
	 	    파스타
			국밥
			볶음밥
			고구마
			계란말이 
	 	 */
	 	
	 	foodArr = food.split("[.]");
        // {"파스타","국밥","볶음밥","고구마","계란말이"}
	 	
	 	System.out.println("foodArr.length => " + foodArr.length);
	    // foodArr.length => 5
	 	
	 	for(int i=0; i<foodArr.length; i++) {
	 		System.out.println(foodArr[i]);
	 	}
	 	/*
	 	    파스타
			국밥
			볶음밥
			고구마
			계란말이 
	 	 */
	 	
        System.out.println("\n 4.=========================== \n");
	 	
	 	food = "파스타|국밥|볶음밥|고구마|계란말이";
	 	
	 //	foodArr = food.split("\\|");
	 // 또는 
	 	foodArr = food.split("[|]");
	 	// {"파스타","국밥","볶음밥","고구마","계란말이"}
	 	
	 	System.out.println("foodArr.length => " + foodArr.length);
	 	// foodArr.length => 5
	 	
	 	for(int i=0; i<foodArr.length; i++) {
	 		System.out.println(foodArr[i]);
	 	}
	 	/*
	 	    파스타
			국밥
			볶음밥
			고구마
			계란말이 
	 	 */
	 	
	 	
	 	System.out.println("\n 5.=========================== \n");
	 	
	 	food = "파스타,국밥.볶음밥	고구마,계란말이";
	 	
	 	foodArr = food.split("\\,|\\.|\\t");
	 	// {"파스타","국밥","볶음밥","고구마","계란말이"}
	 	
	 	System.out.println("foodArr.length => " + foodArr.length);
	 	// foodArr.length => 5
	 	
	 	for(int i=0; i<foodArr.length; i++) {
	 		System.out.println(foodArr[i]);
	 	}
	 	/*
	 	    파스타
			국밥
			볶음밥
			고구마
			계란말이 
	 	 */
	 	
	 	
	 	System.out.println("\n 6.=========================== \n");
	 	
	 	food = "파스타,국밥.볶음밥	고구마|계란말이";
	 	
	 	foodArr = food.split("\\,|\\.|\\t|\\|");
	 	// {"파스타","국밥","볶음밥","고구마","계란말이"}
	 	
	 	System.out.println("foodArr.length => " + foodArr.length);
	 	// foodArr.length => 5
	 	
	 	for(int i=0; i<foodArr.length; i++) {
	 		System.out.println(foodArr[i]);
	 	}
	 	/*
	 	    파스타
			국밥
			볶음밥
			고구마
			계란말이 
	 	 */
	 	
	 	
	 	System.out.println("\n 7.=========================== \n");
	 	
	 	food = "파스타,국밥.볶음밥	고구마|계란말이";
	 	
	 	foodArr = food.split("[,.\t|]");
	 	// {"파스타","국밥","볶음밥","고구마","계란말이"}
	 	
	 	System.out.println("foodArr.length => " + foodArr.length);
	 	// foodArr.length => 5
	 	
	 	for(int i=0; i<foodArr.length; i++) {
	 		System.out.println(foodArr[i]);
	 	}
	 	/*
	 	    파스타
			국밥
			볶음밥
			고구마
			계란말이 
	 	 */
	 	
	 	
        System.out.println("\n 8.=========================== \n");
	 	
	 	food = "파스타1국밥2볶음밥3고구마4계란말이";
	 	
	 	foodArr = food.split("\\d");
	 	//  \\d 에서 d는 정규표현식의 하나로써 숫자를 의미한다. 
	 	//  즉, 숫자가 구분자가 되는 것이다.
	 	
	 	// {"파스타","국밥","볶음밥","고구마","계란말이"}
	 	
	 	System.out.println("foodArr.length => " + foodArr.length);
	 	// foodArr.length => 5
	 	
	 	for(int i=0; i<foodArr.length; i++) {
	 		System.out.println(foodArr[i]);
	 	}
	 	/*
	 	    파스타
			국밥
			볶음밥
			고구마
			계란말이 
	 	 */
	 	
	 	
        System.out.println("\n 9.=========================== \n");
	 	
	 	food = "파스타1국밥2볶음밥3고구마4계란말이";
	 	
	 	foodArr = food.split("\\D");
	    //  \\D 에서 D는 정규표현식의 하나로써 숫자가 아닌것을 의미한다. 
		 	//  즉, 숫자가 아닌것이 구분자가 되는 것이다.
	 	// {"1","2","3","4"}
	 	
	 	System.out.println("foodArr.length => " + foodArr.length);
	 	// foodArr.length => 5
	 	
	 	for(int i=0; i<foodArr.length; i++) {
	 		System.out.println(foodArr[i]);
	 	}
	 	/*
	 	 	1

			2
			
			
			3
			
			
			4 
	 	 */
	 	
	 	
	 	System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	 	
	 	// == <참고>  \ 를 'escape 문자' 라고 부른다. ==
	 	System.out.println("나의 이름은 \"이순신\" 입니다.");
	 	
	 	System.out.println("C:\\movie\\아바타2.mp4");
	 	// C:\movie\아바타2.mp4
	 	
	 	
	 	
	 	
	    // === 8. String.join("구분자", 문자열타입의배열명) ===
	 	//        문자열타입의배열을 "구분자"로 합쳐서 String 타입으로 돌려주는 것이다.
	 	String[] nameArr = {"한석규","두석규","세석규","네석규","오석규"};
	 	String names = String.join("-", nameArr);
	 	System.out.println(names);
	 	// 한석규-두석규-세석규-네석규-오석규
	 	
	 	str = "시작하세요 안녕하세요 건강하세요";
	 	// 위의 str 에 저장된 문자열에서 하세요만 삭제한 결과물을 나타내세요.
	    
	    // str.split("하세요"); ==> {"시작"," 안녕"," 건강"}
	 	str = String.join("", str.split("하세요"));  
	 	System.out.println(str);
	 	// 시작 안녕 건강
	 	
	 	str = "103-23-523-009";
	 	str = String.join("", str.split("[-]"));
	 	System.out.println(str);
	 	// 10323523009
	 	
	 	str = "   안녕  하세요  내일은  화 요 일 이네요   ";
	 	str = String.join("", str.split(" "));
	 	System.out.println(str);
	 	// 안녕하세요내일은화요일이네요
	 	
	 	
	 	
	 	// === 9. "문자열".replaceAll("변경대상문자열", "새로이변경될문자열") ===
	 	//        "문자열" 에서 "변경대상문자열" 을 모두 "새로이변경될문자열" 로 교체해서 반환해주는 것이다.
	 	names = names.replaceAll("석규", "SK");
	 	System.out.println(names);
	 	// 한SK-두SK-세SK-네SK-오SK
	 	
	 	
	    // === 10. "문자열".replaceFirst("변경대상문자열", "새로이변경될문자열") ===
	 	//        "문자열" 에서 "변경대상문자열" 을 첫번째만 "새로이변경될문자열" 로 교체해서 반환해주는 것이다.
	 	names = names.replaceFirst("SK", "석규");
	 	System.out.println(names);
	 	// 한석규-두SK-세SK-네SK-오SK 
	 	
	 	
	 	
	 	// === "문자열".replace() 와  "문자열".replaceAll() 의 차이점 === //
	 	//     "문자열".replace() 는 정규표현식을 사용할 수 없다.
	 	//     하지만
	 	//     "문자열".replaceAll() 은 정규표현식을 사용할 수 있다.
	 	
	 	str = "103-23-523-009";
	 	str = str.replaceAll("-", "");
	 	System.out.println(str);
	 	// 10323523009
	 	
	 	str = "103-23-523-009";
	 	str = str.replace("-", "");
	 	System.out.println(str);
	 	// 10323523009
	 	
	 	str = "   안녕  하세요  내일은  화 요 일 이네요   ";
	 	str = str.replaceAll(" ", "");
	 	System.out.println(str);
	 	// 안녕하세요내일은화요일이네요
	 	
	 	str = "   안녕  하세요  내일은  화 요 일 이네요   ";
	 	str = str.replace(" ", "");
	 	System.out.println(str);
	 	// 안녕하세요내일은화요일이네요
	 	
	 	//////////////////////////////////////////////////////////
	 	
	 	System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"); 
	 	
	 	str = "java abcd javascript";
	 	str = str.replace("abc", "");
	 	System.out.println(str);
	 	// java d javascript
	 	
	 	
	    // 변수 str 에서 a 또는 b 또는 c 라는 글자가 있으면 삭제하려고 한다.
	 	str = "java abcd javascript";
	 	str = str.replace("a", "").replace("b", "").replace("c", "");
	 	// "jv bcd jvscript"
	 	// "jv cd jvscript"
	 	// "jv d jvscript"
	 	
	 	System.out.println(str);
	 	// jv d jvscript
	 	
	 	str = "java abcd javascript";
	 	str = str.replaceAll("[abc]", ""); // replaceAll 은 정규표현식도 사용이 가능하다. 
	 	System.out.println(str);
	 	// jv d jvsript
	 	
	 	str = "ja7va 98abc12d jav555ascri52pt1300";
	 	str = str.replaceAll("[0123456789]", ""); // 숫자인것만 제거해라는 뜻이다.
	 	System.out.println(str);
	 	// java abcd javascript
	 	
	 	str = "ja7va 98abc12d jav555ascri52pt1300";
	 	str = str.replaceAll("[0-9]", ""); // 숫자인것만 제거해라는 뜻이다.
	 	System.out.println(str);
	    // java abcd javascript
	 	
	 	str = "ja7va 98abc12d jav555ascri52pt1300";
	 	str = str.replaceAll("[0-4689]", ""); // 숫자중에 5와7을 뺀 숫자만 제거해라는 뜻이다.
	 	System.out.println(str);
	 	// ja7va abcd jav555ascri5pt
	 	
	 	str = "ja7va 98abc12d jav555ascri52pt1300";
	 	str = str.replaceAll("[^0-9]", ""); // 숫자가 아닌것만 제거해라는 뜻이다.
	 	System.out.println(str);
	 	// 79812555521300
	 	
	 	str = "ja7va 98abc12d jav555ascri52pt1300";
	 	str = str.replaceAll("\\d", ""); // 숫자인것만 제거해라는 뜻이다.
	 	System.out.println(str);
	    // java abcd javascript
	 	
	 	str = "ja7va 98abc12d jav555ascri52pt1300";
	 	str = str.replaceAll("\\D", ""); // 숫자가 아닌것만 제거해라는 뜻이다.
	 	System.out.println(str);
	 	// 79812555521300
	 	
	 	str = "java KOREA 0070 @#$@!";
	 	str = str.replaceAll("[a-z]", ""); // 소문자만 제거해라는 뜻이다.
	 	System.out.println(str);
	 	//  KOREA 0070 @#$@!
	 	
	 	str = "ja88va_ KOss_REA 00abc70 @#$java@!";
	 	str = str.replaceAll("[a-zA-Z0-9_ ]", ""); // 소문자 및 대문자 및 숫자 및 _ 및 공백을 제거해라는 뜻이다.
	 	System.out.println(str);
	 	// @#$@!
	 	
	 	
	 	str = "ja#88va_ KOss_REA 00abc70 @#$java@!";
	 	str = str.replaceAll("[\\w]", ""); // 소문자 및 대문자 및 숫자 및 _ 을 제거해라는 뜻이다.
	 	//                    정규표현식에서 \\w 은 word(단어)라는 뜻으로 대문자,소문자,숫자,_ 까지를 말한다.  
	 	System.out.println(str);
	 	// #   @#$@!
	 	
	 	str = "ja#88va_ KOss_REA 00abc70 @#$java@!";
	 	str = str.replaceAll("[\\w ]", ""); // 소문자 및 대문자 및 숫자 및 _ 및 공백을 제거해라는 뜻이다.
	 	//                    정규표현식에서 \\w 은 word(단어)라는 뜻으로 대문자,소문자,숫자,_ 까지를 말한다.  
	 	System.out.println(str);
	 	// #@#$@!
	 	
	 	str = "ja#88va_ KOss_REA 00abc70 @#$java@!";
	 	str = str.replaceAll("[^a-zA-Z0-9_]", ""); // 소문자 및 대문자 및 숫자 및 _ 을 제외한 나머지를 제거해라는 뜻이다.
	 	//                    정규표현식에서 \\w 은 word(단어)라는 뜻으로 대문자,소문자,숫자,_ 까지를 말한다.  
	 	System.out.println(str);
	 	// ja88va_KOss_REA00abc70java
	 	
	 	str = "ja#88va_ KOss_REA 00abc70 @#$java@!";
	 	str = str.replaceAll("[\\W]", ""); // 소문자 및 대문자 및 숫자 및 _ 을 제외한 나머지를 제거해라는 뜻이다.
	 	//                    정규표현식에서 \\W 은 word(단어)가 아닌것 이라는 뜻으로 대문자,소문자,숫자,_ 를 제외한 나머지를 말한다.  
	 	System.out.println(str);
	 	// ja88va_KOss_REA00abc70java
	 	
	 	
	 	
	 	// === [퀴즈] ===
	 	System.out.println("\n === [퀴즈] === \n");
	 	String[] contents = {"호호안녕하세요","건강하세요","행복하세요 또봐요","즐겁고 건강한 하루되세요"}; 
	 	
	 	// "건강" 이라는 단어가 포함된것을 출력하세요.
	 	for(int i=0; i<contents.length; i++) {
	 		 if(contents[i].indexOf("건강") != -1) 
	 			 System.out.println(contents[i]);
	 	}
	 	
	 	/*
	 	    건강하세요
	 	    즐겁고 건강한 하루되세요
	 	*/
	 	
	 	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
	 	
	    // "건강" 이라는 단어로 시작하는 것만 출력하세요.
	 	for(int i=0; i<contents.length; i++) {
	 		 if(contents[i].indexOf("건강") == 0) 
	 			 System.out.println(contents[i]);
	 	}
	 	// 건강하세요
	 	
	 	
	 	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
	 	// 또는 아래와 같이 할수도 있습니다.
	    // === 11. "문자열".startsWith("찾고자하는문자열") ===
	 	//     "문자열" 에서 "찾고자하는문자열"이 맨첫번째에 나오면 true 를 반환.
        //	   "문자열" 에서 "찾고자하는문자열"이 맨첫번째에 나오지 않으면 false 를 반환.
	 	
	    // "건강" 이라는 단어로 시작하는 것만 출력하세요.
 	 	for(int i=0; i<contents.length; i++) {
 	 		 if(contents[i].startsWith("건강"))
 	 			 System.out.println(contents[i]);
 	 	}
 	 	// 건강하세요
 	 	
 	 	
 	 	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
	    // === 12. "문자열".endsWith("찾고자하는문자열") ===
	 	//     "문자열" 에서 "찾고자하는문자열"로 끝나면 true 를 반환.
        //	   "문자열" 에서 "찾고자하는문자열"로 끝나지 않으면 false 를 반환.
	 	
	    // "하세요" 라는 단어로 끝나는 것만 출력하세요.
 	 	for(int i=0; i<contents.length; i++) {
 	 		 if(contents[i].endsWith("하세요"))
 	 			 System.out.println(contents[i]);
 	 	}
 	 	// 호호안녕하세요
 	 	// 건강하세요
 	 	
 	 	
 	 	// === 13. "문자열".trim() ===
 	 	//         "문자열" 의 좌,우에 공백이 있다라면 공백을 모두 제거하고서 반환해준다.
 	 	String insa = "           수고        많으셨습니다           ";
		System.out.println("하하하"+insa+"내일 뵐께요~~");
		// 하하하           수고        많으셨습니다           내일 뵐께요~~
		
		System.out.println("하하하"+insa.trim()+"내일 뵐께요~~");
		// 하하하수고        많으셨습니다내일 뵐께요~~
 	 	
		
		// === 14. "문자열".isEmpty()  ===
		//         "문자열" 이 아무것도 없으면 true 를 반환해주고,
		//         "문자열" 이 뭔가 있으면 false 를 반환해준다.
		String str1="", str2="abc", str3="          ";
		
		System.out.println(str1.isEmpty());  // true
		System.out.println(str2.isEmpty());  // false
		System.out.println(str3.isEmpty());  // false
		System.out.println(str3.trim().isEmpty());  // true
		
		
		// === 15. "문자열".toUpperCase() ===
		//         "문자열" 에서 소문자가 있으면 모두 대문자로 변경해서 반환해줌.
		String words = "My Name is Tom 입니다.";
		System.out.println(words.toUpperCase());
		// MY NAME IS TOM 입니다.
		
		
		// === 16. "문자열".toLowerCase() ===
		//         "문자열" 에서 대문자가 있으면 모두 소문자로 변경해서 반환해줌.
		words = "My Name is Tom 입니다.";
		System.out.println(words.toLowerCase());
		// my name is tom 입니다.
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		
		// === 17. "문자열".equals("비교대상문자열")  ===
		//     대문자와 소문자를 구분하면서
		//     "문자열" 과 "비교대상문자열" 의 값이 일치하면 true 를 반환.
        //	   "문자열" 과 "비교대상문자열" 의 값이 일치하지 않으면 false 를 반환. 
		
		
		// === 18. "문자열".equalsIgnoreCase("비교대상문자열")  ===
		//     대문자와 소문자를 구분하지 않으면서 
		//     "문자열" 과 "비교대상문자열" 의 값이 대,소문자와 관계없이 일치하면  true 를 반환.
		//	   "문자열" 과 "비교대상문자열" 의 값이 대,소문자와 관계없이 일치하지 않으면  false 를 반환.
				
		String[] strArr = {"korea", "seoul", " KOREA seoul", "Korea 대한민국", "서울 kOrEA 만세", null}; 

		// 검색어를 "korea" 라는 글자가 들어있는 것만 출력하세요.
		for(int i=0; i<strArr.length; i++) {
			
			if("korea".equals(strArr[i])) // if("korea".equals("korea"))
				                          // if("korea".equals("seoul"))
				                          // if("korea".equals(" KOREA seoul"))
				                          // ....
				                          // if("korea".equals(null))
				System.out.println(strArr[i]);
		
		//  아래의 방식대로 하면 	NullPointerException 이 유발될 수 있다.
		//	if(strArr[i].equals("korea")) // if("korea".equals("korea"))	
				                          // if("seoul".equals("korea"))
				                          // if(" KOREA seoul".equals("korea"))
				                          // ....
				                          // if(null.equals("korea"))
		//		System.out.println(strArr[i]);
		}// end of for----------------------------
		// "korea"
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		// 검색어를 "korea" 또는 "KOREA" 또는 "kOreA" 또는 "kOreA" 와 같이 했을때에
		// 대,소문자를 구분치 않고 "korea" 라는 글자가 들어있는 것만 출력하세요.
		
		String search = "kOreA"; // "korea" , "KOREA" , "kOreA" 
		
		for(String s : strArr) { // 배열 strArr 의 크기만큼 반복한다.
			                     // 즉, 6번 반복한다.
			
			search = search.toLowerCase(); // "korea" 
			
			// 첫번째 반복일 경우
			// String s = "korea";
			
			// 두번째 반복일 경우
			// String s = "seoul";
			
			// 세번째 반복일 경우
			// String s = " KOREA seoul";
			
			// 네번째 반복일 경우
			// String s = "Korea 대한민국";
			
			// 다섯번째 반복일 경우
			// String s = "서울 kOrEA 만세";
			
			// 여섯번째 반복일 경우
			// String s = null;
			
			if(s != null && s.toLowerCase().indexOf(search) != -1) {
			//	s.toLowerCase() 은 "korea", "seoul", " korea seoul", "korea 대한민국", "서울 korea 만세" 
			//  search 는 "korea" 
				
				System.out.println(s);
				// korea
				//  KOREA seoul
				// Korea 대한민국
				// 서울 kOrEA 만세
			}
			
			
		}// end of for--------------------------------
		
		/*
		    "korea"
		    " KOREA seoul"
		    "Korea 대한민국"
		    "서울 kOrEA 만세"
		 */
	 	
	}// end of main()---------------------------------------

}
