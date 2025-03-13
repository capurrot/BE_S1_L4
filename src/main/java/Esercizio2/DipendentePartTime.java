package Esercizio2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class DipendentePartTime extends Dipendente {
    private double pagaOraria;
    private double oreLavorate;

    @Override
    public double calculateSalary() {
        return pagaOraria * oreLavorate;
    }
}
