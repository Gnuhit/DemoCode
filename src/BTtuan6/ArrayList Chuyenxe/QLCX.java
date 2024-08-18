package Arr_CX;
import java.util.Scanner;
public class QLCX {
 private ChuyenXe ds[];
 private int sl;
 public QLCX(){
	 
 }

public QLCX(ChuyenXe[] ds, int sl) {
	super();
	this.ds = ds;
	this.sl = sl;
}

public ChuyenXe[] getDs() {
	return ds;
}

public void setDs(ChuyenXe[] ds) {
	this.ds = ds;
}

public int getSl() {
	return sl;
}

public void setSl(int sl) {
	this.sl = sl;
}

public void Nhapds(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập số lượng chuyến xe: ");
    sl = sc.nextInt();
    ds = new ChuyenXe[sl];
    for(int i = 0; i<sl; i++){
            System.out.print("Nhập loại chuyến xe (Nội thành=1, Ngoại thành=2): ");
            int loai = sc.nextInt();
            if (loai == 1) {
                ds[i] = new noiThanh();
            } else {
                ds[i] = new ngoaiThanh();
            }
        ds[i] = new ChuyenXe();
        System.out.print("Nhập chuyến xe thứ "+ (i+1) +":" );
        ds[i].nhap();
        }
    }
 public void xuatds () {
	 for(int i=0;i<sl;i++) {
	 System.out.println(ds[i].xuat());
	 }
			 
 }
}
