package fr.mouna.introductiontojava;

//class principal
public class Main {

	public static void main(String[] args) {
		
		Apple a = new Apple();
		a.taste();
		a.miam();
		
		PineApple pen = new PineApple();
		pen.taste();
		pen.miam();
		
		Fraise f = new Fraise();
		f.taste();
		f.miam();
		
		if (a instanceof PeelFruit) {
			
			PeelFruit fruit =pen;
		     fruit.getSkinType();
		
		}
		
		
		
		
		
		
		
		
		
		
		
		//partie constructor
//		Player player1 = new Player("zied", 15, 2 );
//		 
//		System.out.println("name :" + player1.getName());
//		System.out.println("vie : "+ player1.getHealth());
//		player1.damage(5);
//		System.out.println(" vie:" + player1.getHealth());
//		
//		
//		
//		Player player2 = new Player("ramzi", 22.0, 0.3);
//		System.out.println("name : " + player2.getName());
//		
//		player2.damage(player1.getAttack());
//		System.out.println(player2.getName());
//		
		
		
		
		
		
		
		
		
		
//		
//		//affectation
//	int money = 2000;
//	int pricePhone = 1000;
//	boolean hasPhone = true;
//	
//	if (money >= pricePhone && hasPhone) {
//		System.out.println("tu peux acheter ce phone");	
//		}else {
//			System.out.println("tu ne peux acheter ce phone en olus tu as deja un");
//		}
//	//tableau
//	String name = "Mouna";
//	String[] names = {"Zied", "ZIED"
//, "Ramzi"};
//	if (names [0].equalsIgnoreCase(names [1])) {
//		System.out.println("c'est le mm");
//	}else {
//		System.out.println("ce n'est pas le mm");
//	}
//	
//	int[] numbers = { 12,7, 19};
//	int calcul = (numbers[0]+numbers[1]+numbers[2])/numbers.length;
//	
//	System.out.println(calcul);
//	// tableau dans un tableau
//	
//	int [][] nombres = {
//			{
//				1,2,3
//			},
//			{
//				4,5,6
//			},
//			{
//				7,8,9
//			}
//			};
//	System.out.println(nombres [0][0]);
//	System.out.println(nombres [1][2]);
//	
//	String noms = "Mouna,Zied,Cyrine,Ramzi";
//	String [] tnoms = noms.split(",");
//	 System.out.println(tnoms[0]);
//	System.out.println(tnoms.length);
//	 
//	//Les boucles 
//	//for
//	
//	for (int i=5; i<=100; i++) {
//		System.out.println("ceci est le tour de boucle numero"+i);
//	}
//	
//		//for each
//	for (String str : tnoms) {
//		System.out.println(str);
//	}
//	
//	//exemple pour le boucle  for each
//	
//	int calculs = 0;
//	int[] notes = {15,10,18,17};
//	
//	for (int note : notes) {
//		calculs = calculs + note;
//		
//	}
//	System.out.println("resultat est de "+ (calculs/notes.length));
//		
//	//boucle while
//	
//	int i =0;
//	while (i != 100 ) {
//		i++;
//		System.out.println("java"+i);
//	}
//	
//	// boucle do while
//	do {
//		System.out.println("life is beautiful");
//	}while (calculs ==10);
//	
//	
//	sendMessage("test", 9);
//	sendMessage("resultat", 14);
//	//getResultat
//	sendMessage("la difference est de  " + getResultat(money, pricePhone, hasPhone),9);
//	
//	}
//	
//	// Les fonctions
//	
//	public static void sendMessage(String message, int i) {
//		System.out.println("ceci " +i+ " est msg " + message);
//	}
//	
//	private static int getResultat(int money, int pricePhone, boolean hasPhone) {
//		if (money >= pricePhone && hasPhone) {
//			System.out.println("tu peux acheter ce phone");	
//			}else {
//				System.out.println("tu ne peux acheter ce phone en olus tu as deja un");
//			}
//		return money-pricePhone;
//		
//		
	}
	
	

}
