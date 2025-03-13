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
    protected int matricola;
    protected double stipendio;
    @Setter
    protected Dipartimento dipartimento;

    public abstract double calculateSalary();
}
