package net.jarvisSoftware;

public class Class {
    public static void main(String[] args) {
        System.out.println("Contoh variable, dibagi menjadi 3 bagian: ");
        System.out.println("yang pertama nama dan type variable");
        System.out.println("yang kedua asignment");
        System.out.println("yang ketiga deklarasi\n");

        System.out.println("contoh : ");

        int contohVariableInt = 10;
        String contohVariableString = "ini contoh variable string";
        float contohDeklarasiVariable;

        System.out.println("contoh variable int : " + contohVariableInt);
        System.out.println("contoh variable bertype string " + contohVariableString + "\n");

        System.out.println("contoh diatas sudah termasuk kedalam 3 bagian yang dimaksud : ");
        System.out.println("nama dan type variable yaitu 'int contohVariableInt' ");
        System.out.println("yang kedua yaitu assignment / deklarasi pengisian bisa ditulis dengan 'int = contohVariableInt' \n");

        contohDeklarasiVariable = 10f;
        System.out.println("yang ketiga adalah deklarasi variable bisa ditulis dengan 'typedata namaVariable;' ");
        System.out.println("pada contoh kali ini kita menggunakan deklarasi dengan type data float, yang sudah dideklarasikan tapi belum di assignment lalu bisa kita isi sesuai dengan kebutuhan");
        System.out.println("setiap kita mendeklarasikan variable jika ingin menggunakannya maka kita harus meng-assignment terlebih dahulu");
        System.out.println("output contoh " + contohDeklarasiVariable);
    }
}
