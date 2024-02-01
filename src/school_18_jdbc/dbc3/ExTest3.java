package school_18_jdbc.dbc3;

public class ExTest3 {

	public static void main(String[] args) {
		ExDAO dao = new ExDAO();
		ExDTO dto = dao.selectOne(10);
		if (dto != null) {
			System.out.println(dto.getDeptno() + ", " + dto.getDname() + ", " + dto.getLoc());
		} else {
			System.out.println("존재하지 않는 부서번호 입니다.");
		} 
		
		
	}

}
