import java.util.ArrayList;

public class Tapahtumalista {
    static int listat = 0;
    private int nro;
    private ArrayList<Tapahtuma> tapahtumat = new ArrayList<Tapahtuma>();

    public Tapahtumalista() {
        listat++;
        this.nro = listat;
    }

    public void lisaaTapahtuma(Tapahtuma tapahtuma) {
        tapahtumat.add(tapahtuma);
    }

    public ArrayList<Tapahtuma> palautaLista() {
        return this.tapahtumat;
    }

    public void tulostaTapahtumat() {
        for (Tapahtuma i : this.tapahtumat) {
            System.out.println(i);
        }
    }
}
