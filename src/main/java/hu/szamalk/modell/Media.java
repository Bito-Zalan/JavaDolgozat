package hu.szamalk.modell;

import java.util.UUID;

public abstract class Media {
    private UUID id;
    private int ar;
    private Kategoria kategoria;

    public abstract boolean equals(Konyv egyik, Konyv masik);

    public Media(UUID id, int ar, Kategoria kategoria) {
        this.id = id;
        this.ar = ar;
        this.kategoria = kategoria;
    }

    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", ar=" + ar +
                ", kategoria=" + kategoria +
                '}';
    }


}
