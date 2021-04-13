package blackjack;

public class Kaart {
    private final KaartKleuren kaartKleur;
    private final KaartTypen kaartType;
    private final int waarde;

    public int getWaarde() {
        return waarde;
    }


    public Kaart(KaartKleuren kaartKleur, KaartTypen kaartType) {
        this.kaartKleur = kaartKleur;
        this.kaartType = kaartType;
        this.waarde = kaartType.getValue();
    }

    @Override
    public String toString() {
        return kaartKleur.toString() + "-" + kaartType.toString();
    }
}