package Esercizio2;

import Esercizio1.Dipartimento;
import Esercizio3.InizioLavoro;

public class DipendenteFullTime extends Dipendente implements InizioLavoro {
    private double pagaOraria;
    private double oreLavorate;

    public DipendenteFullTime(int matricola, double stipendio, Dipartimento dipartimento, double pagaOraria, double oreLavorate) {
        super(matricola, stipendio, dipartimento);
        this.pagaOraria = pagaOraria;
        this.oreLavorate = oreLavorate;
    }

    public DipendenteFullTime(double pagaOraria, double oreLavorate) {
        this.pagaOraria = pagaOraria;
        this.oreLavorate = oreLavorate;
    }


    @Override
    public double calculateSalary() {
        return pagaOraria * oreLavorate;
    }

    @Override
    public void checkIn() {
        System.out.println("Check in dipendente full time: " + this.getMatricola());
    }
}