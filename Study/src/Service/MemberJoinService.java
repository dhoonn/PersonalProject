package Service;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MemberDAO;
import DTO.MemberDTO;

public class MemberJoinService {

	public int memberJoin(HttpServletRequest request, HttpServletResponse response) {
		String mid = request.getParameter("mid");
		String mpassword = request.getParameter("mpassword");
		String mname = request.getParameter("mname");
		String mbirth = request.getParameter("mbirth");
		String mphone = request.getParameter("mphone");
		String memail = request.getParameter("memail");
		String mgender = request.getParameter("mgender");
		
		MemberDTO member = new MemberDTO();
		member.setMid(mid);
		member.setMpassword(mpassword);
		member.setMname(mname);
		member.setMbirth(mbirth);
		member.setMphone(mphone);
		member.setMemail(memail);
		member.setMgender(mgender);
		
		MemberDAO mDAO = new MemberDAO();
		mDAO.dbConnection();
		int joinResult = mDAO.memberJoin(member);
		mDAO.dbClose();
		return joinResult;
	}

}
