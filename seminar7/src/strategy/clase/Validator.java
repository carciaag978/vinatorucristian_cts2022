package strategy.clase;

public class Validator {
    private ModPlata modPlata;
    private float pretCalatorie;

    public Validator(float pretCalatorie) {
        this.pretCalatorie = pretCalatorie;
        modPlata = new CardSTB();
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void valideazaCalatorie(){
        this.modPlata.plateste(this.pretCalatorie);
    }
}
