package hu.szamalk.modell;

import java.util.ArrayList;
import java.util.function.Consumer;

public abstract class Gyujtemeny implements Iterable<Media>{
    private int ferohely;
    private ArrayList<Media> mediak;

    public int getFerohely() {
        return ferohely;
    }

    public ArrayList<Media> getMediak() {
        return mediak;
    }

    public void beOlvasas(Media media){
        if (mediak.size() < 5){
            mediak.add(media);
            this.ferohely++;
        }else{
            throw new RuntimeException("Nem lehet több média.");
        }
    }

    public void kiIras(Media media){
        mediak.remove(media);
        //if (mediak.size())
    }

    @Override
    public String toString() {
        return "Gyujtemeny{" +
                "ferohely=" + ferohely +
                ", mediak=" + mediak +
                '}';
    }

    @Override
    public void forEach(Consumer<? super Media> action) {
        Iterable.super.forEach(action);
    }
}
