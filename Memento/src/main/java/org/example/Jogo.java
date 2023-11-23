package org.example;

import java.util.ArrayList;
import java.util.List;

public class Jogo {

    private Fase fase;
    private List<Fase> save = new ArrayList<Fase>();

    public Fase getFase() {
        return this.fase;
    }

    public void setFase(Fase fase) {
        this.fase = fase;
        this.save.add(this.fase);
    }

    public void carregaJogo(int indice) {
        if (indice < 0 || indice > this.save.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.fase = this.save.get(indice);
    }

    public List<Fase> getFases() {
        return this.save;
    }
}