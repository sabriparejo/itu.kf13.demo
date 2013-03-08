package dk.itu.kf13.game.world;

import java.util.ArrayList;
import java.util.List;

public class SomeWorldSomewhere implements World {

	List<Location> myLocations = new ArrayList<Location>();
	
	public SomeWorldSomewhere() {
		myLocations.add(new AwesomeLocation());
		myLocations.add(new RainyMoodyLocation());
	}


	@Override
	public List<Location> getLocations() {
		return myLocations;
	}

}
