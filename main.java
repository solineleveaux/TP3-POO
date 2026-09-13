public static void main(String args[]) 
{

    // 1. Création d'un client avec son adresse
    Client client1 = new Client(1, "Alice", "alice@gmail.com", "15 Rue de Paris, Antony", "0601020304", "CB");
    client1.seConnecter();

    // 2. Création des plats et de la commande (sans adresse en dur)
    Plats pizza = new Plats("Pizza Royale", 15, "Base tomate, fromage, jambon");
    Plats burger = new Plats("Burger Gourmet", 18, "Boeuf, cheddar affiné");

    Commande commande = new Commande(101, "13-09-2026", "En création", client1.getAdresseLivraison());
    commande.ajouter_Plat(pizza);
    commande.ajouter_Plat(burger);

    // 3. Le client passe la commande (son adresse est injectée automatiquement)
    client1.passerCommande(commande);

    // 5. Prise en charge par le livreur
    System.out.println("\n--- TEST LIVREUR ---");
    Livreur l1 = new Livreur(201, "Karim", "karim@express.fr", "Scooter");
    l1.seConnecter();

    // Le livreur récupère l'adresse de la commande qui vient d'être transmise par le client
    l1.prendreEnChargeCommande(commande);
    l1.livrerCommande(commande);
}