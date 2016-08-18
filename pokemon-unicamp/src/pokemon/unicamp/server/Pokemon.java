package pokemon.unicamp.server;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pokemon {

	@Id
	private int id;
	private String name;
	private float health;
	private int combatPower;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHealth() {
		return health;
	}

	public void setHealth(float health) {
		this.health = health;
	}

	public int getCombatPower() {
		return combatPower;
	}

	public void setCombatPower(int combatPower) {
		this.combatPower = combatPower;
	}

}
