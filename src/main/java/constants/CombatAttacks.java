package constants;

public enum CombatAttacks {

	TACKLE("1"), SPLASH("2");

	private String attackKey;

	private CombatAttacks(String attackKey) {
		this.attackKey = attackKey;
	}

	public String getAtackKey() {
		return this.attackKey;
	}
}
