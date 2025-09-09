public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";
        m1.displayBiodata();

        System.out.println();

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "024567";
        m2.nama = "Citra Meilinda";
        m2.alamat = "Malang, Jawa Timur";
        m2.kelas = "2B";
        m2.displayBiodata();

        System.out.println();

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "025678";
        m3.nama = "Vinza Pratama";
        m3.alamat = "Lombok, Nusa Tenggara Barat";
        m3.kelas = "2C";
        m3.displayBiodata();
    }
}