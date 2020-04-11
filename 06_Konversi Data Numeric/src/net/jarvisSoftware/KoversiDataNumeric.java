package net.jarvisSoftware;

public class KoversiDataNumeric {
    //konversi tipe data numeric
    public static void main(String[] args) {
        // kita bisa mengkonfersi dari tipe data numeric yang memiliki size bit lebih kecil ke yang lebih besar.
        //apabila kita melakukan sebaliknya maka hasilnya akan aneh

        // 1. konversi dari tipe int ke long
        int nilaiInt = 700;
        System.out.println("===== KONVERSI TIPE DATA =====");
        System.out.println("Nilai Int : " + nilaiInt);
        System.out.println("Nilai max Int : " + Integer.MAX_VALUE);
        System.out.println("Nilai min Int : " + Integer.MIN_VALUE);
        System.out.println("Besaran memori Int : " + Integer.SIZE + " bit");
        System.out.println("Besaran memori Int : " + Integer.BYTES + " byte \n");

        long nilaiLong = nilaiInt;
        System.out.println("Nilai Long : " + nilaiLong);
        System.out.println("Nilai max Long : " + Long.MAX_VALUE);
        System.out.println("Nilai min Long : " + Long.MIN_VALUE);
        System.out.println("Besaran memori Long : " + Long.SIZE + " bit");
        System.out.println("Besaran memori Long : " + Long.BYTES + " byte \n");

        System.out.println("Dari program diatas bisa dilihat bahwa nilai value variable tetap sama, namun jumlah memori yang dipakai berbeda");
        System.out.println("Ingat, jangan mengkonfersi data dari dari besar ke kecil. karena akan bermasalah pada hasil\n");

        // 2. casting tipe data
        short variabelCastingInt = 7;
        //short adalah angka non koma seperti Int namun memiliki besaran memori yang lebih kecil
        System.out.println("===== CASTING TIPE DATA =====");
        System.out.println("SEBELUM CASTING");
        System.out.println("Tipe variabel yang akan di casting adalah Short dengan nilai " + variabelCastingInt);
        System.out.println("Nilai max : " + Short.MAX_VALUE);
        System.out.println("Nilai min : " + Short.MIN_VALUE);
        System.out.println("Besaran memori : " + Short.SIZE + " bit");
        System.out.println("Besaran memori : " + Short.BYTES + " byte\n");
        System.out.println("SESUDAH CASTING");
        // sintax dibawah inilah yang benar2 mencasting dari tipe data int ke tipe data float (float)variabelCastingInt
        System.out.println("Setelah dicasting maka menjadi tipe Double valuenya bernilai " + (double)variabelCastingInt);
        System.out.println("Nilai max : " + Double.MAX_VALUE);
        System.out.println("Nilai min : " + Double.MIN_NORMAL);
        System.out.println("Besaran memori : " + Double.SIZE + " bit");
        System.out.println("Besaran memori : " + Double.BYTES + " byte\n");

        System.out.println("Nilai valuenya tidak berbeda, namun bisa dilihan kalau casting berhasil terletak pada penggunaan ukuran memori\n");

    }
}
