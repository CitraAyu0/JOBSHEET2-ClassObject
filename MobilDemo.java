public class MobilDemo {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.merk = "Toyota Avanza";
        mobil1.warna = "Hitam";
        mobil1.tahunProduksi = 2020;
        mobil1.kapasitas = 7;
        mobil1.kecepatan = 0;

        Mobil mobil2 = new Mobil();
        mobil2.merk = "Honda Civic";
        mobil2.warna = "Merah";
        mobil2.tahunProduksi = 2022;
        mobil2.kapasitas = 5;
        mobil2.kecepatan = 0;

        mobil1.nyalakanMesin();
        mobil1.percepat(40);
        mobil1.klakson();
        mobil1.kurangiKecepatan(15);
        mobil1.matikanMesin();

        System.out.println();

        mobil2.nyalakanMesin();
        mobil2.percepat(60);
        mobil2.klakson();
        mobil2.kurangiKecepatan(20);
        mobil2.matikanMesin();
    }
}
