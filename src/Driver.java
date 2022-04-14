
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
    public static boolean getYesOrNo(String message) {
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n" + message + " (y/n)? ");
        String pilihanUser = terminalInput.next();

        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.err.println("Pilihan anda bukan y atau n");
            System.out.print("\n" + message + " (y/n)? ");
            pilihanUser = terminalInput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int pilihan, totalTagihan, jumlah, tarifKamar = 0, jumlahHari, charge, usia, total;
        boolean isLanjutkan = true;
        while (isLanjutkan) {
            System.out.println("╔════════════════════════════════════════════╗");
            System.out.println("║               LIST LAYANAN                 ║");
            System.out.println("╚════════════════════════════════════════════╝");
            System.out.println("╔═════╦═════════════════════════════════════╗");
            System.out.println("║ No  ║     Kategori Layanan                ║");
            System.out.println("╠═════╬═════════════════════════════════════╬");
            System.out.println("║   1 ║ Kelas 1             Rp600000/hari   ║");
            System.out.println("║   2 ║ Kelas 2             Rp400000/hari   ║");
            System.out.println("║   3 ║ Kelas 3             Rp200000/hari   ║");
            System.out.println("╚═════╩═════════════════════════════════════╝");
            System.out.println("Pilih Menu : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    tarifKamar = 600000;
                    break;
                case 2:
                    tarifKamar = 400000;
                    break;
                case 3:
                    tarifKamar = 200000;
                    break;
                default:
                    System.err.print("Pilihan anda tidak ada");
            }

            System.out.print("Masukkan akan berapa hari = ");
            jumlahHari = input.nextInt();
            total = tarifKamar * jumlahHari;
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
                jumlah = total + charge;
                totalTagihan = jumlah - (jumlah * 30 / 100);
                System.out.println("Total tagihan anda adalah Rp. " + totalTagihan);
                System.out.println("========================================");
            } else {
                System.out.println("Anda tidak memiliki BPJS");
                System.out.println("========================================");
                jumlah = total + charge;
                System.out.println("Total tagihan anda adalah Rp. " + jumlah);
                System.out.println("========================================");
            }
            isLanjutkan = getYesOrNo("Apakah anda Ingin Lanjutkan : ");
        }
    }
}
