package BTT06;

public class NVQL {
	private String hoten;;
	
	private String chucvu;
	
	public NVQL(String hoten, String chucvu) {
		
		this.hoten = hoten;
		this.chucvu = chucvu;
	}
	
	public NVQL() {
	
	}
	public NVQL(NVQL nvql) {
		this.hoten = nvql.hoten;
		this.chucvu = nvql.chucvu;
	}

	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	
	public String getChucvu() {
		return chucvu;
	}
	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}
	  public String getThongTin() {
	        return "Nhân viên quản lý: " + hoten + ", Chức vụ: " + chucvu ;
	    }
	
	
}
