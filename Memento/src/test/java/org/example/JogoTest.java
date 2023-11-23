package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogoTest {

    @Test
    void deveArmazenarFases() {
        Jogo jogo = new Jogo();
        jogo.setFase(FaseInicial.getInstance());
        jogo.setFase(FaseIntermediaria.getInstance());
        assertEquals(2, jogo.getFases().size());
    }

    @Test
    void deveRetornarFaseInicial() {
        Jogo jogo = new Jogo();
        jogo.setFase(FaseInicial.getInstance());
        jogo.setFase(FaseIntermediaria.getInstance());
        jogo.carregaJogo(0);
        assertEquals(FaseInicial.getInstance(), jogo.getFase());
    }

    @Test
    void deveRetornarFaseAnterior() {
        Jogo jogo = new Jogo();
        jogo.setFase(FaseInicial.getInstance());
        jogo.setFase(FaseIntermediaria.getInstance());
        jogo.setFase(FaseFinal.getInstance());
        jogo.carregaJogo(1);
        assertEquals(FaseIntermediaria.getInstance(), jogo.getFase());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Jogo jogo = new Jogo();
            jogo.carregaJogo(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}