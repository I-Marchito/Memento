package org.example;

public class FaseInicial implements Fase {

    private FaseInicial() {};
    private static FaseInicial instance = new FaseInicial();
    public static FaseInicial getInstance() {
        return instance;
    }

    public String getNomeFase() {
        return "Bosque dos Sonhos";
    }

}
