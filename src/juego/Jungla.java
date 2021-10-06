package juego;

import java.util.Random;
//import javax.swing.plaf.OptionPaneUI;

public class Jungla {
    static Random dado = new Random();
    static Tablero tablero;
    static int turnoAct = 0;
    static Jugador jugador;
    static int njugadores = 1;
    
    public static void main(String[] args) throws Exception {
        //jugador = new Jugador(1);
        //jugadorIa = new Jugador(2);
        tablero= new Tablero(1);
        //mientras no haya un ganador, se puede jugar
        /*
        while(!tablero.ganador()){
            // play();
        }
        */
        //dropGanador
        

        
    }
    public static int turno(){
        if(turnoAct == njugadores){
            turnoAct = 0;
        } else {
            turnoAct++;
        }
        return turnoAct;
        
    }
    public void play(){
        int x = lanzarDado();
        int y = turno();
        jugador.mover(x);
    }

    public static int lanzarDado(){
        
        return dado.nextInt(6) + 1;
    }

}
