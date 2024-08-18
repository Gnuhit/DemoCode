// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Bai4;

import java.util.Scanner;

public class HangHoa {
   
    private String maHang; 
    private String tenHang; 
    private long donGia; 

    public HangHoa() {

    }
  
    public HangHoa(String maHang, String tenHang, long donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }
    
    public HangHoa(HangHoa hh) {
        this.maHang = hh.maHang;
        this.tenHang = hh.tenHang;
        this.donGia = hh.donGia;
    }
   
    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }

    public long getDonGia() {
        return donGia;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã hàng: ");
        maHang = sc.nextLine();
        System.out.print("Nhập tên hàng: ");
        tenHang = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextLong();
    }
   
    public void in() {
        System.out.println("Mã hàng: " + maHang);
        System.out.println("Tên hàng: " + tenHang);
        System.out.println("Đơn giá: " + donGia);
    }

}