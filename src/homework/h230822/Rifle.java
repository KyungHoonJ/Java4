package homework.h230822;
// 이민규

public class Rifle {

	String myGuns="무기를 사용하여 일정 킬 수를 달성할 때마다 레벨업하고,\n "
					+"특정 레벨 도달 시 업그레이드된 무기로 교체";
	String gunName="nobleAk-47";
	int myGunLevel=0;
	int myGunKill=0;
	String expUp;
	String damage="데미지:45%";  //데미지
	String rateOfFire="연사력:72%"; //연사력
	String hitRate="명중률:87%";  //명중률
	String firearmRecoil="총기반동:85%"; //총기반동
	String numberOfBullets ="장탄수:30/120"; //장탄수
	String swapSpeedUp="교체속도 증가";
	String reLoadSpeedUp="장전속도 증가";
	String gunTransLucent ="총기 반투명";
	String upGrade="외형 업그레이드";
	
	int Level10(int myGunLevel) 
	{
		myGunKill=270;
		expUp="20%";
		return myGunLevel=10;		
	}
				
	int Level20(int myGunLevel) 
	{
		myGunKill=1270;
		expUp="30%";
		return myGunLevel=20;		
	}
	int Level30(int myGunLevel) 
	{
		myGunKill=2470;
		expUp="50%";
		return myGunLevel=30;	
	}
	int Level40(int myGunLevel) 
	{
		myGunKill=3870;
		expUp="70%";
		return myGunLevel=40;		
	}
	int Level50(int myGunLevel) 
	{
		myGunKill=5470;
		expUp="100%";
		return myGunLevel=50;		
	}


	public static void main(String[]args) 
	{
		Rifle AK=new Rifle();
		
		System.out.println(AK.gunName+"정보\n"+AK.myGuns);
		
		System.out.println("AK47 정보\n"+AK.damage+"\n"+AK.rateOfFire+"\n"
							+AK.hitRate+"\n"+AK.firearmRecoil+"\n"+AK.numberOfBullets
							+"한때는 라이플의 로망이였으나, 현재는 좋은 라이플이 널리고 있어 꽤 고전하고 있다.\n"
							+ "거기다가 부위별 데미지 잠수함 너프도 받았다.\n"
							+ "물론, 여전히 좋은총이지만 이동속도가 느리다는 단점 하나 때문에\n"
							+ "스나에게 따일 확률은 물론 같은 라이플간의 근접전에서도\n"
							+ "이속 차이때문에 파마스같은 이속이 빠른 총기들에게 밀린다.\n"
							+ "그리고 느린 연사속도와 이동속도로 의외로 근접전깡패가 무색하게 기습에 취약하다.\n"
							);
		System.out.println();
		
		System.out.println("AK47 레벨:"+AK.Level10(0)+"\nkill:"+AK.myGunKill+
							"\n추가경험치:"+AK.expUp+"\n기능:"+AK.upGrade);
		
		System.out.println("AK47 레벨:"+AK.Level20(0)+"\nkill:"+AK.myGunKill+
							"\n추가경험치:"+AK.expUp+"\n기능:"+AK.upGrade);
		
		System.out.println("AK47 레벨:"+AK.Level30(0)+"\nkill:"+AK.myGunKill+
							"\n추가경험치:"+AK.expUp+"\n기능:"+AK.upGrade);
		
		System.out.println("AK47 레벨:"+AK.Level40(0)+"\nkill:"+AK.myGunKill+
							"\n추가경험치:"+AK.expUp+"\n기능:"+AK.upGrade+","+
							AK.swapSpeedUp+","+AK.reLoadSpeedUp);
		
		System.out.println("AK47 레벨:"+AK.Level40(0)+"\nkill:"+AK.myGunKill+
							"\n추가경험치:"+AK.expUp+"\n기능:"+AK.upGrade+","+
							AK.swapSpeedUp+","+AK.reLoadSpeedUp+","+AK.gunTransLucent);

		
	}
}
