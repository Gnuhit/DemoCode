package BTT06;

public class giaovien {
	private String hoten;
	private String monhoc;
	public giaovien(String hoten, String monhoc) {
		
		this.hoten = hoten;
		this.monhoc = monhoc;
	}
	public giaovien() {
		
	}
	public giaovien(giaovien gv) {
		
		this.hoten = gv.hoten;
		this.monhoc = gv.monhoc;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getMonhoc() {
		return monhoc;
	}
	public void setMonhoc(String monhoc) {
		this.monhoc = monhoc;
	}

    public String getThongTin() {
        return "Giáo viên: " + hoten + ", Môn học: " + monhoc;
    }
}
