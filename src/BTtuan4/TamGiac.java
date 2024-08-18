package BTtuan4;

public class TamGiac {
    private int canh1;
    private int canh2;
    private int canh3;

    public TamGiac(int canh1, int canh2, int canh3) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }

    public int getChuVi() {
        return canh1 + canh2 + canh3;
    }

    public double getDienTich() {
        double s = (canh1 + canh2 + canh3) / 2.0;
        return Math.sqrt(s * (s - canh1) * (s - canh2) * (s - canh3));
    }

    public String getLoaiTamGiac() {
        if (canh1 == canh2 && canh2 == canh3) {
            return "Tam giác đều";
        } else if (canh1 == canh2 || canh2 == canh3 || canh1 == canh3) {
            return "Tam giác cân";
        } else if (Math.pow(canh1, 2) + Math.pow(canh2, 2) == Math.pow(canh3, 2) ||
                Math.pow(canh1, 2) + Math.pow(canh3, 2) == Math.pow(canh2, 2) ||
                Math.pow(canh2, 2) + Math.pow(canh3, 2) == Math.pow(canh1, 2)) {
            return "Tam giác vuông";
        } else {
            return "Tam giác thường";
        }
    }
}
