package com.AnandaRezaKurniawan.TugasModul1;

import java.util.Scanner;

public class No1_KonversiSuhuTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Deklarasi Objek
        No1_Suhu no1_Suhu = new No1_Suhu();

        // Input Suhu Dalam Celcius
        System.out.print("Masukan Suhu Celcius\t: ");
        float suhu = scan.nextFloat();

        // Konversi suhu dari Celcius Ke Fahrenheit
        Float suhu1 = no1_Suhu.CelciustoFahrenheit(suhu);
        System.out.println("Celcius Ke Fahrenheit\t: " + suhu1);

        // Konversi suhu dari Fahrenheit Ke Kelvin
        Float suhu2 = no1_Suhu.FahrenheitoKelvin(suhu1);
        System.out.println("Fahrenheit Ke Kelvin\t: " + suhu2);

        // Konversi suhu dari Kelvin Ke Reamur
        Float suhu3 = no1_Suhu.KelvintoReamur(suhu2);
        System.out.println("Kelvin Ke Reamur\t\t: " + suhu3);

        // Konversi suhu dari Reamur Ke Celcius
        Float suhu4 = no1_Suhu.ReamurtoCelcius(suhu3);
        System.out.println("Reamur Ke Celcius\t\t: " + suhu4);

    }
}

