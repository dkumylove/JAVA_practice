package ch14.sec02.exam06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectStreamExample {

	public static void main(String[] args) throws Exception {
		// List를 파일에 저장
		writeList();
		// 파일에 저장된 List읽기
		List<Board> list = readList();
		
		// List 내용을 모니터에 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(Board board : list) {
			System.out.println(
					board.getBno() + "\t" + board.getTitle() + "\t" +
					board.getContent() + "\t" + board.getWriter() + "\t" +
					sdf.format(board.getDate())
			);
		}
	} // 메인끝

	public static void writeList() throws Exception {
		// List 생성
		List<Board> list = new ArrayList<>();
		
		// list에 Board객체 저장
		list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date()));
		list.add(new Board(2, "제목2", "내용2", "글쓴이2", new Date()));
		list.add(new Board(3, "제목3", "내용3", "글쓴이3", new Date()));
		
		// 객체 출력 스트림을 이용해서 list 출력
		FileOutputStream fos = new FileOutputStream("C:/temp/board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close();
	} // writeList() 끝
	
	public static List<Board> readList() throws Exception {
		// 객체 입력 스트림을 이용해서 list 입력
		FileInputStream fis = new FileInputStream("C:/temp/board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Board> list = (List<Board>) ois.readObject();
		return list;

	}
}
