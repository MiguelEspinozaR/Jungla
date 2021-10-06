package juego;

public class Jugador {
    private Jugador nextP;
    private int position;
    public int comodin;
    
    public Jugador(){
        nextP = this;
        position = 0;
        comodin = 2;
    }
    
    public int getPosition(){
        return this.position;
    }
    public Jugador getSigJugador(){
        return this.nextP;
    }
    public void mover(int x){
        position += x;
    }
    public void insertPlayer(Jugador newPlayer){
        Jugador x = nextP;
        while(x.nextP != null){
            x=nextP;
        }
        nextP = newPlayer;
        newPlayer.nextP = this;
    }
    
    
}
