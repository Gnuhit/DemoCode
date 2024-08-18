/*
Ngô Minh Hùng
 */
package BTtuan4;

import java.util.*;
import Bai1.*;

public class Main {
    public static void main(String[] args){
        DanhSach ds = new DanhSach();
        ConNguoi n;
        byte chon;
        ds.init();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\n");
            System.out.println("1: Nhập một nhân viên quản lí");
            System.out.println("2: Nhập một giáo viên");
            System.out.println("3: Xuất thông tin nhân viên quản lí");
            System.out.println("4: Xuất thông tin giáo viên");
            System.out.println("5: Xuất thông tin toàn bộ nhân viên quản lí và giáo viên");
            System.out.println("6: Thoát!");
            System.out.println("==================================================");
            System.out.print("Chọn chức năng: ");     chon = sc.nextByte();
            
            switch(chon){
                case 1:
                    System.out.println("Nhập thông tin một nhân viên quản lí");
                    n = new NhanvienQL();
                    n.input();
                    ds.them(n);
                    break;
                case 2: 
                    System.out.println("Nhập thông tin một giáo viên: ");
                    n = new Giaovien();
                    n.input();
                    ds.them(n);
                    break;
                case 3: 
                    System.out.println("Xuất thông tin nhân viên quản lí: ");
                    ds.xuatNVQL();
                    break;
                case 4: 
                    System.out.println("Xuất thông tin giáo viên: ");
                    ds.xuatGV();
                    break;
                case 5:
                    System.out.println("Xuất thông tin toàn bộ học viên và nhân viên: ");
                    ds.xuatALL();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
