package simple_factory;

public class FabricaMijlocTransport {
    public static MijlocTransport getMijlocTranposrt(TipMijlocTransport tipMijlocTransport, String nrInmatriculare){
        switch(tipMijlocTransport){
            case Tramvai:
                return new Tramvai(nrInmatriculare);
            case Autobuz:
                return new Autobuz(nrInmatriculare);
            case Troleibuz:
                return new Troleibuz(nrInmatriculare);
            default:
                return null;
        }
    }
}
