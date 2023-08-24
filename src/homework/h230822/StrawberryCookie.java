package homework.h230822;
// 김동선

public class StrawberryCookie {
	int cookieLv =1;
	public int coincost = 13500;
	public int crystalcost = 15;
	int lowestHP=100;
	int highestHP =135;
	double hitnum =0;
	String cookieclass = "B";
	String kr ;
	String jp ;
	String cn ;
	String tw ;
	String en ;	
	String[] meta = {"나랑 같이 달려줄 거야?","난 외롭지 않아","내 친구가 되어줄래?","여기는 조금 무서운 곳인 거 같아...","인생은 혼자야...","누구든지 작은 딸기맛 쿠키를 건드리면...","뭔일인지 모르겠으니까 그냥 가만히 있어야겠다","이불 밖은 위험해...!"};

	void krName(String kr) 
	{
		System.out.println("딸기맛 쿠키");
	}
	void jpName(String jp) 
	{
			System.out.println("イチゴ味クッキー");
	}
	void cnName(String cn)
	{
		System.out.println("草莓餅乾");
	}
	void twName(String tw)
	{
		System.out.println("คุกกี้รเบอร์รี่สสตรอ");
	}
	void enName(String en)
	{
		System.out.println("Strawberry Cookie");
	}
	public void cookieHp()
	{
		double maxHp = lowestHP + ((cookieLv-1)*4.375);
		double nowHp= maxHp - (hitnum*40);
	}
	public void specialAbility() 
	{
		double bonusTime = 1 +(cookieLv *0.5);
	}
	public void meta()
	{
		int k =(int)(Math.random()*8);
		System.out.println(meta[k]);
	}
	}



