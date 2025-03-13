package Esercizio1;

public class Main {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente(123, 5000, Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new Dipendente(456, 6000, Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente3 = new Dipendente(789, 7000, Dipartimento.VENDITE);

        Dipendente [] dipendente = new Dipendente[3];
        dipendente[0] = dipendente1;
        dipendente[1] = dipendente2;
        dipendente[2] = dipendente3;

        for (int i = 0; i < dipendente.length; i++) {
            System.out.println("Matricola: " + dipendente[i].getMatricola());
        }
    }
}
