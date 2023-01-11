package my.day07.c.quiz.For;

import java.util.Scanner;

public class Quiz3Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" 휴대폰 번호를 입력하세요(예>010-1234-5678) :  ");
		String inputMes = sc.nextLine();
		
		
		
		
		System.out.println(" 휴대폰 번호 : " + (inputMes.replaceAll("-","")) + "\n");
		
		

	}

}
