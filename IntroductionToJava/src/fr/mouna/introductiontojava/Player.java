package fr.mouna.introductiontojava;

public class Player {
	private String name ;
	private double health ;
	private double attack ;
	
	// constractor pour modifier nos attributs 
	public Player(String name, double health, double attack) {
		// TODO Auto-generated constructor stub
	this.name = name;
	this.health = health;
	this.attack = attack;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getHealth() {
		return health;
	}


	public void setHealth(double health) {
		this.health = health;
	}


	public double getAttack() {
		return attack;
	}


	public void setAttack(double attack) {
		this.attack = attack;
	}
	public void damage(double damage) {
		this.health -= damage; 
		System.out.println( name + "a subit des degat "+damage);
	}

}
