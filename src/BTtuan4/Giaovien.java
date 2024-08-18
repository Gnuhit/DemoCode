/*
Ngô Minh Hùng
 */
package Bai3;

import Bai1.*;
import java.util.Scanner;

public class Giaovien extends NhanvienCLC{
    private long thulaoGV;

    public Giaovien() {
        super();
    }

    public Giaovien(String hoTen, int namSinh, long luong, String nnv, Phongbankhoa pbk, String trinhDo, String nganh, String noiDaotao, long thulaoGV) {
        super(hoTen,namSinh,luong,nnv,pbk, trinhDo, nganh, noiDaotao);
        this.thulaoGV = thulaoGV;
    }
    
    public Giaovien(String hoTen, int namSinh, long luong, String nnv, String maPBK, String tenPBK, String trinhDo, String nganh, String noiDaotao, long thulaoGV) {
        super(hoTen,namSinh,luong,nnv,maPBK, tenPBK, trinhDo, nganh, noiDaotao);
        this.thulaoGV = thulaoGV;
    }
    
    public Giaovien(Giaovien gv) {
        super(gv.hoTen,gv.namSinh,gv.getLuong(),gv.getNnv(),gv.getPbk(),gv.trinhDo,gv.nganh,gv.noiDaotao);
        this.thulaoGV = gv.thulaoGV;
    }
    
    public void input(){
        super.input();
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhập thù lao giáo viên: ");
        thulaoGV = sc.nextLong();
    }
    
    public void output(){
        super.output();
        System.out.printf("%20s |",thulaoGV);
    }
    
    public String toString(){
        return super.toString() + String.format("%20s |",thulaoGV);
    }
}
