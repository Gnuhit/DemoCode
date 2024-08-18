// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Bai7;

public class Demo {
    public static void main(String[] args) {
       
        DangKiem dk1 = new DangKiem();
        dk1.nhap(); 
        dk1.in();       
        DangKiem dk2 = new DangKiem("Bình Thuận", "22/05/2024", (byte)5);
        System.out.println("================================================");
        dk2.in();   
        DangKiem dk3 = new DangKiem(dk2);
        System.out.println("================================================");
        dk3.in();   
    }
}