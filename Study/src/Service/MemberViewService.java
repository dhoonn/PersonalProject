package Service;

import javax.servlet.http.HttpServletRequest;

import DAO.MemberDAO;
import DTO.MemberDTO;

public class MemberViewService {
	public MemberDTO memberView(String mid) {
		MemberDAO mDAO = new MemberDAO();
		mDAO.dbConnection();
		MemberDTO memberView = mDAO.memberView(mid);
		mDAO.dbClose();
		return memberView;
	}

}
