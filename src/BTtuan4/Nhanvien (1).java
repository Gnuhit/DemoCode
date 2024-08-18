/*
Ngô Minh Hùng
 */
package Bai1;

import java.util.*;

public class Nhanvien extends ConNguoi{
    private long luong;
    private String nnv;
    private Phongbankhoa pbk = new Phongbankhoa();

    public Nhanvien() {
        super();
    }

    public Nhanvien(String hoTen, int namSinh, long luong, String nnv, Phongbankhoa pbk) {
        super(hoTen, namSinh);
        this.luong = luong;
        this.nnv = nnv;
        this.pbk = pbk;
    }
    
    public Nhanvien(String hoTen, int namSinh, long luong, String nnv, String maPBK, String tenPBK) {
        super(hoTen, namSinh);
        this.luong = luong;
        this.nnv = nnv;
        this.pbk = new Phongbankhoa(maPBK, tenPBK);
    }
    
    public Nhanvien(Nhanvien nv) {
        super(nv.hoTen, nv.namSinh);
        this.luong = nv.luong;
        this.nnv = nv.nnv;
        this.pbk = nv.pbk;
    }
    
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập lương nhân viên: ");
        luong = sc.nextLong();
        sc.nextLine();
        System.out.print("Nhập ngày nhận việc: ");
        nnv = sc.nextLine();
        System.out.println("Nhập thông tin phòng ban khoa: ");
        pbk = new Phongbankhoa();
        pbk.input();
    }
    
    public void output(){
        super.output();
        System.out.printf("%20d | %20s |", luong, nnv);
        pbk.output();
    }
    
    public String toString(){
        return super.toString() + String.format("%20d | %20s |", luong, nnv) + pbk.toString();
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

    public String getNnv() {
        return nnv;
    }

    public void setNnv(String nnv) {
        this.nnv = nnv;
    }

    public Phongbankhoa getPbk() {
        return pbk;
    }

    public void setPbk(Phongbankhoa pbk) {
        this.pbk = pbk;
    }
    
}
