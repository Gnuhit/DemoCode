/*
Ngô Minh Hùng
 */
package Bai3;

import Bai1.*;
import java.util.*;

public class NhanvienCLC extends Nhanvien{
    protected String trinhDo;
    protected String nganh;
    protected String noiDaotao;

    public NhanvienCLC() {
        super();
    }
    
    public NhanvienCLC(String hoTen, int namSinh, long luong, String nnv, Phongbankhoa pbk, String trinhDo, String nganh, String noiDaotao) {
        super(hoTen,namSinh,luong,nnv,pbk);
        this.trinhDo = trinhDo;
        this.nganh = nganh;
        this.noiDaotao = noiDaotao;
    }

    public NhanvienCLC(String hoTen, int namSinh, long luong, String nnv, String maPBK, String tenPBK, String trinhDo, String nganh, String noiDaotao) {
        super(hoTen,namSinh,luong,nnv,tenPBK,maPBK);
        this.trinhDo = trinhDo;
        this.nganh = nganh;
        this.noiDaotao = noiDaotao;
    }
    
    public NhanvienCLC(NhanvienCLC nvclc) {
        super(nvclc.hoTen,nvclc.namSinh,nvclc.getLuong(),nvclc.getNnv(),nvclc.getPbk());
        this.trinhDo = nvclc.trinhDo;
        this.nganh = nvclc.nganh;
        this.noiDaotao = nvclc.noiDaotao;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getNoiDaotao() {
        return noiDaotao;
    }

    public void setNoiDaotao(String noiDaotao) {
        this.noiDaotao = noiDaotao;
    }
    
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập trình độ nhân viên: ");
        trinhDo = sc.nextLine();
        System.out.print("Nhập ngành: ");
        nganh = sc.nextLine();
        System.out.print("Nhập nơi đào tạo: ");
        noiDaotao = sc.nextLine();
    }
    
    public void output(){
        super.output();
        System.out.printf("%-20s | %-20s | %-20s |", trinhDo, nganh, noiDaotao);
    }
    
    public String toString(){
        return super.toString() + String.format("%-20s | %-20s | %-20s |", trinhDo, nganh, noiDaotao);
    }
    
}
