// Ngô Minh Hùng - 2280601103 - 22DTHB4

import java.util.Scanner;
public class IntergerArray {
	public static void main(String[] args) {
        int a[], n=0;
        System.out.println("Nhập số phần tử n : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        for (int i=0 ; i<n ; i++)
        {
            System.out.print("Nhập giá trị thứ a[" + i+ "]:");
            a[i]=sc.nextInt();
        }
        System.out.print("Mang vua nhap la: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        System.out.println("===========================================================");

                int[] mangSoNguyen = new int[5];
                mangSoNguyen[0] = 10;
                mangSoNguyen[1] = 20;
                mangSoNguyen[2] = 30;
                mangSoNguyen[3] = 40;
                mangSoNguyen[4] = 50;
                for (int i = 0; i < mangSoNguyen.length; i++) {
                    System.out.println("mangSoNguyen[" + i + "] = " + mangSoNguyen[i]);
                }
    }
}