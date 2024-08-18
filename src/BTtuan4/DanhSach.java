/*
Ngô Minh Hùng
 */
package BTtuan4;

import Bai1.*;
import java.util.*;

public class DanhSach {
    private ArrayList<ConNguoi> ds = new ArrayList<>();
    
    public void init(){
        ds.add(new NhanvienQL("Phan Thanh Huấn",	1980,	12000,	"12/03/2021",	"CN_DT",	"Công nghệ", "Đại học", "IT", "Hutech", 2000));
        ds.add(new Giaovien("Nguyễn Thúy Hằng",	1983,	6000,	"10/01/2021",	"MT_KHI",	"Môi trường", "Cao đẳng", "EO", "FPT", 1500));          
        ds.add(new Giaovien("Lê Kiên Cường",          1982,	8000,	"12/02/2021",	"MT_NUOC",	"Môi trường", "Đại học", "EW", "Hutech", 2500));
        ds.add(new NhanvienQL("Bùi Thị Thắm Nồng",      1981,	9000,	"12/02/2020",	"CN_OTO",	"Công nghệ", "Đại học", "OTO", "Hutech", 4000 ));
    }
    
    public void them(ConNguoi cn){
        ds.add(cn);
    }
    
    public void xuatNVQL(){
        for (ConNguoi e: ds)
            if(e instanceof NhanvienQL)
                System.out.println(e);
    }
    
    public void xuatGV(){
        for (ConNguoi e: ds)
            if(e instanceof Giaovien)
                System.out.println(e);
    }
    
    public void xuatALL(){
        xuatNVQL();
        System.out.println("");
        xuatGV();
    }
}
