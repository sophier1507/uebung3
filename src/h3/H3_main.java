package h3;

public class H3_main {
	public static void main(String[] args) {
		int max = 5, fix = 2, wartend = 2;
		boolean istVoll;
		
		istVoll = (max == fix);
		
		if (!istVoll) {
			fix += wartend;
			if (fix >= max) {
				wartend = fix - max;
				fix = max;
				istVoll = true;
			} else {
				wartend = 0;
			}
		}
		System.out.println(fix + "/" + max + " und " + wartend + " warten");
		System.out.println("Voll: " + istVoll);
	}
}
