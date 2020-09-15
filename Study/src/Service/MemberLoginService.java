package Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MemberDAO;

public class MemberLoginService {

	public String memberLogin(HttpServletRequest request, HttpServletResponse response) {
		String mid = request.getParameter("mid");
		String mpassword = request.getParameter("mpassword");
		
		MemberDAO mDAO = new MemberDAO();
		mDAO.dbConnection();
		
		boolean loginResult = mDAO.memberLogin(mid, mpassword);
		
		String loginId = null;
		if(loginResult == true) {
			loginId = mid;
		}else {
			loginId = null;
		}
		mDAO.dbClose();
		return loginId;
	}

}
