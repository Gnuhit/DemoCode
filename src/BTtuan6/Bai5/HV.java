package BTT06;

public class HV {
	private String hoten;
	private int namsinh;
	public HV() {
		
	}
	public HV(String hoten, int namsinh) {
		
		this.hoten = hoten;
		this.namsinh = namsinh;
	}
	public HV(HV hv) {
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
