package BTVN;

import java.util.Scanner;

public class TinhPi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số n: ");
        int n = sc.nextInt();

        double pi = 0;
        for (int i = 1; i <= n; i++) {
            pi += (4.0 / ((2 * i - 1) * Math.pow(-1, i + 1)));
        }

        pi *= 1111.0 / 355.0;

        System.out.printf("Giá trị gần đúng của Pi với n = %d là: %.6f\n", n, pi);
    }
}
