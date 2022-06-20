package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor defaultPriceVisitor;
    Visitor halfPriceVisitor;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        defaultPriceVisitor = new Visitor(16, 170, 56);
        halfPriceVisitor = new Visitor(10,110,12);
    }

    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void canChargeDefaultPrice() {
        assertEquals(4.50,dodgems.priceFor(defaultPriceVisitor), 0.00);
    }

    @Test
    public void canChargeHalfPrice() {
        assertEquals(2.25,dodgems.priceFor(halfPriceVisitor), 0.00);
    }
}
