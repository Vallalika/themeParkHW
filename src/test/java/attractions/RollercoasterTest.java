package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor allowed;
    Visitor notAllowed;
    Visitor allowedAverageHeight;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        allowed = new Visitor(37, 201, 1);
        notAllowed = new Visitor(10, 145, 56);
        allowedAverageHeight = new Visitor(37, 170,57);

    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canAllow() {
        assertEquals(true,rollerCoaster.isAllowedTo(allowed));
    }

    @Test
    public void canChargeDoublePriceForTallPeople() {
        assertEquals(16.80,rollerCoaster.priceFor(allowed),0.00);
    }

    @Test
    public void canChargeRegularPrice() {
        assertEquals(8.40,rollerCoaster.priceFor(allowedAverageHeight),0.00);
    }
}
