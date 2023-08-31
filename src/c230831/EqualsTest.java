package c230831;

public class EqualsTest {
	String name;
	int num;
	
	EqualsTest(int num, String name){
		this.num = num;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
//		if(obj instanceof EqualsTest) {
//			if(num == ((EqualsTest) obj).num && 
//					((EqualsTest) obj).name.equals(name)) {
//				return true;
//			}
//		}
//
////		if(obj instanceof EqualsTest && 
////				((EqualsTest) obj).name.equals(name)) {
////			return true;
////		}
//		
//		return false;
		
		if(!(obj instanceof EqualsTest)) return false;
		
		if(!((EqualsTest) obj).name.equals(name)) return false;
		
		if(num != ((EqualsTest)obj).num) return false;
		
		return true;
	}
	
	@Override
	public int hashCode() {
		return num + name.hashCode();
	}
	
	@Override
	public String toString() {
		return "제 이름은 " + name + "입니다. 나이는 " + num + "살 입니다.";
	}
}







