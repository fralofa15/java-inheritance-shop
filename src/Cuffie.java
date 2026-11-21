public class Cuffie extends Prodotto {

    private String colore;
    private boolean cablate;

    public Cuffie(int codice, String nome, String marca,
                  double prezzo, double iva,
                  String colore, boolean cablate) {

        super(codice, nome, marca, prezzo, iva);

        this.colore = colore;
        this.cablate = cablate;
    }

    public String getColore() {
        return colore;
    }

    public boolean isCablate() {
        return cablate;
    }

    @Override
    public double getPrezzoScontato() {
        if (cablate) {
            return getPrezzo() * 0.93;
        }

        return super.getPrezzoScontato();
    }

    @Override
    public String toString() {
        return "CUFFIE\n" +
               super.toString() +
               "\nColore: " + colore +
               "\nCablate: " + cablate;
    }
}
