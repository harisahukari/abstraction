package Abstract;

public class Subclass extends Superclass{

	public static void main(String[] args) {
		Subclass sc= new Subclass();
		 sc.man();
		 sc.animal();
		

	}

	@Override
	public void animal() {
	System.out.println("kindlyness");
		
	}

}
