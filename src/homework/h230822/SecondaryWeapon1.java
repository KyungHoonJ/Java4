package homework.h230822;
// 이민규

public class SecondaryWeapon1 {
	String myGuns="무기를 사용하여 일정 킬 수를 달성할 때마다 레벨업하고,\n "
				+"특정 레벨 도달 시 업그레이드된 무기로 교체";
	String gunName="noblePeacemaker";
	int myGunLevel=0;
	int myGunKill=0;
	String expUp;
	String damage="데미지:45%";  //데미지
	String rateOfFire="연사력:65%"; //연사력
	String hitRate="명중률:67%";  //명중률
	String firearmRecoil="총기반동:65%"; //총기반동
	String numberOfBullets ="장탄수:9/48"; //장탄수
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
		SecondaryWeapon1 peace=new SecondaryWeapon1();
	
	System.out.println(peace.gunName+"정보\n"+peace.myGuns);
	
	System.out.println("peacemaker 정보\n"+peace.damage+"\n"+peace.rateOfFire+"\n"+peace.hitRate+
						"\n"+peace.firearmRecoil+"\n"+peace.numberOfBullets+
						"제 총기는 서부개척시대의 유명한 총기였던 싱글액션 리볼버인 콜트 싱글 액션 아미로,\n"
						+ "민수용 판매 명칭이 피스메이커다. 별칭은 피메.");
	System.out.println();
	
	System.out.println("peacemaker레벨:"+peace.Level10(0)+"\nkill:"+peace.myGunKill+
						"\n추가경험치:"+peace.expUp+"\n기능:"+peace.upGrade);
	
	System.out.println("peacemaker레벨:"+peace.Level20(0)+"\nkill:"+peace.myGunKill+
						"\n추가경험치:"+peace.expUp+"\n기능:"+peace.upGrade);
	
	System.out.println("peacemaker레벨:"+peace.Level30(0)+"\nkill:"+peace.myGunKill+
						"\n추가경험치:"+peace.expUp+"\n기능:"+peace.upGrade);
	
	System.out.println("peacemaker레벨:"+peace.Level40(0)+"\nkill:"+peace.myGunKill+
						"\n추가경험치:"+peace.expUp+"\n기능:"+peace.upGrade+","+
						peace.swapSpeedUp+","+peace.reLoadSpeedUp+",장탄수증가 "
						+peace.numberOfBullets+">15/45");
	
	System.out.println("peacemaker레벨:"+peace.Level50(0)+"\nkill:"+peace.myGunKill+
						"\n추가경험치:"+peace.expUp+"\n기능:"+peace.upGrade+","+
						peace.swapSpeedUp+","+peace.reLoadSpeedUp+","+peace.gunTransLucent
						+",장탄수증가 "+peace.numberOfBullets+">15/45");
	
	
	
	
	
	}
}
