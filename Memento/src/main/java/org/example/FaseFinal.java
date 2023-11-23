package org.example;

public class FaseFinal implements Fase {

    private FaseFinal() {};
    private static FaseFinal instance = new FaseFinal();
    public static FaseFinal getInstance() {
        return instance;
    }

    public String getNomeFase() {
        return "Ilha do Tenebroso";
    }

}
