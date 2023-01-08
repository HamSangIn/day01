package my.day04.c.scanner;

import java.util.Scanner;

public class Scanner1Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//System.in 은 키보드 라고 보면 된다.
		//Scanner sc 은 키보드에서 입력된 문자열을 읽어들이는 객체이다.
		
		//System.out 은 출력장치(모니터)를 말한다.
		//System.in 은 입력장치(키보드) 라고 보면된다.
		
		System.out.println("첫번째 문장을 입력하세요 => ");
		String inputStr = sc.nextLine();
		/*
		sc.nextLine();은 키보드로부터 입력받은 문장을 읽어들이는 것인데 
		엔터(종결신호)까지 모두 읽어들인 후 스캐너 버퍼에는 아무것도 남기지 않는다.
		*/
		System.out.println("첫번째 입력한 문장 => " + inputStr + "\n");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("정수를 입력하세요 => ");
		int inputNum = sc.nextInt();
		
		/*
		sc.nextInt(); 은 정수(int)를 읽어들이는 것인데
		종결자가 공백 또는 엔터 이다.
		종결자(공백 또는 엔터)앞까지의 입력해준 정수를 읽어온다.
		sc.nextInt(); 를 사용하면 스캐너 버퍼에는 종결자가 삭제되는 것이 아니라 그대로 남아있게 된다.
		*/
		
		sc.nextLine(); // 스캐너 버퍼에 남아있던 엔터(찌꺼기)를 싹 비우는 것이 목적이다.
		
		System.out.println("입력한 정수: " + inputNum);
	
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("두번째 문장을 입력하세요 => ");
		inputStr = sc.nextLine();
		
		System.out.println("두번째 입력한 문장 => " + inputStr + "\n");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("실수를 입력하세요 => ");
		double inputDb1= sc.nextDouble();

		/*
		sc.nextDouble(); 은 실수(Double)를 읽어들이는 것인데
		종결자가 공백 또는 엔터 이다.
		종결자(공백 또는 엔터)앞까지의 입력해준 정수를 읽어온다.
		sc.nextDouble(); 를 사용하면 스캐너 버퍼에는 종결자가 삭제되는 것이 아니라 그대로 남아있게 된다.
		*/
	
		sc.nextLine(); // 스캐너 버퍼에 남아있던 엔터(찌꺼기)를 싹 비우는 것이 목적이다.
	
		System.out.println("입력한 실수 : " + inputDb1);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("단어를 입력하세요 =>");
		String inputWord = sc.next();
		/*
		sc.next(); 는 단어를 읽어들이는 것인데
		종결자가 공백 또는 엔터이다.
		종결자(공백 또는 엔터)앞까지의 입력해준 정수를 읽어온다.
		sc.next(); 를 사용하면 스캐너 버퍼에는 종결자가 삭제되는 것이 아니라 그대로 남아있게 된다.
		 
		*/
		sc.nextLine();
		
		System.out.println("입력한 단어 : " + inputWord);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
	
	
		System.out.println("세번째 문장을 입력하세요 => ");
		inputStr = sc.nextLine();
		
		System.out.println("세번째 입력한 문장 => " + inputStr + "\n");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		sc.close();
	
	
	
	
	
	
	}

}
