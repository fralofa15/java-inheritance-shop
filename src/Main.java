public class Main {

    public static void main(String[] args) {

        // CREAZIONE DEI PRODOTTI

        Smartphone smartphone = new Smartphone(
            1001, "iPhone 16", "Apple",
            900, 22, "123456789012345", 128
        );

        Televisore televisore = new Televisore(
            1002, "OLED", "Samsung",
            1200, 22, 55, true
        );

        Cuffie cuffie = new Cuffie(
            1003, "QuietComfort", "Bose",
            250, 22, "Nero", true
        );

        // TEST SMARTPHONE

        System.out.println("SMARTPHONE");
        System.out.println("Codice: " + smartphone.getCodice());
        System.out.println("Nome: " + smartphone.getNome());
        System.out.println("Marca: " + smartphone.getMarca());
        System.out.println("IMEI: " + smartphone.getImei());
        System.out.println("Memoria: " + smartphone.getMemoria() + " GB");
        System.out.println("Prezzo: " + smartphone.getPrezzo());
        System.out.println("IVA: " + smartphone.getIva() + "%");
        System.out.println("Prezzo con IVA: " + smartphone.getPrezzoConIva());

        // TEST TELEVISORE

        System.out.println("TELEVISORE");
        System.out.println("Codice: " + televisore.getCodice());
        System.out.println("Nome: " + televisore.getNome());
        System.out.println("Marca: " + televisore.getMarca());
        System.out.println("Dimensioni: " + televisore.getDimensioni() + " pollici");
        System.out.println("Smart: " + televisore.isSmart());
        System.out.println("Prezzo con IVA: " + televisore.getPrezzoConIva());

        // TEST CUFFIE

        System.out.println("CUFFIE");
        System.out.println("Codice: " + cuffie.getCodice());
        System.out.println("Nome: " + cuffie.getNome());
        System.out.println("Marca: " + cuffie.getMarca());
        System.out.println("Colore: " + cuffie.getColore());
        System.out.println("Wireless: " + cuffie.isWireless());
        System.out.println("Prezzo con IVA: " + cuffie.getPrezzoConIva());

        // VERIFICA SETTER SMARTPHONE

        System.out.println("TEST SETTER SMARTPHONE");

        smartphone.setNome("iPhone 17");
        smartphone.setPrezzo(1000);
        smartphone.setMemoria(256);

        System.out.println("Nuovo nome: " + smartphone.getNome());
        System.out.println("Nuovo prezzo: " + smartphone.getPrezzo());
        System.out.println("Nuova memoria: " + smartphone.getMemoria() + " GB");
        System.out.println("Nuovo prezzo con IVA: " + smartphone.getPrezzoConIva());

        // VERIFICA SETTER TELEVISORE

        System.out.println("TEST SETTER TELEVISORE");

        televisore.setDimensioni(65);
        televisore.setSmart(false);

        System.out.println("Nuove dimensioni: " + televisore.getDimensioni() + " pollici");
        System.out.println("Smart: " + televisore.isSmart());

        // VERIFICA SETTER CUFFIE

        System.out.println("TEST SETTER CUFFIE");

        cuffie.setColore("Bianco");
        cuffie.setWireless(false);

        System.out.println("Nuovo colore: " + cuffie.getColore());
        System.out.println("Wireless: " + cuffie.isWireless());

        // VERIFICA CODICE IN SOLA LETTURA

        System.out.println("TEST CODICE PRODOTTO");
        System.out.println("Codice smartphone: " + smartphone.getCodice());

        // Non esiste setCodice(), quindi il codice
        // non può essere modificato dall'esterno.
    }
}
