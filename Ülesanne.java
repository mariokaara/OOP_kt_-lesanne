public class Ülesanne extends Sissekanne{

    private double kestus;

    public Ülesanne(String kirjeldus, double kestus) {
        super(kirjeldus);
        this.kestus = kestus;
    }

    public double getKestus() {
        return kestus;
    }

    @Override
    String kirjeldus() {
        return super.kirjeldus() + ". Kestus: " + kestus;
    }

    @Override
    double kestus() {
        return this.kestus;
    }
}
