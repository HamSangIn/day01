package sy_study_100;

	import java.util.Scanner;
	 
	public class Sy_2884 {
	 
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int a,b;
	        a = input.nextInt();
	        b = input.nextInt();
	        if(b < 45)
	        {
	            b += 15;
	            if(a == 0)
	            {
	                a = 23;
	                System.out.println(a+ " " + b);
	            }
	            else
	            {    a--;
	                System.out.println(a+ " "+ b);
	            }
	        }
	        else {
	            b -= 45;
	            System.out.println(a + " " + b); 
	        }
	        
	    }
	 
	}
	 
