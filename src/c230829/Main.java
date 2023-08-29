package c230829;

interface InterfaceTest {
	/* public static final */int NUMBER = 1;
	
	// 얘는 왜 다중 상속이 가능할까? << 이름 밖에 없으니까
	/* public abstract */void methodTest();
	
	static void staticMethodTest() {
		System.out.println("정적 메서드 가능?!");
		// private 메서드 호출 가능? 불가능?
		privateStaticMethodTest();
	}
	
	private static void privateStaticMethodTest() {
		System.out.println("private 정적 메서드 가능?!");
	}

	private void privateMethodTest() {
		System.out.println("private 메서드 가능?!");
	}
	
	default void defaultMethodTest() {
		privateMethodTest();
	}
}

class ClassTest implements InterfaceTest{
	@Override
	public void methodTest() {}
	
	@Override
	public void defaultMethodTest() {
		InterfaceTest.super.defaultMethodTest();
	}
}

public class Main {
	public static void main(String[] args) {
		InterfaceTest.staticMethodTest();
		YellowRace JKH = new YellowRace();
		JKH.move();
//		JKH.skinColor
		Person[] people = new Person[] {JKH, new WhiteRace()};
//		people[0].skin
//		people[0].move
	}
}
