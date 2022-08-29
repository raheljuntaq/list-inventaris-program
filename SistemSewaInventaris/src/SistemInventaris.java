import java.util.ArrayList;
import java.util.Scanner;

public class SistemInventaris {
    private String namaInventaris;
    private int counterNomor;
    private int pilihMenu;

    private ArrayList<AlatMusik> listAlatMusik = new ArrayList<>();
    private ArrayList<SoundSystem> listSoundSystem = new ArrayList<>();
    private Scanner input = new Scanner(System.in);


    //constructor
    public SistemInventaris(String namaInventaris) {
        this.namaInventaris = namaInventaris;
    }

    //mulai sistem
    public void mulaiSistem() {
        boolean sistemOn = true;
        while (sistemOn) {
            System.out.println("\nPilih Menu!");
            System.out.println("1. Lihat List Alat Musik");
            System.out.println("2. Lihat List Sound System");
            System.out.println("3. Tambah Alat Musik");
            System.out.println("4. Tambah Sound System");
            System.out.println("5. Hapus Alat Musik");
            System.out.println("6. Hapus Sound System");
            System.out.println("7. Exit");
            System.out.print("Pilih Menu Nomor: ");
            pilihMenu = input.nextInt();
            input.nextLine();
            switch (pilihMenu) {
                case 1:
                    cetakListAlatMusik();
                    break;
                case 2:
                    cetakListSoundSystem();
                    break;
                case 3:
                    AlatMusik aBaru = AlatMusik.tambahAlatMusik();
                    tambahAlatMusik(aBaru);
                    System.out.println("Alat Musik Telah Ditambahkan");
                    break;
                case 4:
                    SoundSystem sBaru = SoundSystem.tambahSoundSystem();
                    tambahSoundSystem(sBaru);
                    System.out.println("Sound System Telah Ditambahkan");
                    break;
                case 5:
                    AlatMusik ahapus = AlatMusik.hapusAlatMusik(listAlatMusik);
                    hapusAlatMusik(ahapus);
                    System.out.println("Alat Musik Telah Dihapuskan");
                    break;
                case 6:
                    SoundSystem shapus = SoundSystem.hapusSoundSystem(listSoundSystem);
                    hapusSoundSystem(shapus);
                    System.out.println("Sound System Telah Dihapuskan");
                    break;
                case 7:
                    sistemOn = false;
                    System.out.println("Sistem Dimatikan");
                    break;
                default:
                    System.out.println("\nMenu Tidak Tersedia!");
            }
        }
    }

    public void tambahAlatMusik(AlatMusik a) {
        listAlatMusik.add(a);
    }
    public void hapusAlatMusik(AlatMusik a) {
        listAlatMusik.remove(a);
    }
    public void cetakListAlatMusik() {
        counterNomor = 0;
        System.out.println("\nList Alat Musik: ");
        for(AlatMusik a : listAlatMusik) {
            counterNomor++;
            System.out.print(counterNomor + ". ");
            a.cetakAlatMusik();
        }
    }

    public void tambahSoundSystem(SoundSystem s) {
        listSoundSystem.add(s);
    }
    public void hapusSoundSystem(SoundSystem s) {
        listSoundSystem.remove(s);
    }
    public void cetakListSoundSystem() {
        counterNomor = 0;
        System.out.println("\nList Sound System: ");
        for(SoundSystem s : listSoundSystem) {
            counterNomor++;
            System.out.print(counterNomor + ". ");
            s.cetakSoundSystem();
        }
    }


}
