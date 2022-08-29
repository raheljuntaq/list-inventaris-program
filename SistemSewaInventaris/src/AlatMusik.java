import java.util.ArrayList;
import java.util.Scanner;

public class AlatMusik extends Inventaris {
    private String id_alatMusik;

    public AlatMusik(String namaBarang,int hargaPerHari,int jumlah,String id_alatMusik) {
        super(namaBarang,hargaPerHari,jumlah);
        this.id_alatMusik = id_alatMusik;
    }
    public void setId_alatMusik(String id_alatMusik) {
        this.id_alatMusik = id_alatMusik;
    }
    public String getId_alatMusik() {
        return id_alatMusik;
    }

    public static AlatMusik tambahAlatMusik() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nNama Barang: ");
        String namaBarang = input.nextLine();
        System.out.print("Harga per Hari: ");
        int hargaPerHari = Integer.parseInt(input.nextLine());
        System.out.print("Jumlah: ");
        int jumlah = Integer.parseInt((input.nextLine()));
        System.out.print("id Alat Musik: ");
        String id_alatMusik = input.nextLine();
        return new AlatMusik(namaBarang,hargaPerHari,jumlah,id_alatMusik);
    }

    public static AlatMusik hapusAlatMusik(ArrayList<AlatMusik> listAlatMusik) {
        Scanner input = new Scanner(System.in);
        int counterNomor = 1;

        System.out.println("Menampilkan List Alat Musik:");
        for (AlatMusik a : listAlatMusik) {
            System.out.print(counterNomor + ". ");
            a.cetakAlatMusik();
            counterNomor++;
        }

        try {
            System.out.print("Masukkan Nomor Alat Musik Yang Ingin Dihapus: ");
            int indexAlatMusik = input.nextInt();
            return listAlatMusik.get(indexAlatMusik-1);
        } catch (Exception exA) {
            System.out.println("Nomor Salah!");
        }
        input.close();
        return null;
    }


    public void cetakAlatMusik() {
        System.out.println("Nama Barang: " + getNamaBarang());
        System.out.println("Harga per Hari: " + getHargaPerHari());
        System.out.println("Jumlah: " + getJumlah());
        System.out.println("id Alat Musik: " + getId_alatMusik());
    }
}
