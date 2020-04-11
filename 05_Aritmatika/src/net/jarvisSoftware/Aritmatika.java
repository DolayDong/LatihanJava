package net.jarvisSoftware;

public class Aritmatika {

    // operasi aritmatika pada java
    public static void main(String[] args) {
        // 1. penjumlahan
        System.out.println("===== PENJUMLAHAN =====");
        int parameterPertama = 7;
        double parameterKedua = 7.5d;
        System.out.println("Variabel pertama : " + parameterPertama + " Variabel kedua : " + parameterKedua);
        System.out.println("Hasil Variabel pertama + Variabel kedua adalah " + penjumlahan(parameterPertama, parameterKedua) + "\n");

        // 2. pengurangan
        System.out.println("===== PENGURANGAN ======");
        System.out.print("Hasil Variabel pertama - Variabel kedua adalah " + pengurangan(parameterPertama, parameterKedua) + "\n");

        // 3. perkalian
        System.out.println("===== PERKALIAN =====");
        System.out.println("Hasil Variabel pertama x Variabel kedua adalah " + perkalian(parameterPertama, parameterKedua) + "\n");

        // 4. pembagian
        System.out.println("===== PEMBAGIAN =====");
        System.out.println("Hasil Variabel pertama : Variabel kedua adalah " + pembagian(parameterPertama, parameterKedua));

        // 5. modulus
        System.out.println("===== MODULUS =====");
        System.out.println("Hasil Variabel pertama % Variabel kedua adalah " + modulus(parameterPertama, parameterKedua));

        // 6. kuadrat
        System.out.println("===== KUADRAT =====");
        System.out.print("Hasil kuadrat dari Variabel kedua adalah ");
        hitungKuadrat(parameterKedua);

    }

    private static double penjumlahan(int argumentKertama, double argumentKedua){
        return argumentKertama + argumentKedua;
    }

    private static double pengurangan(int argumentPertama, double argumentKedua){
        return argumentPertama - argumentKedua;
    }

    private static double perkalian(int argumentPertama, double argumentKedua){
        return argumentPertama * argumentKedua;
    }

    private static double pembagian(int argumentPertama, double argumentKedua){
        return argumentPertama / argumentKedua;
    }

    private static double modulus(int argumentPertama, double argumentKedua){
        return argumentPertama % argumentKedua;
    }

    private static void hitungKuadrat(double argumentPertama){
        double hasil = argumentPertama * argumentPertama;
        System.out.println(hasil);
    }
}
