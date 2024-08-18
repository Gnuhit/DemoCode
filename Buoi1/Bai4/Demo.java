// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Bai4;

public class Demo {
public static void main(String[] args) {
        
        HangHoa hh1 = new HangHoa();
        hh1.nhap(); 
        hh1.in();   
      
        HangHoa hh2 = new HangHoa("HH2", "Banh Mi", 15000);
        System.out.println("===========================================");
        hh2.in();   
        
        HangHoa hh3 = new HangHoa(hh2);
        System.out.println("===========================================");
        hh3.in();   
    }
}