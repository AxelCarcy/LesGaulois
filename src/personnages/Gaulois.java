package personnages;

public class Gaulois
{
	private String nom;
	private int effetPotion = 1;
	private int force;
	private int nbTrophees;
	Equipement[] trophees = new Equipement[100];


	public Gaulois(String nom, int force)
	{
		this.nom = nom;
		this.force = force;
	}

	public String getNom()
	{
		return nom;
	}

	public void parler(String texte)
	{
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}

//	private String prendreParole()
//	{
//		return "Le gaulois " + nom	+	" : ";
//	}
	
	private String prendreParole() {
		return ("Le gaulois " + nom + " : ");
		
		}


//	public void frapper(Romain romain)
//	{
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
//		romain.recevoirCoup((force / 3) * effetPotion);
//	}
	
	public void frapper(Romain romain)
	{
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		trophees = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++, nbTrophees++)
		{
		this.trophees[nbTrophees] = trophees[i];
		}
	}


	@Override
	public String toString()
	{
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public void boirePotion(int forcePotion)
	{
		this.effetPotion = forcePotion;
		this.parler(" Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée. ");
	}
	
	public static void main(String[] args)
	{
		Gaulois asterix = new Gaulois("Astérix", 8);
		Romain mouloudus = new Romain("Mouloudus", 4);
		Druide panoramix = new Druide("Panoramix", 5, 11);
		int potion = panoramix.preparerPotion();
		
		//System.out.println(asterix.getNom());
		//System.out.println(asterix);
		
		asterix.boirePotion(potion);
		asterix.prendreParole();
		asterix.parler("Bonjour");
		asterix.frapper(mouloudus);
	}
}









