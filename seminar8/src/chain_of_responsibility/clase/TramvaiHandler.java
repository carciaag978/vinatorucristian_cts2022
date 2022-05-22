package chain_of_responsibility.clase;

public class TramvaiHandler extends Handler{
    public TramvaiHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareMijlocTransport(int distanta) {
        if(distanta < super.limita){
            System.out.println("Poti folosi tramvaiul!");
        }
        else{
            handler.afisareMijlocTransport(distanta);
        }
    }
}
