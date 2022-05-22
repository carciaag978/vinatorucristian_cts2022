package strategy.clase;

public class CardBancar implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("Plata a fost efectuata prin card bancar, suma totala: " + suma);
    }
}
