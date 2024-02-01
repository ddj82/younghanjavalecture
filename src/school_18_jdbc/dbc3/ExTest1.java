package school_18_jdbc.dbc3;

import java.util.*;

public class ExTest1 {

	public static void main(String[] args) {
		ExDAO dao = new ExDAO();
		ArrayList<ExDTO> list = dao.select();
		
		for (ExDTO dto : list) {
			int deptno = dto.getDeptno();
			String dname = dto.getDname();
			String loc = dto.getLoc();
			System.out.println(deptno + " " + dname + " " + loc);
		}
		
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			ExDTO dto = list.get(i);
			System.out.println(dto.getDeptno() + " " + dto.getDname() + " " + dto.getLoc());
		}
	}

}
