// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Bai6;

import java.util.Scanner;
public class Xe {
   
    private String chuSoHuu;
    private String hangSX;   
    private String bienSoXe;

    public Xe() {
    	
    }
 
    public Xe(String chuSoHuu, String hangSX, String bienSoXe) {
        this.chuSoHuu = chuSoHuu;
        this.hangSX = hangSX;
        this.bienSoXe = bienSoXe;
    }
   
    public Xe(Xe xe) {
        this.chuSoHuu = xe.chuSoHuu;
        this.hangSX = xe.hangSX;
        this.bienSoXe = xe.bienSoXe;
    }
   
    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chủ sở hữu: ");
        chuSoHuu = sc.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        hangSX = sc.nextLine();
        System.out.print("Nhập biển số xe: ");
        bienSoXe = sc.nextLine();
    }
   
    public void in() {
        System.out.println("Chủ sở hữu: " + chuSoHuu);
        System.out.println("Hãng sản xuất: " + hangSX);
        System.out.println("Biển số xe: " + bienSoXe);
    }
}