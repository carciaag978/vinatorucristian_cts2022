package factory_method.main;

import factory_method.clase.*;

public class Main {
    public static void afisareMijlocTransport(Factory fact, String nrInmatriculare) {
        MijlocTransport mijlocTransport = fact.getMijlocTransport(nrInmatriculare);
        mijlocTransport.afiseazaDescriere();

    }

    public static void main(String[] args) {
        afisareMijlocTransport(new AutobuzFactory(), "B-22-ABC");
        MijlocTransport troleibuz = new TroleibuzFactory().getMijlocTransport("AG-33-ROC");
        troleibuz.afiseazaDescriere();
        new TramvaiFactory().getMijlocTransport("AB-33").afiseazaDescriere();
    }
}
