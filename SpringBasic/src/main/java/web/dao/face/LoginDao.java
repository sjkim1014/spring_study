package web.dao.face;

import org.springframework.ui.Model;

public interface LoginDao {

	public int login(String id, String pw);

	public int login(Model model);

}
