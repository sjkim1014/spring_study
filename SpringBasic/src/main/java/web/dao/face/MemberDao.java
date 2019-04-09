package web.dao.face;

import java.util.HashMap;
import java.util.List;

//import org.apache.ibatis.annotations.Param;

import web.dto.Member;

public interface MemberDao {
	
	public String insertMember(Member member);

	public List<Member> selectMemberAll();

//	public List<Member> selectByName(String name);
	
//	public List<Member> selectByName(Member member);
	
	public List<Member> selectByName(HashMap map);

//	public List<Member> selectByName(String string, String string2);

}
