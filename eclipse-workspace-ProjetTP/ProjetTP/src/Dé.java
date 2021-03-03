
public class Dé {
	
	int face = 0;
	
	public Dé() {}
	
	public int jetDeDé() {
		return this.face = 1+ (int) (Math.random()*6);
	}

}
