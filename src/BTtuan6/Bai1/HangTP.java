package BTT05;

public class HangTP extends HangHoa {
	private String ngaysx,ngayhh;

	public String getNgaysx() {
		return ngaysx;
	}

	public void setNgaysx(String ngaysx) {
		this.ngaysx = ngaysx;
	}

	public String getNgayhh() {
		return ngayhh;
	}

	public void setNgayhh(String ngayhh) {
		this.ngayhh = ngayhh;
	}
	public HangTP(String tenhang,String mahang ,String nhasx,double gia,String ngaysx,String ngayhh) {
		super(tenhang,mahang,nhasx,gia);
		this.ngaysx=ngaysx;
		this.ngayhh=ngayhh;
	}
	 public HangTP() {
	        super();
	        this.ngaysx = "#/##/####";
	        this.ngayhh = "#/##/####";
	    }
	 public String xuatHangHoa() {
		 return super.xuatHangHoa() + "\t" + ngaysx + "\t" + getNgayhh();
	 }
}
