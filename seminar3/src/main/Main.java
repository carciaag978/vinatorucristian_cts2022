package main;


import simple_factory.FabricaMijlocTransport;
import simple_factory.MijlocTransport;
import simple_factory.TipMijlocTransport;
import singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        //singleton -> constructorul va fi apelat o singura data
        //obiectul va fi creat si nu l pot folosi
        Singleton s1 = Singleton.getInstanta();
        Singleton s2 = Singleton.getInstanta();
        System.out.println(s1);
        System.out.println(s2);

        //simple factory
        MijlocTransport autobuz = FabricaMijlocTransport.getMijlocTranposrt(TipMijlocTransport.Autobuz, "B12ABC");
        MijlocTransport troleibuz = FabricaMijlocTransport.getMijlocTranposrt(TipMijlocTransport.Troleibuz, "B145AAA");
        MijlocTransport tramvai = FabricaMijlocTransport.getMijlocTranposrt(TipMijlocTransport.Tramvai, "B133ACD");

        System.out.println(autobuz.toString());
        System.out.println(troleibuz.toString());
        System.out.println(tramvai.toString());

    }
}
