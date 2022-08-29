public class Inventaris {
    private String namaBarang;
    private int hargaPerHari;
    private int jumlah;

    public Inventaris(String namaBarang,int hargaPerHari,int jumlah) {
        this.namaBarang = namaBarang;
        this.hargaPerHari = hargaPerHari;
        this.jumlah = jumlah;
    }

    public String getNamaBarang() {
        return namaBarang;
    }
    public int getHargaPerHari() {
        return hargaPerHari;
    }
    public int getJumlah() {
        return jumlah;
    }
}
