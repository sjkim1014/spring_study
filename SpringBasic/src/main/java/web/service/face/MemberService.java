package web.service.face;

import java.util.List;

import web.dto.Member;

public interface MemberService {
	
	public String insert(Member member);

	public List<Member> getMember();
}
