package BTVN;

import java.util.Scanner;
import java.util.Arrays;

public class IntegerArray {
    private int[] array;
    private int size;

    public IntegerArray(int size) {
        this.size = size;
        array = new int[size];
    }

    public int getSize() {
        return size;
    }

    public void setElement(int index, int value) {
        array[index] = value;
    }

    public int getElement(int index) {
        return array[index];
    }

    public int findMax() {
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int findMin() {
        int min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        return (double) sum / size;
    }

    public void sortArray() {
        Arrays.sort(array);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Số lượng phần tử: ");
        int n = scanner.nextInt(); 
        IntegerArray arr = new IntegerArray(n);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + i + ": ");
            int value = scanner.nextInt();
            arr.setElement(i, value);
        }
        
        System.out.println("Phần tử lớn nhất: " + arr.findMax());
        System.out.println("Phần tử nhỏ nhất: " + arr.findMin());
        System.out.println("Trung bình cộng: " + arr.calculateAverage());
        arr.sortArray();
        System.out.println("Sắp xếp tăng dần: " + arr);
        scanner.close(); 
    }
}

