package c230908;

import c230908.functional.FuncTest;
import c230908.stream.StreamTest;

public class Main {
	public static void main(String[] args) {
		// Lambda
		//   - 람다식 : 메서드 그 자체
		//   - 이름이 없다.
		//   - 타입은? X
		//   - ()->{}
		//   - 매개변수는? 있다.
		//   - 코드
		//   - 어따 쓸까?
		//     - Functional Programming
		//     - 함수형 프로그래밍
		//     - main(()->{})
		//     - for(int i : arr){i * 2} << forEach
		//     - foreach((i)->{i * 2}) << ???
		//   - 람다식을 매개변수로 받는 매서드를 만들 수 있어야 한다
		//   - interface 를 사용해서 미리 내용을 선언해둔다.
		// Stream
		//   - 데이터를 쪼개서 한번에 처리할 수 있는 량으로 바꿔준다?
		//   - 유튜브 스트리밍? => 유튜브 라이브, 녹화된 동영상
		//     동영상 파일을 다운 받지 않고 실시간으로 조각된 파일을 재생한다.
		//   - 하나의 데이터 => 배열, 셋, 맵
		// TodoList
		//     - 애플리케이션 설계
		
//		FuncTest.test();
		
		StreamTest.test();
	}
}
