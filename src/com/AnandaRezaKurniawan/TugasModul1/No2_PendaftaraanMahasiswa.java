package com.AnandaRezaKurniawan.TugasModul1;

import java.util.Scanner;

public class No2_PendaftaraanMahasiswa {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("==========Pendaftaraan Calon Mahasiswa Institut Teknologi Telkom Purwokerto==========");

        // Input nama lengkap
        System.out.print("Masukan Nama Lengkap\t\t\t: ");
        String nama = scan.nextLine();

        // Input tempat tanggal lahir
        System.out.print("Masukan Tempat, Tanggal Lahir\t: ");
        String ttl = scan.nextLine();

        // Input Agama
        System.out.print("Masukan Agama\t\t\t\t\t: ");
        String agama = scan.nextLine();

        // Input alamat rumah
        System.out.print("Masukan Alamat Rumah\t\t\t: ");
        String alamat = scan.nextLine();

        // Input jenis kelamin
        System.out.print("Masukan Jenis Kelamin \t\t\t: ");
        String kelamin = scan.nextLine();
        System.out.println();

        // Input pilihan jurusan
        System.out.println("=========Fakultas Informatika=========");
        System.out.println("S1 Software Engineering");
        System.out.println("S1 Teknik Informatika");
        System.out.println("S1 Sistem Informasi");
        System.out.println("S1 Sains Data");
        System.out.println();

        System.out.println("=========Fakultas Teknik Telekomunikasi Dan Elektro=========");
        System.out.println("S1 Teknik Telekomunikasi");
        System.out.println("S1 Teknik Elektro");
        System.out.println("S1 Biomedis");
        System.out.println("D3 Teknik Komunikasi");
        System.out.println();

        System.out.println("=========Fakultas Rekayasa Industri Dan Design=========");
        System.out.println("S1 Design Komunikasi Visual");
        System.out.println("S1 Teknik Industri");
        System.out.println("S1 Sistem Informasi");
        System.out.println();
        System.out.print("Masukan Pilihan Jurusan\t\t\t: ");
        String jurusan = scan.nextLine();

        // Input Email
        System.out.print("Masukan Email\t\t\t\t\t: ");
        String email = scan.nextLine();

        // Input Nomer HP
        System.out.print("Masukan Nomer HP\t\t\t\t: ");
        int nomorhp = scan.nextInt();

        // Input hasil UTBK
        System.out.print("Masukan Hasil UTBK\t\t\t\t: ");
        int nilaiUtbk = scan.nextInt();

        // Deklarasi Objek
        No2_Mahasiswa no2_mahasiswa = new No2_Mahasiswa(nama, ttl, agama, alamat,
                kelamin, jurusan, email, nomorhp, nilaiUtbk);

        // Output Data Mahasiswa Baru IT Telkom Purwokerto
        System.out.println();
        System.out.println("=========Data Calon Mahasiswa IT Telkom Purwokerto==========");
        System.out.println("Nama\t\t\t : " + no2_mahasiswa.nama);
        System.out.println("TTL\t\t\t\t : " + no2_mahasiswa.ttl);
        System.out.println("Agama\t\t\t : " + no2_mahasiswa.agama);
        System.out.println("Alamat Rumah\t : " + no2_mahasiswa.alamat);
        System.out.println("Jenis Kelamin\t : " + no2_mahasiswa.kelamin);
        System.out.println("Pilihan Jurusan\t : " + no2_mahasiswa.jurusan);
        System.out.println("Email\t\t\t : " + no2_mahasiswa.email);
        System.out.println("Nomer HP\t\t : " + no2_mahasiswa.nomorhp);
        System.out.println("Nilai UTBK\t\t : " + no2_mahasiswa.hasilUtbk);
        System.out.println("==========Terima Kasih Telah Melakukan Registrasi==========");
    }
}