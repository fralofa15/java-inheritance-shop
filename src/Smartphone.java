public class Smartphone extends Prodotto {

    private String imei;
    private int memoria;

    public Smartphone(int codice, String nome, String marca,
                      double prezzo, double iva,
                      String imei, int memoria) {

        super(codice, nome, marca, prezzo, iva);

        this.imei = imei;
        this.memoria = memoria;
    }

    public String getImei() {
        return imei;
    }

    public int getMemoria() {
        return memoria;
    }

    @Override
    public double getPrezzoScontato() {
        if (memoria < 32) {
            return getPrezzo() * 0.95;
        }

        return super.getPrezzoScontato();
    }

    @Override
    public String toString() {
        return "SMARTPHONE\n" +
               super.toString() +
               "\nIMEI: " + imei +
               "\nMemoria: " + memoria + " GB";
    }
}
