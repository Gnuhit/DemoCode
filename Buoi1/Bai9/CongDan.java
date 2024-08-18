// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Bai9;

import java.util.Scanner;

public class CongDan {
   
    private String hoTen; 
    private String sinhNgay; 
    private String cccdCmndHoChieu; 

    public CongDan() {

    }
    
    public CongDan(String hoTen, String sinhNgay, String cccdCmndHoChieu) {
        this.hoTen = hoTen;
        this.sinhNgay = sinhNgay;
        this.cccdCmndHoChieu = cccdCmndHoChieu;
    }
    
    public CongDan(CongDan cd) {
        this.hoTen = cd.hoTen;
        this.sinhNgay = cd.sinhNgay;
        this.cccdCmndHoChieu = cd.cccdCmndHoChieu;
    }
   
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setSinhNgay(String sinhNgay) {
        this.sinhNgay = sinhNgay;
    }

    public String getSinhNgay() {
        return sinhNgay;
    }

    public void setCccdCmndHoChieu(String cccdCmndHoChieu) {
        this.cccdCmndHoChieu = cccdCmndHoChieu;
    }

    public String getCccdCmndHoChieu() {
        return cccdCmndHoChieu;
    }
 
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        sinhNgay = sc.nextLine();
        System.out.print("Nhập số CCCD/CMND/Hộ chiếu: ");
        cccdCmndHoChieu = sc.nextLine();
    }
   
    public void in() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày sinh: " + sinhNgay);
        System.out.println("Số CCCD/CMND/Hộ chiếu: " + cccdCmndHoChieu);
    }

}