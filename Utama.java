/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Habtia Humaira
 */
public class Utama {
    public static void main(String[] args) {
        Hewan meong = new Hewan();
        System.out.println("Nama saya meong...");
        meong.setJumlahKaki(4);
        meong.bernafas();
        meong.tumbuh();
        meong.beradaptasi();
        System.out.println("Jumlah kaki saya ada "  + meong.getJumlahKaki());
        Tumbuhan tulip = new Tumbuhan();
        System.out.println("Nama saya tulip...");
        tulip.setWarnaDaun("Pink");
        tulip.setArahDaun("Barat");
        tulip.bernafas();
        tulip.tumbuh();
        tulip.beradaptasi();
        System.out.println("Arah daun siang hari " + tulip.getArahDaun());
        System.out.println("Warna bunga " + tulip.getWarnaDaun());
        Aves elang = new Aves();
        System.out.println("Nama saya elang...");
        elang.setWarnaBulu("Coklat tua");
        elang.setBentukParuh("Melengkung dan tajam");
        elang.bernafas();
        elang.tumbuh();
        elang.beradaptasi();
        System.out.println("Warna bulu saya " +elang.getWarnaBulu());
        System.out.println("Bentuk paruh saya " +elang.getBentukParuh());
        Reptil buaya = new Reptil();
        System.out.println("Saya buaya...");
        buaya.setJumlahKuku(20);
        buaya.setCaraReproduksi("Ovipar");
        buaya.bernafas();
        buaya.tumbuh();
        buaya.beradaptasi();
        System.out.println("Jumlah kuku saya " +buaya.getJumlahKuku());
        System.out.println("Cara reproduksi saya " +buaya.getCaraReproduksi());
        Pisces hiu = new Pisces();
        System.out.println("Saya Hiu...");
        hiu.setBentukTubuh("besar dan rampinng");
        hiu.setTingkahLaku("pemburu ulung");
        hiu.bernafas();
        hiu.tumbuh();
        hiu.beradaptasi();
        System.out.println("Bentuk tubuh saya " +hiu.getBentukTubuh());
        System.out.println("Tingkah laku saya " +hiu.getTingkahLaku());
        Mamalia sapi = new Mamalia();
        System.out.println("Saya sapi...");
        sapi.setBentukTubuh("besar dan kuat");
        sapi.setAdaptasiFisik("kulit tebal untuk melindungi dari sinar matahari dan goresan.");
        sapi.bernafas();
        sapi.tumbuh();
        sapi.beradaptasi();
        System.out.println("Bentuk tubuh saya " +sapi.getBentukTubuh());
        System.out.println("Adaptasi Fisik saya " +sapi.getAdaptasiFisik());
        Amfibi katak_hijau = new Amfibi();
        System.out.println("Saya katak hijau...");
        katak_hijau.setWarnaKulit("hijau");
        katak_hijau.setHabitat("sawah, kolam, hutan, dan taman");
        katak_hijau.bernafas();
        katak_hijau.tumbuh();
        katak_hijau.beradaptasi();
        System.out.println("Warna kulit saya " +katak_hijau.getWarnaKulit());
        System.out.println("Habitat saya " +katak_hijau.getHabitat());
        Dikotil pohon_mangga = new Dikotil();
        System.out.println("Saya pohon mangga...");
        pohon_mangga.bernafas();
        pohon_mangga.tumbuh();
        pohon_mangga.beradaptasi();
        pohon_mangga.setLajuPertumbuhan("sedang");
        pohon_mangga.setBentukTulangDaun("menjari");
        System.out.println("Laju pertumbuhan saya " +pohon_mangga.getLajuPertumbuhan());
        System.out.println("Bentuk tulang daun saya " +pohon_mangga.getBentukTulangDaun());
        Monokotil jagung = new Monokotil();
        System.out.println("Saya jagung...");
        jagung.setBentukBatang("tegak dan kokoh");
        jagung.setBentukDaun("panjang dan tipis");
        jagung.bernafas();
        jagung.tumbuh();
        jagung.beradaptasi();
        System.out.println("Bentuk batang saya " +jagung.getBentukBatang());
        System.out.println("Bentuk daun saya " +jagung.getBentukDaun());
    }
}
