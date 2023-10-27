package ex.ch08;

public class Ch08_02_E3_OracleDao implements Ch08_02_E3_DataAccessObject {

	@Override
	public void select() {
		System.out.println("Oracle DB를 검색");
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB를 삽입");
	}

	@Override
	public void update() {
		System.out.println("Oracle DB를 수정");
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB를 삭제");
	}

}
