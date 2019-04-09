package web.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.dao.face.MemberDao;
import web.dto.Member;
import web.service.face.MemberService;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired MemberDao memberDao;
	
	
	@Override
	public String insert(Member member) {
		// TODO Auto-generated method stub
		return memberDao.insertMember(member);
	}

//	@Override
//	public List<Member> getMember() {
//		return memberDao.selectMemberAll();
//		return memberDao.selectByName("");
//	}
	
//	@Override 
//	public List<Member> getMember() {
//		Member member1 = new Member();
//		member1.setName("sujeong");
//		member1.setEmail("c");
//		return memberDao.selectMemberAll();
//		return memberDao.selectByName("");
//		return memberDao.selectByName(member1);
//	}
//	@Override
//	public List<Member> getMember() {
//		HashMap map = new HashMap();
//		map.put("name", "sujeong");
//		map.put("email", "1");
//		return memberDao.selectByName(map);
//	}
	@Override
	public List<Member> getMember() {
		String [] names = {"b", "김", "t"};
		HashMap map = new HashMap();
		map.put("arr", names);
		return memberDao.selectByName(map);
	}
}
