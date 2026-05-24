package in.nadeem;

import in.nadeem.dao.EmpDAO;
import in.nadeem.dao.impl.EmpDAOImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		EmpDAO dao = new EmpDAOImpl();

		dao.executeProcedure(7659);
	}
}
