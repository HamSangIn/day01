package my.day05.b.wrapper;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class WrapperMain {

	
	/*
	   === *** wrapper 클래스 *** ===
	   
	   ------------------------------------------------
	     기본자료형(원시형, primitive)     wrapper 클래스
	   ------------------------------------------------
	    byte                           Byte 
	    short                          Short
	    int                            Integer  
	    long                           Long
	    char                           Character
	    float                          Float
	    double                         Double
	    boolean                        Boolean 
	    ------------------------------------------------
	    
	     기본자료형(원시형)은 데이터 저장 및 4칙연산 에서만 사용하는 것이고, 
	    wrapper 클래스는  데이터 저장 및 4칙연산 뿐만아니라 
	     아주 다양한 기능의 메소드가 제공되므로 다방면으로 사용되어진다. 
	*/
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("=== auto Boxing 과 auto unBoxing 에 대해서 알아 봅니다. ===");
		  
		
		  // Boxing(박싱, 포장을 하는것) 이란 ?
	      // ==> 기본자료형(boolean, byte, short, int, long, char, float, double)으로 되어진 변수를 
	      //     객체타입인 Wrapper 클래스(Boolean, Byte, Short, Integer, Long, Character, Float, Double)   
	      //     타입의 객체로 만들어주는 것을 말한다.
	      
	      
	      // UnBoxing(언박싱, 포장을 푸는것) 이란?   
	      // ==> Wrapper 클래스(Boolean, Byte, Short, Integer, Long, Character, Float, Double)로 
	      //     되어져 있는 객체를 기본자료형(boolean, byte, short, int, long, char, float, double)으로 
	      //     만들어주는 것을 말한다.
		
		int a1 = 10;
		Integer a2 = new Integer(a1); // 박싱
		
		System.out.println("a1 :" + a1);
		System.out.println("a2 :" + a2.intValue()); // 언박싱
		System.out.println("a2 :" + a2); // 오토 언박싱
		
		int a3 = 20;
		Integer a4 = a3;	
		
		
		System.out.println("a3 :" + a3);
		System.out.println("a4 :" + a4.intValue()); // 언박싱
		System.out.println("a4 :" + a4); // 오토 언박싱
		
		a4 = 30;
		
		System.out.println("a4 :" + a4); // 오토 언박싱
		System.out.println("a4 :" + a4); // 오토 언박싱
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		double db1 = 1.23456;
		Double db2 = db1; // new Double(db1) 이렇게 안해도 된다. 오토 언박싱.
		Double db3 = db1;
		System.out.println("db1 : " +db1);
		System.out.println("db2 : " +db2);
		System.out.println("db3 : " +db3);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		char ch1 = 'a';
		Character ch2 = new Character('a'); // 박싱
		Character ch3 = 'a';// 오토박싱
		
		System.out.println("ch1 : " + ch1);
		System.out.println("ch2 : " + ch2);
		System.out.println("ch3 : " + ch3);
	
		// 'A' ==> 65
		// 'a' ==> 97
		// '0' ==> 48
		// ' ' ==> 32
		
		ch1 =(char)(ch1 - 32);
		System.out.println("ch1=> " + ch1);
		
	    char ch4 = 'b';
		System.out.println(Character.toUpperCase(ch4)); //ch1 을 대문자로 변경해서 반환시켜 준다.
		
		
		char ch5 = 'C';
		
		System.out.println((char)(ch5 + 32));
		System.out.println(Character.toUpperCase(ch5));
		System.out.println(Character.toLowerCase(ch5));
		Character.toUpperCase(ch5);
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println(">> 아무글자(영문 또는 숫자 또는 특수기호) 1개를 입력하세요 => ");
				 
		String inputStr = sc.nextLine();
		
		
		
		
//		System.out.println(inputStr.charAt(0));
//		System.out.println(inputStr.charAt(1));
//		System.out.println(inputStr.charAt(2));
//		System.out.println(inputStr.charAt(3));
//		System.out.println(inputStr.charAt(4));
	
		
		char ch_1 = inputStr.charAt(0);
		
		String result;
		if( 'A' <= ch_1 && ch_1 <= 'Z')
			result = "대문자";
		
		else if( 'a' <= ch_1 && ch_1 <= 'z')
			result = "소문자";
		
		else if( '0' <= ch_1 && ch_1 <= '9')
			result = "숫자";
		else 
			result = "특수문자";
	
		System.out.println("입력하신 글자 "+ch_1+"는  "+result+"입니다.");
	
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	
		
		if( Character.isUpperCase(ch_1))
			result = "대문자";
		
		else if(Character.isLowerCase(ch_1) )
			result = "소문자";
		
		else if( Character.isDigit(ch_1))
			result = "숫자";
		else 
			result = "특수문자";
		
		System.out.println("입력하신 글자 "+ch_1+"는  "+result+"입니다.");
		
		
		
		
		
	sc.close();
	}

}
