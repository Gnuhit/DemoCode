package BTT06;

public class NVQuanLy {
	private String hoten;
	private String chucvu;
	public NVQuanLy(String hoten, String chucvu) {
		
		this.hoten = hoten;
		this.chucvu = chucvu;
	}
	public NVQuanLy() {
		
	}
	public NVQuanLy(NVQuanLy NVQL) {
		this.hoten = NVQL.hoten;
		this.chucvu = NVQL.chucvu;
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
