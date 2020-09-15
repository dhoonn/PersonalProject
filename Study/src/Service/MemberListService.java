package Service;

import java.util.ArrayList;
import java.util.List;

import DAO.MemberDAO;
import DTO.MemberDTO;

public class MemberListService {

	public List<MemberDTO> memberList() {
		MemberDAO mDAO = new MemberDAO();
		List<MemberDTO> memberList = new ArrayList<MemberDTO>();
		mDAO.dbConnection();
		memberList = mDAO.memberlist();
		mDAO.dbClose();
		return memberList;
	}

}
