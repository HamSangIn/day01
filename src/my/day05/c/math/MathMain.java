package my.day05.c.math;

public class MathMain {

	public static void main(String[] args) {
		
		// === Math 클래스에 대해서 알아봅니다. === //
		
		// 1. >>> 반올림에 대해서 알아봅니다. <<<
		double db1=93.45678, db2=86.87654;
		
		System.out.println("=== 반올림 하기 전 ===");
		System.out.println("db1 => " + db1 + ", db2 => " + db2);
		
		System.out.println("=== 반올림 한 후 ===");
		System.out.println("db1 => " + Math.round(db1) + ", db2 => " + Math.round(db2));
		
		System.out.println("\n=== 소수부 첫째 자리까지 나타내면서 반올림 한 후 ===");
		System.out.println("db1 => " + Math.round(db1*10)/10.0 + ", db2 => " + Math.round(db2*10)/10.0);
		
		System.out.println("\n=== 소수부 둘째 자리까지 나타내면서 반올림 한 후 ===");
		System.out.println("db1 => " + Math.round(db1*100)/100.0 + ", db2 => " + Math.round(db2*100)/100.0);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		double db3=54.0 ,db4=54.1 , db5=54.9;
		
		
		// 2. >>> 올림에 대해서 알아봅니다. <<<
		// 54.0 ==> 54.0
		// 54.1 ==> 55.0
		// 54.9 ==> 55.0
		System.out.println("=== 올림 하기 전 ===");
		System.out.println("db3 => " + db3 + ", db4 => " + db4 + "db5 => " + db5);
		
		
		
		System.out.println("=== 올림 한후 ===");
		System.out.println("db3 => " + (int)Math.ceil(db3) + ", db4 => " + (int)Math.ceil(db4) + "db5 => " + (int)Math.ceil(db5));
		
		
		// 3. >>> 내림에 대해서 알아봅니다. <<<
		// 54.0 ==> 54.0
		// 54.1 ==> 54.0
		// 54.9 ==> 54.0
		System.out.println("=== 내림 하기 전 ===");
		System.out.println("db3 => " + db3 + ", db4 => " + db4 + "db5 => " + db5);
		
		System.out.println("=== 내림 한후 ===");
		System.out.println("db3 => " + Math.floor(db3) + ", db4 => " + Math.floor(db4) + "db5 => " + Math.floor(db5));
		
		System.out.println("db3 => " + (int)Math.floor(db3) + ", db4 => " + (int)Math.floor(db4) + "db5 => " + (int)Math.floor(db5));
		// 4. >>> 절대값에 대해서 알아봅니다. <<<
		System.out.println("\n=== 절대값 ===");
		
		int a=20, b=-30;
		System.out.println("a=> " + a + ", b => " + b);
		
		System.out.println("a=> " + Math.abs(a) + ", b => " + Math.abs(b));
		
		
		
		
		
		
		
		
		
		
		
	}

}
