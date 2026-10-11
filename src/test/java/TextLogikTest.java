import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextLogikTest {

    @Test
    public void testaTomRaknare() {
        TextLogik raknare = new TextLogik();

        assertEquals(0, raknare.getAntalRader());
        assertEquals(0, raknare.getAntalTecken());
    }
    @Test
    public void testaEnRad() {
        TextLogik raknare = new TextLogik();

        raknare.laggTillRad("Hej");

        assertEquals(1, raknare.getAntalRader());
        assertEquals(3, raknare.getAntalTecken());
        assertEquals(1, raknare.getAntalOrd());
        assertEquals("Hej", raknare.getLangstaOrd());
    }
    @Test
    public void testaTvaRader() {
        TextLogik raknare = new TextLogik();

        raknare.laggTillRad("Omar spelar");
        raknare.laggTillRad("Java");

        assertEquals(2, raknare.getAntalRader());
        assertEquals(15, raknare.getAntalTecken());
        assertEquals(3, raknare.getAntalOrd());
        assertEquals("spelar", raknare.getLangstaOrd());
    }
}

