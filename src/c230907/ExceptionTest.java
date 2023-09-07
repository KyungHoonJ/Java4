package c230907;

public class ExceptionTest {
	public static void test() throws Exception {
		try {
			// 가장 기본적인 예외처리 방법
			// try catch finally : 어떤 언어든지 다있다. 그리고 다 똑같다.
			int[] arr = new int[] {1};
			System.out.println(arr[1]);
//			arr[0] = 3;
		}catch(Exception e) { // ArrayIndexOutOfBoundsException
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
			// Parent adsf = new Child(); // 업캐스팅
		}finally {
			System.out.println("무조건 실행");
		}
		System.out.println("무조건 실행111");
		
		new ExceptionTest().printLength(null);
	}
	
	public void printLength(String str) {
		int result = str.length();
		System.out.println("str's length is " + result);
	}
}
