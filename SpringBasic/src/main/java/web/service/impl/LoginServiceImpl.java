package web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import web.dao.face.LoginDao;
import web.service.face.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired 
	LoginDao loginDao;

	@Override
	public int login(String id, String pw) {
		System.out.println("LoginServiceImpl");
		return loginDao.login(id, pw);
	}

	@Override
	public int login(Model model) {
		// TODO Auto-generated method stub
		return loginDao.login(model);
	}
}
