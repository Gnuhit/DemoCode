package BTVN;

import java.util.Scanner;

public class DQFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập số Fibonacci thứ n (n >= 0): ");
            n = sc.nextInt();
        } while (n < 0);

        int fibonacci = DQfibonacci(n);

        System.out.println("Số Fibonacci thứ " + n + " là: " + fibonacci);
    }

    public static int DQfibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return DQfibonacci(n - 1) + DQfibonacci(n - 2);
        }
    }
}
