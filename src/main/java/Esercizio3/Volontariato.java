package Esercizio3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Volontariato implements InizioLavoro {
    private String nome;
    private int eta;
    private String CV;

    @Override
    public void checkIn() {
        System.out.println("Check in volontariato: " + this.getNome());
    }
}
