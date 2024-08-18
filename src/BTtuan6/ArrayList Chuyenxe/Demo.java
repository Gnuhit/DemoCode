package Arr_CX;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng danh sách để quản lý:");
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập loại danh sách (mảng=1, arraylist=2): ");
            int chon = sc.nextInt();
            sc.nextLine(); 
            if (chon == 1) {
                QLCX ql = new QLCX();
                ql.Nhapds();
                System.out.println("*********DANH SÁCH CHUYẾN XE MẢNG*********");
                ql.xuatds();
            } else {
                arr_qlcx ql1 = new arr_qlcx();
                ql1.nhapDS();
                System.out.println("*********DANH SÁCH CHUYẾN XE ARRAYLIST*********");
                ql1.xuatDS();
            }
        }
    }
}
