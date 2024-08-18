/*
Ngô Minh Hùng 
 */
package Bai1;

import java.util.*;

public class ConNguoi {
    protected String hoTen;
    protected int namSinh;

    public ConNguoi() {
    }

    public ConNguoi(String hoTen, int namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập năm sinh: ");
        namSinh = sc.nextInt();
    }
    
    public void output(){
        System.out.printf("%-20s | %20s |",hoTen,namSinh);
    }
    
    public String toString(){
        return String.format("%-20s | %20s |",hoTen,namSinh);
    }
}

