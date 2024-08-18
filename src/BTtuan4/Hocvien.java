/*
Ngô Minh Hùng
 */
package Bai1;

import java.util.*;

public class Hocvien extends ConNguoi{
    private float Diem1;
    private float Diem2;
    private float Diem3;

    public Hocvien() {
        super();
    }

    public Hocvien(String hoTen, int namSinh, float Diem1, float Diem2, float Diem3) {
        super(hoTen,namSinh);
        this.Diem1 = Diem1;
        this.Diem2 = Diem2;
        this.Diem3 = Diem3;
    }
    
    public Hocvien(Hocvien hv){
        super(hv.hoTen,hv.namSinh);
        this.Diem1 = hv.Diem1;
        this.Diem2 = hv.Diem2;
        this.Diem3 = hv.Diem3;
    }

    public float getDiem1() {
        return Diem1;
    }

    public void setDiem1(float Diem1) {
        this.Diem1 = Diem1;
    }

    public float getDiem2() {
        return Diem2;
    }

    public void setDiem2(float Diem2) {
        this.Diem2 = Diem2;
    }

    public float getDiem3() {
        return Diem3;
    }

    public void setDiem3(float Diem3) {
        this.Diem3 = Diem3;
    }
    
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm 1: ");
        Diem1 = sc.nextFloat();
        System.out.print("Nhập điểm 2: ");
        Diem2 = sc.nextFloat();
        System.out.print("Nhập điểm 3: ");
        Diem3 = sc.nextFloat();
    }
    
    public void output(){
        super.output();
        System.out.printf("%20f | %20f | %20f |", Diem1,Diem2,Diem3);
    }
    
    public String toString(){
        return super.toString() + String.format("%20f | %20f | %20f |", Diem1,Diem2,Diem3);
    }
}
