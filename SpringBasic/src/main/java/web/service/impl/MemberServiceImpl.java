package web.service.impl;

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

	@Override
	public List<Member> getMember() {
		return memberDao.selectMemberAll();
	}

}
