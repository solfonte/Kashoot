package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RespuestaCorrectaTest {

    @Test
    public void unTipoCorrectoEsCorrecto(){
        assert(new RespuestaCorrecta().soyCorrecta());
    }

    @Test
    public void unTipoCorrectoDevuelve10Puntos(){
        assertEquals(new RespuestaCorrecta().getPuntos(), 10);
    }
}