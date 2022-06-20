package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor allowed;
    Visitor notAllowed;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1,1);
        allowed = new Visitor (21,180,50);
        notAllowed = new Visitor(14,170,37);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canAllow() {
        assertEquals(true,tobaccoStall.isAllowedTo(allowed));
    }

    @Test
    public void canNotAllow() {
        assertEquals(false,tobaccoStall.isAllowedTo(notAllowed));
    }

    @Test
    public void hasRating() {
        assertEquals(1, tobaccoStall.getRating());
    }
}
