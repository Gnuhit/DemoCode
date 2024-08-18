// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Bai7;

import java.util.Scanner;

public class DangKiem {
   
    private String noiDangKiem;
    private String ngayDangKiem; 
    private byte thoiHan; 

    public DangKiem() {

    }
  
    public DangKiem(String noiDangKiem, String ngayDangKiem, byte thoiHan) {
        this.noiDangKiem = noiDangKiem;
        this.ngayDangKiem = ngayDangKiem;
        this.thoiHan = thoiHan;
    }
   
    public DangKiem(DangKiem dk) {
        this.noiDangKiem = dk.noiDangKiem;
        this.ngayDangKiem = dk.ngayDangKiem;
        this.thoiHan = dk.thoiHan;
    }
   
    public void setNoiDangKiem(String noiDangKiem) {
        this.noiDangKiem = noiDangKiem;
    }

    public String getNoiDangKiem() {
        return noiDangKiem;
    }

    public void setNgayDangKiem(String ngayDangKiem) {
        this.ngayDangKiem = ngayDangKiem;
    }

    public String getNgayDangKiem() {
        return ngayDangKiem;
    }

    public void setThoiHan(byte thoiHan) {
        this.thoiHan = thoiHan;
    }

    public byte getThoiHan() {
        return thoiHan;
    }
   
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập nơi đăng kiểm: ");
        noiDangKiem = sc.nextLine();
        System.out.print("Nhập ngày đăng kiểm: ");
        ngayDangKiem = sc.nextLine();
        System.out.print("Nhập thời hạn (số tháng): ");
        thoiHan = sc.nextByte();
    }
   
    public void in() {
        System.out.println("Nơi đăng kiểm: " + noiDangKiem);
        System.out.println("Ngày đăng kiểm: " + ngayDangKiem);
        System.out.println("Thời hạn (số tháng): " + thoiHan);
    }
}