package hu.szamalk.modell;

import java.util.Objects;
import java.util.UUID;

public abstract class Konyv extends Media implements Comparable<Konyv>{
    private String cim;
    private String szerzo;
    private int kiadasiEv;

    public Konyv(UUID id, int ar, Kategoria kategoria) {
        super(id, ar, kategoria);
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        if (cim.length() < 6){
            this.cim = cim;
        }else{
            throw new NemLetezoKonyvException("A cimnek minimum 6 betüből kell állnia.");
        }
    }

    public String getSzerzo() {
        return szerzo;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }

    public int getKiadasiEv() {
        return kiadasiEv;
    }

    public void setKiadasiEv(int kiadasiEv) {
        this.kiadasiEv = kiadasiEv;
    }


    @Override
    public String toString() {
        return "Konyv{" +
                "cim='" + cim + '\'' +
                ", szerzo='" + szerzo + '\'' +
                ", kiadasiEv=" + kiadasiEv +
                '}';
    }

    @Override
    public boolean equals(Konyv egyik, Konyv masik) {
        boolean egyformaE = false;
        if (Objects.equals(egyik.cim, masik.cim) && Objects.equals(egyik.szerzo, masik.szerzo)){
            egyformaE = true;
        }
        return egyformaE;
    }

}
