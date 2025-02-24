package hu.szamalk.modell;

import java.util.UUID;

public abstract class Media {
    private UUID id;
    private int ar;
    private Kategoria kategoria;


    public Media(UUID id, int ar, Kategoria kategoria) {
        this.id = id;
        this.ar = ar;
        this.kategoria = kategoria;
    }



}
