package BTVN;

import java.util.Scanner;

public class TgPascal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều cao của tam giác Pascal: ");
        int h = sc.nextInt();
        inTgPascal(h);
    }

    public static void inTgPascal(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(hsPascal(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int hsPascal(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return hsPascal(n - 1, k - 1) + hsPascal(n - 1, k);
        }
    }
}

