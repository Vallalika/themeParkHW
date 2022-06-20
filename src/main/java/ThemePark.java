import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;
import java.util.Collection;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviewedObjects;

    public ThemePark() {
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
        this.reviewedObjects = new ArrayList<>();
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public void addAttractionToPark(Attraction attraction) {
        this.attractions.add(attraction);
        this.reviewedObjects.add(attraction);
    }

    public void addStallToPark(Stall stall) {
        this.stalls.add(stall);
        this.reviewedObjects.add(stall);
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return this.reviewedObjects;
    }

    public void visit(Visitor visitor, Attraction attraction) {
        visitor.addAttraction(attraction);
        attraction.incrementVisitCount();
    }
}
