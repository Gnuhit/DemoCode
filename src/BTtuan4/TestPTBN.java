package BTtuan4;

public class TestPTBN {
    public static void main(String[] args) {
        PhuongTrinhBacNhat ptbn1 = new PhuongTrinhBacNhat(); 
        PhuongTrinhBacNhat ptbn2 = new PhuongTrinhBacNhat(3, 5); 

        System.out.println("Phương trình 1: " + ptbn1);
        System.out.println("Nghiệm: " + ptbn1.giaiPT());

        System.out.println("\nPhương trình 2: " + ptbn2);
        System.out.println("Nghiệm: " + ptbn2.giaiPT());
    }
}
