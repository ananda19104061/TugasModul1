package com.AnandaRezaKurniawan.Nomer3;

public class DemoPacar {
    public static void main(String[] args) {
        // objek dari kelas Mahasiswa dan Pacar
        Mahasiswa mahasiswa = new Mahasiswa();
        Pacar pacar = new Pacar();

        // Memanggil Method Mahasiswa dan pacar
        mahasiswa.getStatus();
        pacar.getStatus();
    }
}
