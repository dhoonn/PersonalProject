package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DB.DBConnection;
import DTO.MemberDTO;

public class MemberDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	public void dbConnection() {
		con = DBConnection.getConnection();
	}
	public void dbClose() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void pstmtClose() {
		try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void rsClose() {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public int memberJoin(MemberDTO member) {
		String sql = "INSERT INTO MEMBER(MID,MPASSWORD,MNAME,MBIRTH,MPHONE,MEMAIL,MGENDER)"+"VALUES(?,?,?,?,?,?,?)";
		int joinResult = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getMid());
			pstmt.setString(2, member.getMpassword());
			pstmt.setString(3, member.getMname());
			pstmt.setString(4, member.getMbirth());
			pstmt.setString(5, member.getMphone());
			pstmt.setString(6, member.getMemail());
			pstmt.setString(7, member.getMgender());
			joinResult = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			pstmtClose();
		}
		
		return joinResult;
	}
	public boolean memberLogin(String mid, String mpassword) {
		String sql = "SELECT * FROM MEMBER WHERE MID=? AND MPASSWORD=?";
		boolean loginResult=false;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mid);
			pstmt.setString(2, mpassword);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				loginResult = true;
			} else {
				loginResult = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			rsClose();
			pstmtClose();
		}
		return loginResult;
	}
	public List<MemberDTO> memberlist() {
		String sql = "SELECT * FROM MEMBER";
		List<MemberDTO> memberList = new ArrayList<MemberDTO>();
		MemberDTO member = null;
		try {
			pstmt = con.prepareStatement(sql);
			rs= pstmt.executeQuery();
			while(rs.next()) {
				member = new MemberDTO();
				member.setMid(rs.getString("MID"));
				member.setMpassword(rs.getString("MPASSWORD"));
				member.setMname(rs.getString("MNAME"));
				member.setMbirth(rs.getString("MBIRTH"));
				member.setMphone(rs.getString("MPHONE"));                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
				member.setMemail(rs.getString("MEMAIL"));
				member.setMgender(rs.getString("MGENDER"));
				memberList.add(member);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			rsClose();
		}
		
		return memberList;
	}
	public MemberDTO memberView(String mid) {
		String sql = "SELECT * FROM MEMBER WHERE MID=?";
		System.out.println("asdfsaf"+mid);
		MemberDTO memberView = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				memberView = new MemberDTO();
				memberView.setMid(rs.getString("MID"));
				memberView.setMpassword(rs.getString("MPASSWORD"));
				memberView.setMname(rs.getString("MNAME"));
				memberView.setMbirth(rs.getString("MBIRTH"));
				memberView.setMphone(rs.getString("MPHONE"));                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
				memberView.setMemail(rs.getString("MEMAIL"));
				memberView.setMgender(rs.getString("MGENDER"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			rsClose();
			pstmtClose();
		}
		return memberView;
	}

}
