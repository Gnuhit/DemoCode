// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Bai3;

public class Demo {
	 public static void main(String[] args) {
	       
	        NhanSu ns1 = new NhanSu();
	        ns1.nhap(); 
	        ns1.in();  

	       
	        NhanSu ns2 = new NhanSu("Ngo Minh Hung", "NS2", "Ky Thuat");
	        System.out.println("===========================================");
	        ns2.in();   
	        
	        NhanSu ns3 = new NhanSu(ns2);
	        System.out.println("===========================================");
	        ns3.in();  
	    }
}