import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Päevik {

    private List<Sissekanne> sissekanded;

    public Päevik(List<Sissekanne> sissekanded) {
        this.sissekanded = sissekanded;
    }

    double koguKestus() {
        double summa = 0;
        for (Sissekanne i: sissekanded) {
            summa += i.kestus();
        }
        return summa;
    }

    List<Sissekanne> tegevusteAruanne() {
        List<Sissekanne> valitudSissekanded = new ArrayList<>();
        for (Sissekanne i : sissekanded){
            if (i.kestus() > 0) {
                valitudSissekanded.add(i);
            }
        }
        Collections.sort(valitudSissekanded);
        return valitudSissekanded;
    }

    void väljasta() {
        for (Sissekanne i: sissekanded) {
            System.out.println(i.toString());
        }
    }

}
