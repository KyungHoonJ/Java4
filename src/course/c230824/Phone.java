package course.c230824;

// public, private, protected, static, final

interface InterfacePhone{
	String SIMNUMBER = "ewsaru8hesakur";
	// public static final
//	public void installApp(String appName); // 앱설치 메서드
	void call(String otherOwner); // 전화한다.
}

public abstract class Phone implements InterfacePhone {
	// abstract 은 추상
	public String number;
	// 퍼블릭 변수는 잘 사용하지 않는다.
	// 교수 개인적으론 Static(정적) 변수 이외에 쓰는 걸 본적이 거의 없다.
	// 우리는 어떻게 코딩해야한다? => 어떤 방식으로 코딩해야한다? => 객체지향
	// 캡슐화, 추상화, 다형성, 상속
	// 캡슐화를 위해 사용을 지양한다.
	private String owner;
	protected String operator = "SKT";
//	public static String model = "갤럭시 폴드3";
//	public final String MANUFACTURER = "삼성";
//	public static final double PI = 3.14;
	
	public Phone(String owner){
		this.owner = owner;
	}

	public void setOwner(String owner) {
		// setter
		this.owner = owner;
	}
	
	public String getOwner() {
		// getter
		return owner;
	}
	
	public void takeAPicture() {
		System.out.println("사진을 찍었습니다.");
	}
	
	@Override
	public void call(String otherOwner) {
		System.out.println(owner + "가 " + otherOwner + "에게 전화를 건다.");
	}

}

class GalaxyPhone extends Phone {
	public static final String MANUFACTURER = "삼성";
	public GalaxyPhone(String owner, String number) {
		// TODO Auto-generated constructor stub
		super(owner);
		this.number = number;
		this.operator = "KT";
	}
	
//	@Override
	// Override 했으므로 부모한테 해당 메서드가 있어야한다.
	public void installApp(String appName) {
		System.out.println("구글 스토어에서 " + appName + "을 다운받는다.");
	}
	// 이건 의미가 없다.
	/*
	 * 사용하기에 따라서 코딩할 때 의미를 갖는다.
	 * */
}

class IPhone extends Phone{
	public static final String MANUFACTURER = "애플";
	public IPhone(String owner, String number) {
		// TODO Auto-generated constructor stub
		super(owner);
		this.number = number;
		this.operator = "KT";
	}

//	@Override
	public void installApp(String appName) {
		System.out.println("앱스토어에서 " + appName + "을 다운받는다.");
	}
}

class Player{
	private String nickName;
	public Player(String nickName) {
		// TODO Auto-generated constructor stub
		this.nickName = nickName;
	}
	
	public String getNickName() {
		return nickName;
	}
}





