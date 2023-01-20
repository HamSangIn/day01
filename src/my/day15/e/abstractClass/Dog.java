package my.day15.e.abstractClass;

public class Dog extends Animal {

	// Dog 만 가지는 field 를 정의 (추상화)
	private int weight;

	
	// Dog 만 가지는 method 를 정의 (추상화)
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if(weight > 0)
			this.weight = weight;
	}
	
	public void run() {
		System.out.println(">> 강아지가 빠르게 달립니다. <<");
	}
	
	
	// 메소드의 오버라이딩(재정의) //
	@Override
	public void showInfo() {
		System.out.println("== 강아지 정보 ==\n"
				         + "1. 성명 : " + getName() + "\n"
				         + "2. 생년 : " + getBirthYear() + "년\n"
				         + "3. 몸무게 : " + weight + "kg\n");
	}

	@Override
	protected void cry() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
