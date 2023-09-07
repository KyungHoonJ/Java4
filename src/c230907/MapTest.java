package c230907;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("권원준", 7);
		map.put("김남균", 8);
		map.put("임현규", 23);
		map.put("김동선", 3);
		map.put("정경훈", 7);
		System.out.println(map.size());

		System.out.println(map.get("정경훈"));
		map.put("정경훈", 13);
		System.out.println(map.size());
		System.out.println(map.get("정경훈"));
		
		Set<String> ketSet = map.keySet();
	}
}
