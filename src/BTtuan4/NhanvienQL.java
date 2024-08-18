/*
Ngô Minh Hùng
 */
package Bai3;

import Bai1.*;
import java.util.*;

public class NhanvienQL extends NhanvienCLC{
    private long phucapCV;    

    public NhanvienQL() {
        super();
    }

    public NhanvienQL(String hoTen, int namSinh, long luong, String nnv, Phongbankhoa pbk, String trinhDo, String nganh, String noiDaotao, long phucapCV) {
        super(hoTen,namSinh,luong,nnv,pbk, trinhDo, nganh, noiDaotao);
        this.phucapCV = phucapCV;
    }
    
    public NhanvienQL(String hoTen, int namSinh, long luong, String nnv, String maPBK, String tenPBK, String trinhDo, String nganh, String noiDaotao, long phucapCV) {
        super(hoTen,namSinh,luong,nnv,maPBK, tenPBK, trinhDo, nganh, noiDaotao);
        this.phucapCV = phucapCV;
    }

    public NhanvienQL(NhanvienQL nvql) {
        super(nvql.hoTen,nvql.namSinh,nvql.getLuong(),nvql.getNnv(),nvql.getPbk(),nvql.trinhDo,nvql.nganh,nvql.noiDaotao);
        this.phucapCV = nvql.phucapCV;
    }
    
    public void input(){
        super.input();
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhập phụ cấp công việc: ");
        phucapCV = sc.nextLong();
    }
    
    public void output(){
        super.output();
        System.out.printf("%20d |",phucapCV);
    }
    
    public String toString(){
        return super.toString() + String.format("%20d |",phucapCV);
    }
}
