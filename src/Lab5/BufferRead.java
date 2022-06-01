package Lab5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferRead {
	public static void main(String[] args) throws IOException {
		String dir = "C:\\Users\\poojbn\\Desktop\\Sample.txt";
		BufferedReader br = new BufferedReader(new FileReader(dir));
		String dataLine = br.readLine();
		while (dataLine != null) {
			System.out.println(dataLine); // Printing current line.
			dataLine = br.readLine(); // Going to the next line.
		}
		br.close();
	}
}