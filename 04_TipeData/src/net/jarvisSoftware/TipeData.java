package net.jarvisSoftware;

public class TipeData {

    public static void main(String[] args) {
        //tipe data di java
        //yang membedakan penggunaan setiap tipe data adalah penggunaan memori
        //integer, byte, long, short, double, float, char, boolean
        // ada dua tipe tipe data di java. tipe primitive dan tipe fundamental. this is primitive(nilainya tetap)

        //integer(numeric satuan)
        System.out.println("===== INTEGER =====");
        int integer = 7;
        System.out.println("int integer = 7;");
        System.out.println("Nilai variable integer : " + integer);
        System.out.println("Nilai max : " + Integer.MAX_VALUE);
        System.out.println("Nilai min : " + Integer.MIN_VALUE);
        System.out.println("Besaran memori : " + Integer.BYTES + " bytes");
        System.out.println("Besaran memori : " + Integer.SIZE + " bit\n");

        //byte(numeric satuan)
        System.out.println("===== BYTE =====");
        byte b = 7;
        System.out.println("byte b = 7;");
        System.out.println("Nilai vvariable b : " + b);
        System.out.println("Nilai max : " + Byte.MAX_VALUE);
        System.out.println("Nilai min : " + Byte.MIN_VALUE);
        System.out.println("Besaran memori: " + Byte.BYTES + " bytes");
        System.out.println("Besaran memori : " + Byte.SIZE + " bit\n");

        // long(numeric satuan)
        System.out.println("===== LONG =====");
        long l = 7L;
        System.out.println("long l = 7L;");
        System.out.println("Nilai variable l : " + l);
        System.out.println("Nilai max : " + Long.MAX_VALUE);
        System.out.println("Nilai min : " + Long.MIN_VALUE);
        System.out.println("Besaran memori : " + Long.BYTES + " bytes");
        System.out.println("Besaran memori : " + Long.SIZE + " bit\n");

        // short(numeric satuan)
        System.out.println("===== SHORT =====");
        short s = 7;
        System.out.println("short s = 7;");
        System.out.println("Nilai variable s : " + s);
        System.out.println("Nilai max : " + Short.MAX_VALUE);
        System.out.println("Nilai min : " + Short.MIN_VALUE);
        System.out.println("Besaran memori : " + Short.BYTES + " bytes");
        System.out.println("Besaran memory : " + Short.SIZE +" bit\n");

        // double(bilangan real)
        System.out.println("===== DOUBLE =====");
        double d = 7.0d;
        System.out.println("double d = 7.0d;");
        System.out.println("Nilai variable d : " + d);
        System.out.println("Nilai max : " + Double.MAX_VALUE);
        System.out.println("Nilai max exponen : " + Double.MAX_EXPONENT);
        System.out.println("Nilai min : " + Double.MIN_VALUE);
        System.out.println("Nilai min exponen : " + Double.MIN_EXPONENT);
        System.out.println("Nilai min normal : " + Double.MIN_NORMAL);
        System.out.println("Besaran memori : " + Double.BYTES + " bytes");
        System.out.println("Besaran memori : " + Double.SIZE + " bit\n");

        // float
        System.out.println("==== FLOAT =====");
        float f = 7.0f;
        System.out.println("float f = 7.0f;");
        System.out.println("Nilai variable f : " + f);
        System.out.println("Nilai max : " + Float.MAX_VALUE);
        System.out.println("Nilai max exponen : " + Float.MAX_EXPONENT);
        System.out.println("Nilai min : " + Float.MIN_VALUE);
        System.out.println("Nilai min exponen : " + Float.MIN_EXPONENT);
        System.out.println("Nilai min normal : " + Float.MIN_NORMAL);
        System.out.println("Besaran memori : " + Float.BYTES + " bytes");
        System.out.println("Besaran memori : " + Float.SIZE + " bit\n");

        // char(karakter) tpe data String adalah gabungan dari tipedata char
        System.out.println("==== CHARACTER =====");
        char c = 's';
        System.out.println("char c = 's';");
        System.out.println("Nilai variable c : " + c);
        System.out.println("Nilai max : " + Character.MAX_VALUE);
        System.out.println("Nilai max codepoint : " + Character.MAX_CODE_POINT);
        System.out.println("Nilai min : " + Character.MIN_VALUE);
        System.out.println("Nilai min codepoint : " + Character.MIN_CODE_POINT);
        System.out.println("Besaran memori : " + Character.BYTES + " bytes");
        System.out.println("Besaran memori : " + Character.SIZE + " bit\n");

        // boolean
        System.out.println("===== BOOLEAN =====");
        boolean bool = true;
        System.out.println("boolean bool = true;");
        System.out.println("Nilai boolean bool : " + bool);
        System.out.println("Nilai max : " + Boolean.TRUE);
        System.out.println("Nilai min : " + Boolean.FALSE);
        System.out.println("Besaran memori : 1 bit ");
    }
}
