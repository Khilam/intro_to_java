package fr.mouna.introductiontojava;

public abstract class Fruit {
	private String name;
	// constructor 
	public Fruit(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public abstract void taste();
	public abstract int  getSize();
	public abstract boolean hasSeed();
	public void miam () {
		System.out.println("il faut mager 5 fruits par jour " + name);
	}
	public String getName() {
		return name; 
	}

}
