package com.AnandaRezaKurniawan.TugasModul1;

public class No1_Suhu {
    // Mengkonversi suhu dari Celcius ke Fahrenheit
    public float CelciustoFahrenheit(float suhu){
        float hasil = (suhu * 9/5) + 32;
        return hasil;
    }
    // Mengkonversi suhu dari Fahrenheit ke Kelvin
    public float FahrenheitoKelvin(float suhu) {
        float hasil = (suhu - 32) * 5/9 + 273;
        return hasil;
    }
    // Mengkonversi suhu dari Kelvin ke Reamur
    public float KelvintoReamur(float suhu) {
        float hasil = (suhu - 273) * 4/5;
        return hasil;
    }
    // Mengkonversi suhu dari Reamur ke Celcius
    public float ReamurtoCelcius(float suhu) {
        float hasil = suhu * 5/4;
        return hasil;
    }
}
