package com.AnandaRezaKurniawan.Nomer1;


public class DemoClub {
    public static void main(String[] args) {


        Club club1 = new Club();
        Club club2 = new Club("Real Madrid");
        Club club3 = new Club("Real Madrid", " Madrid Football Club adalah sebuah klub sepak bola yang berasal dari Liga Spanyol");
        Club club4 = new Club("Real Madrid", 1902, "Santiago Bernabeu");
        Club club5 = new Club("Real Madrid", 1902, "Santiago Bernabeu", 13, "Madrid Football Club adalah sebuah klub sepak bola yang berasal dari Liga Spanyol");

        // Memanggil Method dari class Club
        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club4.getTeam();
        System.out.println();
        club5.getTeam();
    }
}
