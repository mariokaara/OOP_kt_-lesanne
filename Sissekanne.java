public abstract class Sissekanne implements Comparable<Sissekanne> {
    private String kirjeldus;

    public Sissekanne(String kirjeldus) {
        this.kirjeldus = kirjeldus;
    }


    String kirjeldus() {
        return kirjeldus;
    }

    abstract double kestus();

    @Override
    public String toString() {
        return "Kirjeldus: " + kirjeldus;
    }

    public int compareTo(Sissekanne sisse) {
        return Double.compare(this.kestus(), sisse.kestus());
        }
    }
