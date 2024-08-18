/*
Ngô Minh Hùng
 */
package Bai1;

import java.util.*;

public class Phongbankhoa {
    private String maPBK;
    private String tenPBK;

    public Phongbankhoa() {
    }

    public Phongbankhoa(String maPBK, String tenPBK) {
        this.maPBK = maPBK;
        this.tenPBK = tenPBK;
    }
    
    public Phongbankhoa(Phongbankhoa pbk) {
        this.maPBK = pbk.maPBK;
        this.tenPBK = pbk.tenPBK;
    }

    public String getMaPBK() {
        return maPBK;
    }

    public void setMaPBK(String maPBK) {
        this.maPBK = maPBK;
    }

    public String getTenPBK() {
        return tenPBK;
    }

    public void setTenPBK(String tenPBK) {
        this.tenPBK = tenPBK;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã phòng ban khoa: ");
        maPBK = sc.nextLine();
        System.out.print("Nhập tên phòng ban khoa: ");
        tenPBK = sc.nextLine();
    }
    
    public void output(){
        System.out.printf("%20s | %20s |", maPBK, tenPBK);
    }
    
    public String toString(){
        return String.format("%20s | %20s |", maPBK, tenPBK);
    }
}
