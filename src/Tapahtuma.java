public class Tapahtuma {
    private String nimi;
    private float saapumisaika;

    public Tapahtuma(String nimi, float aika) {
        this.nimi = nimi;
        this.saapumisaika = aika;
    }

    public float getArrival() {
        return this.saapumisaika;
    }

    public String getNimi() {
        return this.nimi;
    }

    //laitoin huvikseni toStringinkin tänne :P
    @Override public String toString() {
        return "Asiakkaan nimi on" + this.nimi + " ja saapumisaika " + this.saapumisaika;
    }
}
