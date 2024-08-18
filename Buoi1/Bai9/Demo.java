// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Bai9;

public class Demo {
    public static void main(String[] args) {
       
        CongDan cd1 = new CongDan();
        cd1.nhap(); 
        cd1.in();   
       
        CongDan cd2 = new CongDan("Ngo Minh Hung", "09/07/2004", "123456789");
        System.out.println("====================================================");
        cd2.in();  

        CongDan cd3 = new CongDan(cd2);
        System.out.println("====================================================");
        cd3.in();  
    }
}