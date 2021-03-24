public class Kohtumine extends Ülesanne{

    private int algusaeg;

    public Kohtumine(String kirjeldus, double kestus, int algusaeg) {
        super(kirjeldus, kestus);
        this.algusaeg = algusaeg;
    }

    @Override
    String kirjeldus() {
        return super.kirjeldus() + ". Algusaeg: " + algusaeg;
    }
}

