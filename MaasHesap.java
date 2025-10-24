/*
 * Ad Soyad: Melik Buğra Kara
 * Ogrenci No: 250541110
 * Tarih: 24.10.2025
 * Aciklama: Gorev 3 - Maaş Hesaplama Sistemi
 * 
 * Bu program çalışanın adını soyadını, haftalık çalışma saatini, mesai ücretini alıp gerekli kesintileri yapıp bir maaş bordosu oluşturur.
 */

import java.time.LocalDate;
import java.util.Scanner;

public class MaasHesap{
    public static void main(String[] args) {
        String ad, soyad;
        double brutMaas, haftalikSaat, mesaiSaat;
        double mesaiUcreti, toplamUcret;
        double sonSgkKesintisi, sonGelirVergisiKesintisi, sonDamgaVergisiKesintisi;
        double toplamKesinti, sonGelir;
        // Kullanıcının bilgilerini al.
        Scanner input = new Scanner(System.in);
        System.out.print("Calisanin ad: ");
        ad = input.next();

        System.out.print("Calisanin soyadi: ");
        soyad = input.next();

        System.out.print("Brut maas (TL) : ");
        brutMaas = input.nextDouble();

        System.out.print("Haftalik calisma saati : ");
        haftalikSaat = input.nextInt();

        System.out.print("Mesai saati sayisi : ");
        mesaiSaat = input.nextInt();

        // Hesaplamaları yap.
        final double sgkKesintisi = 0.14f;
        final double gelirVergisi = 0.15f;
        final double damgaVergisi = 0.00759f;

        mesaiUcreti = (brutMaas/ 160) * mesaiSaat * 1.5;
        toplamUcret = mesaiUcreti + brutMaas;

        sonSgkKesintisi = toplamUcret * sgkKesintisi;
        sonGelirVergisiKesintisi = toplamUcret * gelirVergisi;
        sonDamgaVergisiKesintisi = toplamUcret * damgaVergisi;

        toplamKesinti = sonSgkKesintisi + sonGelirVergisiKesintisi + sonDamgaVergisiKesintisi;

        sonGelir = toplamUcret - toplamKesinti;

        double kesintiYuzdesi = (toplamKesinti / toplamUcret) * 100;
        double saatlikNetKazanc = sonGelir / (haftalikSaat + mesaiSaat);
        double gunlukNetKazanc = sonGelir / 22;

        // Tüm sonuçları yazdır.
        final LocalDate tarih = LocalDate.now();
        System.out.println("====================================");
        System.out.println("            Maaş bordosu");
        System.out.println("====================================");
            
        System.out.printf("Calisan : %s %s \n", ad, soyad);
        System.out.printf("Tarih : %s \n \n", tarih);

        System.out.println("GELIRLER:");
        System.out.printf("     Brut Maas : %.2f TL \n", brutMaas);
        System.out.printf("     Mesai Ucreti : %.2f TL\n", mesaiUcreti);
        System.out.printf("     TOPLAM GELIR : %.2f TL\n \n", toplamUcret);

        System.out.println("KESINTILER:");
        System.out.printf("     SGK Kesintisi (14.0%%) : %.2f TL\n", sonSgkKesintisi);
        System.out.printf("     Gelir Vergisi (15.0%%) : %.2f TL\n", sonGelirVergisiKesintisi);
        System.out.printf("     Damga Vergisi (0.8%%)  : %.2f TL\n", sonDamgaVergisiKesintisi);
        System.out.printf("     TOPLAM KESINTI : %.2f TL\n \n", toplamKesinti);

        System.out.printf("NET MAAS : %.2f TL\n \n", sonGelir);

        System.out.println("ISTATISTIKLER:");
        System.out.printf("     Kesinti Orani : %.2f %% \n", kesintiYuzdesi);
        System.out.printf("     Saatlik Net Kazanc : %.2f TL/saat \n", saatlikNetKazanc);
        System.out.printf("     Gunluk Net Kazanc : %.2f TL/gun \n", gunlukNetKazanc);
        System.out.println("====================================");
    }
}
