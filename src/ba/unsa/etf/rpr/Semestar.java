package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Semestar {
    private ArrayList<Student> studenti;
    private ArrayList<Predmet> predmeti;
    private int ukupanBrojECTSBodova;

    public Semestar(ArrayList<Student> studenti, ArrayList<Predmet> predmeti, int ukupanBrojECTSBodova) {
        this.studenti = studenti;
        this.predmeti = predmeti;
        this.ukupanBrojECTSBodova = ukupanBrojECTSBodova;
    }

    public ArrayList<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(ArrayList<Student> studenti) {
        this.studenti = studenti;
    }

    public ArrayList<Predmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(ArrayList<Predmet> predmeti) {
        this.predmeti = predmeti;
    }

    public int getUkupanBrojECTSBodova() {
        return ukupanBrojECTSBodova;
    }

    public void setUkupanBrojECTSBodova(int ukupanBrojECTSBodova) {
        this.ukupanBrojECTSBodova = ukupanBrojECTSBodova;
    }

    public void dodajStudenta(Student student){

    }

    public void dodajPredmet(Predmet predmet){

    }
}
