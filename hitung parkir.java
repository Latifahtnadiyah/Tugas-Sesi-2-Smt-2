public class HitungParkir {
    public static void main(String[] args) {
        int jamMasuk = 8;
        int jamKeluar = 16;
        int biayaPerJam = 2000;
        int totalBiaya;
        
        totalBiaya = (jamKeluar - jamMasuk) * biayaPerJam;
        System.out.println("Total biaya parkir adalah : " + totalBiaya + " rupiah");
    }
}