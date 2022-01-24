package fr.mouna.introductiontojava;

public class Kiwi extends Fruit implements PeelFruit {

	public Kiwi(String name) {
		super("kiwi");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void taste() {
		// TODO Auto-generated method stub
		System.out.println("veryyy sweet");
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public boolean hasSeed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPeeled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getSkinType() {
		// TODO Auto-generated method stub
		return "soft";
	}

}
