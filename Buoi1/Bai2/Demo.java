// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Bai2;

public class Demo {
	 public static void main(String[] args) {
	      
	        NhanVien nv1 = new NhanVien();
	        nv1.nhap(); 
	        nv1.in();   
	       
	        NhanVien nv2 = new NhanVien("NV2", "Ngo Minh Hung", "Dai Hoc");
	        System.out.println("==================================================");
	        nv2.in();   
	      
	        NhanVien nv3 = new NhanVien(nv2);
	        System.out.println("==================================================");
	        nv3.in();  
	    }
}