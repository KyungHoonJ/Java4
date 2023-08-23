package homework.h230822;
// 김동선

public class BraveCookie {
	int cookieLV =1;
	int lowestHP =100;
	int highestHP =110;
	double nowHp;
	String cookieClass ="C";
	String[] meta = {"달리기 하면 나지!","마녀는 보이지 않는군… 이때다!","안 돼! 난 여기에서 빠져나가야겠어!","이대로 먹힐 수는 없어!","쿠키라고 무시하지 마!","너! 내 동료가 돼라!","용감한 쿠키가 튀어오르기를 사용했다! 아무일도 일어나지 않았다","탕수육은 부먹이지!"};
	String[] accLv= {"용감함","조금 더 용감함","더 용감함","꽤 용감함","제법 용감함","최고 용감함","용감한데다 멋져","짱짱 용감함"};
	String krName;
	String jpName;
	String cnName;
	String twName;
	String enName;	
	double hitnum = 0;
	void krName(String kr) 
	{
		System.out.println("용감한 쿠키");
	}
	void jpName(String jp) 
	{
		System.out.println("勇敢なクッキー君");
	}
	void cnName(String cn)
	{
		System.out.println("勇敢饼干");
	}
	void twName(String tw)
	{
		System.out.println("คุกกี้ผู้กล้าหาญ");
	}
	void enName(String en)
	{
		System.out.println("Brave Cookie");
	}
	public void cookieHP()
	{
		double maxHp = lowestHP +((cookieLV-1)*1.25);
		double nowHp = maxHp - (hitnum * 40);
	}
	public void deadpoint()
	{
		if(nowHp<=0) 
		{
			System.out.println("당신의 쿠키가 사망하였습니다! ㅠㅠ");
		}
	}
	String specialAbility(int cookieLV) 
	{
		return accLv[cookieLV-1];
	}
	public void meta()
	{
		int k =(int)(Math.random()*8);
		System.out.println(meta[k]);
	}
}


