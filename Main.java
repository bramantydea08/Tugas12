package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // write your code here
        String barang;
        int Harga;
        String Paket;
        Scanner input = new Scanner(System.in);
        Skincare user=new Skincare();
        System.out.println();
        System.out.println("-----------------------APLIKASI PENJUALAN SKINCARE BY FIDIABEAUTY.COM---------------------");
        System.out.println("Menjual berbagai produk kecantikan sesuai kebutuhan kulit dengan bahan yang aman dan Herbal");
        System.out.println();
        System.out.println("<<<<<<<<Data Pelanggan >>>>>>>>");
        System.out.print(" Nama              = ");
        String Nama = input.next();
        System.out.print(" Alamat            = ");
        String Alamat = input.next();
        System.out.print(" Metode Pembayaran = ");
        String MetodeP = input.next();
        System.out.print(" Uang anda         = ");
        Integer Uang = input.nextInt();
        System.out.println();
        user.setPNama(Nama);
        user.setPAlamat(Alamat);
        user.setPMetodeP(MetodeP);
        user.setPUang(Uang);
        System.out.println("Silahkan Pilih Paket Skincare yang Anda inginkan ");
        System.out.println("1. Paket Whitening");
        System.out.println("2. Paket Luminous");
        System.out.println("3. Paket Acne");
        System.out.print(" Masukan Nomer =  ");
        int a= input.nextInt();
        System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>");
        if (a==1){
            Paket = "Paket Whitening";
            barang = "Whitening Day and Night Cream,Toner,Facial Wash";
            Harga = 550000;
        }
        else if (a==2){
            Paket="Paket Luminous";
            barang= "Whitening Day Cream,Toner,Facial Wash,Ultimate Night Cream";
            Harga = 680000;
        }
        else if (a==3){
            Paket="Paket Acne";
            barang= "Whitening Day Cream,Toner,Facial Wash,Acne Night Cream";
            Harga = 400000;
        }
        else {
            Paket="null";
            barang= "null";
            Harga =0;
            System.out.println("Error. Not Found");
        }
        user.setbarang(barang);
        user.setHarga(Harga);
        user.setPaket(Paket);
        System.out.println();
        System.out.println();
        System.out.println("===========================Struk Pembelian Skincare FidiaBeauty=========================");
        System.out.println("========================================================================================");
        System.out.println("|| Nama                         : "+user.getPNama());
        System.out.println("|| Alamat                       : " +user.getPAlamat());
        System.out.println("|| Pilihan Paket                : "+user.getPaket());
        System.out.println("|| Barang yang didapatkan       : "+user.getbarang());
        System.out.println("|| Harga                        : Rp. "+user.getHarga());
        System.out.println("|| Uang                         : Rp. "+user.getPUang());
        System.out.println("|| Sisa Uang Anda               : Rp. "+(user.getPUang()-user.getHarga()));
        System.out.println("========================================================================================");
        System.out.println("========================================FIDIABEAUTY.COM=================================");
    }
}

