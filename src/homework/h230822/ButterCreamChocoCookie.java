package homework.h230822;
// 김동선

public class ButterCreamChocoCookie {
	int cookieLv =1;
	public int coincost = 13500;
	public int crystalcost = 15;
	int lowestHP=100;
	int highestHP =135;
	double hitnum =0;
	String cookieclass = "B";
	String kr ;
	String jp ;
	String en ;	
	String krName;
	String jpName;
	String enName;
	String[] meta = {"난 코인이 많아.","커다란 금화를 본 적 있나?","코인을 벌고 싶으면 나를 따라와.","허리가 잘록한 쿠키가 좋아...","울...ㅊㅣ즈 딸램 넘 이쁘지요..?^^","코인 한 움큼 놓고 갑니다..^^"};
	void krName(String kr) 
	{
		System.out.println("버터크림 초코쿠키");
	}
	void jpName(String jp) 
	{
			System.out.println("バタークリームチョコクッキー");
	}
	void enName(String en)
	{
		System.out.println("ButterCream ChocoCookie");
	}
	public void cookieHP()
	{

		double maxHp = lowestHP + ((cookieLv-1)*4.375);
		double nowHp= maxHp -(hitnum*40);
	}
	public void specialAbility() 
	{
		double coinbonus = 5+ ((cookieLv-1)*2.5);
	}
	public void meta()
	{
		int k =(int)(Math.random()*6);
		System.out.println(meta[k]);
	}

}
