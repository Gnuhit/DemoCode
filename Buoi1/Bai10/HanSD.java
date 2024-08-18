// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Bai10;

import java.util.Scanner;
public class HanSD {
  private String tensp;
  private String ngaysx;
  private String ngayhh;
  
  public HanSD() {
	  
  }

public HanSD(String tensp, String ngaysx, String ngayhh) {
	super();
	this.tensp = tensp;
	this.ngaysx = ngaysx;
	this.ngayhh = ngayhh;
}

public HanSD(HanSD sd) {
	super();
	this.tensp = sd.tensp;
	this.ngaysx = sd.ngaysx;
	this.ngayhh =sd.ngayhh;
}

public String getTensp() {
	return tensp;
}

public void setTensp(String tensp) {
	this.tensp = tensp;
}

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
 
public void nhap() {
	Scanner sc = new Scanner (System.in);
	System.out.print("Nhập tên sản phẩm: ");
	tensp=sc.nextLine();
	System.out.print("Nhập ngày sản xuất: ");
	ngaysx=sc.nextLine();
	System.out.print("Nhập ngày hết hạn: ");
	ngayhh=sc.nextLine();
}
public void xuat () {
	System.out.println("Tên sản phẩm: "+ tensp);
	System.out.println("Ngày sản xuất: "+ngaysx);
	System.out.println("Ngày hết hạn: "+ngayhh);
	
}
}