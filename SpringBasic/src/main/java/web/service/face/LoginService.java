package web.service.face;

import org.springframework.ui.Model;

public interface LoginService {

	public int login(String id, String pw);

	public int login(Model model);

}
