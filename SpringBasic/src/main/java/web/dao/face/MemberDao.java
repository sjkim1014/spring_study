package web.dao.face;

import java.util.List;

import web.dto.Member;

public interface MemberDao {
	
	public String insertMember(Member member);

	public List<Member> selectMemberAll();

}
