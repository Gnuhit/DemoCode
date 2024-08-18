package BTtuan4;

class PhuongTrinhBacNhat {
    private int a;
    private int b;

    public PhuongTrinhBacNhat() {
        this.a = 2;
        this.b = 2;
    }

    public PhuongTrinhBacNhat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return this.a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return this.b;
    }

    public String toString() {
        return "Phuong trinh: " + a + "x + " + b + " = 0";
    }

    public double giaiPT() {
        if (a == 0) {
            if (b == 0) {
                return Double.NaN; 
            } else {
                return -b / 1.0; 
            }
        } else {
            return -b / (1.0 * a); 
        }
    }
}
