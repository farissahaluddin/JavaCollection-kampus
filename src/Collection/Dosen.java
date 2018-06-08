package Collection;

import java.util.HashMap;
import java.util.Map;

public class Dosen {
    public static void main(String[] args) {
        Map dosen = new HashMap<>();
        dosen.put("Fahmi", 3);
        dosen.put("Jony", 12);
        dosen.put("Indra", 30);

        System.out.println("Dosen : " + dosen);

        dosen.remove("Jony");
        System.out.println("Map setelah hapus :" + dosen);



    }
}
