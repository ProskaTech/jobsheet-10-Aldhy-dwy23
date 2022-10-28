package com.program;
// Created by 21343017_Aldhy
public class T2_main {
public static void main(String[] args) {
    T2_class mahasiswa = new T2_class();

    mahasiswa.inputData();
    System.out.println("");
    System.out.println("======================");
    System.out.println("data mahasiswa ");
    System.out.println("nama mahasiswa : "+mahasiswa.nama);
    System.out.println("nim : "+mahasiswa.nim);
    System.out.println("semester : "+mahasiswa.semester);
    System.out.println("ip semester ini : "+mahasiswa.nilai);
    mahasiswa.hitung();
    }
}
