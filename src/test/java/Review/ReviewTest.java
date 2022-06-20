package Review;

import attractions.Attraction;
import attractions.RollerCoaster;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReviewTest {

    private String visitorName;
    private int rating;
    private Attraction attraction;
    private Review newReview;

    @Before
    public void before() {
        visitorName = "Lalika";
        rating = 5;
        attraction = new RollerCoaster("Hell Ride", 5);
        newReview = new Review(visitorName,rating,attraction);
    }

    @Test
    public void canGetReviewerName() {
        assertEquals("Lalika",newReview.getName());
    }

    @Test
    public void canGetAttractionName() {
        assertEquals("Hell Ride",newReview.getAttractionName());
    }
}