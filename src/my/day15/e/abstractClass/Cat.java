package my.day15.e.abstractClass;

public class Cat extends Animal {

	// Cat 만 가지는 field 를 정의 (추상화)
	private String color;

	
	// Cat 만 가지는 method 를 정의 (추상화)	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if(color != null && !color.trim().isEmpty())
			this.color = color;
	}
	
	public void jump() {
		System.out.println(">> 고양이는 점프를 합니다. <<");
	}
	
	
	// 메소드의 오버라이딩(재정의) //
	@Override
	public void showInfo() {
		System.out.println("== 고양이 정보 ==\n"
		         + "1. 성명 : " + getName() + "\n"
		         + "2. 생년 : " + getBirthYear() + "년\n"
		         + "3. 피부색 : " + color + "\n");		
	}

	@Override
	protected void cry() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
