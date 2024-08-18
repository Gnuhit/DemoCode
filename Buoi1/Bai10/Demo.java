// Ngô Minh Hùng - 2280601103 - 22DTHB4

package Bai10;

public class Demo {

	public static void main(String[] args) {
		 HanSD sp1 = new HanSD();
		 sp1.nhap();
		 sp1.xuat();
		 
		 HanSD sp2 = new HanSD("Sữa Dâu","23/05/2024","23/05/2025");
		 System.out.println("===========================================");
		 sp2.xuat();
		 
		 
		 HanSD sp3 = new HanSD(sp2);
		 System.out.println("===========================================");
		 sp3.xuat();
	}
}