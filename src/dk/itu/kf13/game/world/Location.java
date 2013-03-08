package dk.itu.kf13.game.world;

import java.util.List;

public interface Location {
	
	public enum Direction  {EAST, NORTH, WEST, SOUTH, UP, DOWN };
	
	List<Location> getExits(Direction direction);
	
	String getDescription();

}
