package fr.mouna.introductiontojava;

public class Apple extends Fruit {

	public Apple() {
		super("pomme");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void taste() {
		// TODO Auto-generated method stub
		System.out.println("gout sucré");
		super.miam();
		
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean hasSeed() {
		// TODO Auto-generated method stub
		return true;
	}



}
