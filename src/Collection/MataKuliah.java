package Collection;

import java.util.HashSet;
import java.util.Set;

public class MataKuliah {

    public static void main(String[] args) {
        Set<String> makul = new HashSet<>();

        makul.add("Sistem Operasi");
        makul.add("Pemrograman Web");
        makul.add("Aljabar");
        System.out.println(makul);

        if (makul.add("AJAX")) {
            System.out.println("AJAX Tambah");
        }
        if (!makul.add("Aljabar")) {
            System.out.println("Alajabar Tambah");
        }
        if (makul.remove("Pemrograman Web")) {
            System.out.println("Pemrograman Web Di Hapus");
        }
        System.out.println("Makul Setelah di Hapus : " + makul);
        
    }
}
