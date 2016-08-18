package pokemon.unicamp.server;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainer {
	
	@Id
	private int id;
	private String name;
	private int level;
	private String team;
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
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
}
