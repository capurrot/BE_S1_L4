package Esercizio2;

import Esercizio1.Dipartimento;
import Esercizio3.InizioLavoro;

public class Dirigente extends Dipendente implements InizioLavoro {


    public Dirigente(int matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    public Dirigente() {
    }

    @Override
    public double calculateSalary() {
        return 4000;
    }

    @Override
    public void checkIn() {
        System.out.println("Check in dirigente: " + this.getMatricola());
    }
}
