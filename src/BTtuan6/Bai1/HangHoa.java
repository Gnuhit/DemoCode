package BTT05;

public class HangHoa {
	private String mahang ,tenhang,nhasx;
	private double gia;
	public HangHoa(String mahang, String tenhang, String nhasx, double gia) {
		
		this.mahang = mahang;
		this.tenhang = tenhang;
		this.nhasx = nhasx;	
		this.gia = gia;
	}
	public HangHoa() {
		this.mahang="";
		this.tenhang="";
		this.nhasx="";
		this.gia=0.0f;

	}
	public String getMahang() {
		return mahang;
	}
	public void setMahang(String mahang) {
		this.mahang = mahang;
	}
	public String getTenhang() {
		return tenhang;
	}
	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}
	public String getNhasx() {
		return nhasx;
	}
	public void setNhasx(String nhasx) {
		this.nhasx = nhasx;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public HangHoa(HangHoa hh) {
		this.mahang=hh.mahang;
		this.tenhang=hh.tenhang;
		this.nhasx=hh.nhasx;
		this.gia=hh.gia;
	}
	
	public String toString() {
		return super.toString();
	}
	public String xuatHangHoa() {
	    return "Mã hàng: " + mahang +"\t"+" Tên hàng: " + tenhang + "\t"+" Nhà sản xuất: " + nhasx +"\t"+ " Giá: " + gia;
	    
	}


	
	
}
