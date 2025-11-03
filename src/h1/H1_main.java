package h1;

public class H1_main {
	public static void main(String[] args) {
		
		double guthaben = -100, monEingang = 200;
		int rating = -2;
		boolean warnhinweis = false, negativ = true;

		
		if (guthaben < 0) {
			negativ = true;
			if (monEingang >= -guthaben) {
				rating++;
			} else {
				rating--;
			}
		} else {
			negativ = false;
			if (guthaben > 0) {
				rating += 3;
			} else {
				guthaben += 2;
			}
		}
		if ((guthaben < 0) && (monEingang < -guthaben) && (rating < 0)) {
			warnhinweis = true;
		} else {
			warnhinweis = false;
		}
		System.out.println("Negativ: " + negativ + "\nRating: " + rating + "\nWarnhinweis: " + warnhinweis);
	}
}
