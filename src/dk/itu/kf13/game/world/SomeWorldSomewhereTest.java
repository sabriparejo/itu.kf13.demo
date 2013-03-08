package dk.itu.kf13.game.world;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeWorldSomewhereTest {

	@Test
	public void makeSureTheWorldIsReturningSomeLocations() {
		SomeWorldSomewhere world = new SomeWorldSomewhere();
		assertNotNull(world.getLocations());
	}

}
