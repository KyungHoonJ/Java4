package homework.h230822;
// 한상윤

public class Starcraft2
{
}

class HighTempler
{	
	public String name = "고위 기사";
	public String description = "강한 사이오닉 능력을 지니고 있습니다. 환류를 사용할 수 있고 업그레이드하면 사이오닉 폭풍을 사용할 수 있습니다. 집정관으로 변신할 수 있습니다.";

	public int prdMineral = 50;
	public int prdGas = 150;
	public int prdUnit = 2;
	public int[] prdSpeed  = {50, 45};	
	public String[] prdBuilding = {"관문", "차원 관문"};
	public String[] prdNeedBuild = {"기사단 기록보관소"};
	public char hotkey = 't';
	//생산

	public int hp = 40;
	public int def = 0;
	public int defUpgrade = 1;	
	public int sight = 10;
	public double moveSpeed = 2.016;
	public int[] mp = {50,150};
	public int shield = 40;
	public int shieldUpgrade = 1;
	public String[] attribute = new String[] {"경장갑","생체","사이오닉"};
	public int transport = 2;
	//기본 속성

	public String attackName = "사이오닉 폭발";
	public int attackDamage = 4;
	public int attackUpgrade = 1;
	public Double attackRange = 7.0;
	public Double attackSpeed = 1.75;
	public String attackTarget = "지상";
	//공격

	public String[] skill = {"환류","사이오닉 폭풍","집정관 합체"};

	int targetHp;
	int targetMp;
	
	public String skill1Name = "환류";
	public String skill1Description = "대상의 에너지를 모두 소진시키고, 소진된 에너지 1당 0.5의 피해를 줍니다.";
	public char skill1Hotkey = 'f';

	public int skill1NeedMp = 50;
	public int skill1Cooldown = 0;
	public int skill1Range = 10;
	
	public void skillFeedback(int targetHp, int targetMp)
	{
		int skillDamage = (int)(targetMp*0.5);
		this.targetHp -= skillDamage;
		this.targetMp = 0;
	}

	public String skill2Name = "사이오닉 폭풍";
	public String skill2Description = "4초동안 지속되는 사이오닉 에너지의 폭풍을 생성하여, 대상 지역에 있는 모든 유닛에게 최대 80의 피해를 줍니다.";
	public char skill2Hotkey = 't';

	public String skill2NeedUpgrade = "사이오닉 폭풍 업그레이드";

	public int skill2NeedMp = 75;
	public int skill2Cooldown = 2;
	public int skill2Range = 9;
	public double skill2Area = 1.5;		

	public void skillPsionicStrom()
	{		
		int skillDamage = 20;
		int skillDuration = 4;				
	}

	public String skill3Name = "집정관 소환";
	public String skill3Description = "기사 두 명을 희생하여 집정관을 탄생시킵니다.";
	public char skill3Hotkey = 'c';	
	
	public void skillArchonWarp()
	{
		//prdArchon코드		
	}			
}//end of class HighTempler

class Drone
{
	public String name = "일벌레";
	public String description = "기본 일꾼 유닛입니다. 광물과 베스핀 가스를 채취할 수 있습니다. 구조물로 변이할 수 있습니다.";

	public int prdMineral = 50;
	public int prdGas = 0;
	public int prdUnit = 1;
	public int prdSpeed  = 17;	
	public String prdBuilding = null;
	public String prdNeedBuild = null;
	public char hotkey = 's';
	//생산

	public int hp = 40;
	public int def = 0;
	public int defUpgrade = 1;	
	public int[] sight = {8,4};
	public double moveSpeed = 2.8125;
	public int mp = 0;
	public int shield = 0;
	public int shieldUpgrade = 0;
	public String[] attribute = new String[] {"경장갑","생체"};
	public int transport = 1;
	//기본 속성

	public String attackName = "발톱";
	public int attackDamage = 5;
	public int attackUpgrade = 0;
	public Double attackRange = 0.1;
	public Double attackSpeed = 1.5;
	public String attackTarget = "지상";
	//공격

	public String[] skill = {"채취","자원 반환","기본 변이","고급 변이","스프레이", "잠복"};

	public String skill1Name = "채취";
	public String skill1Description = "선택한 광물 지대나 베스핀 간헐천에서 건설로봇이 자원을 채취합니다.";
	public char skill1Hotkey = 'g';
	public int skill1Range = 0;	
	
	public void skillGather(int targetMineral, int ownMineral, boolean carryRes)
	{
		//미네랄로 이동하는 코드필요
		targetMineral -= 8;
		carryRes= true;
		this.skillReturnCargo(targetMineral, ownMineral, carryRes);
	}

	public String skill2Name = "자원 반환";
	public String skill2Description = "운반한 자원을 가장 가까운 자원 수집 구조물로 옮깁니다.";
	public char skill2Hotkey = 'c';	
	
	public void skillReturnCargo(int targetMineral, int ownMineral, boolean carryRes)
	{
		//본진건물로 이동하는 코드필요	
		ownMineral += 8;
		carryRes=false;
		this.skillGather(targetMineral, ownMineral, carryRes);
	}

	public String skill3Name = "기본 변이";
	public String skill3Description = "기본 건물의 목록입니다.";
	public char skill3Hotkey = 'b';
	
	public void skillBasicMutation(String[] button)
	{
		button[1] = "부화장";
		button[2] = "추출장";
		button[3] = "";
		button[4] = "";
		button[5] = "산란못";
		button[6] = "진화장";
		button[7] = "바퀴 소굴";
		button[8] = "맹독충 둥지";
		button[9] = "가시 촉수";
		button[10] = "포자 촉수";
		button[11] = "";
		button[12] = "";
	}

	public String skill4Name = "고급 변이";
	public String skill4Description = "고급 건물의 목록입니다.";
	public char skill4Hotkey = 'v';
	
	public void skillAdvancedMutation(String[] button)
	{
		button[1] = "히드라리스크 굴";
		button[2] = "감염구덩이";
		button[3] = "가시지옥 굴";
		button[4] = "";
		button[5] = "둥지탑";
		button[6] = "땅굴망";
		button[7] = "";
		button[8] = "";
		button[9] = "울트라리스크 동굴";		
		button[10] = "";
		button[11] = "";
		button[12] = "";
	}

	public String skill5Name = "스프레이";
	public String skill5Description = "현재 장착한 스프레이를 대상 위치의 지형에 그립니다.";
	public char skill5Hotkey = 'y';
	public int skill5Cooldown = 300;
	
	public void skillSpray()
	{
		//스프레이 그리는 코드필요
	}
	
	public String skill6Name = "잠복";
	public String skill6Description = "땅속으로 몸을 숨깁니다. 잠복 상태에서는 적을 공격하거나 움직일 수 없으며 탐지 기능 없이는 위치가 발각되지 않습니다.";
	public char skill6Hotkey = 'd';
	public String skill6NeedUpgrade = "잠복 업그레이드";
	public double skill6Cooldown;	
	public String skillBurrow(String situation)
	{
		double delay = Math.random()*0.25;
		this.skill6Cooldown = 1.333+delay;
		return situation = "잠복";
	}
	
	public String skill7Name = "잠복 해제";
	public String skill7Description = "지상으로 모습을 드러냅니다.";
	public char skill7Hotkey = 'r';
	public String skill7NeedUpgrade = "잠복 업그레이드";
	public double skill7Cooldown;	
	public String skillUnburrow(String situation)
	{
		double delay = Math.random()*0.25;
		this.skill6Cooldown = 1+delay;
		return situation = "잠복 해제";
	}	
}//end of class Drone

class Marine
{
	public String name = "해병";
	public String description = "다목적 보병입니다.";

	public int prdMineral = 50;
	public int prdGas = 0;
	public int prdUnit = 1;
	public int prdSpeed  = 25;	
	public String prdBuilding = "병영";
	public String prdNeedBuild = null;
	public char hotkey = 'a';
	//생산

	public int[] hp = {45,55};
	public int def = 0;
	public int defUpgrade = 1;	
	public int sight = 9;
	public double[] moveSpeed = {2.25, 3.375};
	public int mp = 0;
	public int shield = 0;
	public int shieldUpgrade = 0;
	public String[] attribute = new String[] {"경장갑","생체"};
	public int transport = 1;
	//기본 속성

	public String attackName = "C-14 가우스 소총";
	public int attackDamage = 6;
	public int attackUpgrade = 1;
	public int attackRange = 5;
	public Double[] attackSpeed = {0.8608, 0.5739};
	public String[] attackTarget = {"지상","공중"};
	//공격
	
	public String skill1Name = "전투 자극제 사용";
	public String skill1Description = "몇 초 동안 이동 및 공격 속도를 크게 향상시키는 강력한 전투 자극제를 유닛에게 투여합니다. 유닛은 체력 10만큼의 상처를 입습니다.";
	public char skill1Hotkey = 't';
	
	public void skillUseStimpack(int presentHp, double attackSpeed)
	{
		presentHp -= 10;
		attackSpeed = this.attackSpeed[1];
		int duration = 15;
	}
}//end of class Marine
