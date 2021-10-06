package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


import juego.Jugador;

public class JugadorTest {
    Jugador j = new Jugador();
    Jugador j2 = new Jugador();
    Jugador j3 = new Jugador();

    @Test
    public void testJugadorDefault(){
        assertEquals(j, j.getSigJugador());
        assertEquals(2,j.comodin);
        assertEquals(0,j.getPosition());
    }
    @Test
    public void testAdd1Jugador(){
        j.insertPlayer(j2);
        assertEquals(j2, j.getSigJugador());
        assertEquals(j, j2.getSigJugador());
    }
    @Test
    public void testAdd2Jugadores(){
        j.insertPlayer(j2);
        j2.insertPlayer(j3);
        assertEquals(j2, j.getSigJugador());
        assertEquals(j3, j2.getSigJugador());
        assertEquals(j3, j.getSigJugador());
    }
    
    @Test
    public void testMover(){
        j.mover(2);
        assertEquals(2, j.getPosition());
        j.mover(5);
        assertEquals(7, j.getPosition());
    }
}
