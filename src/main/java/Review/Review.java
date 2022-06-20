package Review;

import attractions.Attraction;
import people.Visitor;

public class Review {

    private String visitorName;
    private int rating;
    private Attraction attraction;

    public Review(String visitorName, int rating, Attraction attraction) {
        this.visitorName = visitorName;
        this.rating = rating;
        this.attraction = attraction;
    }

    public String getName() {
        return this.visitorName;
    }
    private int getRating() {
        return this.rating;
    };

    public String getAttractionName(){
        return this.attraction.getName();
    };

}
