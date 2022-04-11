package com.company;
import java.util.*;
class Baju{
    String jenis;
    int harga;
    int jumlah;

    public Baju(String jenis, int jumlah){
        this.jenis = jenis;
        this.jumlah = jumlah;
    }
    
    final int baju_1= 100000;
    final int baju_2 = 125000;
    final int baju_3 = 175000;

    void harga_1(){
        if(jumlah > 100){
        harga = 95000;
        }else
        harga = baju_1;
    }

    void harga_2(){
        if (jumlah > 100){
        harga = 120000;
        }else
        harga = baju_2;
    }

    void harga_3(){
        if (jumlah > 100){
        harga = 160000;
        }else
        harga = baju_3;
    }

    void display(){
        if(jenis.equalsIgnoreCase("a")) {
            harga_1();
        }else if(jenis.equalsIgnoreCase("b")) {
            harga_2();
        }else if(jenis.equalsIgnoreCase("c")){
            harga_3();
        }

        System.out.println("Jenis yang anda beli : " + jenis);
        System.out.println("Harga per buah : " + harga);
        System.out.println("Total harga : " + harga*jumlah);

    }
}
public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        System.out.println("=============================");
        System.out.println("|   Jenis baju  |   Harga   |");
        System.out.println("=============================");
        System.out.println("|       a       |   100000  |");
        System.out.println("|       b       |   125000  |");
        System.out.println("|       c       |   175000  |");
        System.out.println(" ");
        System.out.print("Silahkan masukkan jenis baju : ");
    String jenis = sc.nextLine();
        System.out.print("masukkan jumlah pembelian : ");
    int jumlah = sc.nextInt();

    Baju bajuu = new Baju (jenis, jumlah);
    bajuu.display();
    }
}
