package BTtuan4;

public class Phanso {
	
	private int tuso;
	private int mauso;
	public Phanso(int tuso, int mauso) {
	this.tuso = tuso;
	this.mauso = mauso;
}
	public Phanso () {
			this.tuso=0;
			this.mauso=0;
}
	public void nhapphanso(int tu , int mau) {
			this.tuso=tu;
			if (mau == 0) {
				this.mauso = 1; 
			}else {
				this.mauso = mau;

			}
			
}
	public void inPhanSo() {
		    System.out.println(this.tuso + "/" + this.mauso);
		    
}

	private int uocSoChungLonNhat(int a, int b) {
		    if (b == 0) return a;
		    return uocSoChungLonNhat(b, a % b);
}
	public void rutgonphanso() {
		if (this.mauso != 0) {
			int ucln = uocSoChungLonNhat(this.tuso, this.mauso);
			this.tuso /= ucln;
			this.mauso /= ucln;
		}
	}
	public Phanso congPhanSo(Phanso ps) {
		    int tu = this.tuso * ps.mauso + ps.tuso * this.mauso;
		    int mau = this.mauso * ps.mauso;
		    Phanso ketQua = new Phanso(tu, mau);
		    ketQua.rutgonphanso();
		    return ketQua;
		}
	public Phanso truPhanSo(Phanso ps) {
		    int tu = this.tuso * ps.mauso - ps.tuso * this.mauso;
		    int mau = this.mauso * ps.mauso;
		    Phanso ketQua = new Phanso(tu, mau);
		    ketQua.rutgonphanso();
		    return ketQua;
	}
	 public Phanso nhanPhanSo(Phanso ps) {
	        int tu = this.tuso * ps.tuso;
	        int mau = this.mauso * ps.mauso;
	        Phanso ketQua = new Phanso(tu, mau);
	        ketQua.rutgonphanso();
	        return ketQua;
	    }
	 public Phanso chiaPhanSo(Phanso ps) {
	        int tu = this.tuso * ps.mauso;
	        int mau = this.mauso * ps.tuso;
	        Phanso ketQua = new Phanso(tu, mau);
	        ketQua.rutgonphanso();
	        return ketQua;
	    }
	
 }
