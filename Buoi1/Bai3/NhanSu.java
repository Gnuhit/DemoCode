// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Bai3;

import java.util.Scanner;

public class NhanSu {
    private String hoTen;     
    private String maNhanSu;   
    private String chuyenMon;  

    public NhanSu() {

    }

    public NhanSu(String hoTen, String maNhanSu, String chuyenMon) {
        this.hoTen = hoTen;
        this.maNhanSu = maNhanSu;
        this.chuyenMon = chuyenMon;
    }
   
    public NhanSu(NhanSu ns) {
        this.hoTen = ns.hoTen;
        this.maNhanSu = ns.maNhanSu;
        this.chuyenMon = ns.chuyenMon;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setMaNhanSu(String maNhanSu) {
        this.maNhanSu = maNhanSu;
    }

    public String getMaNhanSu() {
        return maNhanSu;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }
   
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên nhân sự: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập mã nhân sự: ");
        maNhanSu = sc.nextLine();
        System.out.print("Nhập chuyên môn: ");
        chuyenMon = sc.nextLine();
    }
  
    public void in() {
        System.out.println("Họ tên nhân sự: " + hoTen);
        System.out.println("Mã nhân sự: " + maNhanSu);
        System.out.println("Chuyên môn: " + chuyenMon);
    }
}