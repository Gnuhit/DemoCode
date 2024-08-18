package BTtuan4;

public class DemoPS {
	public static void main(String[] args) {
 		Phanso ps1 = new Phanso(1, 2); 
 		Phanso ps2 = new Phanso(3, 4); 

 	
 		System.out.print("Phân số thứ nhất: ");
 		ps1.inPhanSo();
 		System.out.print("Phân số thứ hai: ");
 		ps2.inPhanSo();


 		Phanso tong = ps1.congPhanSo(ps2);
 		System.out.print("Tổng hai phân số: ");
 		tong.inPhanSo();

 		Phanso hieu = ps1.truPhanSo(ps2);
 		System.out.print("Hiệu hai phân số: ");
 		hieu.inPhanSo();

 		Phanso tich = ps1.nhanPhanSo(ps2);
 		System.out.print("Tích hai phân số: ");
 		tich.inPhanSo();

 		Phanso thuong = ps1.chiaPhanSo(ps2);
 		System.out.print("Thương hai phân số: ");
 		thuong.inPhanSo();
 	}
}
