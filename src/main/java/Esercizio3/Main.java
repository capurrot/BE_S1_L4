package Esercizio3;

import Esercizio1.Dipartimento;
import Esercizio2.DipendenteFullTime;
import Esercizio2.DipendentePartTime;
import Esercizio2.Dirigente;

public class Main {
    public static void main(String[] args) {
        InizioLavoro volontario1 = new Volontariato("Timoteo", 20, "CV_Timoteo");
        InizioLavoro dipendente1 = new DipendenteFullTime(52368, 4000, Dipartimento.AMMINISTRAZIONE, 20,40);
        InizioLavoro dipendente2 = new DipendentePartTime(6852, 500, Dipartimento.AMMINISTRAZIONE, 20,32);
        InizioLavoro dirigente = new Dirigente(25368, 4000, Dipartimento.AMMINISTRAZIONE);

        InizioLavoro[] inizioLavoro = {volontario1, dipendente1, dipendente2, dirigente};

        for (int i = 0; i < inizioLavoro.length; i++) {
            inizioLavoro[i].checkIn();
        }
    }
}
