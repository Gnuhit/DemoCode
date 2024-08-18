package BTT05;

	public class HangSS extends HangHoa {
		private String loainglieu;

		public String getLoainglieu() {
			return loainglieu;
		}

		public void setLoainglieu(String loainglieu) {
			this.loainglieu = loainglieu;
		}
		public HangSS(String tenhang,String mahang ,String nhasx,double gia,String loainglieu) {
			super(tenhang,mahang,nhasx,gia);
			this.loainglieu=loainglieu;
		}
		public HangSS() {
			super();
			this.loainglieu="";
			
		}
		 public String xuatHangSS() {
		        return super.xuatHangHoa() + "\t" + loainglieu;
		    }
		
		
	
}
