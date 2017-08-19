package constants;

public enum CombatAttacks {

	TACKLE("1"), SPLASH("2");

	private String attackType;

	private CombatAttacks(String attackKey) {
		this.attackType = attackKey;
	}

	public String getAttackType() {
		return attackType;
	}

}
