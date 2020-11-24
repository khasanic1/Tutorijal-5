package ba.unsa.etf.rpr;

public class Predmet {
    private String imePredmeta;
    private int brojECTSBodova;
    private int brojUpisanihStudenata;

    public Predmet(String imePredmeta, int brojECTSBodova) {
        this.imePredmeta = imePredmeta;
        this.brojECTSBodova = brojECTSBodova;
    }

    public String getImePredmeta() {
        return imePredmeta;
    }

    public void setImePredmeta(String imePredmeta) {
        this.imePredmeta = imePredmeta;
    }

    public int getBrojECTSBodova() {
        return brojECTSBodova;
    }

    public void setBrojECTSBodova(int brojECTSBodova) {
        this.brojECTSBodova = brojECTSBodova;
    }

    public int getBrojUpisanihStudenata() {
        return brojUpisanihStudenata;
    }

    public void setBrojUpisanihStudenata(int brojUpisanihStudenata) {
        this.brojUpisanihStudenata = brojUpisanihStudenata;
    }
}
