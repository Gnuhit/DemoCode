package BTT06;

public class hocvien {
	private  String hoten;
	private int namsinh;
	
	public hocvien(String hoten, int namsinh) {
		
		this.hoten = hoten;
		this.namsinh = namsinh;
	}
	
	public hocvien() {
		
	}
	public hocvien(hocvien hv) {
		this.hoten = hv.hoten;
		this.namsinh = hv.namsinh;
	}

	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public int getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
	 public String getThongTin() {
	        return "Học viên: " + hoten + ", Tuổi: " + namsinh;
	    }
	
}
