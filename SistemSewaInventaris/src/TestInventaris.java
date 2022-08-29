public class TestInventaris {
    public static void main(String[] args) {
        SistemInventaris sistemInventaris = new SistemInventaris("Sewa Inventaris TI'C");

        AlatMusik a1 = new AlatMusik("Keyboard",40000,6,"101");
        AlatMusik a2 = new AlatMusik("Gitar",30000,8,"102");

        sistemInventaris.tambahAlatMusik(a1);
        sistemInventaris.tambahAlatMusik(a2);


        SoundSystem s1 = new SoundSystem("Mic",5000,25,"201");
        SoundSystem s2 = new SoundSystem("Speaker",35000,12,"202");

        sistemInventaris.tambahSoundSystem(s1);
        sistemInventaris.tambahSoundSystem(s2);

        //sistem dimulai
        sistemInventaris.mulaiSistem();

    }
}
