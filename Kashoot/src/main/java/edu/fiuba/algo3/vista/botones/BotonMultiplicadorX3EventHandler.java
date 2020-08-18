package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.modelo.Jugador;
import edu.fiuba.algo3.modelo.Kashoot;
import edu.fiuba.algo3.modelo.Pregunta;
import edu.fiuba.algo3.modelo.Respuesta;
import edu.fiuba.algo3.vista.VistaKashoot;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonMultiplicadorX3EventHandler implements EventHandler<ActionEvent> {

    private Scene escenaFinal;
    private Stage stage;
    private Kashoot kashoot;
    private VistaKashoot vista;

    public BotonMultiplicadorX3EventHandler(Kashoot kashoot, VistaKashoot unaVista, Scene escenaFinal, Stage stage){
        this.kashoot = kashoot;
        this.vista = unaVista;
        this.escenaFinal = escenaFinal;
        this.stage = stage;
        this.stage.setFullScreen(true);
        this.stage.show();
    }

    @Override
    public void handle(ActionEvent actionEvent){

        Jugador jugadorActual = kashoot.obtenerJugadorActual();
        jugadorActual.multiplicarX2(this.vista.getRespuesta());
        jugadorActual.responder(this.vista.getPregunta(), this.vista.getRespuesta());
        System.out.println(jugadorActual.getPuntajeRonda());

        this.vista.actualizar();
        if(vista.terminoJuego()){
            this.vista.setDatosFinales();
            this.stage.setScene(this.escenaFinal);
            this.stage.setFullScreen(true);
            this.stage.show();
        }

    }
}
