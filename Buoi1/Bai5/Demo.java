// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Bai5;

public class Demo {
    public static void main(String[] args) {
        PhongBanKhoa pbk1 = new PhongBanKhoa();
        pbk1.nhap();
        pbk1.in();   

        PhongBanKhoa pbk2 = new PhongBanKhoa("PBK2", "Khoa CNTT", 49);
        System.out.println("===========================================");
        pbk2.in(); 
        
        PhongBanKhoa pbk3 = new PhongBanKhoa(pbk2);
        System.out.println("===========================================");
        pbk3.in();   
    }
}