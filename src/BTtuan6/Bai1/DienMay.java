package BTT05;

public class DienMay extends HangHoa{
	private String tgbh,congsuat,dienap;

	public String getTgbh() {
		return tgbh;
	}

	public void setTgbh(String tgbh) {
		this.tgbh = tgbh;
	}

	public String getCongsuat() {
		return congsuat;
	}

	public void setCongsuat(String congsuat) {
		this.congsuat = congsuat;
	}

	public String getDienap() {
		return dienap;
	}

	public void setDienap(String dienap) {
		this.dienap = dienap;
	}

	public DienMay(String tenhang,String mahang,String nhasx,double gia,String tgbh,String congsuat,String dienap) {
		super(tenhang,mahang,nhasx,gia);
		this.tgbh=tgbh;
		this.congsuat=congsuat;
		this.dienap=dienap;		
	}
	public DienMay() {
		super();
		this.congsuat="";
		this.dienap="";
		this.tgbh="#/##/####";
	}
	public String xuatHangHoa() {
		 return super.xuatHangHoa() + "\t" + congsuat + "\t" + dienap;
	 }
	
}
