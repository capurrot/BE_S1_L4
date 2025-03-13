package Esercizio2;

import Esercizio1.Dipartimento;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public abstract class Dipendente {
    private int matricola;
    private double stipendio;
    @Setter
    private Dipartimento dipartimento;

    public abstract double calculateSalary();
}
