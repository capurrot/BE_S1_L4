package Esercizio2;

import Esercizio1.Dipartimento;
import Esercizio3.InizioLavoro;

public class DipendentePartTime extends Dipendente implements InizioLavoro {
    private double pagaOraria;
    private double oreLavorate;

    public DipendentePartTime(int matricola, double stipendio, Dipartimento dipartimento, double pagaOraria, double oreLavorate) {
        super(matricola, stipendio, dipartimento);
        this.pagaOraria = pagaOraria;
        this.oreLavorate = oreLavorate;
    }

    public DipendentePartTime(double pagaOraria, double oreLavorate) {
        this.pagaOraria = pagaOraria;
        this.oreLavorate = oreLavorate;
    }


    @Override
    public double calculateSalary() {
        return pagaOraria * oreLavorate;
    }

    @Override
    public void checkIn() {
        System.out.println("Check in dipendente part time: " + this.getMatricola());
    }
}
