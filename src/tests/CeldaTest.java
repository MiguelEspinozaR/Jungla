package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import juego.Celda;

public class CeldaTest {
    Celda c = new Celda();
    Celda c1 = new Celda();
    Celda c2 = new Celda();
    @Test
    public void testCeldaDefault(){
        assertEquals(null, c.getAnt());
        assertEquals(null, c.getSig());
        assertEquals(null, c.getLink());
    }
    @Test
    public void testApuntado(){
        c1.setAnt(c);
        c1.setSig(c2);

        assertEquals(c, c1.getAnt());
        assertEquals(c2, c1.getSig());
        assertEquals(null, c2.getSig());
        
        /*
        // descomentar para mostrar logs
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.getAnt());
        System.out.println(c1.getSig());
        System.out.println(c2.getAnt());
        */
        
    }

}

