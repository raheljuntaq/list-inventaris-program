import java.util.ArrayList;
import java.util.Scanner;

public class SoundSystem extends Inventaris{
    private String id_soundSystem;

    public SoundSystem(String namaBarang,int hargaPerHari,int jumlah,String id_soundSystem) {
        super(namaBarang,hargaPerHari,jumlah);
        this.id_soundSystem = id_soundSystem;
    }
    public void setId_soundSystem(String id_soundSystem) {
        this.id_soundSystem = id_soundSystem;
    }
    public String getId_soundSystem() {
        return id_soundSystem;
    }

    public static SoundSystem tambahSoundSystem() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nNama Barang: ");
        String namaBarang = input.nextLine();
        System.out.print("Harga per Hari: ");
        int hargaPerHari = Integer.parseInt(input.nextLine());
        System.out.print("Jumlah: ");
        int jumlah = Integer.parseInt(input.nextLine());
        System.out.print("id Alat Musik: ");
        String id_soundSystem = input.nextLine();
        return new SoundSystem(namaBarang,hargaPerHari,jumlah,id_soundSystem);
    }

    public static SoundSystem hapusSoundSystem(ArrayList<SoundSystem> listSoundSystem) {
        Scanner input = new Scanner(System.in);
        int counterNomor = 1;

        System.out.println("Menampilkan List Sound System: ");
        for (SoundSystem s : listSoundSystem) {
            System.out.print(counterNomor + ". ");
            s.cetakSoundSystem();
            counterNomor++;
        }

        try {
            System.out.print("Masukkan Nomor Sound System Yang Ingin Dihapus: ");
            int indexSoundSystem = input.nextInt();
            return listSoundSystem.get(indexSoundSystem - 1);
        } catch (Exception exS) {
            System.out.println("Nomor Salah!");
        }
        return null;
    }


    public void cetakSoundSystem() {
        System.out.println("Nama Barang: " + getNamaBarang());
        System.out.println("Harga per Hari: " + getHargaPerHari());
        System.out.println("Jumlah: " + getJumlah());
        System.out.println("id Sound System: " + getId_soundSystem());
    }
}
