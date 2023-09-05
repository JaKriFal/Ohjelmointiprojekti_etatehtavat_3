public class Tapahtuma {
    private Asiakas asiakas;
    private float saapumisaika;
    private TapahtumanTyyppi tyyppi;

    public Tapahtuma(Asiakas asiakas, float aika, TapahtumanTyyppi tyyppi) {
        this.asiakas = asiakas;
        this.saapumisaika = aika;
        this.tyyppi = tyyppi;
    }

    public float getArrival() {
        return this.saapumisaika;
    }

    public Asiakas getAsiakas() {
        return this.asiakas;
    }

    //laitoin huvikseni toStringinkin tänne :P
    @Override public String toString() {
        return "Asiakkaan nimi on " + this.asiakas.getNimi() + " ja saapumisaika " + this.saapumisaika;
    }
}
