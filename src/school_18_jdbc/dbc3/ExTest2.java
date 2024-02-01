package school_18_jdbc.dbc3;

public class ExTest2 {

	public static void main(String[] args) {
		ExDAO dao = new ExDAO();
//		dao.insert(60, "test", "seoul");
//		dao.update(50, "test", "anyang");
//		dao.deleteDno(50);
		dao.deleteLoc("seoul");
		
		
	}

}
