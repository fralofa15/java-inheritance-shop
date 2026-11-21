import java.util.ArrayList;
import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Prodotto> carrello = new ArrayList<>();

        System.out.println("===== NEGOZIO =====");

        System.out.print("Quanti prodotti vuoi inserire? ");
        int quantita = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantita; i++) {

            System.out.println("\nPRODOTTO " + (i + 1));

            System.out.println("1 - Smartphone");
            System.out.println("2 - Televisore");
            System.out.println("3 - Cuffie");

            System.out.print("Scegli il prodotto: ");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            if (scelta < 1 || scelta > 3) {
                System.out.println("Scelta non valida!");
                i--;
                continue;
            }

            System.out.print("Codice: ");
            int codice = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            System.out.print("Prezzo: ");
            double prezzo = scanner.nextDouble();

            System.out.print("IVA (%): ");
            double iva = scanner.nextDouble();

            switch (scelta) {

                case 1:
                    System.out.print("IMEI: ");
                    String imei = scanner.next();

                    System.out.print("Memoria (GB): ");
                    int memoria = scanner.nextInt();

                    Smartphone smartphone = new Smartphone(
                        codice, nome, marca, prezzo, iva,
                        imei, memoria
                    );

                    carrello.add(smartphone);
                    break;

                case 2:
                    System.out.print("Dimensioni (pollici): ");
                    int dimensioni = scanner.nextInt();

                    System.out.print("Smart? (true/false): ");
                    boolean smart = scanner.nextBoolean();

                    Televisore televisore = new Televisore(
                        codice, nome, marca, prezzo, iva,
                        dimensioni, smart
                    );

                    carrello.add(televisore);
                    break;

                case 3:
                    System.out.print("Colore: ");
                    String colore = scanner.next();

                    System.out.print("Cablate? (true/false): ");
                    boolean cablate = scanner.nextBoolean();

                    Cuffie cuffie = new Cuffie(
                        codice, nome, marca, prezzo, iva,
                        colore, cablate
                    );

                    carrello.add(cuffie);
                    break;
            }

            System.out.println("Prodotto aggiunto al carrello!");
        }

        System.out.print("\nHai la tessera fedelta? (si/no): ");
        String risposta = scanner.next();

        boolean tessera = risposta.equalsIgnoreCase("si");

        double totale = 0;

        System.out.println("\n===== IL TUO CARRELLO =====");

        for (Prodotto prodotto : carrello) {

            System.out.println("\n" + prodotto);

            if (tessera) {

                double prezzoScontato =
                    prodotto.getPrezzoScontato();

                System.out.println(
                    "Prezzo scontato: " + prezzoScontato
                );

                totale += prezzoScontato;

            } else {

                totale += prodotto.getPrezzo();
            }

            System.out.println("-------------------------");
        }

        System.out.println("\n===== RIEPILOGO =====");

        System.out.println(
            "Numero prodotti: " + carrello.size()
        );

        System.out.println(
            "Tessera fedelta: " + (tessera ? "SI" : "NO")
        );

        System.out.printf(
            "TOTALE CARRELLO: %.2f euro%n", totale
        );

        scanner.close();
    }
}
