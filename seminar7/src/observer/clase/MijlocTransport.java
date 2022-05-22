package observer.clase;

import java.util.ArrayList;
import java.util.List;

public class MijlocTransport {
    private List<ICalator> lista;
    private int nrLinie;

    public MijlocTransport(int nrLinie) {
        this.lista = new ArrayList<>();
        this.nrLinie = nrLinie;
    }

    public void adaugaCalator(ICalator calator){
        lista.add(calator);
    }

    public void stergeCalator(ICalator calator){
        lista.remove(calator);
    }

    public void trimiteMesaj(String mesaj){
        for(ICalator calator : lista){
            calator.primireMesaj(mesaj);
        }
    }

    public void trimiteMesajPlecareCapatLinie(){
        trimiteMesaj("Autobuzul numarul " + this.nrLinie + " a plecat din capatul de linie!");
    }
}
