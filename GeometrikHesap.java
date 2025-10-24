/*
 * Ad Soyad: Melik Buğra Kara
 * Ogrenci No: 250541110
 * Tarih: 24.10.2025
 * Aciklama: Gorev 2 - Geometrik Hesaplayıcı
 * 
 * Bu program kullanıcıdan yarı çapı alıp dairenin alanı, çevresi ve çapını; aynı yarı çaplı kürenin hacmini ve yüzey alanını bulur.
 */

import java.util.Scanner;

public class GeometrikHesap{
    public static void main(String[] args) {
        System.out.println("=== GEOMETRIK HESAPLAYICI ===");

        // Scanner objesini oluşturur.
        Scanner input = new Scanner(System.in);
        
        // Pi'yi 3.14159 olarak belirler.
        final double pi = 3.14159;

        // Yarıçapı kullanıcından alır.
        System.out.print("Yaricapi giriniz : ");
        double yaricap = input.nextDouble();

        // Gerekli hesaplamaları yapar
        double dairealani = pi * Math.pow(yaricap, 2);
        double dairenincevresi = 2 * pi * yaricap;
        double dairenincapi = 2 * yaricap;
        double kureninhacmi = (4.0/3.0) * pi * Math.pow(yaricap, 3);
        double kureninalani = 4 * pi * Math.pow(yaricap, 2);

        // Sonuçları yazdırır.
        System.out.println("======SONUÇLAR======");
        System.out.printf("Dairenin alani:          %.2f \n", dairealani);
        System.out.printf("Dairenin cevresi:        %.2f \n", dairenincevresi);
        System.out.printf("Dairenin capi:           %.2f \n", dairenincapi);
        System.out.printf("Kurenin hacmi:           %.2f \n", kureninhacmi);
        System.out.printf("Kurenin yuzey alani :    %.2f \n", kureninalani);

        // Scanner'ı kapat
        input.close();
    }
}
