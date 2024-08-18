// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Bai1;

public class Demo {
	public static void main(String[] args) {
	    SinhVien sv1 = new SinhVien();
	    sv1.input(); 
	    sv1.output();   
	   
	    SinhVien sv2 = new SinhVien("Ngo Minh Hung", "SV2", 7.0f);
	    System.out.println("=========================================");
	    sv2.output();  
	    
	    SinhVien sv3 = new SinhVien(sv2);
	    System.out.println("=========================================");
	    sv3.output();   
	}
}