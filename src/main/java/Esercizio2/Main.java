package Esercizio2;
import Esercizio1.Dipartimento;

public class Main {

    public static void main(String[] args) {
        Dipendente dipendente1 = new DipendenteFullTime(42856, 1000, Dipartimento.AMMINISTRAZIONE, 20, 40);
        Dipendente dipendente2 = new DipendenteFullTime(25698, 1000, Dipartimento.VENDITE, 20, 40);
        Dipendente dipendente3 = new DipendenteFullTime(18965, 1000, Dipartimento.PRODUZIONE, 20, 40);
        Dipendente dipendente4 = new DipendentePartTime( 73524, 500, Dipartimento.AMMINISTRAZIONE, 20,32);
        Dipendente dipendente5 = new DipendentePartTime( 71224, 500, Dipartimento.AMMINISTRAZIONE, 20,32);
        Dipendente dipendente6 = new DipendentePartTime( 65324, 500, Dipartimento.AMMINISTRAZIONE, 20,32);
        Dipendente dipendente7 = new Dirigente();


        Dipendente [] dipendente = {dipendente1, dipendente2, dipendente3, dipendente4, dipendente5, dipendente6, dipendente7};

        double totStipendi = 0;

        for(int i = 0; i < dipendente.length; i++) {
            totStipendi += dipendente[i].calculateSalary();
        }
        System.out.println("Totale stipendi: " + totStipendi);

    }
}
