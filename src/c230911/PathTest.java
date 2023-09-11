package c230911;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
	public static void test() {
		// String path
		Path path = Paths.get("src/c230911/../c230908");
		System.out.println(path.toAbsolutePath().normalize());
		
		File file = new File(path.toString() + "\\Main1.java");
		System.out.println(file.exists());
		try {
//			file.createNewFile();
			file.mkdir();
		}catch(Exception e) {
			e.printStackTrace();
		}
//		exit
	}
}
