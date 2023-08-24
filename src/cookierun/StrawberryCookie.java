package cookierun;

public class StrawberryCookie extends Cookie {
	public StrawberryCookie(
		String[] names, 
		int coinPrice, 
		int crystalPrice,
		int highestHP,
		char grade,
		String[] parts){
		super(names, coinPrice, crystalPrice, highestHP, grade, parts); 
	}
	
	public short getBonusTime() {
		return (short) (this.level * 5 + 10);
	}
}
