import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Peaklass {

    public static List<Sissekanne> loeSissekanded(String failinimi) throws Exception {

        List<Sissekanne> sissekanded = new ArrayList<>();
        try (java.util.Scanner sc = new java.util.Scanner(Path.of(failinimi), "UTF-8")) {
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] tükid = rida.split("; ");
                if (tükid.length == 1) {
                    sissekanded.add(new Mõte(tükid[0]));
                } else if (tükid.length == 2) {
                    sissekanded.add(new Ülesanne(tükid[0], Double.parseDouble(tükid[1])));
                } else {
                    sissekanded.add(new Kohtumine(tükid[1], Double.parseDouble(tükid[2]), Integer.parseInt(tükid[0])));
                }
            }
            return sissekanded;
        }
    }

    public static void main(String[] args) throws Exception {

        // tegevused 1 ja 2
        Päevik päevik = new Päevik(loeSissekanded("fail"));
        // tegevus 3
        päevik.väljasta();
        // tegevus 4
        System.out.println("Tegevuste kogukestus on: " + (int) päevik.koguKestus() + " minutit");
        // tegevus 5
        System.out.println(päevik.tegevusteAruanne());


    }
}
