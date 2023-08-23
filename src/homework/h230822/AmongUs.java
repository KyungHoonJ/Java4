package homework.h230822;
//import java.util.Scanner;
// 권원준

class Character
{
	Skill skill = new Skill();
	public int emergencyMeeting = 0; //긴급회의 소집을 활성화 하지 않음
	public int vote = 0; //투표를 하지 않음.
	public int myLocation = 0; //나의 캐릭터의 위치
	public int otherLocation = 0;//다른 사람의 캐릭터의 위치
	public double moveSpeed = 1.0; // 이동속도 1
	public boolean missionUpdate = true; //미션 업데이트 항상 활성화
	public boolean misssion = true; // 클리어한 만큼 임무 게이지 활성화
	public String nicName = " "; //유저정보로 부터 가져옴
	public int colorSelet = 0; //캐릭터 색상 선택
	public int die = 0; //사망하면 1로 활성화
	public String moveUp = "w"; //w를 누르면 위로 이동
	public String moveDown = "s"; //s를 누르면 아래로 이동
	public String moveRight = "d"; //d를 누르면 오른쪽로 이동
	public String moveLeft = "a"; //a를 누르면 왼쪽으로 이동
	public String[] allSkills = new String[] {
		"report", 
		"emergencyMeeting",
		"lever"
	};
}

class Crew extends Character //크루원
{
//	Skill skill = new Skill();
//	public int emergencyMeeting = 0; //긴급회의 소집을 활성화 하지 않음
//	public int vote = 0; //투표를 하지 않음.
//	public int myLocation = 0; //나의 캐릭터의 위치
//	public int otherLocation = 0;//다른 사람의 캐릭터의 위치
//	public double moveSpeed = 1.0; // 이동속도 1
//	public boolean missionUpdate = true; //미션 업데이트 항상 활성화
//	public boolean misssion = true; // 클리어한 만큼 임무 게이지 활성화
//	public String nicName = " "; //유저정보로 부터 가져옴
//	public int colorSelet = 0; //캐릭터 색상 선택
//	public int die = 0; //사망하면 1로 활성화
//	public String moveUp = "w"; //w를 누르면 위로 이동
//	public String moveDown = "s"; //s를 누르면 아래로 이동
//	public String moveRight = "d"; //d를 누르면 오른쪽로 이동
//	public String moveLeft = "a"; //a를 누르면 왼쪽으로 이동
//	public String[] allSkills = new String[] {
//		"report", 
//		"emergencyMeeting",
//		"lever"
//	};
	
	int dieCount = 0;
//	Character character = new Character();
//	CrewGost cGost = new CrewGost();
	public static double crewView = 1.0; //크루원 기본 시야
	public static int doMission =0; //크루원은 미션을 할 수 있다.
	int missionCount = 0;
}

class GuardianAngelGost extends Crew //수호천사
{	
//	Character character = new Character();
	// Crew crew = new Crew();
	SkillCrew skill = new SkillCrew();
	public int die = 1;
	public static int[] gostColor = new int[15]; //유령이 되면 적용
	public static double moveSpeed = 3.0; // 이동속도 3
	public String[] skills = new String[] {"guard"}; //유령이 되면 스킬 활성화
}

class Scientist extends Crew
{
//	Character character = new Character();
//	Crew crew = new Crew();
	CrewGost cGost = new CrewGost();
	Skill skill = new Skill();
	public String[] skills = new String[] {"vitals"}; //과학자는 스킬을 사용할 수 있다.
}

class Technician
{
	Character character = new Character();
	Crew crew = new Crew();
	CrewGost cGost = new CrewGost();
	Skill skill = new Skill();
	public String[] skills = new String[] {"lesser vent"}; //기술자는 스킬을 사용할 수 있다.

}

class CrewGost
{
	Character character = new Character();
	Crew crew = new Crew();
	//유령이 되면 적용
	public static double moveSpeed = 3.0; // 이동속도 3
}

class Imporster
{
	Character character = new Character();
	InmporsterGost imGost = new  InmporsterGost();
	Skill skill = new Skill();
	public static double imporster = Crew.crewView*1.5; //임포스터는 크루윈의 1.5배의 시야를 가진다.
	public static boolean misssion = false; // 클리어한 민큼 임무 게이지 활성화
	public String[] skills = new String[] {
		"kill", 
		"savotage", 
		"vent"
	};  //기본적인 임포스터의 스킬은 킬, 방해공작, 환퉁구를 통한 순간이동이다.
}

class ShapeShifter
{
	Character character = new Character();
	Imporster imporster = new Imporster();
	InmporsterGost imGost = new  InmporsterGost();
	Skill skill = new Skill();
	public String[] skills = new String[] {
		"kill", 
		"savotage", 
		"vent", 
		"shapeshift"
	};  //일반적인 임포스터보다 스킬이 하나 더 있다.
}

class InmporsterGost
{
	Character character = new Character();
	Imporster imporster = new Imporster();
	public static int[] gostColor = new int[15]; //유령이 되면 적용
	public static double moveSpeed = 3.0; // 이동속도 3

}

class Skill
{
//	Character character = new Character();
	public int coolTime = 0; //스킬의 쿨타임
	public int duration = 0; //스킬의 지속시간
	public int vent1 = 0; //밴트 1번
	public int vent2 = 0; //밴트 2번
	public int vent3 = 0; //밴트 3번
	public int vent4 = 0; //밴트 4번
	public int vent5 = 0; //밴트 5번
	public int vent6 = 0; //밴트 6번
	public int win = 0; //승리
	
	public String emergencyMeeting = "emergencyMeeting";
	void emergencyMeeting() {}
	
	public String report = "report";
	void report() {}
	
	public String lever = "lever";
	void lever() {}
}

class SkillCrew extends Skill {
	public String guard = "guard";
	void guard() {}
	
	public String lesserVent = "lesserVent";
	void lesserVent() {}
}

class SkillImporster extends Skill {
	public int savotage1 = 0; //빙해공작 활성화 여부
	public int shapeshift1 = 0; //형상변환자 활성화 여부
	
	public String kill = "kill";
	void kill() {}
	
	public String savotage = "savotage";
	void savotage() {}
	
	public String vent = "vent";
	void vent() {}
	
	public String shapeshift = "shapeshift";
	void shapeshft() {}
}

