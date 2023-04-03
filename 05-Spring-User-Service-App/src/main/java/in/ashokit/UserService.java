package in.ashokit;

public class UserService {

	private UserDAO dao;

	

	public void setDao(UserDAO dao) {
		this.dao = dao;
	}

	public void printName(int id) {

		String findName = dao.findName(id);

		if (findName != null) {
			System.out.println(findName);
		} else {
			System.out.println("Not Found !");
		}

	}
}
