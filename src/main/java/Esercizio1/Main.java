package Esercizio1;

public class Main {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente(123, 5000, Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new Dipendente(456, 6000, Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente3 = new Dipendente(789, 7000, Dipartimento.VENDITE);

        for (Dipendente dipendente : new Dipendente[]{dipendente1, dipendente2, dipendente3}) {
            System.out.println("Matricola: " + dipendente.getMatricola());
        }
    }
}
