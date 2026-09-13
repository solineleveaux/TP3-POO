public static void main(String args[]) {

    // 1. Instanciation du restaurant et de sa carte
    Restaurant resto = new Restaurant("Sushi & Burger Express", "22 Rue Auguste Mounié, Antony");
    Plats pizza = new Plats("Pizza Royale", 15, "Base tomate, fromage, jambon");
    Plats burger = new Plats("Burger Gourmet", 18, "Boeuf, cheddar affiné");
    
    resto.ajouterPlatAuMenu(pizza);
    resto.ajouterPlatAuMenu(burger);
    resto.afficherMenu();

    // 2. Création du client
    Client client1 = new Client(1, "Alice", "alice@gmail.com", "15 Rue de Paris, Antony", "0601020304", "CB");
    client1.seConnecter();

    // 3. Création et passage de la commande par le client
    Commande commande = new Commande(101, "13-09-2026", "En création", client1.getAdresseLivraison());
    commande.ajouter_Plat(pizza);
    commande.ajouter_Plat(burger);
    client1.passerCommande(commande); // Valide et paye la commande

    // 4. Préparation par le restaurant
    System.out.println("\n--- PRÉPARATION RESTAURANT ---");
    resto.preparerCommande(commande);

    // 5. Prise en charge et livraison par le livreur
    System.out.println("\n--- LIVRAISON ---");
    Livreur l1 = new Livreur(201, "Karim", "karim@express.fr", "Scooter");
    l1.seConnecter();

    // Le livreur intervient une fois la commande prête
    l1.prendreEnChargeCommande(commande);
    l1.livrerCommande(commande);
}