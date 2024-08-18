package BTVN;

import java.util.Scanner;

public class CD {
    private int maCD;
    private String tuaCD;
    private int soBaiHat;
    private double giaThanh;

    public CD() {
    }

    public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    public int getMaCD() {
        return maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã CD:");
        maCD = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer
        System.out.println("Nhập tựa CD:");
        tuaCD = scanner.nextLine();
        System.out.println("Nhập số bài hát:");
        soBaiHat = scanner.nextInt();
        System.out.println("Nhập giá thành:");
        giaThanh = scanner.nextDouble();
    }

    public void output() {
        System.out.println("Mã CD: " + maCD);
        System.out.println("Tựa CD: " + tuaCD);
        System.out.println("Số bài hát: " + soBaiHat);
        System.out.println("Giá thành: " + giaThanh);
    }
}