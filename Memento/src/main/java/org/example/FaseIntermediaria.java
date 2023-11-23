package org.example;

public class FaseIntermediaria implements Fase {

    private FaseIntermediaria() {};
    private static FaseIntermediaria instance = new FaseIntermediaria();
    public static FaseIntermediaria getInstance() {
        return instance;
    }

    public String getNomeFase() {
        return "Desfiladeiro do Pesadelo";
    }

}
