package Arr_CX;

import java.util.Scanner;

public class ngoaiThanh extends ChuyenXe {
 private String noiDen;
 private int soNgaydd;
 
public String getNoiDen() {
	return noiDen;
}
public void setNoiDen(String noiDen) {
	this.noiDen = noiDen;
}
public int getSoNgaydd() {
	return soNgaydd;
}
public void setSoNgaydd(int soNgaydd) {
	this.soNgaydd = soNgaydd;
}
 
 public ngoaiThanh () {
	 super();
	 this.noiDen=" ";
	 this.soNgaydd=0;
 }

public ngoaiThanh(String maCX, String hoTenTX, int soXe, double doanhThu,String noiDen, int soNgaydd) {
	super(maCX,hoTenTX,soXe,doanhThu);
	this.noiDen = noiDen;
	this.soNgaydd = soNgaydd;
}
public void nhap() { 
	Scanner	sc = new Scanner(System.in);
	System.out.print("Nhập nơi đến: ");
	noiDen=sc.nextLine();
	System.out.println("Nhập số ngày đi được: ");
	soNgaydd=sc.nextInt();
	super.nhap();
}

public String xuat() {
		return super.xuat() +"\t"+noiDen+"\t"+ soNgaydd;
	}
}



 
