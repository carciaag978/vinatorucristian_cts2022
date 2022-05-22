package chain_of_responsibility.clase;

public class MetrouHandler extends Handler{
    public MetrouHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareMijlocTransport(int distanta) {
        if(distanta < super.limita) {
            System.out.println("Poti folosi metroul!");
        }
        else{
            handler.afisareMijlocTransport(distanta);
        }
    }
}
