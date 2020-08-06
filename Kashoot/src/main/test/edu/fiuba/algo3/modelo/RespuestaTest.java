package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RespuestaTest {

    @Test
    public void dadaUnaRespuestaCorrectaElJugadorRespondeCorrectamenteYSuCantidadDeAciertosEs1(){

        Opcion opcionCorrecta = new Opcion("Verdadero");

        Respuesta respuesta = new Respuesta();
        respuesta.agregarOpcion(opcionCorrecta);

        Respuesta respuestaJugador= new Respuesta();
        respuestaJugador.agregarOpcion(opcionCorrecta);

        int aciertos = respuesta.calcularAciertos(respuestaJugador);

        assertEquals(1,aciertos);
    }

    @Test
    public void dadaUnaRespuestaCorrectaDeUnVerdaderoFalsoConPenalidadMalContestadaTieneCeroAciertos(){

        Opcion opcionCorrecta = new Opcion("Verdadera");
        Opcion opcionIncorrecta = new Opcion("Falsa");

        Respuesta respuesta = new Respuesta();
        respuesta.agregarOpcion(opcionCorrecta);
        Respuesta respuestaJugador= new Respuesta();

        respuestaJugador.agregarOpcion(opcionIncorrecta);

        int aciertos = respuesta.calcularAciertos(respuestaJugador);

        assertEquals(0,aciertos);
    }

    @Test
    public void dadasDosRespuestasCorrectasEnUnChoiceSeRespondenAmbasMalYSusAciertosSonCero(){

        Opcion opcionCorrecta = new Opcion("Verdadera");
        Opcion otraOpcionCorrecta = new Opcion("Otra verdadera");
        Opcion opcionIncorrecta = new Opcion("Falsa");
        Opcion otraOpcionIncorrecta = new Opcion("Otra falsa");

        Respuesta respuesta = new Respuesta();
        respuesta.agregarOpcion(opcionCorrecta);
        respuesta.agregarOpcion(otraOpcionCorrecta);

        Respuesta respuestaJugador= new Respuesta();
        respuestaJugador.agregarOpcion(opcionIncorrecta);
        respuestaJugador.agregarOpcion(otraOpcionIncorrecta);

        int aciertos = respuesta.calcularAciertos(respuestaJugador);

        assertEquals(0,aciertos);
    }

    @Test
    public void dadasDosRespuestasCorrectasEnUnChoiceSeRespondeUnaBienYUnaMalYLosAciertosSon1(){

        Opcion opcionCorrecta = new Opcion("Verdadera");
        Opcion otraOpcionCorrecta = new Opcion("Otra Verdadera");
        Opcion opcionIncorrecta = new Opcion("Falsa");

        Respuesta respuesta = new Respuesta();
        respuesta.agregarOpcion(opcionCorrecta);
        respuesta.agregarOpcion(otraOpcionCorrecta);

        Respuesta respuestaJugador= new Respuesta();
        respuestaJugador.agregarOpcion(opcionIncorrecta);
        respuestaJugador.agregarOpcion(opcionCorrecta);

        int aciertos = respuesta.calcularAciertos(respuestaJugador);

        assertEquals(1, aciertos);
    }

    @Test
    public void dadaUnaRespuestaConMultiplesOpcionesJugadorAciertaTodas(){

        Opcion opcionCorrecta1 = new Opcion("Uno");
        Opcion opcionCorrecta2 = new Opcion("Dos");
        Opcion opcionCorrecta3 = new Opcion("Tres");
        Opcion opcionIncorrecta1 = new Opcion("Tiburon");
        Opcion opcionIncorrecta2 = new Opcion("silla");

        Respuesta respuesta = new Respuesta();
        respuesta.agregarOpcion(opcionCorrecta1);
        respuesta.agregarOpcion(opcionCorrecta2);
        respuesta.agregarOpcion(opcionCorrecta3);

        Respuesta respuestaJugador= new Respuesta();
        respuestaJugador.agregarOpcion(opcionCorrecta1);
        respuestaJugador.agregarOpcion(opcionCorrecta2);
        respuestaJugador.agregarOpcion(opcionCorrecta3);

        int aciertos = respuesta.calcularAciertos(respuestaJugador);
        assertEquals(3,aciertos);
    }

    @Test
    public void dadaUnaRespuestaRecienInicializadaObtenerTamanioDevuelve0(){

        Respuesta respuesta = new Respuesta();

        int tamanio = respuesta.obtenerTamanio();

        assertEquals(0,tamanio);
    }

    @Test
    public void dadaUnaRespuestaCon3OpcionesObtenerTamanioDevuelve3(){

        Respuesta respuesta = new Respuesta();
        Opcion opcion1 = new Opcion("Uno");
        Opcion opcion2 = new Opcion("Dos");
        Opcion opcion3 = new Opcion("Tres");

        respuesta.agregarOpcion(opcion1);
        respuesta.agregarOpcion(opcion2);
        respuesta.agregarOpcion(opcion3);

        int tamanio = respuesta.obtenerTamanio();

        assertEquals(3,tamanio);
    }
}