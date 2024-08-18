package BTtuan4;

public class DemoTG {
    public static void main(String[] args) {
        TamGiac tamGiac1 = new TamGiac(3, 4, 5);
        TamGiac tamGiac2 = new TamGiac(4, 4, 6);
        TamGiac tamGiac3 = new TamGiac(5, 12, 13);

        System.out.println("Tam giác 1:");
        System.out.println("Chu vi: " + tamGiac1.getChuVi());
        System.out.println("Diện tích: " + tamGiac1.getDienTich());
        System.out.println("Loại tam giác: " + tamGiac1.getLoaiTamGiac());

        System.out.println("\nTam giác 2:");
        System.out.println("Chu vi: " + tamGiac2.getChuVi());
        System.out.println("Diện tích: " + tamGiac2.getDienTich());
        System.out.println("Loại tam giác: " + tamGiac2.getLoaiTamGiac());

        System.out.println("\nTam giác 3:");
        System.out.println("Chu vi: " + tamGiac3.getChuVi());
        System.out.println("Diện tích: " + tamGiac3.getDienTich());
        System.out.println("Loại tam giác: " + tamGiac3.getLoaiTamGiac());
    }
}