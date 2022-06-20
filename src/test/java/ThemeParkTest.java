
import attractions.Dodgems;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.*;
import attractions.*;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private Attraction dodgems;
    private Attraction rollerCoaster;
    private Stall candyfloss;
    private Stall iceCreamStall;
    private ThemePark myThemePark;
    private Visitor visitor;

    @Before
    public void before() {
        myThemePark = new ThemePark();
        dodgems = new Dodgems("Super Dodgems", 4);
        rollerCoaster = new RollerCoaster("Hell Ride",5);
        candyfloss = new CandyflossStall("My Fav Candies","Lalika", ParkingSpot.A2, 4);
        iceCreamStall = new IceCreamStall("My great Ice creams","Lalikum", ParkingSpot.B1, 5);
        visitor = new Visitor(17, 175, 117);
    }

    @Test
    public void startsWithEmptyAttractionsListArray() {
        assertEquals(0,myThemePark.getAttractions().size());
    }

    @Test
    public void startsWithEmptyStallsListArray() {
        assertEquals(0,myThemePark.getStalls().size());
    }

    @Test
    public void canAddAttractionToPark() {
        myThemePark.addAttractionToPark(dodgems);
        myThemePark.addAttractionToPark(rollerCoaster);
        assertEquals(2,myThemePark.getAttractions().size());
    }

    @Test
    public void canAddStallToPark() {
        myThemePark.addStallToPark(candyfloss);
        myThemePark.addStallToPark(iceCreamStall);
        assertEquals(2,myThemePark.getStalls().size());
    }

    @Test
    public void canGetReviewedObjects() {
        myThemePark.addAttractionToPark(dodgems);
        myThemePark.addAttractionToPark(rollerCoaster);
        myThemePark.addStallToPark(candyfloss);
        myThemePark.addStallToPark(iceCreamStall);
        assertEquals(4, myThemePark.getAllReviewed().size());
    }

    @Test
    public void canIncreaseVisitCountForAttraction() {
        myThemePark.addAttractionToPark(rollerCoaster);
        myThemePark.visit(visitor,rollerCoaster);
        assertEquals(1,rollerCoaster.getVisitCount());
    }

    @Test
    public void canAddAttractionToVisitedAttractionsForVisitor() {
        myThemePark.addAttractionToPark(rollerCoaster);
        myThemePark.visit(visitor,rollerCoaster);
        assertEquals(1,visitor.getVisitedAttractions().size());
    }

//    @Test
//    public void canGetReviews() {
//        myThemePark.addAttractionToPark(rollerCoaster);
//        myThemePark.addAttractionToPark(dodgems);
//        myThemePark.visit(visitor,rollerCoaster);
//        myThemePark.visit(visitor,dodgems);
//        // TODO: Use a Review class to store reviews
//        // TODO: Visitor adds reviews
//        // TODO: ThemePark can get reviews for all attractions
//        // TODO: Refactor the IReviewed interface implementation to link to the review class
//        assertEquals(2,myThemePark.getAllReviews().size());
//    }

}
