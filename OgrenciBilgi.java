/*
 * Ad Soyad: Melik Buğra Kara
 * Ogrenci No: 250541110
 * Tarih: 24.10.2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        // Scanner objesi olusturun
        
        Scanner input = new Scanner(System.in);
        
        // Degisken tanimlamalari
        String ad, soyad;
        int ogrenciNo, yas;
        double gpa;
        
        
        // Kullanicidan bilgileri alin
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();
        
        // Ad
        System.out.print("Adinizi girin : ");
        ad = input.next();
        
        // Soyad
        System.out.print("Soyadinizi girin : ");
        soyad = input.next();
        
        // Ogrenci No
        System.out.print("Ogrenci No. girin : ");
        ogrenciNo = input.nextInt();
        
        // Yas
        System.out.print("Yasinizi girin : ");
        yas = input.nextInt();

        // GPA
        System.out.print("GPA'inizi girin : ");
        gpa = input.nextDouble();
        
        // Bilgileri ekrana yazdirin
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        
        // COZUMUNUZU BURAYA YAZIN
        System.out.printf("Ad-Soyad: %s %s \n", ad, soyad);
        System.out.printf("Ogrenci No : %d \n", ogrenciNo);
        System.out.printf("Yas : %d \n", yas);
        System.out.printf("GPA : %.2f \n", gpa);
        
        // Scanner'i kapatin (önemli pratik)
        input.close();
    }
}
