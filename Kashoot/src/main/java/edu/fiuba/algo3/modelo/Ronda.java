package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Ronda {

    private Pregunta pregunta;
    private ArrayList<Opcion> opciones;
    private int turnosJugados = 0;

    public void agregarOpciones(ArrayList<Opcion> opciones){
        this.opciones = opciones;
    }

    public void agregarPregunta(Pregunta pregunta){
        this.pregunta = pregunta;
    }

    public void jugarRonda(Jugador jugador){

        this.turnosJugados += 1;
    }

    public boolean rondaContinua(){
        return (this.turnosJugados < 2);
    }

    public ArrayList<Opcion> getOpciones() {
        return this.opciones;
    }

    public Pregunta getPregunta() {
        return this.pregunta;
    }
}