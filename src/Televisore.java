public class Televisore extends Prodotto {

    private int dimensioni;
    private boolean smart;

    public Televisore(int codice, String nome, String marca,
                      double prezzo, double iva,
                      int dimensioni, boolean smart) {

        super(codice, nome, marca, prezzo, iva);

        this.dimensioni = dimensioni;
        this.smart = smart;
    }

    public int getDimensioni() {
        return dimensioni;
    }

    public boolean isSmart() {
        return smart;
    }

    @Override
    public double getPrezzoScontato() {
        if (!smart) {
            return getPrezzo() * 0.90;
        }

        return super.getPrezzoScontato();
    }

    @Override
    public String toString() {
        return "TELEVISORE\n" +
               super.toString() +
               "\nDimensioni: " + dimensioni + " pollici" +
               "\nSmart: " + smart;
    }
}
