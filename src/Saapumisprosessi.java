import eduni.distributions.*;
public class Saapumisprosessi {
    private Normal generaattori = new Normal(5,2);
    private Kello kello = Kello.getInstance();

    public Saapumisprosessi() {
    }

    public void luoTapahtuma(Tapahtumalista lista, Asiakas asiakas, TapahtumanTyyppi tyyppi) {
        Tapahtuma tapahtuma = new Tapahtuma(asiakas, kello.getSystemTime(), tyyppi);
        lista.lisaaTapahtuma(tapahtuma);
        double t = generaattori.sample();
        float aika = (float) t;
        kello.advanceSystemTime(aika);
        }

    public static void main(String[] args) {
        Tapahtumalista testilista = new Tapahtumalista();
        String[] nimia = {"Jan", "Jussi", "Julia", "Pekka","Maija","Matti","Urho","Jesse","Nisse", "Timppa"};
        Saapumisprosessi prosessi = new Saapumisprosessi();
        TapahtumanTyyppi tyyppi = new TapahtumanTyyppi("Saapuminen");
        for(int i = 0; i <10; i++){
            Asiakas asiakas = new Asiakas(nimia[i]);
            prosessi.luoTapahtuma(testilista, asiakas, tyyppi);
        }
        testilista.tulostaTapahtumat();
    }
    }


