package chain_of_responsibility.clase;

public class TroleibuzHandler extends Handler{

    public TroleibuzHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareMijlocTransport(int distanta) {
        if(distanta < super.limita){
            System.out.println("Poti folosi troleibuzul");
        }
        else{
            handler.afisareMijlocTransport(distanta);
        }
    }
}
