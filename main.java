public static void main (String args[]) 
{
    Plats nouveau_plat = new Plats("Maki", 12, "California Avocat Saumon");
    nouveau_plat.afficherDetail();
    nouveau_plat.modifierPrix(10);
    nouveau_plat.setNom("Maki California");
    nouveau_plat.setDescription("California Avocat Saumon Concombre");
    System.out.println();
    System.out.println(nouveau_plat.get_Nom());
    System.out.println(nouveau_plat.get_Prix());
    System.out.println(nouveau_plat.get_Description());

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




}  
