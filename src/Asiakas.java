public class Asiakas {
    private String nimi;
    private float saapumisaika;

    public Asiakas(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return this.nimi;
    }

    public float getAika() {
        return this.saapumisaika;
    }

    public void lisaaAika(float aika) {
        this.saapumisaika = aika;
    }
}
