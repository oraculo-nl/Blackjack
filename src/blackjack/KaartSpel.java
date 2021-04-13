package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KaartSpel {

    public static void zetNieuwSpelOp() {

        List<Kaart> kaartenInSpel = new ArrayList<>();
        for (KaartKleuren kaartKleur : KaartKleuren.values()) {
            for (KaartTypen kaartType : KaartTypen.values()) {
                Kaart kaart = new Kaart(kaartKleur, kaartType);
                kaartenInSpel.add(kaart);
            }
        }
        Collections.shuffle(kaartenInSpel);
        Speler speler1 = new Speler();
        speler1.speelSpel(kaartenInSpel);
    }


    public static int berekeningPunten(List<Kaart> getrokkenKaarten) {
        int totaalAantalPunten = 0;
        for (Kaart kaart : getrokkenKaarten) {
            int kaartPunten = kaart.getWaarde();
            totaalAantalPunten += kaartPunten;
        }
        return totaalAantalPunten;
    }


    public static void bepalenWieWint(int puntenSpeler, int puntenBank, Bank bank) {
        System.out.println("Kaarten van de bank: " + bank.getGetrokkenKaarten() + " Totale punten van de bank: " + bank.getTotalePunten());
        if (puntenSpeler <= 21 && puntenSpeler > bank.getTotalePunten()) {
            System.out.println("Gefeliciteerd, je hebt het spel gewonnen");
        } else if (bank.getTotalePunten() > 21) {
            System.out.println("Gefeliciteerd, je hebt het spel gewonnen");
        } else if (puntenSpeler == bank.getTotalePunten()) {
            System.out.println("Gelijkspel");
        } else {
            System.out.println("Helaas, je hebt het spel verloren");
        }
    }




}
