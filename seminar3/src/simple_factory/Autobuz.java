package simple_factory;

public class Autobuz extends MijlocTransport{
    public Autobuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        return "Autobuz{} " + super.toString();
    }
}
