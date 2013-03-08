package dk.itu.kf13.game.world;

import java.util.List;

import dk.itu.kf13.game.world.Location.Direction;

public class GameRunner {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SomeWorldSomewhere newWorld = new SomeWorldSomewhere();
		List<Location> myLocations = newWorld.getLocations();
		
		
		for (Location giveMeaLocationOneAtATime : myLocations) {
			System.out.println("Fancy for loop: "+giveMeaLocationOneAtATime.getDescription());
		}			
		
		for (Direction theNextDirection : Direction.values()) {
			System.out.println(theNextDirection);
		}
	}

}
