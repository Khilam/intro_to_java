package fr.mouna.introductiontojava;

public class PineApple extends Fruit implements PeelFruit {

	public PineApple() {
		super("ananas");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void taste() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("gout tres sucr�");

	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 2;
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
		return ("hard");
	}

}
