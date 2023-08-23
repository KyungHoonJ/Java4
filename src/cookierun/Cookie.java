package cookierun;

public class Cookie {
	public byte level = 1;
	public String[] names;
	public short coinPrice;
	public short crystalPrice;
	public short lowestHP = 100;
	public short highestHP;
	public byte hitCount = 0;
	public char grade;
	public String[] parts;
	
	public Cookie(
		String[] names, 
		int coinPrice, 
		int crystalPrice,
		int highestHP,
		char grade,
		String[] parts) {
		this.names =names ;
		this.coinPrice = (short) coinPrice ;
		this.crystalPrice = (short) crystalPrice ;
		this.highestHP = (short) highestHP ;
		this.grade =grade ;
		this.parts =parts ;
	}

	public String getName(String lang) {
		switch(lang) {
			case "en":
				return names[1];
			case "jp":
				return names[2];
			default:
				return names[0];
		}
	}
	
	public int getMaxHp() {
		return lowestHP + ((level - 1) * (highestHP - lowestHP) / 7);
	}

	public int changeNowHp()
	{
		return getMaxHp() - (hitCount * 40);
	}

	public String meta()
	{
		return parts[(int)(Math.random() * parts.length)];
	}
}
