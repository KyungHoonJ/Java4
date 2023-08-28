package cookierun;

import cookierun.cookie.*;

public class Main {
	public static void main(String[] args) {
		StrawberryCookie test = new StrawberryCookie(
				new String[] {
						"딸기맛 쿠키", 
						"Strawberry Cookie", 
						"イチゴ味クッキー", 
						"草莓餅乾", 
						"คุกกี้รเบอร์รี่สสตรอ"},
				13500,
				15,
				135,
				'C',
				new String[] {
					"나랑 같이 달려줄 거야?",
					"난 외롭지 않아",
					"내 친구가 되어줄래?",
					"여기는 조금 무서운 곳인 거 같아...",
					"인생은 혼자야...",
					"누구든지 작은 딸기맛 쿠키를 건드리면...",
					"뭔일인지 모르겠으니까 그냥 가만히 있어야겠다",
					"이불 밖은 위험해...!"
					}
				);
		test.level += 7;
		System.out.println(test.level);
		System.out.println(test.getMaxHp());
	}
}
