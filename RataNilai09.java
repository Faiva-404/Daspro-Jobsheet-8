import java.util.Scanner;
public class RataNilai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        float nilai, totalNilai, rataNilai;

        for (i=1; i<=6; i++) {
            totalNilai = 0;
            System.out.println("Input Nilai Mahasiswa ke" + i);

        for (j=1; j<=5; j++) {
            System.out.print("Nilai ke-" + j + " = ");
            nilai = sc.nextFloat();
            totalNilai += nilai;
        }

        rataNilai = totalNilai / 5;
        System.out.println("Rata-rata Nilai Mahasiswa ke " + i + "adalah" + rataNilai);
        System.out.println();
        }

        sc.close();
    }
}