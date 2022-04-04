package simple_factory;

public class Tramvai extends Autobuz{
    public Tramvai(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        return "Tramvai{} " + super.toString();
    }
}
