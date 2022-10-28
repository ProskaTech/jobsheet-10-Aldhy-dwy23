package com.program;
import java.util.Scanner;
// Created by 21343017_Aldhy
public class L2_Manusia {
    String nama,tempat_lahir,tgl_lahir;
    int berat_badan,tinggi_badan;

    public void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nama lengkap\t : ");
        nama=input.nextLine();
        System.out.println("masukkan tempat lahir\t: ");
        tempat_lahir=input.nextLine();
        System.out.println("masukkan berat badan\t: ");
        berat_badan=input.nextInt();
        System.out.println("masukkan tinggi badan\t: ");
        tinggi_badan=input.nextInt();
    }

public void identitas(){
    System.out.println("");
    System.out.println("nama saya \t"+nama);
    System.out.println("tempat lahir \t"+tempat_lahir);
    System.out.println("tanggal lahir \t"+tgl_lahir);
    System.out.println("berat badan \t"+berat_badan+"KG");
    System.out.println("tanggal lahir \t"+tinggi_badan+"cm");
}

public static void main(String[] args) {
    L2_Manusia A= new L2_Manusia();
    A.inputData();
    A.identitas();
}

}
