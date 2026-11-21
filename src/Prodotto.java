public class Prodotto {

    private int codice;
    private String nome;
    private String marca;
    private double prezzo;
    private double iva;

    public Prodotto(int codice, String nome, String marca,
                    double prezzo, double iva) {
        this.codice = codice;
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getIva() {
        return iva;
    }

    public double getPrezzoConIva() {
        return prezzo * (1 + iva / 100);
    }

    public double getPrezzoScontato() {
        return prezzo * 0.98;
    }

    @Override
    public String toString() {
        return "Codice: " + codice +
               "\nNome: " + nome +
               "\nMarca: " + marca +
               "\nPrezzo: " + prezzo + " euro" +
               "\nIVA: " + iva + "%" +
               "\nPrezzo con IVA: " + getPrezzoConIva();
    }
}
