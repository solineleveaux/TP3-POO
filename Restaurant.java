import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private String nom;
    private String adresse;
    private List<Plats> menu;

    // Constructeur par défaut
    public Restaurant() {
        this.nom = "Restaurant Inconnu";
        this.adresse = "Adresse Inconnue";
        this.menu = new ArrayList<>();
    }

    // Constructeur initialisant le nom et l'adresse
    public Restaurant(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
        this.menu = new ArrayList<>();
    }

    // Ajouter un plat à la carte
    public void ajouterPlatAuMenu(Plats plat) 
    {
        if (plat != null) 
        {
            this.menu.add(plat);
            System.out.println("Plat " + plat.get_Nom() + " ajouté au menu de " + this.nom);
        }
    }

    // Afficher tout le menu du restaurant
    public void afficherMenu() {
        System.out.println("\n--- Menu du restaurant " + this.nom + " ---");
        for (int i = 0; i < menu.size(); i++) 
        {
            System.out.println((i + 1) + ". " + menu.get(i).get_Nom() + " - " + menu.get(i).get_Prix() + " euros");
        }
    }

    // Préparer une commande validée/payée
    public void preparerCommande(Commande commande) 
    {
        if ("Payée".equals(commande.getStatut()) || "Validée".equals(commande.getStatut())) {
            commande.setStatut("En préparation");
            System.out.println("Le restaurant " + this.nom + " prépare la commande n°" + commande.get_id_commande());
            commande.setStatut("Prête");
            System.out.println("La commande n°" + commande.get_id_commande() + " est prête à être récupérée par le livreur !");
        } else {
            System.out.println("Échec : La commande doit être validée/payée avant préparation.");
        }
    }

    // Getters et Setters
    public String getNom() 
    {
        return this.nom;
    }

    public String getAdresse() 
    {
        return this.adresse;
    }

    public List<Plats> getMenu() 
    {
        return this.menu;
    }
}