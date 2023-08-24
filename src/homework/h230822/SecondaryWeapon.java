package homework.h230822;
// 이민규

public class SecondaryWeapon {

	String myGuns="무기를 사용하여 일정 킬 수를 달성할 때마다 레벨업하고,\n "
					+"특정 레벨 도달 시 업그레이드된 무기로 교체";
	String gunName="nobleG18";
	int myGunLevel=0;
	int myGunKill=0;
	String expUp;
	String damage="데미지:35%";  //데미지
	String rateOfFire="연사력:61%"; //연사력
	String hitRate="명중률:59%";  //명중률
	String firearmRecoil="총기반동:36%"; //총기반동
	String numberOfBullets ="장탄수:12/48"; //장탄수
	String swapSpeedUp="교체속도 증가";
	String reLoadSpeedUp="장전속도 증가";
	String gunTransLucent ="총기 반투명";
	String upGrade="외형 업그레이드";
		
	
	
	
	int Level10(int myGunLevel) 
	{
		myGunKill=67;
		expUp="20%";
		return myGunLevel=10;		
	}
				
	int Level20(int myGunLevel) 
	{
		myGunKill=367;
		expUp="30%";
		return myGunLevel=20;		
	}
	int Level30(int myGunLevel) 
	{
		myGunKill=767;
		expUp="50%";
		return myGunLevel=30;	
	}
	int Level40(int myGunLevel) 
	{
		myGunKill=1267;
		expUp="70%";
		return myGunLevel=40;		
	}
	int Level50(int myGunLevel) 
	{
		myGunKill=1867;
		expUp="100%";
		return myGunLevel=50;		
	}
	
	
	public static void main(String[]args) {
		SecondaryWeapon G18=new SecondaryWeapon();
	
		System.out.println(G18.gunName+"정보\n"+G18.myGuns);
		
		System.out.println("G18 정보\n"+G18.damage+"\n"+G18.rateOfFire+"\n"+G18.hitRate+
							"\n"+G18.firearmRecoil+"\n"+G18.numberOfBullets
							+"2015년 12월 10일 대작 겨울 업데이트 신규 맵 '벙커'와 같이 새로 출시된 권총이고 보통 3권이라는 명칭으로 불려진다.\n"
							+ "일반적으로 상점에서 구매할 수 없으며, 이벤트 한정으로 지급된 총기였으나 시간이 흐르면서 다양한 스킨 버전으로 많이 풀리고 있다.\n"
							+ "웬만한 돌격소총과 거의 비슷한 데미지를 보유하고 있으며 3점사 기능을 사용하면 매우 빠르게 3발을 쏘기 때문에\n"
							+ "근접전에서 매우 유리해서 거의 산탄총급 성능을 보유한 권총이라도 할 수 있다.\n"
							+ "특히 근거리에서 3점사 모드를 키고 상대 헤드를 노리면 잘 맞는다.\n"
							+ "이동 중 에임 변화가 없다고는 하지만 중거리 이상부터는 집탄율이 매우 떨어지며\n"
							+ "3점사를 사용하면 탄알을 금방 소모해버리기 때문에 탄알관리에 신경써야 한다.");
		System.out.println();
		
		System.out.println("G18레벨:"+G18.Level10(0)+"\nkill:"+G18.myGunKill+
							"\n추가경험치:"+G18.expUp+"\n기능:"+G18.upGrade);
		
		System.out.println("G18레벨:"+G18.Level20(0)+"\nkill:"+G18.myGunKill+
							"\n추가경험치:"+G18.expUp+"\n기능:"+G18.upGrade);
		
		System.out.println("G18레벨:"+G18.Level30(0)+"\nkill:"+G18.myGunKill+
							"\n추가경험치:"+G18.expUp+"\n기능:"+G18.upGrade);
		
		System.out.println("G18레벨:"+G18.Level40(0)+"\nkill:"+G18.myGunKill+
							"\n추가경험치:"+G18.expUp+"\n기능:"+G18.upGrade+","+
							G18.swapSpeedUp+","+G18.reLoadSpeedUp+",장탄수증가 "
							+G18.numberOfBullets+">15/45");
		
		System.out.println("G18레벨:"+G18.Level50(0)+"\nkill:"+G18.myGunKill+
							"\n추가경험치:"+G18.expUp+"\n기능:"+G18.upGrade+","+
							G18.swapSpeedUp+","+G18.reLoadSpeedUp+","+G18.gunTransLucent
							+",장탄수증가 "+G18.numberOfBullets+">15/45");
		

	
	
	
	}	
}
