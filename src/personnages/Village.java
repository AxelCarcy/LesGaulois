package personnages;

import java.util.Iterator;

public class Village {
	private String nom;
	private String chef;
	private int nbVillageoisMaximum;
	private int nbVillageois = 0;
	private Gaulois villageois[];
	
	
	public Village(String nom, int nbVillageoisMaximum)
	{
	this.nom = nom;
	villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void setChef(String chef)
	{
	this.chef = chef;
	}
	
	public String getNom()
	{
	return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois)
	{
		villageois[nbVillageois] = gaulois;
		nbVillageois += 1;
	}
	
	public Gaulois trouverHabitant(int numGaulois)
	{
		return villageois[numGaulois];
	}
	
	public void afficherVillageois()
	{
		System.out.println("Dans le village du chef " + chef + " vivent les légendaires gaulois : ");
		for (int i = 0; i < nbVillageois; i++)
		{
			System.out.println("- " + villageois[i].getNom());
		}
	}
	
	
	public static void main(String[] args)
	{
		Village village = new Village("Village des Irréductibles", 30);
//		Gaulois gaulois = village.trouverHabitant(30);
		Chef chef = new Chef("Abraracourcix", 6, 1, village);
		village.setChef(chef.getNom());
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
		village.afficherVillageois();
	}

}

