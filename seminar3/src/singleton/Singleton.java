package singleton;

public class Singleton {
    //atributul static ocupa memorie in plus, nu va fi utilizat
    private String nume;
    private static Singleton instanta = null;
    private Singleton(){}

    //Lazy initialization
    //Thread-safe initialization -> ne asiguram ca nu va initializa constructorul de pe ambele fire de executie
    public static synchronized Singleton getInstanta(){
        if(instanta == null){
            instanta = new Singleton();
        }
        return instanta;
    }
}
