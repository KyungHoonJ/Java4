package homework.h230822;

public class Persona {
	public PersonaSkillInfo personaSkillInfo = new PersonaSkillInfo();
	public PersonasSkill[] personasSkill = new PersonasSkill[8];
	public String name;
	public String personaBookInfo;
	public int level;
	public int str;
	public int magic;
	public int def;
	public int speed;
	public int luck;
	public int exp;
	public int[] upstatus;
	public String arcana; //아르카나는 변화하지 않는다.
	public String[] weak; //공격받을 때 공격속성이 일치하는게 있으면
	public String[] resist; ////공격할 때 공격속성이 일치하는게 있으면
	public String[] changeItem;//통상인지 경보인지는 아이템화 시키는 곳에서
	public String summonSpeech;
	public String[] specificity; //효과를 불러올때는 0번으로 계승여부확인은 2번으로
	public String[] nowSkill; //페르소나가 소지할 수 있는 스킬 8개
	public String[] canLearnSkillname;
	public String[] learnSkillInfo;
	public int[] canLearnSkillLevel;
	
	public Persona(
			String name,
			String personaBookInfo,
			int level,
			int str,
			int magic,
			int def,
			int speed,
			int luck,
			int exp,
			int[] upstatus,
			String arcana,
			String[] weak,
			String[] resist,
			String[] changeItem,
			String summonSpeech,
			String[] specificity,
			String[] nowSkill,
			String[] canLearnSkillname,
			String[] learnSkillInfo,
			int[] canLearnSkillLevel) {
		 this.name = name; 
		 this.personaBookInfo = personaBookInfo;
		 this.level = level;
		 this.str = str;
		 this.magic = magic;
		 this.def = def;
		 this.speed = speed;
		 this.luck = luck;
		 this.exp = exp;
		 this.upstatus = upstatus;
		 this.arcana = arcana;
		 this.weak = weak;
		 this.resist = resist;
		 this.changeItem = changeItem;
		 this.summonSpeech = summonSpeech;
		 this.specificity = specificity;
		 this.nowSkill = nowSkill;
		 this.canLearnSkillname = canLearnSkillname;
		 this.learnSkillInfo = learnSkillInfo;
		 this.canLearnSkillLevel = canLearnSkillLevel;
	}

	void levelup()//레벨당 자료가 없어서 임의 수치
	{
		level = level+1;
		str = str+upstatus[0];
		magic = magic+upstatus[1];
		def = def+upstatus[2];
		speed = speed+upstatus[3];
		luck = luck+upstatus[4];
	}
	
}

class PersonaSkillInfo
{
	enum Persona {에이하,슬래시,스쿤다,몽견침,역경의_각오,지오,디아,파트라,타루카쟈,혼란_내성}; // 스킬이 몇번이지 까먹지 않기위해서
	String skillname[] = {"에이하","슬래시","스쿤다","몽견침","역경의 각오","지오","디아","파트라","타루카쟈","혼란 내성"};
	int useMp[] = {4,0,8,0,0,4,3,4,8,0};
	int useHp[] = {0,6,0,8,0,0,0,0,0,0};
	String target[] = {"enemy","enemy","enemy","enemy","passive","enemy","ally","enemy","enemy","passive"};
	int targetNumber[] = {1,1,1,1,1,1,1,1,1,1};
	String type[] = {"어둠","물리","변화","물리","물리","패시브","전기","회복","변화","변화","패시브"};
}

// 현규야 배운 것만 쓰자?
enum SkillType {
	Attack, Passive, Buff
}

enum SkillAttribute {
	Dark, Physics, Transition, Electricity, Recovery  
}

class PersonasSkill{
	String name;
	int consumeMp;
	int consumeHp;
	SkillType type;
	boolean isAllTarget;
	SkillAttribute attribute;
	
	public PersonasSkill() {
		// TODO Auto-generated constructor stub
	}
}


