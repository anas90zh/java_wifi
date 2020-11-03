package gitTest;

import java.util.ArrayList;

public class Bauern {

	private String name ;
	private static ArrayList<Tier> ar = new ArrayList<>();


	public static void main(String[] args) {
		ar.add(new Tier("cow",10));
		ar.add(new Tier("hase",5));
		ar.add(new Tier("schaffe",20));
		ar.add(new Tier("Hund",10));


		for(Tier t:ar)
			System.out.println("name "+ t.getName()+" Alter " + t.getAlter() );
	}
	
	
}
