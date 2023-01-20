package sy_study_100;

import java.util.Scanner;

public class Sy_2753 {

	public static void main(String[] args) {
		System.out.println(">> 1에서4000사이의 숫자를 입력하세요 ");
		System.out.println(">> 윤년이라면 1 평년이라면 0이 나옵니다. \n");
		Scanner sc = new Scanner(System.in);
        int leapyear = sc.nextInt();
      
        
        if(leapyear%4 == 0){
            if(leapyear%400 != 0 && leapyear%100 == 0)
                System.out.println("0");
            else
                System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        
    }
}
 