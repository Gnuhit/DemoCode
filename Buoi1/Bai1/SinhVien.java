// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Bai1;

import java.util.Scanner;
public class SinhVien {
private String hoTen; 
private String maSo;  
private float dtb;    

public SinhVien() {

}

public SinhVien(String hoTen, String maSo, float dtb) {
    this.hoTen = hoTen;
    this.maSo = maSo;
    this.dtb = dtb;
}

public SinhVien(SinhVien sv) {
    this.hoTen = sv.hoTen;
    this.maSo = sv.maSo;
    this.dtb = sv.dtb;
}

public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
}

public String getHoTen() {
    return hoTen;
}

public void setMaSo(String maSo) {
    this.maSo = maSo;
}

public String getMaSo() {
    return maSo;
}

public void setDtb(float dtb) {
    this.dtb = dtb;
}

public float getDtb() {
    return dtb;
}

public void input() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập họ tên: ");
    hoTen = sc.nextLine();
    System.out.print("Nhập mã số: ");
    maSo = sc.nextLine();
    System.out.print("Nhập điểm trung bình: ");
    dtb = sc.nextFloat();
}

public void output() {
    System.out.println("Họ tên: " + hoTen);
    System.out.println("Mã số: " + maSo);
    System.out.println("Điểm trung bình: " + dtb);
	}

}