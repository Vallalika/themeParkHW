package people;

import attractions.Dodgems;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    Dodgems dodgems;
    RollerCoaster rollerCoaster;

    @Before
    public void before(){
        visitor = new Visitor(14, 1.2, 40.0);
        dodgems = new Dodgems("Super Dodgems", 4);
        rollerCoaster = new RollerCoaster("Hell Ride", 5);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void startsWithNoVisitedAttractions() {
        assertEquals(0,visitor.getVisitedAttractions().size());
    }

    @Test
    public void canAddAttractions() {
        visitor.addAttraction(dodgems);
        visitor.addAttraction(rollerCoaster);
        assertEquals(2,visitor.getVisitedAttractions().size());
    }
}
