package ch14.sec01.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteBytesExample {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = new FileOutputStream("test2.db");

		byte[] bytes = { 10, 20, 30};
		
		os.write(bytes);
		
		os.flush();
		os.close();
	}

}
