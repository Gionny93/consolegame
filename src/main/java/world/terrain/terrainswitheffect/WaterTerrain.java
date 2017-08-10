package world.terrain.terrainswitheffect;

import world.terrain.commonterrains.TerrainEffect;

public class WaterTerrain implements TerrainEffect{

	@Override
	public void showEffect() {
		System.out.println("No damage on this terrain");
	}

	@Override
	public int damageDealt() {
		return 0;
	}

	@Override
	public int slowRate() {
		return 2;
	}

}
