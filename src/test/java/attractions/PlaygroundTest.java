package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor allowed;
    Visitor notAllowed;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        allowed = new Visitor(10, 100, 0);
        notAllowed = new Visitor(16, 170, 110);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canAllow() {
        assertEquals(true,playground.isAllowedTo(allowed));
    }

    @Test
    public void canNotAllow() {
        assertEquals(false,playground.isAllowedTo(notAllowed));
    }
}
