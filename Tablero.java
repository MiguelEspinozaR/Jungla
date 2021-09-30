public class Tablero {
    public Celda tabla;
    public Random dado;
    public Jugador jugador;
    public int njugadores;
    
    public Tablero(){
        tabla = new Celda[100];
        dado = new Random();
        jugador = new Jugador();
    }
    public void newJugador(){

    }
    public int lanzarDado(){
        return dado.nextInt(6) + 1;
    }
    public void timer(){
        //por desarrollar
    }

}
