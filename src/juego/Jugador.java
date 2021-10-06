package juego;

public class Jugador {
    public Jugador nextP;
    public int position;
    public int comodin;
    
    public Jugador(){
        this.nextP = nextP;
        position = 0;
        comodin = 2;
    }
    
    public int getPosition(){
        return position;
    }
    public void mover(int x){
        position += x;
    }
    public void insertPlayer(){

    }
    
}
