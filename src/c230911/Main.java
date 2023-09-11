package c230911;

import c230911.buffered.BufferedTest;
import c230911.byteStream.OutputStreamTest;
import c230911.fileIO.FileIOTest;
import c230911.fileIO.SubTest;
import c230911.stream.MatchTest;
import c230911.stream.OptionsTest;

public class Main {
	public static void main(String[] args) {
		// 드디어 저장한다?
		MatchTest.test();
		OptionsTest.test();
		OutputStreamTest.test();
		FileIOTest.test();
		SubTest.test();
		BufferedTest.test();
	}
}
