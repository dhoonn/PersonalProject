package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DB.DBConnection;
import DTO.BoardDTO;

public class BoardDAO {
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

	public List<BoardDTO> boardList() {
		String sql = "SELECT * FROM BOARD ORDER BY BNUMBER DESC";
		List<BoardDTO> boardList = new ArrayList<BoardDTO>();
		BoardDTO board = null;
		try {
			pstmt=con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				board = new BoardDTO();
				board.setBnumber(rs.getInt("BNUMBER"));
				board.setBwriter(rs.getString("BWRITER"));
				board.setBtitle(rs.getString("BTITLE"));
				board.setBcontent(rs.getString("BCONTENT"));
				board.setBfile(rs.getString("BFILE"));
				board.setBdate(rs.getDate("BDATE"));
				board.setBlike(rs.getInt("BLIKE"));
				board.setBhits(rs.getInt("BHITS"));
				boardList.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			pstmtClose();
			rsClose();
		}
		return boardList;
	}

	public int boardWrite(BoardDTO board) {
		String sql = "INSERT INTO BOARD(BNUMBER,BWRITER,BTITLE,BCONTENT,BCATEGORY,BFILE,BDATE,BLIKE,BHITS)"
				+"VALUES(BOARD_SEQ.NEXTVAL,?,?,?,?,?,SYSDATE,0,0)";
	int writeResult = 0;
	try {
		pstmt=con.prepareStatement(sql);
		pstmt.setString(1, board.getBwriter());
		pstmt.setString(2, board.getBtitle());
		pstmt.setString(3, board.getBcontent());
		pstmt.setString(4, board.getBcategory());
		pstmt.setString(5, board.getBfile());
		writeResult = pstmt.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		pstmtClose();
	}
	return writeResult;

	}

	public void boardHits(int bnumber) {
		String sql = "UPDATE BOARD SET BHITS=BHITS+1 WHERE BNUMBER=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bnumber);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public BoardDTO boardView(int bnumber) {
		String sql = "SELECT * FROM BOARD WHERE BNUMBER=?";
		BoardDTO boardView = null;
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, bnumber);
			rs = pstmt.executeQuery();
			if(rs.next()){
				boardView = new BoardDTO();
				boardView.setBnumber(rs.getInt("BNUMBER"));
				boardView.setBwriter(rs.getString("BWRITER"));
				boardView.setBtitle(rs.getString("BTITLE"));
				boardView.setBcontent(rs.getString("BCONTENT"));
				boardView.setBdate(rs.getDate("BDATE"));
				boardView.setBfile(rs.getString("BFILE"));
				boardView.setBhits(rs.getInt("BHITS"));
				boardView.setBlike(rs.getInt("BLIKE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			pstmtClose();
			rsClose();
		}
		return boardView;
	}

	public void boardLike(int bnumber) {
		String sql = "UPDATE BOARD SET BLIKE=BLIKE+1 WHERE BNUMBER=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bnumber);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
	
	

}
