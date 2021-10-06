package juego;

public class Celda{
    private Celda link;
    private Celda sig;
    private Celda ant;

    public Celda(){
        link = null;
        sig = null;
        ant = null;
    }

    public Celda getSig(){
        return this.sig;
    }
    public Celda getAnt(){
        return this.ant;
    }
    public Celda getLink(){
        return this.link;
    }
    public void setSig(Celda siguiente){
        sig = siguiente;
        siguiente.setAnt(this);
    }
    public void setAnt(Celda anterior){
        ant = anterior;
        //anterior.setSig(this);
    }
    public void setLink(Celda enlace){
        link = enlace;
    }
}