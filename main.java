public static void main (String args[]) 
{
    // Test Plat
    Plats nouveau_plat = new Plats("Maki", 12, "California Avocat Saumon");
    nouveau_plat.afficherDetail();
    nouveau_plat.modifierPrix(10);
    nouveau_plat.setNom("Maki California");
    nouveau_plat.setDescription("California Avocat Saumon Concombre");
    System.out.println();
    System.out.println(nouveau_plat.get_Nom());
    System.out.println(nouveau_plat.get_Prix());
    System.out.println(nouveau_plat.get_Description());

    // Test Utilisateur
    System.out.println();
    System.out.println("Test Utilisateur");
    Utilisateur u1 = new Utilisateur(1010, "Lolo", "lolo@gmail.com");
    System.out.println(u1.identifiant);
    System.out.println(u1.nom);
    System.out.println(u1.email);
    u1.seConnecter();
    System.out.println("Se connecter : " + u1.connecte);
    u1.seDeconnecter();
    System.out.println("Se Deconnecter : " + u1.connecte);
    u1.mettre_a_jour("Soso", "soso@gmail.com");
    System.out.println(u1.nom);
    System.out.println(u1.email);

    // Test Commande
    System.out.println();
    System.out.println("Test Commande");
    Plats pizza = new Plats("Pizza Royale", 15, "Base tomate, fromage, jambon, champignons");
    Plats burger = new Plats("Burger Gourmet", 18, "Boeuf, cheddar affiné, sauce maison, frites");
    Plats dessert = new Plats("Tiramisu", 7, "Dessert italien traditionnel au café");

    pizza.afficherDetail();
    System.out.println();

    Commande commande = new Commande(101, "13-09-2026", "En création");

    System.out.println("--- État initial de la commande ---");
    System.out.println("ID : " + commande.get_id_commande());
    System.out.println("Statut : " + commande.getStatut());

    commande.ajouter_Plat(pizza);
    commande.ajouter_Plat(burger);
    commande.ajouter_Plat(dessert);

    for (int i=0; i<commande.getListePlats().size(); i++)
    {
        System.out.println("Plat " + (i+1) + " : " + commande.getListePlats().get(i).get_Nom());
    }

    commande.supprimer_Plat(burger);

    for (int i=0; i<commande.getListePlats().size(); i++)
    {
        System.out.println("Plat " + (i+1) + " : " + commande.getListePlats().get(i).get_Nom());
    }
    
    System.out.println("Total actuel : " + commande.calculer_total() + " Euros");

    boolean estValidee = commande.validerCommande();
    System.out.println("Commande validée ? " + estValidee + " | Nouveau statut : " + commande.getStatut());

    boolean estPayee = commande.validerPaiement();
    System.out.println("Commande payée ? " + estPayee + " | Statut final : " + commande.getStatut());

    
    // Test Clients
    System.out.println();
    System.out.println("Test Client");
    Client c1 = new Client(1011, "Faustine", "Faufau@gmail.com", "Rue du Nord, Antony", "07 81 99 13 12", "Carte") ;
    System.out.println(c1.get_id());
    System.out.println(c1.get_nom());
    System.out.println(c1.get_email());
    System.out.println(c1.getAdresseLivraison());
    System.out.println(c1.getnumeroTelephone());
    System.out.println(c1.getMoyenPaiement());

    System.out.println("Se connecter : " + c1.connecte);
    // Création d'une nouvelle commande pour le client
    Commande commandeClient = new Commande(102, "13-09-2026", "En création");
    commandeClient.ajouter_Plat(pizza);

    // Tentative sans être connecté (doit échouer)
    System.out.println("--> Test de commande SANS connexion :");
    c1.passerCommande(commandeClient);

    // Connexion du client puis re-test (doit réussir)
    System.out.println("\n--> Connexion du client...");
    c1.seConnecter();
    c1.passerCommande(commandeClient);

}  
