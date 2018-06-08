package Collection;

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {

    public static void main(String[] args) {
        List<String> nama = new ArrayList<String>();
        nama.add("Faris");
        nama.add("Iqbal");
        nama.add("Muh");
        nama.add(1, "Ahmad");

        System.out.println("Nama : " + nama);

        nama.remove("Muh");
        System.out.println("hapus : " + nama.size());
        System.out.println("Nama : " +nama);

    }

}
