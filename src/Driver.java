
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author REZA
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int pilihan, totalTagihan, jumlah, tarifKamar, jumlahHari, charge, usia;
        System.out.println("Pilih Menu : ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("anda akan memilih kamar");
                System.out.print("Masukkan akan berapa hari = ");
                jumlahHari = input.nextInt();
                System.out.println("========================================");
                tarifKamar = jumlahHari * 600000;
                System.out.println("Tarif Kamar = Rp. " + tarifKamar);
                System.out.print("usia pasien = ");
                usia = input.nextInt();
                if (usia >= 17) {
                    charge = 500000;
                    System.out.println("pasien masuk kedalam kategori umum");
                } else if (usia <= 16) {
                    charge = 700000;
                    System.out.println("pasien masuk kedalam kategori umum");
                } else if (usia <= 5) {
                    charge = 1000000;
                    System.out.println("pasien masuk kedalam kategori umum");
                } else {
                    charge = 0;
                    System.out.println("pasien idak masuk kedalam kategori apapun");
                }

                System.out.println("apakah Pasien memiliki Bpjs (y/n)?");
                String bpjs = input.next();
                if (bpjs.equalsIgnoreCase("y")) {
                    System.out.println("Anda memiliki BPJS");
                    System.out.println("========================================");
                    System.out.println("Anda mendapatkan diskon sebesar 30%");
                    jumlah = tarifKamar + charge;
                    totalTagihan = jumlah - (jumlah * 30 / 100);
                    System.out.println("Total tagihan anda adalah Rp. " + totalTagihan);
                } else {
                    System.out.println("Anda tidak memiliki BPJS");
                    System.out.println("========================================");
                    jumlah = tarifKamar + charge;
                    System.out.println("Total tagihan anda adalah Rp. " + jumlah);
                }

                break;
            case 2:
                System.out.println("anda akan memilih kamar");
                System.out.print("Masukkan akan berapa hari = ");
                jumlahHari = input.nextInt();
                System.out.println("========================================");
                tarifKamar = jumlahHari * 400000;
                System.out.println("Harga Solar = Rp. " + tarifKamar);

                System.out.print("usia pasien = ");
                usia = input.nextInt();
                if (usia >= 17) {
                    charge = 500000;
                    System.out.println("pasien masuk kedalam kategori umum");
                } else if (usia <= 16) {
                    charge = 700000;
                    System.out.println("pasien masuk kedalam kategori umum");
                } else if (usia <= 5) {
                    charge = 1000000;
                    System.out.println("pasien masuk kedalam kategori umum");
                } else {
                    charge = 0;
                    System.out.println("pasien idak masuk kedalam kategori apapun");
                }

                System.out.println("apakah Pasien memiliki Bpjs (y/n)?");
                bpjs = input.next();
                if (bpjs.equalsIgnoreCase("y")) {
                    System.out.println("Anda memiliki BPJS");
                    System.out.println("========================================");
                    System.out.println("Anda mendapatkan diskon sebesar 30%");
                    jumlah = tarifKamar + charge;
                    totalTagihan = jumlah - (jumlah * 30 / 100);
                    System.out.println("Total tagihan anda adalah Rp. " + totalTagihan);
                } else {
                    System.out.println("Anda tidak memiliki BPJS");
                    System.out.println("========================================");
                    jumlah = tarifKamar + charge;
                    System.out.println("Total tagihan anda adalah Rp. " + jumlah);
                }

                break;
            case 3:
                System.out.println("anda akan memilih kamar");
                System.out.print("Masukkan akan berapa hari = ");
                jumlahHari = input.nextInt();
                System.out.println("========================================");
                tarifKamar = jumlahHari * 200000;
                System.out.println("Harga Solar = Rp. " + tarifKamar);

                System.out.print("usia pasien = ");
                usia = input.nextInt();
                if (usia >= 17) {
                    charge = 500000;
                    System.out.println("pasien masuk kedalam kategori umum");
                } else if (usia <= 16) {
                    charge = 700000;
                    System.out.println("pasien masuk kedalam kategori umum");
                } else if (usia <= 5) {
                    charge = 1000000;
                    System.out.println("pasien masuk kedalam kategori umum");
                } else {
                    charge = 0;
                    System.out.println("pasien idak masuk kedalam kategori apapun");
                }

                System.out.println("apakah Pasien memiliki Bpjs (y/n)?");
                bpjs = input.next();
                if (bpjs.equalsIgnoreCase("y")) {
                    System.out.println("Anda memiliki BPJS");
                    System.out.println("========================================");
                    System.out.println("Anda mendapatkan diskon sebesar 30%");
                    jumlah = tarifKamar + charge;
                    totalTagihan = jumlah - (jumlah * 30 / 100);
                    System.out.println("Total tagihan anda adalah Rp. " + totalTagihan);
                } else {
                    System.out.println("Anda tidak memiliki BPJS");
                    System.out.println("========================================");
                    jumlah = tarifKamar + charge;
                    System.out.println("Total tagihan anda adalah Rp. " + jumlah);
                }

                break;
            default:
                System.out.println("Anda tidak memilih menu yang tersedia");
        }

    }

}
