// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Bai8;

public class Demo {
    public static void main(String[] args) {
      
        BinhChung bc1 = new BinhChung();
        bc1.nhap(); 
        bc1.in();   
       
        BinhChung bc2 = new BinhChung("Bộ binh", "Quân khu 7", 7777);
        System.out.println("===============================================");
        bc2.in();  
       
        BinhChung bc3 = new BinhChung(bc2);
        System.out.println("===============================================");
        bc3.in();   
    }
}