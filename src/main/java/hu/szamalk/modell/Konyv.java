package hu.szamalk.modell;

import java.util.Objects;

public class Konyv extends Media implements Comparable<Konyv>{
    private String cim;
    private String szerzo;
    private int kiadasiEv;

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
    public boolean compareTo(Konyv egyik, Konyv masik) {
        boolean egyformaE = false;
        if (Objects.equals(egyik.cim, masik.cim) && Objects.equals(egyik.szerzo, masik.szerzo)){
            egyformaE = true;
        }
        return egyformaE;
    }


}
