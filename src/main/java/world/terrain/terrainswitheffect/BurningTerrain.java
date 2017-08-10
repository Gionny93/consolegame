package world.terrain.terrainswitheffect;

import constants.Values;
import world.terrain.commonterrains.TerrainEffect;

public class BurningTerrain implements TerrainEffect{

	@Override
	public void showEffect() {
		System.out.println("Burning ground");
	}

	//damage dealt every second that the character stands in the burning ground
	@Override
	public int damageDealt() {
		return Values.BURNING_GROUND.getValue();
	}

	@Override
	public int slowRate() {
		return Values.BURNING_SLOW_RATE.getValue();
	}
	
}
