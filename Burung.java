package com.AnandaRezaKurniawan.Nomer2;

// Class Burung yang mewarisi Class Binatang
public class Burung {
    // Inisiasi variabel
    public String nama;
    public String terbang;
    public String makan;
    public String tidur;

    // Method getName untuk mencetak nama binatangnya
    public void getNama(){
        System.out.println("Nama Binatang\t: " + nama);
    }
    // Method terbang untuk mencetak aktivitas hewan burung
    public void terbang(){
        System.out.println("Aktivitas\t\t: " + terbang);
    }

    public void binatang() {
    }
}
