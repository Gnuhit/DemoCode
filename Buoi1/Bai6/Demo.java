// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Bai6;

public class Demo {
	  public static void main(String[] args) { 
	        Xe xe1 = new Xe();
	        xe1.nhap(); 
	        xe1.in();     
	        Xe xe2 = new Xe("Ngo Minh Hung", "MecS450", "86B6-569724");
	        System.out.println("========================================");
	        xe2.in();   
	        Xe xe3 = new Xe(xe2);
	        System.out.println("========================================");     
	        xe3.in();   
	    }
}