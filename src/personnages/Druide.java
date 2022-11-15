package personnages;
import java.util.*;

public class Druide
{
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax)
	{
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à " + effetPotionMax + ".");
	}
	
	public String getNom()
	{
		return nom;
	}
	
	public void parler(String texte)
	{
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole()
	{
		return "Le druide " + nom + " : ";
	}
	
	public int preparerPotion()
	{
		Random random = new Random();
		forcePotion = random.nextInt(effetPotionMin, effetPotionMax + 1);
		this.parler(" Je vais aller préparer une petite potion... ");
		
		if (forcePotion > 7)
		{
			this.parler(" J'ai préparé une super potion de force " + forcePotion);
		}
		else
		{
			this.parler(" Je n'ai pas trouvé tous les ingrédients, ma forcePotion est seulement de force " + forcePotion);
		}
		return forcePotion;
	}
	
	public void booster(Gaulois gaulois)
	{
		if (gaulois.getNom() == "Obélix")
		{
			this.parler(" Non, Obélix !... Tu n’auras pas de potion magique ! ");
		}
		else
		{
			gaulois.boirePotion(forcePotion);
		}
	}
	
	public static void main(String[] args)
	{
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion();
		
		
	}
}