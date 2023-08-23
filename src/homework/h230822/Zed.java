package homework.h230822;
// 송성민
import java.util.Scanner;

class Abilities {
		public int[] Stamina=new int[18];
		public double[] StaminaRegeneration=new double[18];
		public int Energy=200;
		public int EnergyRegeneration=50;
		public double[] Damage=new double[18];
		public double[] AttackSpeed=new double[18];
		public double[] Armor=new double[18];
		public double[] MagicResistance=new double[18];
		public int Range=125;
		public int MovementSpeed=345;
		public int[] Level=new int[18];
		public String Difficulty="상";
		public String DamageAbility="상";
		public String DefenseAbility="하";
		public String CrowdControlAbility="하";
		public String MovementAbility="상";
		public String AssistiveAbility="하";
				
		Abilities() {
			for(int i=0; i<Level.length; i++) {
				Level[i]=i+1;
			}
			for(int i=0; i<18; i++) {				
				if(Level[i]==i+1) {
					Stamina[i]=654+(i*99);
					StaminaRegeneration[i]=7+(i*0.65);
					Damage[i]=63+(i*3.4);
					AttackSpeed[i]=0.651+(i*(0.651*0.033));
					Armor[i]=32+(i*4.7);
					MagicResistance[i]=29+(i*2.05);										
				}				
			}						
		}				
}

	class Voice {
		public String PickVoice="보이지 않는 검이 가장 무서운 법";
		public String[] MovementVoices= 
	   {"소리없이.","금기 따윈 상관 안 해.","그림자단이여, 용감하게 진실을 찾아라.",
		"가려진 길이라 해도 두려울 건 없어."+"균형 같은 소리 하지 마.",
		"비급이라니, 아껴 두면 무슨 소용이야.","그림자가 나를 일깨웠다.",
		"균형은 약점일 뿐이야.","진실은 바로 어둠 속에 있지.",
		"현명한 자라면 전통에 연연하지 않아.","엎지른 물은 주워담을 수 없어."};		
		public String[] AttackVoices=
	   {"가치있는 자만 살아남는 거야.","나는 어둠 속에 숨은 검이다!",
		"숨통을 끊어 주마.","속박의 굴레를 벗어.","가슴 속에 그림자가 있지.",
		"나를 부정하지 마.","엉뚱한 스승을 따랐군.","아무도 그림자를 피할 수 없다.",
		"무지한 놈들."};		
	}
	class Skill {
		public String PassiveSkill=
	    "약자 멸시(Contempt for the Weak)\r\n"
	   +"제드가 체력 50% 이하인 적을 기본 공격하면 대상의 최대 체력에 비례한 마법 피해를 추가로 입힙니다.\r\n"
	   +"같은 적 챔피언에게는 이 효과가 10초에 한 번씩만 적용됩니다.\r\n"
	   +"에픽 몬스터 상대 최대 피해량은 300입니다.\r\n"
	   +"정글 몬스터에게 200%의 피해를 입힙니다.\r\n"
	   +"마법피해 대상 최대 체력의 6 / 8 / 10%";
		public String FirstSkill=
		"Q-예리한 표창(Razor Shuriken)\r\n"
	   +"제드와 그림자가 표창을 던져, 각각 처음 맞는 적에게 물리 피해를 입히고\r\n"		
	   +"이후 추가로 맞히는 적에게는 각각 60%의 물리 피해를 입힙니다."; 
		public String SecondSkill=
		"W - 살아있는 그림자(Living Shadow)\r\n"
	   +"기본 지속 효과: 제드와 그림자가 같은 스킬로 동일한 대상을 공격할 때마다 제드가 기력을 얻습니다.\r\n"
	   +"사용 시: 제드의 그림자가 전방으로 질주하여, 5초간 그 자리에 유지됩니다.\r\n"
	   +"이 스킬을 재사용하면 제드가 그림자와 위치를 바꿉니다.";
		public String ThirdSkill=
		"E - 그림자 베기(Shadow Slash)\r\n"
	   +"제드와 그림자가 각각 주위 적을 베어 물리 피해를 입힙니다.\r\n"
	   +"제드가 이 스킬로 적 챔피언을 하나 맞힐 때마다 살아있는 그림자의\r\n"
	   +"재사용 대기시간이 2초씩 감소합니다.\r\n"
	   +"그림자의 스킬에 맞은 적은 1.5초 동안 둔화됩니다.\r\n"
	   +"그림자 베기로 동일한 대상을 여러 번 맞힐 경우,\r\n"
	   +"추가 피해는 입히지 않지만 1.5배의 둔화 효과가 적용됩니다.";
		public String FourthSkill=
		"제드가 잠시 대상지정불가대상으로 지정할 수 없는 상태가 되어\r\n"
	   +"적 챔피언에게 돌진하며 표식을 남깁니다.\r\n"
	   +"3초가 지나면 표식이 발동되며 물리 피해를 입히고 표식이 적용된 동안\r\n"
	   +"제드가 대상에게 가한 피해의 일부에 해당하는 피해를 추가로 입힙니다.\r\n"
	   +"돌진 시 7.5초 동안 유지되는 그림자가 남습니다.\r\n"
	   +"이 스킬을 재사용하면 제드가 이 그림자와 위치를 바꿉니다.";
		public int[] FirstSkillEnergyConsumption=new int[5];
		public int FirstSkillRange=900;
		public int FirstSkillCooldown=6;
		public double[] FirstSkillInitialDamage=new double[5];
		public double[] FirstSkillPenetratingdamage=new double[5];
		public int[] SecondSkillEnergyConsumption=new int[5];
		public int SecondSkillRange=650;
		public double[] SecondSkillCooldown=new double[5];
		public int SecondSkillRange2=1950;
		public int SecondSkillProjectionspeed=2500;
		public int ThirdSkillEnergyConsumption=40;
		public int ThirdSkillRange=290;
		public double[] ThirdSkillCooldown=new double[5];
		public double[] ThirdSkillDamage=new double[5];
		public int FourthSkillRange=625;
		public int[] FourthSkillCooldown=new int[3];
		public double FourthSkillDamage;
		public double[] FourthSkillDamage2=new double[3];
		public String FourthSkillRange2="제한없음";
		public int[] SkillLevel=new int[5];
		public int AdditionalAttackDamage;
		public int TotalAttackDamage;
		
		Skill() {
			for(int i=0; i<SkillLevel.length; i++) {
				SkillLevel[i]=i+1;
			}
			for(int i=0; i<5; i++) {
				if(SkillLevel[i]==i+1) {
					FirstSkillEnergyConsumption[i]=75-(i*5);
					FirstSkillInitialDamage[i]=70+(i*35)+AdditionalAttackDamage;
					FirstSkillPenetratingdamage[i]=42+(i*21)+AdditionalAttackDamage;
					SecondSkillEnergyConsumption[i]=40-(i*5);
					SecondSkillCooldown[i]=20-(i*1.5);
					ThirdSkillCooldown[i]=5-(i*0.5);
					ThirdSkillDamage[i]=65+(i*20);
					FourthSkillCooldown[i]=120-(i*20);
					FourthSkillDamage2[i]=FourthSkillDamage*(0.25+(i*0.15))+(TotalAttackDamage*0.65);				
				}
			}
		}
	}
	class Rune {
		public String DominationBuilds=
		"핵심 룬 : 지배\r\n"
	   +"감전, 피의 맛, 사냥의 증표, 궁극의 사냥꾼\r\n"
	   +"보조 룬 : 마법\r\n"
	   +"깨달음, 주문작열\r\n"
	   +"보조 룬 : 정밀\r\n"
	   +"침착, 강인함\r\n"
	   +"보조 룬 : 결의1\r\n"
	   +"재생의 바람, 불굴의 의지\r\n"
	   +"보조 룬 : 결의2\r\n"
	   +"뼈 방패, 불굴의 의지";				
		public String PrecisionBuilds=
		"핵심 룬 : 정밀\r\n"
	   +"정복자, 침착, 강인함, 최후의 일격\r\n"
	   +"보조 룬 : 마법1\r\n"
	   +"빛의 망토, 깨달음\r\n"
	   +"보조 룬 : 마법2\r\n"
	   +"빛의 망토, 주문 작열";		
	}
	class Item {
		public String StartItems="롱소드\r\n"+"도란의 방패+1포션";
		public String MythicalItems="월식\r\n"+"드락사르의 황혼검\r\n"+"요우무의 유령검";
		public String AttackItems=
		"그림자 검\r\n"
	   +"자객의 발톱\r\n"
	   +"굶주린 히드라\r\n"
	   +"칠흑의 양날 도끼\r\n"
	   +"세릴다의 원한\r\n"
	   +"독사의 송곳니\r\n"
	   +"징수의 총\r\n"
	   +"원칙의 원형낫\r\n"
	   +"쇼진의 창";
		public String DefensiveItems=
		"밤의 끝자락\r\n"
	   +"맬모셔스의 아귀\r\n"
	   +"수호 천사\r\n"
	   +"은빛 여명-수은 장식띠";
		public String shoes=
		"명석함의 아이오니아 장화\r\n"
	   +"기동력의 장화\r\n"
	   +"판금장화\r\n"
	   +"헤르메스의 발걸음\r\n"
	   +"신속의 장화";				
	}
	public class Zed {

		public String Job="역할군 : 암살자";
		public String Belong="소속 : 아이오니아";
		public String BackGround="배경\r\n"
	   +"제드는 극도로 무자비하고 인정사정 없는 인물로,\r\n"
	   +"녹서스 침공군을 몰아내기 위해 아이오니아의 전통 마법과 무술을 집약시킨다는 의도로 설립한 그림자단의 수장이다.\r\n"
	   +"아이오니아 전쟁 중 제드는 녹서스에게 이기고 싶다는 간절한 마음에서 그림자 비급의 봉인을 해제해 버렸다.\r\n"		 
	   +"그 사악한 비급은 강력한 만큼이나 위험하고, 사용자를 타락의 길로 빠뜨리는 것이었다.\r\n"
	   +"하지만 제드는 아랑곳하지 않고 모든 금단의 비술을 익혔다.\r\n"
	   +"자신의 국가에, 아니면 자신이 만든 그림자단에 위협이 될 만한 것을 모조리 파괴하기 위해.";
		public String DamageType="공격타입 : 물리(AD)";
		public String Merit="장점\r\n"
	   +"강하고 안정적인 라인전\r\n"
	   +"우수한 파밍 및 기동성을 통한 운영 능력\r\n"
	   +"살인적인 단일 대상 누킹 능력\r\n"
	   +"확정적이고 리스크가 적은 진입\r\n"
	   +"그림자를 활용한 어그로 핑퐁과 교란 능력\r\n"
	   +"스플릿 푸시와 스노우볼링 구도의 강세";
		public String Disadvantages="단점\r\n"
	   +"높은 살아있는 그림자(W) 의존도\r\n"
	   +"취약한 근접전 및 전투 지속력\r\n"
	   +"높은 궁극기 의존도와 매커니즘의 한계\r\n"
	   +"부족한 팀 기여도와 취약한 대치전으로 인한 낮은 한타 기여도\r\n"
	   +"까다로운 운영 및 조작 난이도로 인한 파일럿 간 편차1";
		public String Line="라인 : 미드";	
		
	public static void main(String[] args) {
	    Zed zed=new Zed();	
	    System.out.println(zed.Job);
	    System.out.println(zed.Belong);
	    System.out.println(zed.BackGround);
	    System.out.println();
	    System.out.println(zed.DamageType);
	    System.out.println(zed.Merit);
	    System.out.println();
	    System.out.println(zed.Disadvantages);
	    System.out.println();
	    System.out.println(zed.Line);
	    
	    Scanner sc=new Scanner(System.in);
	    Abilities abilities=new Abilities();
	    System.out.println("레벨을 입력하세요(1~18)");
	    int num =sc.nextInt();
	    System.out.println("체력 : "+abilities.Stamina[num]);
	    System.out.println("체력 재생 : "+abilities.StaminaRegeneration[num]);
	    System.out.println("공격력 : "+abilities.Damage[num]);
	    System.out.println("공격속도 : "+abilities.AttackSpeed[num]);
//	    for (int i = 0; i < abilities.Stamina.length; i++) {
//			System.out.println(abilities.Stamina[num]);
//		}
	    
	
	
	
	}
}
