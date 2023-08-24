package homework.h230822;
// 이민규

public class M4a1 {
		
	String myGuns="무기를 사용하여 일정 킬 수를 달성할 때마다 레벨업하고,\n "
					+"특정 레벨 도달 시 업그레이드된 무기로 교체";
	String gunName="nobleAk-47";
	int myGunLevel=0;
	int myGunKill=0;
	String expUp;
	String damage="데미지:37% \n(실공격력)36.5%";  //데미지
	String rateOfFire="연사력:82%"; //연사력
	String hitRate="명중률:88%";  //명중률
	String firearmRecoil="총기반동:44%"; //총기반동
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
	M4a1 m4=new M4a1();
	
	System.out.println(m4.gunName+"정보\n"+m4.myGuns);
	
	
	
	System.out.println("M4A1 정보\n"+m4.damage+"\n"+m4.rateOfFire+"\n"
						+m4.hitRate+"\n"+m4.firearmRecoil+"\n"+m4.numberOfBullets+
						"\n서든어택 돌격소총 중에서 데미지, 연사력, 명중률, 총기반동 등\n"
						+ "모든게 평균적이고 밸런스가 가장 잘 맞춰진 총기다.\n"
						+ "특히 낮은 총기반동과 연사해도 높은 집탄률 덕분에 헤드샷 노리기가 매우 수월하며,\n"
						+ "굳이 헤드슈터로 지망하지 않아도 꾸준히\n"
						+ "데미지 상향을 받았기 때문에 헤드샷에 신경쓰지 않아도 될 정도다.");
	System.out.println();
	
	System.out.println("M4A1 레벨:"+m4.Level10(0)+"\nkill:"+m4.myGunKill+
						"\n추가경험치:"+m4.expUp+"\n기능:"+m4.upGrade);
	
	System.out.println("M4A1 레벨:"+m4.Level20(0)+"\nkill:"+m4.myGunKill+
						"\n추가경험치:"+m4.expUp+"\n기능:"+m4.upGrade);
	
	System.out.println("M4A1 레벨:"+m4.Level30(0)+"\nkill:"+m4.myGunKill+
						"\n추가경험치:"+m4.expUp+"\n기능:"+m4.upGrade);
	
	System.out.println("M4A1 레벨:"+m4.Level40(0)+"\nkill:"+m4.myGunKill+
						"\n추가경험치:"+m4.expUp+"\n기능:"+m4.upGrade+","+
						m4.swapSpeedUp+","+m4.reLoadSpeedUp);
	
	System.out.println("M4A1 레벨:"+m4.Level40(0)+"\nkill:"+m4.myGunKill+
						"\n추가경험치:"+m4.expUp+"\n기능:"+m4.upGrade+","+
						m4.swapSpeedUp+","+m4.reLoadSpeedUp+","+m4.gunTransLucent);


}
}
