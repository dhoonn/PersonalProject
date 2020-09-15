package DTO;

public class MemberDTO {
	private String mid;
	private String mpassword;
	private String mname;
	private String mbirth;
	private String mphone;
	private String memail;
	private String mgender;
	
	public MemberDTO(){
		
	}
	
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpassword() {
		return mpassword;
	}
	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMbirth() {
		return mbirth;
	}
	public void setMbirth(String mbirth) {
		this.mbirth = mbirth;
	}
	public String getMphone() {
		return mphone;
	}
	public void setMphone(String mphone) {
		this.mphone = mphone;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	public String getMgender() {
		return mgender;
	}
	public void setMgender(String mgender) {
		this.mgender = mgender;
	}
	public MemberDTO(String mid, String mpassword, String mname, String mbirth, String mphone,
			String memail, String mgender) {
		super();
		this.mid = mid;
		this.mpassword = mpassword;
		this.mname = mname;
		this.mbirth = mbirth;
		this.mphone = mphone;
		this.memail = memail;
		this.mgender = mgender;
	}
	@Override
	public String toString() {
		return "MemberDTO [mid=" + mid + ", mpassword=" + mpassword + ", mname=" + mname 
				+ ", mbirth=" + mbirth + ", mphone=" + mphone + ", memail=" + memail + ", mgender=" + mgender + "]";
	}
	
	
	

}
