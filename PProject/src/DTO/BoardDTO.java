package DTO;

import java.util.Date;

public class BoardDTO {
	private int bnumber;
	private String bwriter;
	private String btitle;
	private String bcontent;
	private String bcategory;
	private String bfile;
	private Date bdate;
	private int blike;
	private int bhits;
	
	public BoardDTO(){
		
	}

	public BoardDTO(int bnumber, String bwriter, String btitle, String bcontent, String bcategory, String bfile,
			Date bdate, int blike, int bhits) {
		super();
		this.bnumber = bnumber;
		this.bwriter = bwriter;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bcategory = bcategory;
		this.bfile = bfile;
		this.bdate = bdate;
		this.blike = blike;
		this.bhits = bhits;
	}

	public int getBnumber() {
		return bnumber;
	}

	public void setBnumber(int bnumber) {
		this.bnumber = bnumber;
	}

	public String getBwriter() {
		return bwriter;
	}

	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public String getBcategory() {
		return bcategory;
	}

	public void setBcategory(String bcategory) {
		this.bcategory = bcategory;
	}

	public String getBfile() {
		return bfile;
	}

	public void setBfile(String bfile) {
		this.bfile = bfile;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public int getBlike() {
		return blike;
	}

	public void setBlike(int blike) {
		this.blike = blike;
	}

	public int getBhits() {
		return bhits;
	}

	public void setBhits(int bhits) {
		this.bhits = bhits;
	}

	@Override
	public String toString() {
		return "BoardDTO [bnumber=" + bnumber + ", bwriter=" + bwriter + ", btitle=" + btitle + ", bcontent=" + bcontent
				+ ", bcategory=" + bcategory + ", bfile=" + bfile + ", bdate=" + bdate + ", blike=" + blike + ", bhits="
				+ bhits + "]";
	}
	
	
}