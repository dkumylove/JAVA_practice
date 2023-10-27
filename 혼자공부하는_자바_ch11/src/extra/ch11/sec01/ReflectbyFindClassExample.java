package extra.ch11.sec01;

public class ReflectbyFindClassExample {

	public static void main(String[] args) {
		// 1. 클래스 찾기
		Class findClass = Child.class;
		System.out.println("Class name : " + findClass.getName());
		
		
		/// 1.1 클래스이름으로 찾기
		///     클래스이름은 정확하게 패키지이름을 포함
		String className = "extra.ch11.sec01.Parent";
		//className = "Child";
		// 클래스 파일의 이름을 모를때 클래스를 가져와라
		// Class.forName("이름") : 지정된 "이름"의 클래스 파일을 찾아 가져오세요
		try {
			Class findClass2 = Class.forName(className);
			System.out.println("Class name : " + findClass2.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
