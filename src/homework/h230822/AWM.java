package homework.h230822;
// 임주한


class AWM{
		 
	
	public String kind = "SR";
	public String bullet = ".300megnum";
	public String name = "AWM";
	public int speedOfABullet= 945; //탄
	public int stoppingPower = 40000;//저지력
	public int minimumRange = 100;//최소 범위
	public int maximumRange = 1000;//최대 범위
	public double theSpeedOfAProjection = 1.850;
	public int volume = 500;//소모 용
	 
	public String[] acquisitionDestination = new String[] //출현맵
			{"erangel","miramar","sanok","vikendi","karakin","heaven","paramo","taeigo"};
	public String[][] parts = new String[][]//파츠
		{
		{"총구","SR보정기"},{"총구","SR소염기"},{"총구","SR소음기"},
		{"조준경","레드도트사이트"},{"조준경","홀로그램조준기"},{"조준경","2배율 스코프"},{"조준경","4배율 스코프"},
		{"조준경","8배율 스코프"},{"조준경","3배율 스코프"},{"조준경","16배율 스코프"},{"조준경","캔티드사이트"},{"조준경","6배율 스코프"},
		{"탄창","SR대용량 탄창"},{"탄창","SR대용량 퀵드로우 탄창"},{"탄창","SR퀵드로우 탄창"},
		{"개머리판","칙패드"}
		};



	public double[][] damageScale = new double[/*타격부위*/][/*방어구 레벨*/]{
	
	
	{0,},{1,},{2,},{3,},
	{0,},{1,},{2,},{3,},
	{0,},{1,},{2,},{3,},
	{0,},{1,},{2,},{3,},
	{0,},{1,},{2,},{3,},
	{0,},{1,},{2,},{3,},
	{0,},{1,},{2,},{3,},
	{0,},{1,},{2,},{3,},
	
	};

	
		
	 
}
	
class Groza{
		 
	
	public String kind = "AR";
	public String bullet = "7.6mm";
	public String name = "Groza";
	public int speedOfABullet= 715; //탄속
	public int stoppingPower = 10000;//저지력
	public int minimumRange = 100;//최소 범위
	public int maximumRange = 300;//최대 범위
	public double theSpeedOfAProjection = 0.080;
	public int volume = 500;//소모 용량
	 
	public String[] acquisitionDestination = new String[] //출현맵
			{"erangel","miramar","sanok","vikendi","karakin","heaven","paramo","taeigo"};
	public String[][] parts = new String[][]//파츠
		{
		{"총구","AR소음기"},
		{"조준경","레드도트사이트"},{"조준경","홀로그램조준기"},{"조준경","2배율 스코프"},{"조준경","4배율 스코프"},
		{"조준경","3배율 스코프"},{"조준경","6배율 스코프"},
		{"탄창","AR대용량 탄창"},{"탄창","AR대용량 퀵드로우 탄창"},{"탄창","AR퀵드로우 탄창"},
		{"개머리판","칙패드"}
		};



	public double[][] damageScale = new double[/*타격부위*/][/*방어구 레벨*/]{
	
	
	{0,},{1,},{2,},{3,},
	{0,},{1,},{2,},{3,},
	{0,},{1,},{2,},{3,},
	{0,},{1,},{2,},{3,},
	{0,},{1,},{2,},{3,},
	{0,},{1,},{2,},{3,},
	{0,},{1,},{2,},{3,},
	{0,},{1,},{2,},{3,},
	
	};

		
		
	
		
	 
}
	
class UMP45{
		 
	
	public String kind = "SMG";
	public String bullet = ".45ACP";
	public String name = "UMP45";
	public int speedOfABullet= 360; //탄속
	public int stoppingPower = 7000;//저지력
	public int minimumRange = 100;//최소 범위
	public int maximumRange = 300;//최대 범위
	public double theSpeedOfAProjection = 0.092;
	public int volume = 500;//소모 용량
	 
	public String[] acquisitionDestination = new String[] //출현맵
			{"erangel","miramar","sanok","vikendi","karakin","heaven","paramo","taeigo"};
	public String[][] parts = new String[][]//파츠
		{
		{"총구","SMG소음기"},{"총구","SMG소음기"},{"총구","SMG소음기"},
		{"손잡이","앵글손잡이"},{"손잡이","수직손잡이"},{"손잡이","하프손잡이"},{"손잡이","라이트손잡이"},{"손잡이","엄지손잡이"},{"손잡이","레이저사이트"},
		{"조준경","레드도트사이트"},{"조준경","홀로그램조준기"},{"조준경","2배율 스코프"},{"조준경","4배율 스코프"},
		{"조준경","3배율 스코프"},{"조준경","캔티드사이트"},{"조준경","6배율 스코프"},
		{"탄창","SMG대용량 탄창"},{"탄창","SMG대용량 퀵드로우 탄창"},{"탄창","SMG퀵드로우 탄창"},
		{"개머리판","칙패드"}
		};



	public double[][] damageScale = new double[/*타격부위*/][/*방어구 레벨*/]{
		
	
	{0,},{1,},{2,},{3,},
	{0,},{1,},{2,},{3,},
	{0,},{1,},{2,},{3,},
	{0,},{1,},{2,},{3,},
	{0,},{1,},{2,},{3,},
	{0,},{1,},{2,},{3,},
	{0,},{1,},{2,},{3,},
	{0,},{1,},{2,},{3,},
	
	};
}
