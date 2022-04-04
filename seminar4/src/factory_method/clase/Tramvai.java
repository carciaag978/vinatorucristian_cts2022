package factory_method.clase;

public class Tramvai extends MijlocTransport{
    public Tramvai(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Tramvai:" + super.nrInmatriculare);
    }


}
