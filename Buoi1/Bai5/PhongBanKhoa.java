// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Bai5;

import java.util.Scanner;

public class PhongBanKhoa {
  
    private String maPBK;
    private String tenPBK; 
    private int soNguoi; 

    
    public PhongBanKhoa() {

    }
   
    public PhongBanKhoa(String maPBK, String tenPBK, int soNguoi) {
        this.maPBK = maPBK;
        this.tenPBK = tenPBK;
        this.soNguoi = soNguoi;
    }

   
    public PhongBanKhoa(PhongBanKhoa pbk) {
        this.maPBK = pbk.maPBK;
        this.tenPBK = pbk.tenPBK;
        this.soNguoi = pbk.soNguoi;
    }

    
    public void setMaPBK(String maPBK) {
        this.maPBK = maPBK;
    }

    public String getMaPBK() {
        return maPBK;
    }

    public void setTenPBK(String tenPBK) {
        this.tenPBK = tenPBK;
    }

    public String getTenPBK() {
        return tenPBK;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public int getSoNguoi() {
        return soNguoi;
    }
   
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã PBK: ");
        maPBK = sc.nextLine();
        System.out.print("Nhập tên PBK: ");
        tenPBK = sc.nextLine();
        System.out.print("Nhập số người: ");
        soNguoi = sc.nextInt();
    }
  
    public void in() {
        System.out.println("Mã PBK: " + maPBK);
        System.out.println("Tên PBK: " + tenPBK);
        System.out.println("Số người: " + soNguoi);
    }
}