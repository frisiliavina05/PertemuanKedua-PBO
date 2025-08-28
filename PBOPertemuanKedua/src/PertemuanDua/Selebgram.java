/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanDua;

/**
 *
 * @author HP
 */
public class Selebgram extends Manusia implements Penulis, Penyanyi, Traveler {
    private String Nama;
    private int Umur;

    /**
     * @return the Nama
     */
    protected String getNama() {
        return Nama;
    }

    /**
     * @param Nama the Nama to set
     */
    protected void setNama(String Nama) {
        this.Nama = Nama;
    }

    /**
     * @return the Umur
     */
    protected int getUmur() {
        return Umur;
    }

    /**
     * @param Umur the Umur to set
     */
    protected void setUmur(int Umur) {
        this.Umur = Umur;
    }
    
    public Selebgram(String Nama, int Umur, String Bernafas, String Bergerak) {
        super(Bernafas, Bergerak);
        this.Nama = Nama;
        this.Umur = Umur;
    }
    
    public void Menulis() {
        System.out.println(Nama + " menulis buku tentang perjalanan hidupnya");
    }

    public void Menerbitkan() {
        System.out.println(Nama + " menerbitkan artikel motivasi di blog pribadinya");
    }

    public void MendapatkanPenghargaan() {
        System.out.println(Nama + " mendapatkan penghargagaan dari sastrawan");
    }

    public void Bernyanyi() {
        System.out.println(Nama + " bernyanyi dengan merdu di pentas seni");
    }

    public void Konser() {
        System.out.println(Nama + " menghadiri konser di Surabaya");
    }

    public void MerekamLagu() {
        System.out.println(Nama + " merekam lagu baru di studio");
    }

    public void Menjelajah() {
        System.out.println(Nama + " menjelajahi tempat yang eksotis di Indonesia");
    }

    public void Bepergian() {
        System.out.println(Nama + " bepergian ke berbagai kota untuk inspirasi");
    }

    public void MerekamPerjalanan() {
        System.out.println(Nama + " merekam perjalanan untuk konten media sosial");
    }

    public static void main(String[] args) {
        Selebgram Nola = new Selebgram("Nola", 22, "Paru-paru", "Berjalan");

        System.out.println("Nama : " + Nola.getNama());
        System.out.println("Umur : " + Nola.getUmur() + " tahun");
        System.out.println("Bernafas : " + Nola.getBernafas());
        System.out.println("Bergerak : " + Nola.getBergerak());

        System.out.println("\nAktivitas Nola sebagai Penulis : ");
        Nola.Menulis();
        Nola.Menerbitkan();
        Nola.MendapatkanPenghargaan();

        System.out.println("\nAktivitas Nola sebagai Penyanyi : ");
        Nola.Bernyanyi();
        Nola.Konser();
        Nola.MerekamLagu();

        System.out.println("\nAktivitas Nola sebagai Traveler : ");
        Nola.Menjelajah();
        Nola.Bepergian();
        Nola.MerekamPerjalanan();

    }
}
