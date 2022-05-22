package strategy.clase;

public class CardSTB implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("Plata a fost efectuata prin cardul STB, suma totala: " + suma);
    }
}
