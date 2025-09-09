public class Mobil {
    public String merk;
    public String warna;
    public int tahunProduksi;
    public int kapasitas;
    public double kecepatan;

    public void nyalakanMesin() {
        System.out.println(merk + " mesin dinyalakan.");
    }

    public void matikanMesin() {
        System.out.println(merk + " mesin dimatikan.");
    }

    public void percepat(int tambahan) {
        kecepatan += tambahan;
        System.out.println(merk + " dipercepat, kecepatan sekarang: " + kecepatan + " km/jam");
    }

    public void kurangiKecepatan(int pengurangan) {
        kecepatan -= pengurangan;
        if (kecepatan < 0) {
            kecepatan = 0;
        }
        System.out.println(merk + " dikurangi kecepatannya, kecepatan sekarang: " + kecepatan + " km/jam");
    }

    public void klakson() {
        System.out.println(merk + " membunyikan klakson: Beep! Beep!");
    }
}
