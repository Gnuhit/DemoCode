// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Bai2;

import java.util.Scanner;

public class NhanVien {
  
    private String maNhanVien; 
    private String hoTen;     
    private String trinhDo;   
   
    public NhanVien() {

    }
   
    public NhanVien(String maNhanVien, String hoTen, String trinhDo) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.trinhDo = trinhDo;
    }
 
    public NhanVien(NhanVien nv) {
        this.maNhanVien = nv.maNhanVien;
        this.hoTen = nv.hoTen;
        this.trinhDo = nv.trinhDo;
    }
    
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getTrinhDo() {
        return trinhDo;
    }
   
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        maNhanVien = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập trình độ: ");
        trinhDo = sc.nextLine();
    }

    public void in() {
        System.out.println("Mã nhân viên: " + maNhanVien);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Trình độ: " + trinhDo);
    }

}