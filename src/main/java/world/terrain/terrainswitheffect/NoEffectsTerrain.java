package world.terrain.terrainswitheffect;

import world.terrain.commonterrains.TerrainEffect;

public class NoEffectsTerrain implements TerrainEffect {

	@Override
	public void showEffect() {
		System.out.println("No effects on this terrain");
	}

	@Override
	public int damageDealt() {
		return 0;
	}

	@Override
	public int slowRate() {
		return 0;
	}

}
