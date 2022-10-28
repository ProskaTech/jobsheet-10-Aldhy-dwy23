package com.program;
// Created by 21343017_Aldhy
public class L1_MobilUtama {
    public static void main(String[] args) {
        L1_Mobil Honda = new L1_Mobil();
        Honda.merk="Civic";
        Honda.warna="hitam";
        Honda.tahunProduksi=2020;
        System.out.println("merek\t; "+Honda.merk); 
        System.out.println("warna\t; "+Honda.warna); 
        System.out.println("tahun\t; "+Honda.tahunProduksi); 
        
        Honda.Maju();
        Honda.Maju();
        Honda.Mundur();
        
    }
}
