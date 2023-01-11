package my.day07.c.quiz.For;

import java.util.Scanner;

public class QuizMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" > 문자열을 입력하세요 : ");
		String inputMes = sc.nextLine();
		String a = inputMes;
		int a_len = a.length();
		char c;
		int aa = 0;
		int BigAlpha = 0;
		int SmallAlpha = 0;
		int spChr = 0;

		for (int i = 0; i < a.length(); i++) {
			c = a.charAt(i);
			if (c >= 97 && c <= 122) {
				SmallAlpha++;
			} else if (c >= 65 && c <= 90) {
				BigAlpha++;
			} else if (c >= 48 && c <= 57) {
				aa++;
			} else {
				spChr++;
			}
		}

		System.out.println(" 입력한 문자열 : " + inputMes + "\n" + "입력한 문자열의 길이 : " + a_len + "\n" + "대문자 개수 : " + BigAlpha
				+ "\n" + "소문자 개수 : " + SmallAlpha + "\n" + "숫자 개수 : " + aa + "\n" + "특수문자 개수 : " + spChr + "\n");

	}

	}

