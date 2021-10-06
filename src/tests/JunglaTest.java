package tests;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import juego.Jungla;

public class JunglaTest {
    Jungla j = new Jungla();
    @Test
    public void testDado(){
        int x = Jungla.lanzarDado();
        assertTrue(x <= 6 && x >= 0 );
    }
}
