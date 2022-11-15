package Histoire;
import personnages.*;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 25);
		Romain minus = new Romain("Minus", 6);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler(" Par Bélénos, ce n'est pas juste ! ");
		panoramix.booster(asterix);
		
		asterix.parler(" Bonjour à tous ");
		minus.parler(" UN GAU... UN GAUGAU... ");
		asterix.frapper(minus);
	}
}
