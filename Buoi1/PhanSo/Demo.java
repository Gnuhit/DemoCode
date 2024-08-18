// Ngô Minh Hùng - 2280601103 - 22DTHB4

package PhanSo;

public class Demo {

	public static void main(String[] args) {
		PhanSo ps1 = new PhanSo();
		ps1.input();
		ps1.output();
		
		PhanSo ps2 = new PhanSo(5,7);
		System.out.println("====================================");
		ps2.output();
		
		PhanSo ps3 = new PhanSo(ps1);
		System.out.println("====================================");
		ps3.output();
		}

}