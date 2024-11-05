import java.util.Scanner;
public class modifikasipercobaan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMhs];
        
        double rataLulus = 0;
        double rataTidakLulus = 0;
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jumalLulus = 0;
        int jumalTidakLulus = 0;

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumalLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumalTidakLulus++;
            }
        }

        rataLulus = (jumalLulus > 0) ? totalLulus / jumalLulus : 0;
        rataTidakLulus = (jumalTidakLulus > 0) ? totalTidakLulus / jumalTidakLulus : 0;
        
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
}
