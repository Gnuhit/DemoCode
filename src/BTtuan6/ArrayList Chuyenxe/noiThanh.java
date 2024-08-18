package Arr_CX;

import java.util.Scanner;

public class noiThanh extends ChuyenXe {
 private int soTuyen;
 private double soKm;
public int getSoTuyen() {
	return soTuyen;
}
public void setSoTuyen(int soTuyen) {
	this.soTuyen = soTuyen;
}
public double getSoKm() {
	return soKm;
}
public void setSoKm(double soKm) {
	this.soKm = soKm;
}
 public noiThanh() {
	 super();
	 this.soTuyen=0;
	 this.soKm=0.0f;
	 
 }
public noiThanh(String maCX, String hoTenTX, int soXe, double doanhThu,int soTuyen, double soKm) {
	super(maCX,hoTenTX,soXe,doanhThu);
	this.soTuyen = soTuyen;
	this.soKm = soKm;
}
public void nhap() { 
	Scanner	sc= new Scanner(System.in);
	System.out.print("Nhập số tuyến xe: ");
	soTuyen=sc.nextInt();
	System.out.print("Nhập số Km: ");
	soKm=sc.nextDouble();
	super.nhap();
}

public String xuat() {
		return super.xuat() +"\t"+soTuyen+"\t"+ soKm;
	}
}

