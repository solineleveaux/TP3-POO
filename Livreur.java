public class Livreur extends Utilisateur 
{
    private String vehicule ;
    private boolean disponible ;

    public Livreur (int id, String nom, String mail, String vehicule)
    {
        super(id, nom, mail);
        this.vehicule = vehicule ;
        this.disponible =  true ;
    }

    public void prendreEnChargeCommande(Commande commande) 
    {
        if (!this.connecte) {
            System.out.println("Échec : Le livreur doit être connecté pour prendre une commande.");
            return;
        }

        if (!this.disponible) {
            System.out.println("Échec : Le livreur " + this.nom + " n'est pas disponible.");
            return;
        }

        if ("Prête".equals(commande.getStatut())) 
        {
            this.disponible = false;
            commande.setStatut("En cours de livraison");
            System.out.println("Le livreur " + this.nom + " (en " + this.vehicule 
                + ") prend en charge la commande n°" + commande.get_id_commande() 
                + " à destination de : " + commande.getAdresseLivraison()); // <-- Affiche l'adresse
        }
        else 
        {
            System.out.println("Échec : La commande doit être prête avant d'être livrée.");
        }
    }

    // Marquer la commande comme livrée
    public void livrerCommande(Commande commande) 
    {
        if (!this.connecte) 
        {
            System.out.println("Échec : Le livreur doit être connecté.");
            return;
        }

        if ("En cours de livraison".equals(commande.getStatut())) 
        {
            commande.setStatut("Livrée");
            this.disponible = true; // Le livreur redevient disponible
            System.out.println("Commande n°" + commande.get_id_commande() + " livrée avec succès par " + this.nom + " !");
        } 
        else 
        {
            System.out.println("Échec : La commande n'est pas en cours de livraison.");
        }
    }

    public String getVehicule() 
    {
        return this.vehicule;
    }

    public void setVehicule(String vehicule) 
    {
        this.vehicule = vehicule;
    }

    public void setDisponible(boolean disponible) 
    {
        this.disponible = disponible;
    }

}
