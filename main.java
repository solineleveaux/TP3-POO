public static void main(String args[])
{
    // Instancation du client
    Client client = new Client(1, "Alice", "alice@gmail.com", "15 Rue de Paris, Antony", "0601020304", "CB");
    
    // Instanciation du restaurant et de sa carte
    Restaurant resto = new Restaurant("Sushi & Burger Express", "22 Rue Auguste Mounié, Antony");
    Plats pizza = new Plats("Pizza Royale", 15, "Base tomate, fromage, jambon");
    Plats burger = new Plats("Burger Gourmet", 18, "Boeuf, cheddar affiné");
    resto.ajouterPlatAuMenu(pizza);
    resto.ajouterPlatAuMenu(burger);
    resto.afficherMenu();


    // Pour créer une commande, le client doit se connecter 
    client.seConnecter();
    // passer commande 
    Commande commande = new Commande(101, "13-09-2026", "En création", client.getAdresseLivraison());
    commande.ajouter_Plat(pizza); // Il ajoute une pizza a sa commande
    commande.ajouter_Plat(burger); // Il ajoute un burger a sa commande
    client.passerCommande(commande); // Il valide et paye la commande

    // preparation
    System.out.println("\n--- PRÉPARATION RESTAURANT ---");
    resto.preparerCommande(commande);

    // Instanciation du livreur pour livrer la commande au client
    System.out.println("\n--- LIVRAISON ---");
    Livreur livreur = new Livreur(201, "Karim", "karim@express.fr", "Scooter");

    // prise en charge
    // Avant de prendre en charge une commande, le livreur doit se connecter
    livreur.seConnecter();
    // prise en charge
    livreur.prendreEnChargeCommande(commande);
    // livraison
    livreur.livrerCommande(commande);

}