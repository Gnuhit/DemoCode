package BTtuan2;

public class SinhVien {
    private String maSV;
    private String tenSV;
    private String lop;
    private float diemT;
    private float diemL;
    private float diemH;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, String lop, float diemT, float diemL, float diemH) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lop = lop;
        this.diemT = diemT;
        this.diemL = diemL;
        this.diemH = diemH;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getDiemT() {
        return diemT;
    }

    public void setDiemT(float diemT) {
        this.diemT = diemT;
    }

    public float getDiemL() {
        return diemL;
    }

    public void setDiemL(float diemL) {
        this.diemL = diemL;
    }

    public float getDiemH() {
        return diemH;
    }

    public void setDiemH(float diemH) {
        this.diemH = diemH;
    }
    
    public float tinhDTB() {
        return (diemT + diemL + diemH) / 3;
    }

    public void xuatTT() {
        System.out.println("Mã sinh viên: " + maSV);
        System.out.println("Tên sinh viên: " + tenSV);
        System.out.println("Lớp: " + lop);
        System.out.println("Điểm T: " + diemT);
        System.out.println("Điểm L: " + diemL);
        System.out.println("Điểm H: " + diemH);
    }
}
