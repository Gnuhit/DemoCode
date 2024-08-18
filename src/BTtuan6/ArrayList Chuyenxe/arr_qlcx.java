package Arr_CX;

import java.util.ArrayList;
import java.util.Scanner;

public class arr_qlcx {
    private ArrayList<ChuyenXe> ds = new ArrayList<>();

    public void nhapDS() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng chuyến xe: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập loại chuyến xe (Nội thành=1, Ngoại thành=2): ");
            int loai = sc.nextInt();
            sc.nextLine();
            ChuyenXe cx;
            if (loai == 1) {
                cx = new noiThanh();
            } else {
                cx = new ngoaiThanh();
            }
            System.out.println("Nhập chuyến xe thứ " + (i + 1) + ":");
            cx.nhap();
            ds.add(cx);
        }
    }

    public void xuatDS() {
        for (ChuyenXe e : ds) {
            System.out.println(e.xuat());
        }
    }
}
