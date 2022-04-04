package factory_method.clase;

public class Autobuz extends MijlocTransport {
    public Autobuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Autobuz" + super.nrInmatriculare);
    }


}
