package ex.ch08;

public class Ch08_02_E3_DaoExample {
	
	public static void dbWork(Ch08_02_E3_DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new Ch08_02_E3_OracleDao());
		dbWork(new Ch08_02_E3_MySqlDao());

	}

}
