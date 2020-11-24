package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Student {
    private String imeStudenta;
    private int indeks;
    private ArrayList<Predmet> predmetiKojePohadja;

    public Student(String imeStudenta, int indeks, ArrayList<Predmet> predmetiKojePohadja) {
        this.imeStudenta = imeStudenta;
        this.indeks = indeks;
        this.predmetiKojePohadja = predmetiKojePohadja;
    }

    public String getImeStudenta() {
        return imeStudenta;
    }

    public void setImeStudenta(String imeStudenta) {
        this.imeStudenta = imeStudenta;
    }

    public int getIndeks() {
        return indeks;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }

    public ArrayList<Predmet> getPredmetiKojePohadja() {
        return predmetiKojePohadja;
    }

    public void setPredmetiKojePohadja(ArrayList<Predmet> predmetiKojePohadja) {
        this.predmetiKojePohadja = predmetiKojePohadja;
    }

    public void dodajPredmetKojiPohadja(Predmet predmet){

    }

}
