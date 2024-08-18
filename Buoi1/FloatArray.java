// Ngô Minh Hùng - 2280601103 - 22DTHB4

import java.util.Scanner;

public class FloatArray {
	public static void main(String[] args) {
        float a[];
        int n=0;
        System.out.println("Nhập số phần tử n : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new float[n];
        for (int i=0 ; i<n ; i++)
        {
            System.out.print("Nhập giá trị thứ a[" + i+ "]:");
            a[i]=sc.nextFloat();
        }
        System.out.print("Mang vua nhap la: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        System.out.println("===========================================================");

        float[] mangSoThuc = new float[5];
        	mangSoThuc[0] = 10.5f;
        	mangSoThuc[1] = 20.25f;
        	mangSoThuc[2] = 30.75f;
        	mangSoThuc[3] = 40.125f;
        	mangSoThuc[4] = 50.375f;
        for (int i = 0; i < mangSoThuc.length; i++) {
            System.out.println("mmangSoThuc[" + i + "] = " + mangSoThuc[i]);
        }
    }
}