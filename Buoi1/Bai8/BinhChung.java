// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Bai8;

import java.util.Scanner;

public class BinhChung {
  
    private String tenBinhChung; 
    private String quanKhu;      
    private long quanSo;       
    
    public BinhChung() {

    }
    
    public BinhChung(String tenBinhChung, String quanKhu, long quanSo) {
        this.tenBinhChung = tenBinhChung;
        this.quanKhu = quanKhu;
        this.quanSo = quanSo;
    }

    
    public BinhChung(BinhChung bc) {
        this.tenBinhChung = bc.tenBinhChung;
        this.quanKhu = bc.quanKhu;
        this.quanSo = bc.quanSo;
    }

   
    public void setTenBinhChung(String tenBinhChung) {
        this.tenBinhChung = tenBinhChung;
    }

    public String getTenBinhChung() {
        return tenBinhChung;
    }

    public void setQuanKhu(String quanKhu) {
        this.quanKhu = quanKhu;
    }

    public String getQuanKhu() {
        return quanKhu;
    }

    public void setQuanSo(long quanSo) {
        this.quanSo = quanSo;
    }

    public long getQuanSo() {
        return quanSo;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên binh chủng: ");
        tenBinhChung = sc.nextLine();
        System.out.print("Nhập quân khu: ");
        quanKhu = sc.nextLine();
        System.out.print("Nhập quân số: ");
        quanSo = sc.nextLong();
    }
   
    public void in() {
        System.out.println("Tên binh chủng: " + tenBinhChung);
        System.out.println("Quân khu: " + quanKhu);
        System.out.println("Quân số: " + quanSo);
    }
}