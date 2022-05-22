package strategy.clase;



public class Sms implements ModPlata {
    @Override
    public void plateste(float suma) {
        System.out.println("Plata a fost efectuata prin SMS, suma totala: " + suma);
    }
}
