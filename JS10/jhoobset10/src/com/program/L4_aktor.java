package com.program;
// Created by 21343017_Aldhy
public class L4_aktor {
    String nama;
    int umur;

    L4_aktor(String n,int u){
        nama=n;
        umur=u;
    }

    void tampilAktor(){
        System.out.println("namaku : "+nama);
        System.out.println("umurku : "+umur+" tahun");
    }

public static void main(String[] args) {
    L4_aktor a;

    a=new L4_aktor("ronaldo", 33);
    a.tampilAktor();
    System.out.println("==============");

    a=new L4_aktor("messi", 34);
    a.tampilAktor();
    System.out.println("==============");


}

}
