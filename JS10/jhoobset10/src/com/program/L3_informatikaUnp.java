package com.program;
// Created by 21343017_Aldhy
public class L3_informatikaUnp {
    public static void main(String[] args) {
        L3_Mahasiswa informatika = new L3_Mahasiswa();
        L3_Mahasiswa elektronika = new L3_Mahasiswa();

        informatika.nama="aldhy";
        informatika.nim=1;
        informatika.jur="S1 informatika";
        informatika.univ="UNP";

        elektronika.nama="mirza";
        elektronika.nim=2;
        elektronika.jur="S1 Elektronika";
        elektronika.univ="UNP";

        System.out.println("data mahasiswa informatika");
        System.out.println("nama : "+informatika.nama);
        System.out.println("nim : "+informatika.nim);
        System.out.println("jurusan : "+informatika.jur);
        System.out.println("status : "+informatika.univ);

        System.out.println("data mahasiswa elektronika");
        System.out.println("nama : "+elektronika.nama);
        System.out.println("nim : "+elektronika.nim);
        System.out.println("jurusan : "+elektronika.jur);
        System.out.println("status : "+elektronika.univ);
    }
}
