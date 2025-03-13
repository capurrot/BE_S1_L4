package Esercizio2;

public class Main {

    public static void main(String[] args) {
        Dipendente dipendente1 = new DipendenteFullTime(20,40);
        Dipendente dipendente2 = new DipendenteFullTime(15,40);
        Dipendente dipendente3 = new DipendenteFullTime(5,40);
        Dipendente dipendente4 = new DipendentePartTime(20,32);
        Dipendente dipendente5 = new DipendentePartTime(15,20);
        Dipendente dipendente6 = new DipendentePartTime(5,10);
        Dipendente dipendente7 = new Dirigente();


        Dipendente [] dipendente = {dipendente1, dipendente2, dipendente3, dipendente4, dipendente5, dipendente6, dipendente7};

        double totStipendi = 0;

        for(int i = 0; i < dipendente.length; i++) {
            totStipendi += dipendente[i].calculateSalary();
        }
        System.out.println("Totale stipendi: " + totStipendi);

    }
}
